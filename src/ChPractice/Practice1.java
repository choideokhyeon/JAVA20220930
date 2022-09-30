package ChPractice;

import java.util.Random;
import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		int answer = random.nextInt(100);
		int input = 0;
		int count = 1;
		
		
		while(input != answer)
		{
			System.out.print("1과 100사이의 정수를 입력하세요 : ");
			input = sc.nextInt();
			if(input > answer)
			{
				System.out.printf("%d 보다 작습니다\n", input);
				count++;
			}
			else if(input < answer)
			{
				System.out.printf("%d 보다 큽니다\n", input);
				count++;
			}
		}
		System.out.printf("정답은 %d 였습니다\n", answer);
		System.out.printf("%d번의 시도가 시행되었습니다\n", count);
		
		sc.close();
	}

}
