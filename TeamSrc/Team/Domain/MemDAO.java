package Team.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemDAO {
	String id = "SYSTEM";
	String pw = "1234";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	
	//DB연결객체 관련 참조변수
	Connection conn = null;				//DB연결객체용
	PreparedStatement pstmt = null;		//SQL쿼리 전송용 객체
	ResultSet rs = null;				//쿼리결과(Select결과) 수신용
	
	private static MemDAO instance;
	public static MemDAO getInstance()
	{
		if(instance == null)
			instance = new MemDAO();
		return instance;
	}
	
	private MemDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver Loading Success!");
			conn = DriverManager.getConnection(url, id, pw);
			System.out.println("DB Connected...");
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally
		{
			try {conn.close();}
			catch(Exception e) {e.printStackTrace();}
		}
	}
	
	public int Insert(MemDTO dto)
	{
		int result = 0;
		try
		{
			pstmt = conn.prepareStatement("insert into mem_tbl values(?, ?, ?, ?, ?, ?, ?, ?)");
			pstmt.setString(1, dto.getID());
			pstmt.setString(2, dto.getPW());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getAddr());
			pstmt.setString(5, dto.getPhone());
			pstmt.setString(6, dto.getJoinDate());
			pstmt.setInt(7, dto.getPerm());
		} catch (Exception e) {e.printStackTrace();}
		
		return result;
	}
	
}
