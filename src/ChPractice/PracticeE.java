package ChPractice;

import java.util.Random;
import java.util.Scanner;

class cal
{
	
	Random random = new Random();
	
	int plus(int x, int y)
	{
		return x + y;
	}
	
	int minus(int x, int y)
	{
		return x - y;
	}
	
	int multiple(int x, int y)
	{
		return x * y;
	}
	
	double divide(int x, int y)
	{
		return (double)x / y;
	}
	
	int square(int x, int y)
	{
		return (int)Math.pow(x, y);
	}
	
	
}

public class PracticeE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		cal cl = new cal();
		int result = 0;
		boolean run = true;
		
		
		
		while(run)
		{	
			System.out.println("===========================================");
			System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈|5.제곱|6.퀴즈|7.종료");
			System.out.println("===========================================");
			System.out.print("원하는 연산을 입력하세요 : ");
			int input = sc.nextInt();
			
			if(0 < input && input < 6)
			{
				System.out.print("정수 2개를 입력하세요 : ");
				int a = sc.nextInt();
				int b = sc.nextInt();
			
				if(input == 1)
				{
					System.out.println("덧셈 연산을 진행합니다");
					result = cl.plus(a, b);
					System.out.printf("%d + %d = %d\n", a, b, result);
					System.out.println();
				}
				
				else if(input == 2)
				{
					System.out.println("뺄셈 연산을 진행합니다");
					result = cl.minus(a, b);
					System.out.printf("%d - %d = %d\n", a, b, result);
					System.out.println();
				}
				
				else if(input == 3)
				{
					System.out.println("곱셈 연산을 진행합니다");
					result = cl.multiple(a, b);
					System.out.printf("%d x %d = %d\n", a, b, result);
					System.out.println();
				}
				
				else if(input == 4)
				{
					System.out.println("나눗셈 연산을 진행합니다");
					System.out.printf("%d / %d = %.2f\n", a, b, cl.divide(a, b));
					System.out.println();
				}
				
				else if(input == 5)
				{
					System.out.println("제곱 연산을 진행합니다");
					result = cl.square(a, b);
					System.out.printf("%d ^ %d = %d\n", a, b, result);
					System.out.println();
				}
				
			}
			
			else if(input == 6)
			{
				int count = 0;
				Random random = new Random();
				int answer = random.nextInt(100);
				while(true)
				{
					System.out.print("숫자를 입력하세요(1~100) : ");
					int c = sc.nextInt();
					if(c == answer)
					{
						System.out.printf("정답은 %d 입니다\n", answer);
						count++;
						break;
					}
					else if(c > answer)
					{
						System.out.println("입력하신 값보다 작습니다 down");
						count++;
					}
					else
					{
						System.out.println("입력하신 값보다 큽니다 up");
						count++;
					}
					
				}
				System.out.printf("총 시도는 %d 회 입니다\n", count);
				System.out.println();
			}
			
			else if(input == 7)
			{
				run = false;
			}
			
			else
			{
				System.out.println("잘못된 숫자입니다 다시 입력하세요");
			}
		}
		System.out.println("프로그램을 종료합니다");
		
		sc.close();
		
	}

}
