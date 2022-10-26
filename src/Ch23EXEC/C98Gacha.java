package Ch23EXEC;

import java.sql.*;
import java.util.*;

public class C98Gacha {

	public static void main(String[] args) throws Exception {
		
	
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/gachadb";
		Random rand = new Random();
		
		Connection conn = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩에 성공했습니다!!");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("가챠 시스템 DB에 연결 중...");
			
			while(true)
			{
				System.out.println("=============================");
				System.out.println("1.신규계정|2.과금하기|3.가챠돌리기");
				System.out.println("4.전체 계정현황 보기|5.프로그램종료");
				System.out.println("9.쥬얼조정|0.계정삭제모드 진입");
				System.out.println("=============================");
				System.out.print("입력하세요 >> ");
				int num = sc.nextInt();
				
				if(num == 1)
				{
					conn.setAutoCommit(false);
					String inputname = null;
					do
					{
						System.out.print("유저아이디 입력(최대 7자리) : ");
						inputname = sc.next();
						if(inputname.length() > 7)
							System.out.println("아이디가 너무 깁니다");
					}
					while(inputname.length() > 7);
					
					int n = rand.nextInt(100);
					pst = conn.prepareStatement("insert into userdb values(?, ?, 0, 0, 0)");
					pst.setInt(1, n);
					pst.setString(2, inputname);
					
					int result = pst.executeUpdate();
					if(result != 0)
						System.out.println("계정이 생성되었습니다");
					else
						System.out.println("계정을 생성할 수 없습니다");
				}
				
				else if(num == 3)
				{
					conn.setAutoCommit(false);
					System.out.print("가챠를 시행할 id코드를 입력하세요");
					int inputid = sc.nextInt();
					PreparedStatement pstmt = conn.prepareCall("select * from gachadb.userdb;");
					rs = pstmt.executeQuery();
					if(rs.getInt("jewel")-2500 < 2500 || rs != null)
					{
						System.out.println("쥬얼이 부족하여 진행할 수 없습니다");
						pst.setInt(1, rs.getInt("jewel"));
						pst.setInt(2, rs.getInt("SSRstack"));
						pst.setInt(3, inputid);
						break;
					}
					else
					{
						pst = conn.prepareStatement("update userdb set money=?, set SSRstack=? where usercode=?;");
						
						pst.setInt(1, rs.getInt("jewel")-2500);
						pst.setInt(3, inputid);
						System.out.println("2500쥬얼을 사용하여 가챠를 진행합니다");
						for(int i = 1; i <= 10; i++)
						{
							Thread.sleep(500);
							int random = (int)(Math.random() * 100 + 1);
							if(1 <=  random && random <= 3)
							{
								System.out.println("★SSR★");
								pst.setInt(2, rs.getInt("SSRstack")+1);
							}
							
							else if(4 <= random && random <= 13)
							{
								System.out.println("SR");
							}
							
							else
							{
								System.out.println("R");
							}
							System.out.printf("누적 쥬얼 사용량은 %d개 입니다\n", rs.getInt("Jewel"));
							int result = pst.executeUpdate();
							if(result != 0)
								System.out.println("가챠 완료");
							else
								System.out.println("가챠 실패");
						}
					}
				}
				
				else if(num == 4)
				{
					conn.setAutoCommit(false);
					pst = conn.prepareStatement("select * from gachadb.userdb;");
					rs = pst.executeQuery();
					if(rs != null)
					{
						System.out.println("========================================");
						System.out.println("usercode\tusername\tmoney\t\tjewel\t\tSSRstack");
						while(rs.next())
						{
							System.out.print(rs.getInt("usercode") + "\t\t");
							System.out.print(rs.getString("username") + "\t\t");
							System.out.print(rs.getInt("money") + "\t\t");
							System.out.print(rs.getInt("jewel") + "\t\t");
							System.out.print(rs.getInt("SSRstack") + "\n");
						}
						System.out.println("========================================");
					}
				}
				
				else if(num == 5)
				{
					System.out.println("가챠시스템을 종료합니다");
					System.exit(0);
				}
				
				else if(num == 9)
				{
					conn.setAutoCommit(false);
					pst = conn.prepareStatement("update userdb set jewel=? where usercode=?");
					System.out.print("변경할 id 입력 : ");
					int inputid = sc.nextInt();
					System.out.print("변경할 쥬얼양 : ");
					int inputjewel = sc.nextInt();
					pst.setInt(1, inputjewel);
					pst.setInt(2, inputid);
					int result = pst.executeUpdate();
					if(result != 0)
						System.out.println("변경 완료");
					else
						System.out.println("변경 실패");
				}
				
				else if(num == 0)
				{
					conn.setAutoCommit(false);
					pst = conn.prepareStatement("delete from userdb where usercode=?");
					System.out.print("삭제할 유저코드 입력 : ");
					int inputnum = sc.nextInt();
					pst.setInt(1, inputnum);
					int result = pst.executeUpdate();
					if(result != 0)
						System.out.println("계정이 삭제되었습니다");
					else
						System.out.println("계정 삭제에 실패했습니다");
				}
				
				conn.setAutoCommit(true);
			}
		}
		
		catch(Exception e)
		{
			try
			{
				conn.rollback();
				System.out.println("롤백됩니다..");
			}
			catch(Exception e1) {e.printStackTrace();}
			e.printStackTrace();
		}
		finally
		{
			try {
				rs.close();
				pst.close();
				conn.close();
			} catch(Exception e) {e.printStackTrace();}
		}

	}
}
