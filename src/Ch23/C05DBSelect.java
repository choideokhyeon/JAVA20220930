package Ch23;

import java.sql.*;

public class C05DBSelect {

	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "root";	//DB연결 id
		String pw = "1234";	//DB연결 pw
		String url = "jdbc:mysql://localhost:3306/testdb";	//연결 URL(DBMS마다 상이함)
		
		//DB연결객체 관련 참조변수
		Connection conn = null;				//DB연결객체용
		PreparedStatement pstmt = null;		//SQL쿼리 전송용 객체
		ResultSet rs = null;				//쿼리결과(Select결과) 수신용
		
		//연결하기
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	//DB드라이버 로드
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw);	//DB Connection 객체 받기
			System.out.println("DB Connected...");
			
			pstmt = conn.prepareStatement("select * from testdb.tbl_meme;");
			
			rs = pstmt.executeQuery();		//Select만 Query
			if(rs != null)
			{
				while(rs.next())
				{
					System.out.print(rs.getString("상호") + "\t");
					System.out.print(rs.getString("도로명주소") + "\t");
					System.out.print(rs.getString("전화번호") + "\t");
					System.out.print(rs.getString("메뉴") + "\n");
				}
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			try {rs.close();} catch(Exception e) {e.printStackTrace();}
			try {pstmt.close();} catch(Exception e) {e.printStackTrace();}
			try {conn.close();} catch(Exception e) {e.printStackTrace();}
		}
		
		
	}
}
