package ChPractice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
		//do while
		
		System.out.println("메세지를 입력하세요");
		System.out.println("프로그램을 종료하려면 q 를 입력하세요");
		
		Scanner sc = new Scanner(System.in);
		String inputString;
		
		do{
			System.out.print(">");
			inputString = sc.nextLine();
			System.out.println(inputString);
		} while( ! inputString.equals("q"));	//while문이 참이면 do 반복실행
												//while문이 거짓이면 종료
		
		System.out.println();
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
