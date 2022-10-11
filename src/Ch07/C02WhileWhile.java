package Ch07;

import java.util.Scanner;

public class C02WhileWhile {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		//전체 구구단(2~9단) 출력하기
//		int i = 1;
//		int j = 2;
//		while(j <= 9)
//		{
//			i = 1;
//			System.out.printf("===== %d 단 =====\n", j);
//			while(i <= 9)
//			{
//				System.out.printf("%d x %d = %d\n", j, i, j*i);
//				i++;
//			}
//			j++;
//			System.out.println();
//		}
		
		
		//전체 구구단 출력하기(역순)
		int i = 9;
		int j = 9;
		while(j >= 2)
		{
			i = 9;
			System.out.printf("===== %d 단 =====\n", j);
			while(i >= 1)
			{
				System.out.printf("%d x %d = %d\n", j, i, j*i);
				i--;
			}
			j--;
			System.out.println();
		}
		
		
		
		//n 부터 9단까지 전체 출력
//		int i = 1;
//		System.out.print("원하는 단수 입력 (9 미만) : ");
//		int j = sc.nextInt();
//		while(j <= 9)
//		{
//			i = 1;
//			System.out.printf("===== %d 단 =====\n", j);
//			while(i <= 9)
//			{
//				System.out.printf("%d x %d = %d\n", j, i, j*i);
//				i++;
//			}
//			j++;
//		System.out.println();
//		}
		
		
		
		//n단부터 2단까지 역순 출력
//		int i = 9;
//		System.out.print("원하는 단수 입력 (2 이상) : ");
//		int j = sc.nextInt();
//		while(j >= 2)
//		{
//			i = 9;
//			System.out.printf("===== %d 단 =====\n", j);
//			while(i >= 1)
//			{
//				System.out.printf("%d x %d = %d\n", j, i, j*i);
//				i--;
//			}
//			j--;
//			System.out.println();
//		}
		
		
		sc.close();

	}

}
