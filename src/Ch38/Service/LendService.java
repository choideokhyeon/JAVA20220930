package Ch38.Service;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import Ch38.Domain.BookDAO;
import Ch38.Domain.BookDTO;
import Ch38.Domain.LendDAO;
import Ch38.Domain.LendDTO;

public class LendService {
	
	BookDAO BDAO = BookDAO.getInstance();
	LendDAO LDAO = LendDAO.getInstance();
	
	//싱글톤 패턴 추가
	private static LendService instance;
	
	public static LendService getInstance()
	{
		if(instance == null)
			instance = new LendService();
		return instance;
	}
	
	private LendService() {}
	
	public boolean LendBook(boolean Login, int perm, String id, int bookcode)
	{
		//1 로그인 상태 + 대여권한 있는지
		if(Login == true && perm >= 1)	//0비회원, 1회원, 2사서(관리자)
		{	
			//2 도서 대여 가능확인(BookDAO 의 select 함수로 확인)
			BookDTO BDTO = BDAO.Select(bookcode);
			if(BDTO.isLend())	//도서 대여 가능
			{
				//3 도서 상태 정보 수정(대여불가능상태로)
				BDTO.setLend(false);
				
				
				//4 tbl_lend에 도서 정보 저장(LendDAO의 insert함수로 처리)
				//int lid, int bookcode, String memid, String startDate, String endDate
				//대여날짜, 반납날짜(7일후)
				SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd");	//DataFormat지정 객체
				Calendar cal = Calendar.getInstance();						//날짜정보객체
				String start = fmt.format(cal.getTime()).toString();		//현재 날짜정보를 문자열로 저장 start
				cal.add(Calendar.DATE, 7);									//7일 이후 날짜로 등록 
				String end = fmt.format(cal.getTime()).toString();			//7일 이후 날짜정보를 문자열로 저장 end
				
				//Table 수정 처리
//				BDAO.Update(BDTO);	//성공
//				int result = LDAO.Insert(new LendDTO(0,BDTO.getBookCode(),id,start,end));	//실패
				int result = LDAO.Insert(BDTO,new LendDTO(0,BDTO.getBookCode(),id,start,end));
		
				//5 결과 Controller로 반환
				if(result > 0)
					return true;
			}
		
		}
		return false;
	}
}
