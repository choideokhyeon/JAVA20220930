package Ch23EXEC;

import java.sql.*;
import java.util.Scanner;

public class C02Prac {
	
	//tbl_customer에 id가 2인 행의 name='SeoGilDong', addr='ulsan' phone='none' 으로 수정하세요
	//tbl_customer에 id가 3인을 삭제합니다.

	public static void main(String[] args) throws Exception {
		//연결관련 정보 저장용 변수
		String id = "root";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:mysql://localhost:3306/shopdb";	//연결 URL(DBMS마다 상이함)
		
		//DB연결객체 관련 참조변수
		Connection conn = null;				//DB연결객체용
		PreparedStatement pstmt = null;		//SQL쿼리 전송용 객체
		ResultSet rs = null;				//쿼리결과(Select결과) 수신용
		
		//연결하기
		try {
			Scanner sc = new Scanner(System.in);
			Class.forName("com.mysql.cj.jdbc.Driver");			//DB드라이버 로드
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw);	//DB Connection 객체 받기
			System.out.println("DB Connected...");
			
			System.out.println("===================");
			System.out.println("1.삽입|2.변경|3.삭제");
			System.out.println("===================");
			int num = sc.nextInt();
			if(num == 1)
			{
				conn.setAutoCommit(false);	//auto commit을 해제
				pstmt = conn.prepareStatement("insert into tbl_customer values(?, ?, ?, ?)");
				System.out.print("id 입력 : ");
				int inputid = sc.nextInt();
				System.out.print("이름 입력 : ");
				String inputname = sc.next();
				System.out.print("주소 입력 : ");
				String inputaddr = sc.next();
				System.out.print("전화번호 입력 : ");
				String inputphone = sc.next();
				
				pstmt.setInt(1, inputid);
				pstmt.setString(2, inputname);
				pstmt.setString(3, inputaddr);
				pstmt.setString(4, inputphone);
				int result = pstmt.executeUpdate();
				if(result != 0)
					System.out.println("Insert Success!");
				else
					System.out.println("Insert Failed..");
			}
			
			else if(num == 2)
			{
				conn.setAutoCommit(false);
				pstmt = conn.prepareStatement("update tbl_customer set name=?, addr=?, phone=? where id=?");
				System.out.print("변경할 id 입력 : ");
				int inputid = sc.nextInt();
				System.out.print("변경할 이름 입력 : ");
				String inputname = sc.next();
				System.out.print("변경할 주소 입력 : ");
				String inputaddr = sc.next();
				System.out.print("변경할 전화번호 입력 : ");
				String inputphone = sc.next();
				pstmt.setString(1, inputname);
				pstmt.setString(2, inputaddr);
				pstmt.setString(3, inputphone);
				pstmt.setInt(4, inputid);
				int result = pstmt.executeUpdate();
				if(result != 0)
					System.out.println("Update Success!");
				else
					System.out.println("Update Failed..");
			}
			
			else if(num == 3)
			{
				conn.setAutoCommit(false);
				pstmt = conn.prepareStatement("delete from tbl_customer where id=?");
				System.out.print("삭제할 id 입력 : ");
				int inputid = sc.nextInt();
				pstmt.setInt(1, inputid);
				int result = pstmt.executeUpdate();
				if(result != 0)
					System.out.println("Delete Success!");
				else
					System.out.println("Delete Failed..");
			}
			
			else
				System.out.println("잘못된 입력입니다");
			
			conn.setAutoCommit(true);	//commit 실행

		}
		catch(Exception e){
			try
			{
				conn.rollback();
				System.out.println("RollBack..!");
			}
			catch(Exception e1){e.printStackTrace();}
		}
		finally
		{
			try {pstmt.close();} catch(Exception e) {e.printStackTrace();}
			try {conn.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		
	}
}
