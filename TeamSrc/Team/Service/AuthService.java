package Team.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Team.Domain.MemDAO;
import Team.Domain.MemDTO;

public class AuthService {

	private MemDAO dao = MemDAO.getInstance();
	
	private static AuthService instance;
	public static AuthService getInstance()
	{
		if(instance == null)
			instance = new AuthService();
		return instance;
	}
	
	public AuthService() {}
	
	public MemDTO LoginCheck(String id, String pw)
	{
		MemDTO dto = new MemDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
				Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1234");
				pstmt = conn.prepareStatement("select * from mem_tbl where id=?");
				pstmt.setString(1, id);
				rs = pstmt.executeQuery();
				if(rs != null)
				{
					while(rs.next())
					{
						if(id.equals(rs.getString("id")) && pw.equals(rs.getString("pw")))
						{
							dao.Loginstatus(id);
							System.out.println("[SYSTEM] 로그인에 성공했습니다");
							return dto;
						}
						else
						{
							System.out.println("[SYSTEM] 로그인에 실패했습니다");
						}
					}
				}
		} catch (Exception e) {e.printStackTrace();}
		finally
		{
			try
			{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		return dto;
	}
	
	public MemDTO LogOut(String id)
	{
		MemDTO dto = new MemDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","SYSTEM","1234");
			pstmt = conn.prepareStatement("select id,pw,loginstatus from mem_tbl where id=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					if(rs.getInt("loginstatus") == 0)
						System.out.println("[SYSTEM]현재 로그인 상태가 아닙니다");
					else
					{
						if(id.equals(rs.getString("id")))
						{
							dao.Logout(id);
							System.out.println("[SYSTEM]로그아웃 하셨습니다");
						}
						else
							System.out.println("[SYSTEM]로그아웃에 실패하셨습니다");
					}
				}
			}
		}catch (Exception e) {e.printStackTrace();}
		finally
		{
			try
			{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		
		return dto;
	}
	

}
