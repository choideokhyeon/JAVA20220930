package ChPractice;

import java.util.Scanner;

//8450 = 10000
//4250 = 5000
//2570 = 3200

class kakin
{
	int jewel = 0;
	int money = 0;
	Scanner sc = new Scanner(System.in);
	void purchase()
	{
		System.out.println("=========================================");
		System.out.println("1)8450개 | 2)4200개 | 3)2570개 | 4)쥬얼 확인");
		System.out.println("=========================================");
		System.out.print("충전할 쥬얼을 선택하세요 > ");
		int input = sc.nextInt();
		if(input == 1)
		{
			System.out.println("8450 쥬얼을 충전합니다");
			jewel += 8450;
			System.out.printf("현재 보유 쥬얼은 %d 개 입니다\n", jewel);
			money += 10000;
			System.out.printf("총 결제 금액은 %d 엔 입니다\n", money);
		}
		
		else if(input == 2)
		{
			System.out.println("4200 쥬얼을 충전합니다");
			jewel += 4200;
			System.out.printf("현재 보유 쥬얼은 %d 개 입니다\n", jewel);
			money += 5000;
			System.out.printf("총 결제 금액은 %d 엔 입니다\n", money);
		}
		
		else if(input == 3)
		{
			System.out.println("2570 쥬얼을 충전합니다");
			jewel += 2570;
			System.out.printf("현재 보유 쥬얼은 %d 개 입니다\n", jewel);
			money += 3200;
			System.out.printf("총 결제 금액은 %d 엔 입니다\n", money);
		}
		
		else if(input == 4)
		{
			System.out.printf("현재 보유 쥬얼은 %d 개 입니다\n", jewel);
		}
		
		else
		{
			System.out.println("잘못된 입력입니다 다시 시도하세요");
		}
		System.out.println();
	}
}

public class PracticeG {

	public static void main(String[] args) throws InterruptedException {
		kakin account = new kakin();

		int SSRstack = 0;
		int SRstack = 0;
		int Rstack = 0;
		int Jewelstack = 0;
		boolean run = true;
		
		while(run)
		{
			
			if(account.jewel < 2500)
			{
				System.out.println("쥬얼이 부족합니다");
				account.purchase();
				continue;
			}
			else
			{
				int sum = SSRstack + SRstack + Rstack;
				account.jewel -= 2500;
				Jewelstack += 2500;
				System.out.println("2500쥬얼을 사용해 10연 가챠를 진행합니다");
				for(int i = 1; i <= 10; i++)
				{
					Thread.sleep(500);
					double random = (int)(Math.random() * 100 + 1);
					if(1 <= random && random <= 3)
					{
						System.out.println("★SSR★");
						SSRstack++;
					}
					
					else if(4 <= random && random <= 13)
					{
						System.out.println("SR");
						SRstack++;
					}
					
					else
					{
						System.out.println("Rare");
						Rstack++;
					}
				}
				System.out.printf("총 사용 쥬얼은 %d개이며 결제 금액은 %d엔 입니다\n", Jewelstack, account.money);
				System.out.println("==========누적 카드 개수==========");
				System.out.printf("SSR:%d | SR:%d | R:%d\n", SSRstack, SRstack, Rstack);
				System.out.println("==============================");
				if(SSRstack != 0)
				{
					double avg = (double)SSRstack / sum * 100;
					System.out.printf("현재까지 SSR 획득 확률 : %f\n", avg);
				}
				else
					System.out.println("현재까지 SSR 획득 확률 : 0");
				System.out.println();
			}
		}
		
		
		
		
	}

}
