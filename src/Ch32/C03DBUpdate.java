package Ch32;

import java.sql.*;

public class C03DBUpdate {

	public static void main(String[] args) {
		//연결관련 정보 저장용 변수
		String id = "SYSTEM";	//DB연결 id
		String pw = "1234";		//DB연결 pw
		String url = "jdbc:oracle:thin:@localhost:1521:xe";	//연결 URL(DBMS마다 상이함)
		
		
		//연결하기 try-with-resources(JAVA 7버전 이상)
		try
		(
				Connection conn = DriverManager.getConnection(url, id, pw);
				PreparedStatement pstmt = conn.prepareStatement("update a_tbl set name=? where no=?");
		)		
		{
			pstmt.setString(1, "정아무개");	//set name=? 첫번째물음표
			pstmt.setInt(2, 1);				//where no=? 두번째물음표
			
			
			int result = pstmt.executeUpdate();
			if(result != 0)
				System.out.println("Update Success!");
			else
				System.out.println("Update Failed..");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}
}
