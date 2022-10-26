package Ch23EXEC;

import java.sql.*;
import java.util.Scanner;

public class C01Prac {
	
	//tbl_customer에 키보드로 입력한 내용을 저장해보세요

	public static void main(String[] args) {
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
			Class.forName("com.mysql.cj.jdbc.Driver");			//DB드라이버 로드
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw);	//DB Connection 객체 받기
			System.out.println("DB Connected...");
			pstmt = conn.prepareStatement("insert into tbl_customer values(?, ?, ?, ?)");
			
			Scanner sc = new Scanner(System.in);
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
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			try {pstmt.close();} catch(Exception e) {e.printStackTrace();}
			try {conn.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		
	}
}
