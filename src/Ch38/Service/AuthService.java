package Ch38.Service;

import Ch38.Domain.MemberDAO;
import Ch38.Domain.MemberDTO;

public class AuthService {
	
	private MemberDAO dao = MemberDAO.getInstance();
	
	//싱글톤 패턴 추가
	private static AuthService instance;
	public static AuthService getInstance()
	{
		if(instance == null)
			instance = new AuthService();
		return instance;
	}
	
	public AuthService() {}
	
	
	// ID/PW 인증 이후 Role 전달
	public Integer LoginCheck(String id, String pwd)
	{
		MemberDTO dto = null;
		dto = dao.Select(id);
		if(dto == null)
		{
			return null;
		}
		
		//ID 일치 PW일치여부 확인
		if(id.equals(dto.getMemId()) && pwd.equals(dto.getPwd()))
		{
			return dto.getRole();
		}
		
		//role 반환(1 or 2 or Null)
		return null;
	}
	
	
	
	
	//멤버 수정하기
	//멤버 삭제하기
	//기타..
}
