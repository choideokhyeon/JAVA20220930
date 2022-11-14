package Ch38.View;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Ch38.Controller.FrontController;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDTO;
import Ch38.Domain.MemberDTO;

public class TUIView {
	
	private boolean Loginstate = false;
	private String userid = null;
	private Integer perm = 0;	//0 비회원, 1 회원, 2 관리자(사서)
	
	private FrontController controller = new FrontController();
	
	Scanner sc = new Scanner(System.in);
	int num = 0;
	
	TUIView()
	{
		mainview();
	}
	
	void mainview()
	{
		while(true)
		{
			System.out.println("=================MAIN=================");
			System.out.println("1 도서전체 조회|2 도서대여 요청|3 도서등록 |4 종료");
			System.out.println("=================MAIN=================");
			System.out.print("번호를 입력 하세요 >> ");
			num = sc.nextInt();
			switch(num)
			{
				case 1:
					List<BookDTO> list = (List<BookDTO>)controller.ExSubController("/book", 5, null);
					for(BookDTO dto : list)
					{
						System.out.println("[VIEW] " + dto);
					}
					break;
				case 2:
					if(!Loginstate)	//로그인 상태 확인
					{
						loginview();
					}
					else
					{
						if(perm > 0) //권한 확인
						{
							System.out.print("Bookcode를 입력 : ");
							int bookcode = sc.nextInt();
							LendDTO dto = new LendDTO();
							//boolean Login, int perm, String id, int bookcode
							dto.setLogin(true);
							dto.setPerm(perm);
							dto.setMemid(userid);
							dto.setBookcode(bookcode);
							String msg = (String)controller.ExSubController("/lend", 1, dto);
							System.out.println("[VIEW] " + msg);
						}
						else
						{
							System.out.println("[VIEW-ERROR] 권한이 필요합니다");
						}
					}
					break;
				case 3:
					break;
				case 4:
					System.out.println("[VIEW] 종료합니다.");
					System.exit(-1);
					break;
				default:
			}
		}
	}
	
	
	
	void loginview()
	{
		System.out.println("=================LOGIN=================");
		System.out.print("ID/PW 입력 : ");
		String id = sc.next();
		String pw = sc.next();
		Integer result = (Integer)controller.ExSubController("/auth", 1, new MemberDTO(id, pw));
		if(result != null)
		{
			//권한 1,2를 획득
			Loginstate = true;
			perm = result;
			userid = id;
		}
		else {
			System.out.println("[VIEW-ERROR] 로그인 실패");
		}
	}
	
	void lendview()
	{
		
	}
	
	
	
	
	
	public static void main(String[] args){
		new TUIView();
		
		
		
		
		
	}
}
