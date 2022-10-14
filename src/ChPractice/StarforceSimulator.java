package ChPractice;

import java.util.Scanner;

class Starforce
{
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int Starforce = 0;
	int Count = 0;
	
	void Success()
	{
		Starforce++;
		System.out.printf("%d성 강화에 성공했습니다!\n", Starforce);
	}
	
	void Failed()
	{
		if(Starforce >= 12)
		{
			Starforce--;
			System.out.printf("[System]12성 이상이여서 등급이 %d성으로 하락합니다\n", Starforce);
		}
		else
			System.out.printf("강화에 실패했습니다! 현재 %d성 입니다.\n", Starforce);
	}
	
	void Crash()
	{
		System.out.println("강화에 실패하여 아이템이 파괴되었습니다");
		System.out.println("스타포스 강화를 종료합니다");
		System.out.printf("%d강까지 시도회수 : %d\n", Starforce, Count);
		run = false;
	}
	
	void Victory()
	{
		Starforce++;
		System.out.println("축하합니다 스타포스 24성을 달성하셨습니다");
		System.out.println("스타포스 강화를 종료합니다");
		System.out.printf("%d강까지 시도회수 : %d\n", Starforce, Count);
		run = false;
	}
	
	void Upgrade()
	{
		while(run)
		{
			System.out.println("=======================");
			System.out.print("스타포스 강화를 실행 하려면 아무거나 입력해주세요");
			String input = sc.nextLine();
			double random = (double)(Math.random()*1000 + 1);
			if(input != null)
			{
				if(Starforce <= 2)
				{
					if(1 <= random && random <= 950 - 5 * Starforce)
					{
						Success();
					}
					else
					{
						Failed();
					}
				}
				
				else if(Starforce <= 14)
				{
					if(1 <= random && random <= 1000 - 5 * Starforce)
					{
						Success();
					}
	
					else
					{
						if(Starforce == 12)
						{
							if(994 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						
						else if(Starforce == 13)
						{
							if(987 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						
						else if(Starforce == 14)
						{
							if(986 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						Failed();
					}
				}
				
				else if(Starforce <= 21)
				{
					if(random <= 300)
					{
						Success();
					}
					
					else
					{
						if(Starforce <= 17)
						{
							if(979 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						
						else if(Starforce <= 19)
						{
							if(971 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						
						else if(Starforce <= 21)
						{
							if(930 <= random && random <= 1000)
							{
								Crash();
								break;
							}
						}
						Failed();
					}
				}
				
				else if(Starforce == 22)
				{
					if(random <= 30)
					{
						Success();
					}
					
					else if(806 <= random && random <= 1000)
					{
						Crash();
						break;
					}
					
					else
					{
						Failed();
					}
				}
				
				else if(Starforce == 23)
				{
					if(random <= 20)
					{
						Success();
					}
					
					else if(706 <= random && random <= 1000)
					{
						Crash();
						break;
					}
					
					else
					{
						Failed();
					}
				}
				
				else
				{
					if(random <= 10)
					{
						Victory();
					}
					
					else if(604 <= random && random <= 1000)
					{
						Crash();
						break;
					}
					
					else
					{
						Failed();
					}
				}
				
				Count++;
				
			}
			
		}
		
	}
}

public class StarforceSimulator {

	public static void main(String[] args) {
		Starforce account = new Starforce();
		
		account.Upgrade();
	}

}
