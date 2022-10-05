package ChPractice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args)
	{	
//		직각삼각형 별 찍기
//		int i;
//		int j;
//		
//		for(i = 0; i < 5; i++)
//		{
//			for(j = 0; j <= i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		역직각삼각형 별 찍기
//		int i;
//		int j;
//		
//		for(i = 5; i >= 0; i--)
//		{
//			for(j = 0; j < i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		피라미드 별 찍기
//		int i;
//		int j;
//		int k;
//		
//		for(i = 0; i < 4; i++)
//		{
//			for(k = 0; k < 3-i; k++)
//			{
//				System.out.print(" ");
//			}
//			for(j = 0; j < 2 * i + 1; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		역피라미드 별 찍기
//		int i;
//		int j;
//		int k;
//		
//		for(i = 0; i < 4; i++)
//		{
//			for(k = 0; k < i; k++)
//			{
//				System.out.print(" ");
//			}
//			for(j = 0; j < 7 - 2 * i; j++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		입력값 받아 피라미드 만들기
//		int i;
//		int j;
//		int k;
//		int input;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("피라미드의 층을 입력하세요 : ");
//		input = sc.nextInt();
//		
//		for(i = 0; i < input; i++)
//		{
//			for(j = 0; j < input - i - 1; j++)
//			{
//				System.out.print(" ");
//			}
//			for(k = 0; k < 2 * i + 1; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
//		
//		sc.close();
		
		
		
//		입력값 받아 역피라미드 만들기
//		int i;
//		int j;
//		int k;
//		int input;
//		Scanner sc = new Scanner(System.in);
//		System.out.print("피라미드의 층을 입력하세요 : ");
//		input = sc.nextInt();
//		
//		for(i = 0; i < input; i++)
//		{
//			for(j = 0; j < i; j++)
//			{
//				System.out.print(" ");
//			}
//			for(k = 0; k < 2 * (input - i) - 1 ; k++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
//		다이아몬드 만들기
//		int i;
//		int j;
//		int k;
//		
//			for(i = 0; i < 7; i++)
//			{
//				if(i < 4)
//				{
//					for(j = 0; j < 3 - i; j++)
//					{
//						System.out.print(" ");
//					}
//					for(k = 0; k < 2 * i + 1; k++)
//					{
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//				else if(i >= 4)
//				{
//					for(j = 0; j < i - 3; j++)
//					{
//						System.out.print(" ");
//					}
//					for(k = 0; k < 13 - 2 * i; k++)
//					{
//						System.out.print("*");
//					}
//					System.out.println();
//				}
//			}
			
			
			
//		입력값 받아서 다이아몬드 만들기
		int i;
		int j;
		int k;
		int input;
		Scanner sc = new Scanner(System.in);
		System.out.print("다이아몬드의 중간높이를 입력하세요 : ");
		input = sc.nextInt();
		
		for(i = 0; i < (2 * input) - 1; i++)
		{
			if(i < input)
			{
				for(j = 0; j < input - i - 1; j++)
				{
					System.out.print(" ");
				}
				for(k = 0; k < 2 * i + 1; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			else if(i == input)
			{
				for(j = 0; j < i - input + 1; j++)
				{
					System.out.print(" ");
				}
				for(k = 0; k < 2 * i - 3; k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
			
			else
			{
				for(j = 0; j < i - input + 1; j++)
				{
					System.out.print(" ");
				}
				for(k = 0; k < (4 * input - 3) - (2 * i); k++)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		
		
		
		sc.close();
	}

}
