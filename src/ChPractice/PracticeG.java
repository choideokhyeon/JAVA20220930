package ChPractice;

import java.util.Scanner;

//8450 = 10000
//4250 = 5000
//2570 = 3200

class kakin
{
	int jewel = 0;
	int money = 0;
	int jewelstack = 0;
	int SSRstack = 0;
	int SRstack = 0;
	int Rstack = 0;
	Scanner sc = new Scanner(System.in);
	void purchase()
	{
		System.out.println("=========================================");
		System.out.println("1)8450個 | 2)4200個 | 3)2570個 | 4)残りジュエル確認");
		System.out.println("=========================================");
		System.out.print("チャージするジュエル入力 > ");
		int input = sc.nextInt();
		if(input == 1)
		{
			System.out.println("8450ジュエルチャージします。");
			jewel += 8450;
			System.out.printf("今の残りジュエルは%d個です。\n", jewel);
			money += 10000;
			System.out.printf("支払ったお金は総合%d円です。\n", money);
		}
		
		else if(input == 2)
		{
			System.out.println("4200ジュエルチャージします。");
			jewel += 4200;
			System.out.printf("今の残りジュエルは%d個です。\n", jewel);
			money += 5000;
			System.out.printf("支払ったお金は総合%d円です。\n", money);
		}
		
		else if(input == 3)
		{
			System.out.println("2570ジュエルチャージします。");
			jewel += 2570;
			System.out.printf("今の残りジュエルは%d個です。\n", jewel);
			money += 3200;
			System.out.printf("累積総課金額は%d円です。\n", money);
		}
		
		else if(input == 4)
		{
			System.out.printf("今の残りジュエルは%d個です。\n", jewel);
		}
		
		else
		{
			System.out.println("不具合が発生しましたので最初からやり直してください。");
		}
		System.out.println();
	}
	
}

public class PracticeG {

	public void main(String[] args) throws InterruptedException {
		kakin account = new kakin();
		Scanner sc = new Scanner(System.in);

		int SSRstack = 0;
		int SRstack = 0;
		int Rstack = 0;
		int Jewelstack = 0;
		boolean run1 = true;
		boolean run2 = false;
		
		while(run1)
		{
			System.out.println("ガシャ回しますか？ (1.はい | 2.いいえ | 3.ジュエルチャージ)");
			System.out.print("入力 > ");
			int input1 = sc.nextInt();
			if(input1 == 1)
			{
				run2 = true;
				run1 = false;
			}
			
			else if(input1 == 2)
			{
				System.out.println("ガシャを回しません。");
				System.out.printf("今まで使ったジュエルは%d個、累積課金額は%d円です。\n", Jewelstack, account.money);
				System.out.println("ガシャシミュレーターを終了致します。");
				run1 = false;
			}
			
			else if(input1 == 3)
			{
				account.purchase();
			}
			
			else
			{
				System.out.println("不具合が発生しましたのでやり直してください。");
				continue;
			}
		
		
			while(run2)
			{
				
				if(account.jewel < 2500)
				{
					System.out.println("ジュエルが足りないです。");
					account.purchase();
					continue;
				}
				else
				{
					System.out.println("=================================");
					System.out.println("1.10回　引く | 2.ジュエルチャージに戻る");
					System.out.println("=================================");
					System.out.print("入力 > ");
					int input2 = sc.nextInt();
					if(input2 == 1)
					{
						account.jewel -= 2500;
						Jewelstack += 2500;
						System.out.println("2500ジュエルで10回引きます");
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
						System.out.printf("残りジュエルは%d個、総合累積金額は%d円です。\n", account.jewel, account.money);
						System.out.println("==========累積カード枚数==========");
						System.out.printf("SSR:%d | SR:%d | R:%d\n", SSRstack, SRstack, Rstack);
						System.out.println("==============================");
						int sum = SSRstack + SRstack + Rstack;
						if(SSRstack != 0)
						{
							double avg = (double)SSRstack / sum * 100;
							System.out.printf("現在までのSSR獲得確率 : %.2f%%\n", avg);
						}
						else
							System.out.println("現在までのSSR獲得確率 : 0%");
						System.out.println();
					}
					
					else if(input2 == 2)
					{
						System.out.println("ジュエルチャージに戻ります");
						run2 = false;
						run1 = true;
					}
					
					else
					{
						System.out.println("不具合が発生しましたのでやり直してください");
						continue;
					}
				}
				
			}
			
		}
		
		
		
		
	}

}
