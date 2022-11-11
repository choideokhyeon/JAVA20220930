package Ch99.Service;

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
		dao.Loginstatus(id);
		//ID 일치 PW일치여부 확인
		if(id.equals(dto.getUsername()) && pwd.equals(dto.getPwd()))
		{
			System.out.println("[SYSTEM] 로그인에 성공했습니다");
			dao.Loginstatus(dto.getUsername());
		}
		
		else
		{
			System.out.println("[SYSTEM] 로그인에 실패했습니다");
		}
		
		return dto;
	}

	public UserDTO LogOut(String id)
	{
		UserDTO dto = null;
		dto = dao.Select(id);
		if(dto == null)
		{
			System.out.println("[SYSTEM] 로그아웃에 실패했습니다");
		}
		
		if(id.equals(id))
		{
			System.out.println("[SYSTEM] 로그아웃 했습니다");
			dao.Logout(dto);
		}
		else
		{	
			System.out.println("[SYSTEM] 로그아웃에 실패했습니다");
		}
		
		return dto;
	}
}
