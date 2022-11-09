package Ch38.Controller;

import Ch38.Domain.DTO;
import Ch38.Domain.MemberDTO;
import Ch38.Service.MemberService;

public class MemberController implements SubController {

	MemberService service = new MemberService();
	
	@Override
	public Object execute(int SN, DTO dto) {
		Object obj = null;
		boolean flag = false;
		switch(SN)
		{
			case 1:	//회원 등록
//				System.out.println("회원등록 서비스 요청");
				MemberDTO down = (MemberDTO)dto;			//downcasting
				flag = service.RegisterMember(down);
				System.out.println("[System] 회원 등록 성공 여부 : " + flag);
				if(flag)
					obj = "회원 등록이 완료되었습니다.";
				else
					obj = "회원 등록에 실패했습니다";
				break;
			case 2:	//회원 조회
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
	//1 파라미터 받기
	//1)회원등록 2)회원수정 3)회원삭제
	
	//2 입력값 검증(Validation Check)
	
	//3 서비스 실행
	
	//4 View 이동(내용전달 포함)
	

}
