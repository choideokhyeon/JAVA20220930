package Team.Domain;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	
	public MemDAO()
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(url, id, pw);
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
			Connection conn = DriverManager.getConnection(url, id, pw);
			PreparedStatement pstmt = conn.prepareStatement("insert into mem_tbl values(?, ?, ?, ?, ?, default, 1, 0)");
			pstmt.setString(1, dto.getID());
			pstmt.setString(2, dto.getPW());
			pstmt.setString(3, dto.getName());
			pstmt.setString(4, dto.getAddr());
			pstmt.setString(5, dto.getPhone());
			result = pstmt.executeUpdate();
			if(result != 0)
				System.out.println("Insert Success!");
			else
				System.out.println("Insert Failed..");
		} catch (Exception e) {e.printStackTrace();}
		
		return result;
	}
	
	public MemDTO Loginstatus(String userid)
	{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemDTO dto = new MemDTO();
		int result = 0;
		try
		{
			Connection conn = DriverManager.getConnection(url, id, pw);
			pstmt = conn.prepareStatement("select loginstatus from mem_tbl where ID=?");
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				rs.next();
				if(rs.getInt("loginstatus") == 0)
				{
					pstmt = conn.prepareStatement("update mem_tbl set loginstatus=? where id=?");
					pstmt.setInt(1, 1);
					pstmt.setString(2, userid);
					result = pstmt.executeUpdate();
					return dto;
				}
				else
					System.out.println("[SYSTEM] 현재 로그인 상태입니다");
			}
		} catch (Exception e) {e.printStackTrace();}
		finally
		{
			try
			{
				rs.close(); pstmt.close();
				}catch(Exception e) {e.printStackTrace();}
		}
		return dto;
	}
	
	public int Logout(String id)
	{
		MemDTO dto = new MemDTO();
		int result = 0;
		try
		{
			pstmt = conn.prepareStatement("select loginstatus,id from mem_tbl where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				rs.next();
				dto.setLoginstatus(rs.getInt("loginstatus"));
				dto.setID(rs.getString("id"));
				if(rs.getInt("loginstatus") == 1)
				{
					pstmt = conn.prepareStatement("update mem_tbl set loginstatus=? where id=?");
					pstmt.setInt(1, 0);
					pstmt.setString(2, dto.getID());
					result = pstmt.executeUpdate();
				}
				else {
					System.out.println("[SYSTEM] 현재 로그아웃중입니다");
				}
			}
		} catch (Exception e) {e.printStackTrace();}
		finally
		{
			try
			{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}

		return result;
	}
	
	public MemDTO Select()
	{
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		MemDTO dto = new MemDTO();
		int result = 0;
		try
		{
			Connection conn = DriverManager.getConnection(url, id, pw);
			pstmt = conn.prepareStatement("select * from mem_tbl");
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					System.out.println("ㅇㅇ");
					rs.getString("id");
					rs.getString("pw");
					rs.getString("name");
					rs.getString("addr");
					rs.getString("phone");
					rs.getString("joindate");
					rs.getInt("perm");
					rs.getInt("loginstatus");
				}
				result = pstmt.executeUpdate();
				return dto;
			}
			else
				return null;
		} catch (Exception e) {e.printStackTrace();}
		finally
		{
			try
			{
				rs.close(); pstmt.close();
				}catch(Exception e) {e.printStackTrace();}
		}
		return dto;
	}
}
