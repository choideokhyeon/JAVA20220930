package Ch23;

import java.sql.*;

public class C02DBInsert {

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
			pstmt.setInt(1, 5);
			pstmt.setString(2, "이지성");
			pstmt.setString(3, "창녕");
			pstmt.setString(4, "010-1818-1818");
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
