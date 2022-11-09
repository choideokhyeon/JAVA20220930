package Ch38.Service;

import Ch38.Domain.BookDAO;
import Ch38.Domain.BookDTO;

public class BookService {
	
	private BookDAO dao = BookDAO.getInstance();
	
	//싱글톤 패턴 코드 추가
	private BookService instance;
	public BookService getInstance()
	{
		if(instance == null)
			instance = new BookService();
		return instance;
	}
	
	public BookService() {}
	
	
	//도서 조회하기
	//도서 등록하기
	
//	--내일
	//(권한 확인 후 도서 등록하기)
	public boolean RegisterBook(BookDTO dto, int permission)
	{
		boolean isRegisterOK = true;
//		권한 체크(등록가능 여부)
		
		if(permission >= 3)
		{
			int result = dao.Insert(dto);
			if(result > 0)
				return true;
		}
		
		return false;
	}
	
	
	//도서 수정하기
	//도서 삭제하기
	//기타..
}
