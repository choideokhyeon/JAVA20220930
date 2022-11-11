package Ch99.TEST;

import java.util.Scanner;

import Ch99.Controller.FrontController;
import Ch99.Domain.UserDTO;

public class test {

	public static void main(String[] args) {
		FrontController controller = new FrontController();
//		Scanner sc = new Scanner(System.in);
//		System.out.print("생성할 아이디를 입력하세요 : ");
//		String name = sc.next();
//		System.out.print("생성할 비밀번호를 입력하세요 : ");
//		String pwd = sc.next();
//		Object obj = controller.ExSubController("/user", 1, new UserDTO(0, name, pwd, 0, 0));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("아이디를 입력하세요 : ");
		String name = sc.next();
//		System.out.print("비밀번호를 입력하세요 : ");
//		String pwd = sc.next();
//		controller.ExSubController("/user", 1, new UserDTO(name,pwd));
//		controller.ExSubController("/auth", 1, new UserDTO(name,pwd));
		controller.ExSubController("/auth", 2, new UserDTO(name));
//		controller.ExSubController("/user", 2, new UserDTO(name));

	}

}
