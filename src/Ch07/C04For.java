package Ch07;

import java.util.Scanner;

public class C04For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
//		int i = 0;		//초기값
//		
//		System.out.println("while문");
//		while(i < 10)	//조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;	//증감연산식
//		}
//		
//		System.out.println("for문");
//		for(i = 0; i < 10; i++)
//		{
//			System.out.println("HELLO WORLD");
//		}
		
		
		
		//1부터 10까지 합
//		int sum = 0;
//		int i;
//		for(i = 0; i <= 10; i++)
//		{
//			sum += i;
//		}
//		System.out.println("sum : " + sum);
		
		
		
		//1부터 N까지 합
//		int sum = 0;
//		System.out.print("정수 입력 : ");
//		int n = sc.nextInt();
//		int i;
//		for(i = 0; i <= n; i++)
//		{
//			sum += i;
//		}
//		System.out.println("1부터 " + n + "까지의 합 : " + sum);

		
		
		//N부터 M까지 합
//		int sum = 0;
//		System.out.print("두개의 정수 입력 : ");
//		int n = sc.nextInt();
//		int m = sc.nextInt();
//		int i = n;
//		
//		if(n > m)
//		{
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		for(i = n; i <= m; i++)
//		{
//			sum += i;
//		}
//		System.out.println(n + "부터 " + m + "까지의 합 : " + sum);
		
		
		
		//구구단 2단
//		int i;
//		for(i = 1; i <= 9; i++)
//		{
//			System.out.printf("2 x %d = %d\n", i, i*2);
//		}
		
		
		
		//구구단 N단
//		int i;
//		System.out.print("계산할 단 입력 : ");
//		int n = sc.nextInt();
//		for(i = 1; i <= 9; i++)
//		{
//			System.out.printf("%d x %d = %d\n", n, i, n*i);
//		}
		
		
		
		//구구단 전체
//		int i;
//		int j;
//		for(j = 2; j <= 9; j++)
//		{
//			System.out.printf("======== %d 단 ========\n", j);
//			for(i = 1; i <= 9; i++)
//			{
//				System.out.printf("%d x %d = %d\n", j, i, j*i);
//			}
//			System.out.println();
//		}
		
		
		//별찍기
		//직각삼각형
//		int i;
//		int j;
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//역직각삼각형
//		int i;
//		int j;
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		for(i = 0; i < n; i++)
//		{
//			for(j = n; j > i; j--)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//정삼각형
		//   *
		//  ***
		// *****
		//*******
//		int i;
//		int j;
//		int k;
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j < n - i - 1; j++)
//				System.out.print(" ");
//			
//			for(k = 0; k < 2 * i + 1; k++)
//				System.out.print("*");
//		
//			System.out.println();
//		}
		
		
		
		//역정삼각형
		//*******
		// *****
		//  ***
		//   *
//		int i;
//		int j;
//		int k;
//		System.out.print("높이 입력 : ");
//		int n = sc.nextInt();
//		for(i = 0; i < n; i++)
//		{
//			for(j = 0; j < i; j++)
//				System.out.print(" ");
//			
//			for(k = 0; k < 2*n - 2*i - 1; k++)
//				System.out.print("*");
//			
//			System.out.println();
//		}
		
		
		
		//다이아몬드
		//  *
		// ***
		//*****
		// ***
		//  *
		int i;
		int j;
		int k;
		System.out.print("중간 높이 입력 : ");
		int n = sc.nextInt();
		for(i = 0; i < 2*n - 1; i++)
		{
			if(i < n)
			{
				for(j = 0; j < n - i - 1; j++)
					System.out.print(" ");
				for(k = 0; k < 1 + 2*i ; k++)
					System.out.print("*");
				System.out.println();
			}
			
			else
			{
				for(j = 0; j < i - n + 1; j++)
					System.out.print(" ");
				for(k = 0; k < 4*n - 2*i - 3; k++)
					System.out.print("*");
				System.out.println();
			}
		}
		
		
		
		//단어 거꾸로 만들기
//		System.out.print("단어 입력 : ");
//		String str = sc.nextLine();
//		int i;
//		for(i = str.length()-1; i >= 0; i--)
//		{
//			System.out.print(str.charAt(i));
//		}
		
		
	}

}
