package ChPractice;

import java.util.Scanner;

class Account
{
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance)
	{
		super();
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	@Override
	public String toString() {
		return "[예금주:" + owner + ", 계좌번호:" + ano + ", 통장잔고:" + balance + "]";
	}
	
}

public class BankApplication {
	
	private static Scanner sc = new Scanner(System.in);
	private static Account[] accountArray = new Account[100];
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run)
		{
			System.out.println("==================================");
			System.out.println("1.계좌생성|2.계좌목록|3.예금|4.출금|5.종료");
			System.out.println("==================================");
			System.out.print("선택 > ");
			int selectNo = sc.nextInt();
			
			if(selectNo == 1)
			{
				createAccount();
			}
			
			else if(selectNo == 2)
			{
				accountList();
			}
			
			else if(selectNo == 3)
			{
				deposit();
			}
			
			else if(selectNo == 4)
			{
				withdraw();
			}
			
			else if(selectNo == 5)
			{
				run = false;
			}
		}
		System.out.println("프로그램 종료");
		

	}

	private static void createAccount()
	{
		System.out.println("계좌를 생성합니다");
		System.out.println("------------");
		System.out.print("계좌번호 : ");
		String accountnum = sc.next();
		sc.nextLine();
		System.out.print("예금주명 : ");
		String accountname = sc.nextLine();
		System.out.print("초기예금액 : ");
		int accountbalance = sc.nextInt();
		
		Account newAccount = new Account(accountnum, accountname, accountbalance);
		
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] == null)
			{
				accountArray[i] = newAccount;
				break;
			}
		}
		System.out.printf("%s 님의 계좌가 생성되었습니다\n", accountname);
	}
	
	private static void accountList()
	{
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] != null)
				System.out.println(accountArray[i]);
		}
	}
	
	private static void deposit()
	{
		System.out.print("계좌번호를 입력하세요 : ");
		String ano = sc.next();
		System.out.print("예금할 금액을 입력하세요 : ");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance() + balance);
		System.out.printf("%d 원이 입금되었습니다\n", balance);
	}
	
	private static void withdraw()
	{
		System.out.print("계좌번호를 입력하세요 : ");
		String ano = sc.next();
		System.out.print("출금할 금액을 입력하세요 : ");
		int balance = sc.nextInt();
		Account account = findAccount(ano);
		account.setBalance(account.getBalance() - balance);
		System.out.printf("%d 원이 출금되었습니다\n", balance);
	}
	
	private static Account findAccount(String ano)
	{
		Account account = null;
		for(int i = 0; i < accountArray.length; i++)
		{
			if(accountArray[i] != null)
			{
				String accountnum = accountArray[i].getAno();
				if(accountnum.equals(ano))
				{
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}
