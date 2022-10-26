package Ch23EXEC;

import java.sql.*;
import java.util.Scanner;

public class C99Prac {

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/gamedb";
		
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Scanner sc = new Scanner(System.in);
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩에 성공했습니다!!");
			con = DriverManager.getConnection(url, id, pw);
			System.out.println("게임DB와 연결 중입니다...");

			
			while(true)
			{
				System.out.println("==============================");
				System.out.println("1.신규계정|2.닉네임,직업변경|3.계정삭제");
				System.out.println("4.데이터열람|5.프로그램 종료");
				System.out.println("==============================");
				System.out.print("입력하세요 >> ");
				int num = sc.nextInt();
				if(num == 1)
				{
					con.setAutoCommit(false);
					System.out.print("id코드 입력 : ");
					int inputid = sc.nextInt();
					
					System.out.print("아이디 입력 : ");
					String inputname = sc.next();
					
					System.out.print("레벨 입력 : ");
					int inputlevel = sc.nextInt();
					
					System.out.print("직업 입력 : ");
					String inputjob = sc.next();
					
					System.out.print("경험치 입력 : ");
					double inputexp = sc.nextDouble();
					
					System.out.print("HP 입력 : ");
					int inputhp = sc.nextInt();
					
					System.out.print("MP 입력 : ");
					int inputmp = sc.nextInt();
					
					pst = con.prepareStatement("insert into tbl_userdata values(?, ?, ?, ?, ?, ?, ?)");
					pst.setInt(1, inputid);
					pst.setString(2, inputname);
					pst.setInt(3, inputlevel);
					pst.setString(4, inputjob);
					pst.setDouble(5, inputexp);
					pst.setInt(6, inputhp);
					pst.setInt(7, inputmp);
				
				int result = pst.executeUpdate();
				if(result != 0)
					System.out.println("계정 생성 완료!");
				else
					System.out.println("계정 생성 실패..");
				}
				
				else if(num == 2)
				{
					con.setAutoCommit(false);
					System.out.print("변경할 아이디 입력 : ");
					String inputname = sc.next();
					
					System.out.print("변경할 직업 입력 : ");
					String inputjob = sc.next();
					
					System.out.print("id코드 입력 : ");
					int inputid = sc.nextInt();
					
					pst = con.prepareStatement("update tbl_userdata set name=?, job=? where usercode=?");
					pst.setString(1, inputname);
					pst.setString(2, inputjob);
					pst.setInt(3, inputid);
					int result = pst.executeUpdate();
					if(result != 0)
						System.out.println("정보 변경 완료!");
					else
						System.out.println("정보 변경 실패..");
				}
				
				else if(num == 3)
				{
					con.setAutoCommit(false);
					pst = con.prepareStatement("delete from tbl_userdata where id=?");
					System.out.print("삭제할 id코드 입력 : ");
					int inputid = sc.nextInt();
					pst.setInt(1, inputid);
					int result = pst.executeUpdate();
					if(result != 0)
						System.out.println("계정 삭제 완료!");
					else
						System.out.println("계정 삭제 실패..");
				}
				
				else if(num == 4)
				{
					pst = con.prepareStatement("select * from gamedb.tbl_userdata;");
					rs = pst.executeQuery();
					if(rs != null)
					{
						System.out.println("===============================================");
						while(rs.next())
						{					
							System.out.print("usercode[" + rs.getInt("usercode") + "]");
							System.out.print("[닉네임:" + rs.getString("name") + " ");
							System.out.print("레벨:" + rs.getInt("level") + " ");
							System.out.print("직업:" + rs.getString("job") + " ");
							System.out.print("경험치:" + rs.getDouble("exp") + " ");
							System.out.print("체력:" + rs.getInt("HP") + " ");
							System.out.print("마력:" + rs.getInt("MP") + "]\n");
						}
						System.out.println("===============================================");
					}
				}
				
				else if(num == 5)
				{
					System.out.println("시스템을 종료합니다");
					sc.close();
					System.exit(0);
				}
				con.setAutoCommit(true);
			}
		}
		
		catch(Exception e)
		{
			try
			{
				con.rollback();
				System.out.println("RollBack..!");
			}
			catch(Exception e1){e.printStackTrace();}
			e.printStackTrace();
		}
		finally
		{
			try {
			rs.close();
			pst.close();
			con.close();
			} catch(Exception e) {e.printStackTrace();}
		}
		
		
		
	}
}
