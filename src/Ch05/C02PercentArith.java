package Ch05;

import java.util.Scanner;

public class C02PercentArith {

	public static void main(String[] args) throws InterruptedException {
		//%연산자

		//01 홀수/짝수
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("정수 입력 : ");
//		int num1 = sc.nextInt();
//
//		String result = (num1 % 2 == 0) ? "짝수입니다" : "홀수입니다";
//		System.out.println(result);
		
		
		
		// 02 배수 구하기
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1번째 정수 입력 : ");
//		int num1 = sc.nextInt();
//		System.out.print("2번째 정수 입력 : ");
//		int num2 = sc.nextInt();
//		System.out.print("3번째 정수 입력 : ");
//		int num3 = sc.nextInt();
//		
//		int sum = num1 + num2 + num3;
//
//		String result = (sum % 5 == 0) ? "5의 배수입니다" : "5의 배수가 아닙니다";
//		System.out.println("RESULT : " + result);
		
		
		
		// 03 수의범위

//		수%3 = 0 ~ 2
//		수%4 = 0 ~ 3
//		수%100 = 0 ~ 99
		
		//난수생성
		//1) Random rnd = new Random();
//		Random rnd = new Random();
//		while(true)
//		{
//			System.out.println(rnd.nextInt(5));	//N%6 과 동일
//			Thread.sleep(500);
//		}
		
		//2) Math.random();
//		while (true)
//		{
//			System.out.println((int)(Math.random()*100));
//			Thread.sleep(500);
//		}
		
		
		
	
		
		// 04 끝자리수
		
//		int num = 56789;
//		System.out.println("오른쪽 끝 1자리 : "+(num%10));
//		System.out.println("오른쪽 끝 2자리 : "+(num%100));
//		System.out.println("오른쪽 끝 3자리 : "+(num%1000));
//		System.out.println("오른쪽 끝 4자리 : "+(num%10000));
//		System.out.println();
//		System.out.println("왼쪽 끝 1자리 : "+(num/10000));
//		System.out.println("왼쪽 끝 2자리 : "+(num/1000));
//		System.out.println("왼쪽 끝 3자리 : "+(num/100));
//		System.out.println("왼쪽 끝 4자리 : "+(num/10));
		
		
		
		//정수 하나를 입력받아 거꾸로 저장해보세요(반복문 이후 풀어보기)
		//예
		//입력 : 1234
		//출력 : 4321
		
		System.out.println((int)(Math.pow(10, 3)));
		
		
		
		
		
	}

}
