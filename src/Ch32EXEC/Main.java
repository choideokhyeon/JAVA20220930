package Ch32EXEC;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		MemberDAO dao = new MemberDAO();
		//Insert
//		boolean flag = dao.Insert("exam1@exam.com", "대구", "010-1111-2222");
//		System.out.println("성공여부 : " + flag);
		
//		boolean flag = dao.Insert(new MemberDTO(0, "exam2@exam.com", "서울", "010-2222-3333"));
//		System.out.println("성공여부 : " + flag);
		
		//Search
//		boolean flag = dao.Search("exam2@exam.com");
//		System.out.println("성공여부 : " + flag);
//		boolean flag = dao.SearchAll();
//		System.out.println("성공여부 : " + flag);
//		Scanner sc = new Scanner(System.in);
//		System.out.print("변경할 주소 : ");
//		String addr = sc.next();
//		System.out.print("변경할 연락처 : ");
//		String phone = sc.next();
//		System.out.print("불러올 이메일 : ");
//		String email = sc.next();
		boolean flag = dao.Update(new MemberDTO(0, "exam1@exam.com", "부산", "010-1818-1818"));
		System.out.println("성공여부 : " + flag);
	}
}
