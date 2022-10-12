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
//		int i = 9;
//		int j = 9;
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
		
		
		
		//1
		//*****
		//*****
		//*****
		//*****
//		System.out.print("높이 입력 : ");
//		int input = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < input)
//		{
//			j = 0;
//			while(j < 5)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//2
		//*
		//**
		//***
		//****
//		System.out.print("높이 입력 : ");
//		int input = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < input)
//		{
//			j = 0;
//			while(j <= i)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//3
		//****
		//***
		//**
		//*
//		System.out.print("높이 입력 : ");
//		int input = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		while(i < input)
//		{
//			j = input;
//			while(j > i)
//			{
//				System.out.print("*");
//				j--;
//			}
//			System.out.println();
//			i++;
//		}
		
		
		
		//4
		//   *
		//  ***
		// *****
		//*******
//		System.out.print("높이 입력 : ");
//		int input = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < input)
//		{
//			j = 0;
//			k = 0;
//			while(k < input - i - 1)
//			{
//				System.out.print(" ");
//				k++;
//			}
//			
//			while(j <= 2 * i)
//			{	
//				System.out.print("*");
//				j++;
//			}
//			
//			System.out.println();
//			i++;
//		}
		
		
		
		//5
		//*******
		// *****
		//  ***
		//   *
//		System.out.print("높이 입력 : ");
//		int input = sc.nextInt();
//		int i = 0;
//		int j = 0;
//		int k = 0;
//		while(i < input)
//		{
//			k = 0;
//			j = 0;
//			while(k < i)
//			{
//				System.out.print(" ");
//				k++;
//			}
//			
//			while(j < 2 * (input - i) - 1)
//			{
//				System.out.print("*");
//				j++;
//			}
//			System.out.println();
//			i++;
//		}
			
			
			
		//6
		//   *
		//  ***
		// *****
		//*******
		// *****
		//  ***
		//   *
		System.out.print("중간 높이 입력 : ");
		int input = sc.nextInt();
		int i = 0;
		int j = 0;
		int k = 0;
		while(i < 2 * input - 1)
		{
			j = 0;
			k = 0;
			if(i < input)
			{
				while(k < input - 1 - i)
				{
					System.out.print(" ");
					k++;
				}
				
				while(j < 2 * i + 1)
				{
					System.out.print("*");
					j++;
				}
			}
			
			else
			{
				while(k < i - input + 1)
				{
					System.out.print(" ");
					k++;
				}
				
				while(j < 4 * input - 2 * i - 3)
				{
					System.out.print("*");
					j++;
				}
			}
			
			System.out.println();
			i++;
		}
		
		
		sc.close();

	}

}
