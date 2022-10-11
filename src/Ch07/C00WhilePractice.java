package Ch07;

import java.util.Random;
import java.util.Scanner;

public class C00WhilePractice {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//134p 문제3 응용
//		int i;
//		System.out.print("원하는 배수 입력 : ");
//		int input = sc.nextInt();
//		int sum = 0;
//		for(i = 1; i <= 100; i++)
//		{
//			if(i % input == 0)
//				sum += i;
//		}
//		System.out.println("1부터 100까지 " + input + "의 배수의 합 : " + sum);
		
		
		
		//134p 문제4
		//Type A
		//Math.random() 함수는 0~1 사이의 실수를 리턴한다
		//Math.random()*n 을 하면 n까지의 실수범위가 리턴된다.
//		int a = 0, b = 0;
//		int count = 1;
//		while((a + b) != 5)
//		{
//			a = (int)(Math.random() * 6);
//			b = (int)(Math.random() * 6);
//			System.out.printf("(%d, %d)\n", a, b);
//			count++;
//		}
//		System.out.println("시도횟수 : " + count);
		
		//Type B
		//Random 클래스 사용하기
		//정수 .nextInt(원하는 범위); 실수 .nextFloat(원하는 범위);
//		Random random = new Random();
//		int c = 0;
//		int d = 0;
//		int count = 1;
//		while((c + d) != 5)
//		{
//			c = random.nextInt(6);
//			d = random.nextInt(6);
//			System.out.printf("(%d, %d)\n", c, d);
//			count++;
//		}
//		System.out.println("시도횟수 : " + count);
		
		
		
		//135p 문제 5
//		int x;
//		int y;
//		for(x = 1; x <= 10; x++)
//		{
//			for(y = 1; y <= 10; y++)
//			{
//				if(4 * x + 5 * y == 60)
//				{
//					System.out.printf("(%d, %d)\n", x, y);
//				}
//			}
//		}
		
		
		
		//135p 문제 6
//		int x;
//		int y;
//		for(x = 0; x < 5; x++)
//		{
//			for(y = 0; y <= x; y++)
//			{
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		
		
		
		//135p 문제 7
//		boolean run = true;
//		int balance = 0;
//		int input = 0;
//		
//		while(run)
//		{
//			System.out.println("============================");
//			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
//			System.out.println("============================");
//			System.out.print("선택 : ");
//			input = sc.nextInt();
//			
//			if(input == 1)
//			{
//				System.out.print("예금액 : ");
//				balance += sc.nextInt();
//			}
//			
//			else if(input == 2)
//			{
//				System.out.print("출금액 : ");
//				balance -= sc.nextInt();
//			}
//			
//			else if(input == 3)
//			{
//				System.out.println("현재 잔고 : " + balance);
//			}
//			
//			else if(input == 4)
//			{
//				run = false;
//			}
//			
//			else
//			{
//				System.out.println("잘못된 입력입니다");
//			}
//		}
//		System.out.println("프로그램을 종료합니다");
		
			
		
		sc.close();
	}

}
