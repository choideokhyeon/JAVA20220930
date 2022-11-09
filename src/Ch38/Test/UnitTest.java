package Ch38.Test;

import Ch38.Controller.FrontController;
import Ch38.Domain.MemberDTO;

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
		
		FrontController controller = new FrontController();
//		controller.ExSubController("/member", 1);
		
		//도서 등록 (메뉴, SN, 책DTO)
//		Object obj = controller.ExSubController("/book", 1, new BookDTO(4040, "MVC다이어그램"));
//		if(obj != null)
//			System.out.println("[View] " + obj.toString());
		
		//멤버 등록 (메뉴, SN, 멤버DTO)
		Object obj = controller.ExSubController("/member", 1, new MemberDTO("mem2", "2222"));
		if(obj != null)
			System.out.println("[View] " + obj.toString());

		
		
		

	}
}
