package Ch99.Service;

import Ch99.Domain.UserDAO;
import Ch99.Domain.UserDTO;

public class UserService {
private UserDAO dao = UserDAO.getInstance();
	
	//싱글톤 패턴 추가
	private static UserService instance;
	public static UserService getInstance()
	{
		if(instance == null)
			instance = new UserService();
		return instance;
	}
	
	public UserService() {}
	
	//멤버 등록하기
	
//	--내일
	//(권한 확인 후 멤버 등록하기)
	public boolean RegisterUser(UserDTO dto)
	{
		int result = dao.Insert(dto);
		if(result > 0)
		{
			System.out.println("[SYSTEM] 유저 등록에 성공했습니다");
			return true;
		}
		else
		{
			System.out.println("[SYSTEM] 유저 등록에 실패했습니다");
			return false;
		}
		
	}

	public boolean ViewUser(UserDTO dto) {
		if(dao.Select(dto.getUsername()) != null)
		{
			dao.Select(dto.getUsername());
			return true;
		}
		return false;
	}
}
