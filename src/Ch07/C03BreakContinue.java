package Ch07;

import java.util.Scanner;

public class C03BreakContinue {

	public static void main(String[] args) {
		
		//1 break
		// -1을 입력하기 전까지 계속 정수값을 받아 누적 합을 출력
		Scanner sc = new Scanner(System.in);
//		int sum = 0;
//		int input = 0;
//		while(true)
//		{
//			System.out.print("더하고 싶은 정수 값 입력 : ");
//			input = sc.nextInt();
//			if(input == -1)
//				break;
//			sum += input;
//		}
//		System.out.printf("입력된 정수의 합 %d 출력\n", sum);
		
		
		
		//2 continue
		// 1부터 10까지의 수 중에 3의 배수를 제외한 합 출력
//		int sum = 0;
//		int i = 1;
//		while(i <= 10)
//		{
//			if(i % 3 == 0)
//			{
//				i++;
//				continue;	//근접한 반복문의 조건식으로 돌아간다
//			}
//			sum += i;
//			i++;
//		}
//		System.out.println("3의 배수를 제외한 합 : " + sum);
		
		
		
		sc.close();
	}

}
