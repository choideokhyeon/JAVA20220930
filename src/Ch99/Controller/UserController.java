package Ch99.Controller;

import Ch99.Domain.DTO;
import Ch99.Domain.UserDTO;
import Ch99.Service.UserService;

public class UserController implements SubController {
	UserService service = new UserService();
	
	public Object execute(int SN, DTO dto) {
		Object obj = null;
		boolean flag = false;
		switch(SN)
		{
			case 1:	//회원 등록
//				System.out.println("회원등록 서비스 요청");
				UserDTO down = (UserDTO)dto;			//downcasting
				flag = service.RegisterUser(down);
				if(flag)
					obj = "[SYSTEM] 유저 등록이 완료되었습니다.";
				else
					obj = "[SYSTEM] 유저 등록에 실패했습니다";
				break;
			case 2:	//회원 조회
				UserDTO down2 = (UserDTO)dto;
				flag = service.ViewUser(down2);
				System.out.println("회원조회 서비스 요청");
				break;
			case 3:	//회원 수정
				System.out.println("회원수정 서비스 요청");
				break;
			case 4:	//회원 삭제
				System.out.println("회원삭제 서비스 요청");
				break;
			default:
				System.out.println("잘못된 서비스 요청입니다");
		}
		return null;
	}

}
