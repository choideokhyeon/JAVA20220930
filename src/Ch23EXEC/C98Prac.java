package Ch23EXEC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Types;
import java.util.Random;
import java.util.Scanner;
import java.math.*;

public class C98Prac {

	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.print("sql 서버에 접속할 계정을 입력하세요 : ");
		String id = sc.next();
		System.out.print("비밀번호를 입력하세요 : ");
		String pw = sc.next();
		System.out.print("선택할 db 이름을 입력하세요 : ");
		String dbname = sc.next();
		System.out.print("테이블 이름을 입력하세요 : ");
		String tblname = sc.next();
		
		
		String url = "jdbc:mysql://localhost:3306/" + dbname;
		String driver = "com.mysql.cj.jdbc.Driver";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName(driver);
			System.out.println("드라이버 로딩에 성공했습니다");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("게임DB와 연결중입니다...");
			while(true)
			{
				System.out.println("=========================================");
				System.out.println("1.계정생성|2.데이터열람|3.재획하기|4.HP회복|5.종료");
				System.out.println("=========================================");
				System.out.print("입력하세요 >> ");
				int num = sc.nextInt();
				Random rand = new Random();
				if(num == 1)
				{
					conn.setAutoCommit(false);
					System.out.print("아이디 입력 : ");
					String inputid = sc.next();
					int rancode = (rand.nextInt(100)+1);
					pstmt = conn.prepareStatement("insert into userdata values(?, ?, 1, 0, 30, 1)");
					pstmt.setInt(1, rancode);
					pstmt.setString(2, inputid);
					
					int result = pstmt.executeUpdate();
					if(result != 0)
						System.out.println("신규 계정이 생성되었습니다");
					else
						System.out.println("계정 생성에 실패했습니다..");
				}
				
				else if(num == 2)
				{
					pstmt = conn.prepareStatement("select * from " + dbname + "." + tblname + ";");
					rs = pstmt.executeQuery();
					ResultSetMetaData rsmd = rs.getMetaData();
					if(rs != null)
					{
						System.out.println("========================================================");
						for(int i = 1; i <= rsmd.getColumnCount(); i++)
						{
							String getname = rsmd.getColumnName(i);
							System.out.print(getname);
							if(i < rsmd.getColumnCount())
								System.out.print("\t");
						}
						System.out.println();
						System.out.println("========================================================");
						while(rs.next())
						{
							for(int i = 1; i <= rsmd.getColumnCount(); i++)
							{
								String getname = rsmd.getColumnName(i);
								if(rsmd.getColumnType(i) == Types.INTEGER)
								{
									System.out.print(rs.getInt(getname));
								}
								else if(rsmd.getColumnType(i) == Types.VARCHAR)
								{
									System.out.print(rs.getString(getname));
								}
								else if(rsmd.getColumnType(i) == Types.DOUBLE)
								{
									System.out.print(rs.getDouble(getname));
								}
								
								if(i < rsmd.getColumnCount())
								{
									System.out.print("\t");
								}
							}
							System.out.println();
						}
						System.out.println("========================================================");
					}
				}
				
				else if(num == 3)
				{
					System.out.print("불러올 유저 코드 입력 : ");
					int inputcode = sc.nextInt();
					pstmt2 = conn.prepareStatement("select * from gamedb.userdata where code=" + inputcode + ";");
					rs = pstmt2.executeQuery();
					rs.next();
					pstmt = conn.prepareStatement("update userdata set level=?, exp=?, hp=?, damage=? where code=?;");
					if(rs.getInt("hp")-5 <= 0)
					{
						System.out.println("HP가 부족하여 재획이 불가능합니다");
						continue;
					}
					else
					{
						if(rs.getDouble("exp")+50 >= 100)
						{
							pstmt.setInt(1, rs.getInt("level")+1);
							pstmt.setDouble(2,1);
							pstmt.setInt(3, rs.getInt("hp")-5);
							pstmt.setInt(4, rs.getInt("damage")+5);
							pstmt.setInt(5, inputcode);
						}
						else
						{
							pstmt.setInt(1, rs.getInt("level"));
							pstmt.setDouble(2, rs.getDouble("exp") + 2/(double)rs.getInt("level") );	//연산 안되는거 해결
							pstmt.setInt(3, rs.getInt("hp")-5);
							pstmt.setInt(4, rs.getInt("damage"));
							pstmt.setInt(5, inputcode);
						}
					}
					
					int result = pstmt.executeUpdate();
					if(result != 0)
						System.out.println("재획 완료");
					else
						System.out.println("재획 불가");
				}
				
				else if(num == 4)
				{
					System.out.print("불러올 유저 코드 입력 : ");
					int inputcode = sc.nextInt();
					pstmt2 = conn.prepareStatement("select * from gamedb.userdata where code=" + inputcode + ";");
					rs = pstmt2.executeQuery();
					rs.next();
					pstmt = conn.prepareStatement("update userdata set hp=? where code=?;");
					pstmt.setInt(1, rs.getInt("hp") + 100);
					pstmt.setInt(2, inputcode);
					
					int result = pstmt.executeUpdate();
					if(result != 0)
						System.out.println("회복 완료");
					else
						System.out.println("회복 불가");
				}
				
				else if(num == 5)
				{
					System.out.println("시스템을 종료합니다");
					sc.close();
					System.exit(-1);
				}
				conn.setAutoCommit(true);
			}
		}
		catch(Exception e)
		{
			try
			{
				conn.rollback();
				System.out.println("롤백됩니다");
			}
			catch(Exception e1) {e.printStackTrace();}
			e.printStackTrace();
		}
		finally
		{
			try
			{
				rs.close();
				pstmt.close();
				conn.close();
			}
			catch(Exception e) {e.printStackTrace();}
		}

	}

}
