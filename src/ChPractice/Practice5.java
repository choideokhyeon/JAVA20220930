package ChPractice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(run)
		{
			System.out.println("------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------");
			System.out.print("선택 > ");
			
			int input = sc.nextInt();
			if(input == 1)
			{
				System.out.print("예금액을 입력하세요 > ");
				balance += sc.nextInt();
			}
			else if(input == 2)
			{
				System.out.print("출금액을 입력하세요 > ");
				balance -= sc.nextInt();
			}
			else if(input == 3)
			{
				System.out.println("현재 잔고는 " + balance + "원 입니다");
			}
			else if(input == 4)
			{
				run = false;
			}
			else
			{
				System.out.println("잘못된 숫자입니다 다시 입력하세요");
				continue;
			}
		}
		
		System.out.println("프로그램 종료");
		
		sc.close();
	}

}
