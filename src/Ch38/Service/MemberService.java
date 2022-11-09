package Ch38.Service;

import Ch38.Domain.MemberDAO;
import Ch38.Domain.MemberDTO;

public class MemberService {
	
	private MemberDAO dao = MemberDAO.getInstance();
	
	//싱글톤 패턴 추가
	private MemberService instance;
	public MemberService getInstance()
	{
		if(instance == null)
			instance = new MemberService();
		return instance;
	}
	
	public MemberService() {}
	
	//멤버 조회하기
	//멤버 등록하기
	
//	--내일
	//(권한 확인 후 멤버 등록하기)
	public boolean RegisterMember(MemberDTO dto)
	{
		int result = dao.Insert(dto);
		if(result > 0)
			return true;
		return false;
	}
	
	
	//멤버 수정하기
	//멤버 삭제하기
	//기타..
}
