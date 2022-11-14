package Ch38.Test;

import java.util.ArrayList;
import java.util.List;

import Ch38.Controller.FrontController;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDTO;
import Ch38.Domain.MemberDTO;
import Ch38.Service.AuthService;
import Ch38.Service.LendService;

public class UnitTest {

	public static void main(String[] args) {


		//DAO tests
//		BookDAO dao = BookDAO.getInstance();
//		boolean flag = dao.Insert(new BookDTO(1000,"자바의정석"));
//		if(flag)
//		{
//			System.out.println("Insert 성공!");
//		}
		
		
		//Service Tests
//		BookService service = new BookService();
//		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0);	//권한은 3 이상일때만 허용 -> 실패
//		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 3);	//권한은 3 이상일때만 허용 -> 성공
//		if(flag)
//			System.out.println("Register Insert 성공!");
//		else
//			System.out.println("Register Insert 실패!");
		
		
		//MemberDAO Tests
//		MemberDAO dao = MemberDAO.getInstance();
//		int result = dao.Insert(new MemberDTO("mem1","1111"));
//		if(result > 0) {
//			System.out.println("INSERT 성공!");
//		}else {
//			System.out.println("INSERT 실패..");
//		}
		
//		FrontController controller = new FrontController();
//		controller.ExSubController("/member", 1);
		
		//도서 등록 (메뉴, SN, 책DTO)
//		Object obj = controller.ExSubController("/book", 1, new BookDTO(4040, "MVC다이어그램"));
//		if(obj != null)
//			System.out.println("[View] " + obj.toString());
		
		//멤버 등록 (메뉴, SN, 멤버DTO)
//		Object obj = controller.ExSubController("/member", 1, new MemberDTO("mem3", "3333"));
//		if(obj != null)
//			System.out.println("[View] " + obj.toString());
		
//		MemberDAO dao = MemberDAO.getInstance();
//		MemberDTO dto = dao.Select("mgr1");
//		System.out.println("DTO : " + dto);
		
//		AuthService service = AuthService.getInstance();
//		Integer result = service.LoginCheck("mgr1","1111");
//		if(result != null)
//			System.out.println("[VIEW] 로그인 성공! ROLE : " + result);
//		else
//			System.out.println("[VIEW] 로그인 실패");
		
		
//		FrontController controller = new FrontController();
		//서비스요청 , 요청번호, DTO
//		Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mgr","1111"));
//		if(result == null)
//			System.out.println("[VIEW] 로그인 실패");
//		else
//			System.out.println("[VIEW] 로그인 성공 ROLE : " + result);
		
//		LendDAO dao = LendDAO.getInstance();
//		dao.Insert(new LendDTO(0,2020,"bbbb","2022-11-10","2022-11-17"));
		
		//DataFormat지정 객체
//		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");
//		//날짜정보객체
//		Calendar cal = Calendar.getInstance();
//		//현재 날짜정보를 문자열로 저장 start
//		String start = fmt.format(cal.getTime()).toString();		
//		System.out.println("start : " + start);
//		//7일 이후 날짜로 등록 
//		cal.add(Calendar.DATE, 7);
//		String end = fmt.format(cal.getTime()).toString();	
//		System.out.println("end : " + end );
		
		
//		boolean Loginstate = false;
//		String userid = null;
//		Integer perm = 0;	//0비회원 1회원 2관리자(사서)
//		
//		//인증 서비스
//		AuthService authservice = AuthService.getInstance();
//		perm = authservice.LoginCheck("mem1", "1111");
//		if(perm > 0)
//		{
//			Loginstate = true;
//			userid="mem1";
//		}
//		else
//			perm = 0;
//		
//		//대여 서비스
//		LendService lendservice = LendService.getInstance();
//		
//		boolean result = lendservice.LendBook(Loginstate, perm, userid, 4040);
//		if(result)
//			System.out.println("[VIEW] 대여 성공!");
//		else
//			System.out.println("[VIEW] 대여 실패..");
		
		
		//LendController Tests
//		boolean Loginstate = false;
//		String userid = null;
//		Integer perm = 0;
//		
//		FrontController controller = new FrontController();
//		
//		//1 로그인
//		perm = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mem1","1111"));
//		if(perm > 0)
//		{
//			userid = "mem1";
//			Loginstate = true;
//		}
//		
//		//대여하기
//		LendDTO LDTO = new LendDTO();
//		LDTO.setMemid(userid);
//		LDTO.setLogin(Loginstate);
//		LDTO.setPerm(perm);
//		LDTO.setBookcode(3030);
//		String msg = (String)controller.ExSubController("/lend", 1, LDTO);
//		System.out.println("[VIEW] " + msg);
		
		
		
		
		//로그인 이후 전체 도서 정보를 Console 화면에 출력
		boolean Loginstate = false;
		String userid = null;
		Integer perm = 0;
		
		FrontController controller = new FrontController();
		
		//1 로그인
		perm = (Integer)controller.ExSubController("/auth", 1, new MemberDTO("mem1","1111"));
		if(perm > 0)
		{
			userid = "mem1";
			Loginstate = true;
		}
		
		// 2 전체 도서조회
		ArrayList<BookDTO> list = (ArrayList<BookDTO>)controller.ExSubController("/book", 5, null);
		for(BookDTO dto : list)
		{
			System.out.println(dto.toString());
		}
		
	}
}
