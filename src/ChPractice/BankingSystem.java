package ChPractice;

import java.util.*;

public class BankingSystem {
	static Map <String, Integer> Bank = new HashMap();
	
	static Scanner sc = new Scanner(System.in);
	
	public static void NewAccount()
	{
		
	}
	
	public static void ShowInfo()
	{
		System.out.println("전체 계좌를 열람합니다");
	}
	
	public static void FindAccount(String name)
	{

	}

	public static void main(String[] args) {
		BankingSystem bank = new BankingSystem();
		
		while(true)
		{
			System.out.println("=========================");
			System.out.println("1.신규계좌|2.예금하기|3.출금하기");
			System.out.println("4.계좌열람|5.잔액조회|6.종료하기");
			System.out.println("=========================");
			System.out.print("입력하세요 >> ");
			int input = sc.nextInt();
			if(input == 1)
			{
				System.out.print("성함을 입력하세요 >> ");
				String name = sc.next();
				System.out.print("계좌번호를 입력하세요 >> ");
				int anum = sc.nextInt();
				continue;
			}
			
			else if(input == 2)
			{
				
			}
			
			else if(input == 4)
			{
				ShowInfo();
			}
			
			else if(input == 5)
			{
				System.out.print("검색하실 성함을 입력하세요 : ");
				String name = sc.next();
			}
			
			else if(input == 6)
			{
				System.out.println("뱅킹 시스템을 종료합니다");
				break;
			}
			
			else
				System.out.println("잘못된 입력입니다 다시 입력하세요");
		}
	}

}
