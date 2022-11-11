package Ch99.Controller;

import Ch99.Domain.DTO;
import Ch99.Domain.UserDTO;
import Ch99.Service.AuthService;

public class AuthController implements SubController {
	private AuthService service = AuthService.getInstance();

	@Override
	public Object execute(int SN, DTO dto)
	{
		//1 로그인 2 로그아웃 3 권한검증
		
		//1)파라미터 받기
		//2)입력값 검증(Validation)
		//3)서비스 요청
		//4)View 전달
		switch(SN)
		{
			case 1:	//로그인
				UserDTO down = (UserDTO)dto;
				String id = down.getUsername();
				String pwd = down.getPwd();
				if(id != null || pwd != null)
					service.LoginCheck(id, pwd);	//null or role값
				break;
			case 2:	//로그아웃
				UserDTO down2 = (UserDTO)dto;
				String id2 = down2.getUsername();
				if(id2 != null)
					service.LogOut(id2);
				break;
			case 3:
				break;
			default:
				
		}
		
		
		
		return null;
	}

}
