package ChPractice;

import java.util.Random;
import java.util.Scanner;

//8450 = 10000
//4250 = 5000
//2570 = 3200

class Gacha
{
	String[] SSR = {
			"★[SSR]松田亜利沙★",
			"★[SSR]市ヶ谷有咲★",
			"★[SSR]小豆沢こはね★",
			"★[SSR]安部菜々★",
			"★[SSR]上杉ウエバスキョーコ★"};
	
	String[] SR = {
			"[SR]田中琴葉",
			"[SR]高坂海美",
			"[SR]佐藤心",
			"[SR]戸山香澄",
			"[SR]山吹沙綾"};
	
	String[] R = {
			"[R]舞浜歩",
			"[R]キャル",
			"[R]ロコ",
			"[R]チュパカブラ",
			"[R]坂上陽三",
			"[R]ネットウヨ",
			"[R]ハズレ"};
	Random ran = new Random();
	int jewel = 0;
	int money = 0;
	int jewelstack = 0;
	int SSRstack = 0;
	int SRstack = 0;
	int Rstack = 0;
	boolean run = true;
	Scanner sc = new Scanner(System.in);
	void purchase() throws InterruptedException
	{
		System.out.println("=========================================");
		System.out.println("1)8450個 | 2)4200個 | 3)2570個");
		System.out.println("4)残りジュエル確認 | 5)ガシャ引き | 6)終了");
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
		
		else if(input == 5)
		{
			System.out.println();
			gacha();
		}
		
		else if(input == 6)
		{
			run = false;
			end();
		}
		
		else
		{
			System.out.println("不具合が発生しましたので最初からやり直してください。");
		}
		System.out.println();
	}


	void end()
	{
		System.out.println("ガシャシミュレーターを終了致します。");
		System.out.printf("総合累積課金額は%d円、累積使ったジュエルは%d個です。\n", money, jewelstack);
	}
	
	void gacha() throws InterruptedException
	{
		
		if(jewel < 2500)
		{
			System.out.println("ジュエルが足りないのでチャージ画面に移動します。");
		}
		else
		{
			System.out.println("======================================");
			System.out.println("1.10回　引く | 2.ジュエルチャージに戻る | 3.終了");
			System.out.println("======================================");
			System.out.print("入力 > ");
			int input = sc.nextInt();
			if(input == 1)
			{
				jewel -= 2500;
				jewelstack += 2500;
				System.out.println("2500ジュエルで10回引きます");
				for(int i = 1; i <= 10; i++)
				{
					Thread.sleep(500);
					double random = (int)(Math.random() * 100 + 1);
					if(1 <= random && random <= 3)
					{
						System.out.println(SSR[ran.nextInt(SSR.length)]);
						SSRstack++;
					}
					
					else if(4 <= random && random <= 13)
					{
						System.out.println(SR[ran.nextInt(SR.length)]);
						SRstack++;
					}
					
					else
					{
						System.out.println(R[ran.nextInt(R.length)]);
						Rstack++;
					}
				}
				System.out.printf("残りジュエルは%d個、総合累積金額は%d円です。\n", jewel, money);
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
				gacha();
			}
				
			else if(input == 2)
			{
				System.out.println("ジュエルチャージに戻ります");
				System.out.println();
				purchase();
			}
			
			else if(input == 3)
			{
				run = false;
				end();
			}
				
			else
			{
				System.out.println("不具合が発生しましたのでやり直してください");
			}
		}
	}
}

public class GachaSimulator {

	public static void main(String[] args) throws InterruptedException {
		Gacha account = new Gacha();
		
		while(true)
		{
			account.purchase();
			if(account.run == false)
				break;
		}

		
		
		
	}

}

