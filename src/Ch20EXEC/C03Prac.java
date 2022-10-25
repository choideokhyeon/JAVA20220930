package Ch20EXEC;

import java.util.*;

import org.mindrot.bcrypt.BCrypt;

public class C03Prac {
	
	public static void main(String[] args) throws ClassNotFoundException {
	
		
		int num = 0;
		//Map 만들기
		Map<String,String> map = new HashMap();
		Scanner sc = new Scanner(System.in);
		String id=null;
		String pw=null;
		while(true) {
			System.out.println("=======M E N U =======");
			System.out.println("1 ID/PW 등록");
			System.out.println("2 ID/PW 조회");
			System.out.println("3 Password 변경");
			System.out.println("4 ID/PW 삭제");
			System.out.println("5 전체조회");
			System.out.println("6 종료");
			System.out.println("=======M E N U =======");
			System.out.print("번호 : " );
			num = sc.nextInt();
			switch(num)
			{
			case 1:
				//map 에 ID/PW등록
				//단! 기존에 동일 ID가 있으면 등록불가(containsKey사용)
				System.out.print("ID : ");
				id=sc.next();
				if(map.containsKey(id)) {
					System.out.println("동일 ID 존재합니다.");
					break;
				}
				System.out.print("PW : ");
				pw=sc.next();
				pw = BCrypt.hashpw(pw,BCrypt.gensalt());
				System.out.println("PW : "+ pw);
				map.put(id, pw);
				break;
				
			case 2:
				//ID를 받아서 map에 있는 동일한 Id/pw 를 출력
				System.out.print("ID : ");
				id = sc.next();
				System.out.println("-----------확인-----------");
				pw = map.get(id);
				System.out.println("ID : " + id + " PW : " + pw);
				break;
				
			case 3:
				//ID를 받아서 map에 있는 동일한 id의 password를 변경 
				System.out.print("ID : ");
				id = sc.next();
				System.out.print("PW : ");
				pw = sc.next();
				
				if(map.containsKey(id) && BCrypt.checkpw(pw, map.get(id)))
				{
					System.out.print("변경 PW : ");
					pw = sc.next();
					map.put(id, BCrypt.hashpw(pw, BCrypt.gensalt()));	//다시 삽입(최근에 삽입된 K:V 적용)
				}
				
				else
					System.out.println("ID/PW가 일치하지 않습니다");
				break;
				
			case 4:
				//ID를 받아서 map에 있는 동일한 id/pw를 삭제
				break;
				
			case 5:
				//전체조회
				break;
				
			case 6:
				System.exit(-1);
				
			default:
				System.out.println("다시 입력...");
			}
		}
	}
}
