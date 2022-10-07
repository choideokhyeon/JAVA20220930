package Ch04;

import java.util.Scanner;

public class C04Practice {

	public static void main(String[] args) {
		
//		--------------------------------------------------------
//		문제
//		--------------------------------------------------------
//		1 Scanner 를 이용해서 키보드로 입력한 두수를 덧셈하여 결과를 출력해보세요
		
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("첫번째 수 : ");
//		String strNum1 = scanner.nextLine();
//		
//		System.out.print("두번째 수 : ");
//		String strNum2 = scanner.nextLine();
//		
//		int num1 = Integer.parseInt(strNum1);
//		int num2 = Integer.parseInt(strNum2);
//		
//		int result = num1 + num2;
//		System.out.println("덧셈 결과 : " + result);
		
		
		
//		2 Scanner를 이용해서 이름, 주미번호 앞 6자리 , 전화번호를 키보드에서
//		입력받고 출력하는 코드를 작성해보세요
//
//		[예시]
//		----------------------------
//		[필수 정보 입력]
//		1. 이름 : ______________ENTER
//		2. 주민번호 6자리 : ______________ENTER
//		3. 전화번호 : ____________ENTER
//
//		[입력한 내용]
//		이름 : 홍길동
//		주민번호 : 123456
//		PH : 010-222-3333
//		----------------------------
		
		Scanner sc = new Scanner(System.in);
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름 : ");
		String name = sc.next();
		System.out.print("2. 주민번호 6자리 : ");
		String id = sc.next();
		System.out.print("3. 전화번호 : ");
		String tel = sc.next();
		
		System.out.println("[입력한 내용]");
		System.out.println("이름 : " + name);
		System.out.println("주민번호 : " + id);
		System.out.println("PH : " + tel);
		
		
		
		
		
	}

}
