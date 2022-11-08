package TEST;

import Ch38Domain.BookDTO;
import Ch38Service.BookService;

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
		BookService service = new BookService();
//		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 0);	//권한은 3 이상일때만 허용 -> 실패
		boolean flag = service.RegisterBook(new BookDTO(2020, "윤성우C언어"), 3);	//권한은 3 이상일때만 허용 -> 성공
		if(flag)
			System.out.println("Register Insert 성공!");
		else
			System.out.println("Register Insert 실패!");
		

	}
}