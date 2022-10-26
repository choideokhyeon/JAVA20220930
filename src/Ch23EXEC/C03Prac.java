package Ch23EXEC;

import java.sql.*;

public class C03Prac {
	
	//자유롭게 csv파일을 받아서 mysqldb 안의 테이블로 변환 후
	//jdbc와 select 구문을 이용해서 java로 확인해보세요

	public static void main(String[] args) {
		String id = "root";
		String pw = "1234";
		String url = "jdbc:mysql://localhost:3306/flightdb";
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("드라이버 로딩 성공");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB 연결중...");
			
			pstmt = conn.prepareStatement("select * from flightdb.tbl_list;");
			
			rs = pstmt.executeQuery();		//Select만 Query
			if(rs != null)
			{
				while(rs.next())
				{
					System.out.print(rs.getInt("년") + "\t");
					System.out.print(rs.getInt("월") + "\t");
					System.out.print(rs.getString("승객 승무원 구분") + "\t");
					System.out.print(rs.getString("출입국구분") + "\t");
					System.out.print(rs.getInt("출입국자수") + "\n");
				}
			}
		}
		catch(Exception e)
		{
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
