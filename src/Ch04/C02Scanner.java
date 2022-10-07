package Ch04;

import java.util.Scanner;

public class C02Scanner {

	public static void main(String[] args) {
		System.out.println("---------------Scanner Test---------------");
		Scanner sc = new Scanner(System.in);
		
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.println("입력된 정수 값 : " + num1);
//		
//		System.out.print("실수 입력 : ");
//		double num2 = sc.nextDouble();
//		System.out.println("입력된 실수 값 : " + num2);
		
//		System.out.print("문자열 입력 : ");
//		String str1 = sc.next();		//문자열 입력받기 기능 함수, 띄워쓰기는 포함하지 않음
//		System.out.println("입력된 문자열 : " + str1);
//		System.out.print("입력 : ");
//		String s1 = sc.next();
//		String s2 = sc.next();
//		String s3 = sc.next();
//		System.out.printf("문자열 : %s %s %s\n", s1, s2, s3);
		
//		sc.nextLine();	//버퍼 공간에 남아있는 데이터값을 초기화
		
		
		System.out.printf("수 입력 : ");
		int num = sc.nextInt();
		sc.nextLine();
		System.out.print("문자열 입력(띄워쓰기 포함 문자열) : ");
		String str = sc.nextLine();	//문자열 입력받기 기능 함수, 띄워쓰기 포함
		System.out.println("입력된 문자열 : " + str);
		
		sc.close();
	}

}
