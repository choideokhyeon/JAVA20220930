package Ch99.Service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Ch99.Domain.UserDAO;
import Ch99.Domain.UserDTO;

public class AuthService {
private UserDAO dao = UserDAO.getInstance();
	
	//싱글톤 패턴 추가
	private static AuthService instance;
	public static AuthService getInstance()
	{
		if(instance == null)
			instance = new AuthService();
		return instance;
	}
	
	public AuthService() {}
	
	
	// ID/PW 인증 이후 
	public UserDTO LoginCheck(String id, String pwd)
	{
		UserDTO dto = new UserDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gachadb","root","1234");
			pstmt = conn.prepareStatement("select username,pwd from usertbl where username=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					//ID 일치 PW일치여부 확인
					if(id.equals(rs.getString("username")) && pwd.equals(rs.getString("pwd")))
					{
						dao.Loginstatus(id);
						System.out.println("[SYSTEM] 로그인에 성공했습니다");
					}
					
					else
					{
						System.out.println("[SYSTEM] 로그인에 실패했습니다");
					}
				}
			}
		}catch (SQLException e) {e.printStackTrace();}
		finally
		{
			try
			{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		return dto;
	}

	public UserDTO LogOut(String id)
	{
		UserDTO dto = new UserDTO();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try
		{
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/gachadb","root","1234");
			pstmt = conn.prepareStatement("select username,pwd,loginstatus from usertbl where username=?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if(rs != null)
			{
				while(rs.next())
				{
					if(rs.getInt("loginstatus") == 0)
					{
						System.out.println("[SYSTEM] 현재 로그인 상태가 아닙니다");
					}
					else
					{
						//ID 일치 여부 확인
						if(id.equals(rs.getString("username")))
						{
							dao.Logout(id);
							System.out.println("[SYSTEM] 로그아웃에 성공했습니다.");
						}
						
						else
						{
							System.out.println("[SYSTEM] 로그아웃에 실패했습니다.");
						}
					}
				}
			}
		}catch (SQLException e) {e.printStackTrace();}
		finally
		{
			try
			{rs.close(); pstmt.close();}catch(Exception e) {e.printStackTrace();}
		}
		return dto;
		
//		if(dto.getLoginstatus() == 0)
//		{
//			System.out.println("[SYSTEM] 로그아웃에 실패했습니다");
//		}
//		
//		else
//		{
//			
//			if(id.equals(dto.getUsername()))
//			{
//				System.out.println("[SYSTEM] 로그아웃 했습니다");
//				dao.Logout(id);
//			}
//			else
//			{	
//				System.out.println("[SYSTEM] 로그아웃에 실패했습니다");
//			}
//		}
//			
//		return dto;
	}
}
