package Ch06;

import java.util.Scanner;

public class C01APractice {

	public static void main(String[] args) {
		//if 문만 사용해서 풀기
		Scanner sc = new Scanner(System.in);
		
		// 문제
		// 정수 한개값을 입력받아 3의 배수이면 해당 수를 출력하세요
//		System.out.print("정수를 입력하세요 : ");
//		int n = sc.nextInt();
//		if(n % 3 == 0)
//		{
//			System.out.println(n);
//		}

		
		// 문제
		// 두수를 입력받아 두수 중에 큰수를 출력
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		
//		if(n1 > n2)
//		{
//			System.out.print(n1);
//		}
//		
//		if(n2 > n1)
//		{
//			System.out.print(n2);
//		}
		
		
		
		// 문제
		// 세개의 정수를 입력받아 해당수의 합과 평균을 출력
//		System.out.print("첫번째 정수를 입력하세요 : ");
//		int n1 = sc.nextInt();
//		System.out.print("두번째 정수를 입력하세요 : ");
//		int n2 = sc.nextInt();
//		System.out.print("세번째 정수를 입력하세요 : ");
//		int n3 = sc.nextInt();
//		int sum = n1 + n2 + n3;
//		double avg = (double)(n1 + n2 + n3) / 3;
//		System.out.println("세 수의 합은 " + sum + " 이고 평균은 " + avg + " 입니다");
		
		
		// 문제
		// 세 정수를 입력받아 세 정수 중에 가장 큰 수와 가장 작은 수를 출력
		System.out.print("첫번째 정수를 입력하세요 : ");
		int n1 = sc.nextInt();
		System.out.print("두번째 정수를 입력하세요 : ");
		int n2 = sc.nextInt();
		System.out.print("세번째 정수를 입력하세요 : ");
		int n3 = sc.nextInt();
		if(n1 > n2 && n1 > n3)
		{
			System.out.println("가장 큰 수는 " + n1 + " 입니다");
			if(n2 > n3)
			{
				System.out.println("가장 작은 수는 " + n3 + " 입니다");
			}
			else
				System.out.println("가장 작은 수는 " + n2 + " 입니다");
		}
		
		else if(n2 > n1 && n2 > n3)
		{
			System.out.println("가장 큰 수는 " + n2 + " 입니다");
			if(n1 > n3)
			{
				System.out.println("가장 작은 수는 " + n3 + " 입니다");
			}
			else
				System.out.println("가장 작은 수는 " + n1 + " 입니다");
		}
		
		else
		{
			System.out.println("가장 큰 수는 " + n3 + " 입니다");
			if(n1 > n2)
			{
				System.out.println("가장 작은 수는 " + n2 + " 입니다");
			}
			else
				System.out.println("가장 작은 수는 " + n1 + " 입니다");
		}
			
	}

}
