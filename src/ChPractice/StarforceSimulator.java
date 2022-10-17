package ChPractice;

import java.text.DecimalFormat;
import java.util.Scanner;

class Starforce
{
	//정수에 쉼표를 붙여 String으로 바꾸는 모듈
	DecimalFormat formatter = new DecimalFormat("###,###");
	
	Scanner sc = new Scanner(System.in);
	boolean run = true;
	int Starforce = 0;
	int Count = 0;
	long meso = 0;
	
	void Success()
	{
		Starforce++;
		System.out.printf("%d성 강화에 성공했습니다!\n", Starforce);
		System.out.printf("누적 사용 메소량은 %s메소 입니다\n", formatter.format(meso));
	}
	
	void Failed()
	{
		if(Starforce >= 12)
		{
			System.out.printf("누적 사용 메소량은 %s메소 입니다\n", formatter.format(meso));
			Starforce--;
			System.out.printf("[System]12성 이상이여서 등급이 %d성으로 하락합니다\n", Starforce);
		}
		else
		{
			System.out.printf("누적 사용 메소량은 %s메소 입니다\n", formatter.format(meso));
			System.out.printf("강화에 실패했습니다! 현재 %d성 입니다.\n", Starforce);
		}
	}
	
	void Crash()
	{
		System.out.println("[System]강화에 실패하여 아이템이 파괴되었습니다");
		System.out.println("스타포스 강화를 종료합니다");
		System.out.printf("%d강까지 시도회수 : %d회\n", Starforce, Count);
		System.out.printf("%d강까지 사용메소 : %s메소\n", Starforce, formatter.format(meso));
		run = false;
	}
	
	void Victory()
	{
		Starforce++;
		System.out.println("축하합니다 스타포스 24성을 달성하셨습니다");
		System.out.println("스타포스 강화를 종료합니다");
		System.out.printf("%d강까지 시도회수 : %d회\n", Starforce, Count);
		System.out.printf("%d강까지 사용메소 : %s메소\n", Starforce, formatter.format(meso));
		run = false;
	}
	
	void Upgrade()
	{
		System.out.println("==========================");
		System.out.print("강화할 장비 레벨을 입력하세요 : ");
		int L = sc.nextInt();
		sc.nextLine();
		while(run)
		{
			System.out.println();
			System.out.println("=======================");
			System.out.print("스타포스 강화를 실행 하려면 엔터키를 누르세요");
			String input = sc.nextLine();
			double random = (double)(Math.random()*1000 + 1);
			if(input != null)
			{
				if(Starforce <= 2)
				{
					meso += 1000 + ((Math.pow(L, 3)) * (Starforce + 1) / 25);
					if(1 <= random && random <= 950 - 5 * Starforce)
					{
						Success();
					}
					else
					{
						Failed();
					}
				}
				
				else if(Starforce <= 9)
				{
					meso += 1000 + Math.pow(L, 3) * (Starforce + 1) / 25;
					if(1 <= random && random <= 1000 - 5 * Starforce)
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
					meso += 1000 + Math.pow(L, 3) * Math.pow((Starforce + 1), 2.7) / 400;
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
					meso += 1000 + Math.pow(L, 3) * Math.pow((Starforce + 1), 2.7) / 200;
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
					meso += 1000 + Math.pow(L, 3) * Math.pow((Starforce + 1), 2.7) / 200;
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
					meso += 1000 + Math.pow(L, 3) * Math.pow((Starforce + 1), 2.7) / 200;
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
					meso += 1000 + Math.pow(L, 3) * Math.pow((Starforce + 1), 2.7) / 200;
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
