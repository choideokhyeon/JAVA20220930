package Ch07;

import java.util.Scanner;

public class C01While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//탈출 요건
		
//		int i = 0;	//1 탈출 변수
//		while(i < 10)	//2 탈출 조건식
//		{
//			System.out.println("HELLO WORLD");
//			i++;	//3 탈출 연산식
//		}
		
		
		//1 부터 10까지 합
//		int i = 1;		//1 탈출 변수
//		int sum = 0;	//누적 합 저장 변수
//		while(i <= 10)	//2 탈출 조건식
//		{
//			System.out.println("i : " + i);
//			sum += i;
//			i++;	//3 탈출 연산식
//		}
//		System.out.println("종료 후 i : " + i);
//		System.out.println("1부터 10까지의 합 : " + sum);
		
		
		
		//문제
		//1부터 입력한 정수까지 합 구하기
//		int i = 1;
//		System.out.print("원하는 정수 입력 : ");
//		int n = sc.nextInt();
//		int sum = 0;
//		while(i <= n)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("1부터 %d 까지의 합 : %d\n", n, sum);
		
		
		
		//문제
		//n,m을 입력받아서 n부터 m까지의 합 구하기(n < m)
//		System.out.print("시작 정수값 입력 : " );
//		int n = sc.nextInt();
//		System.out.print("끝 정수값 입력 : " );
//		int m = sc.nextInt();
//		
//		if(n > m)
//		{
//			int tmp = n;
//			n = m;
//			m = tmp;
//		}
//		
//		int i = n;	//초기값
//		int sum = 0;
//		while(i <= m)
//		{
//			sum += i;
//			i++;
//		}
//		System.out.printf("%d부터 %d까지의 합 : %d\n", n, m, sum);
		
		
		
		//문제
		//구구단 2단 출력
//		int i = 1;
//		while(i < 10)
//		{
//			System.out.printf("2 x %d = %d\n", i, i*2);
//			i++;
//		}
		
		
		
		//문제
		//구구단 2단 출력(역순출력)
//		int i = 9;
//		while(i > 0)
//		{
//			System.out.printf("2 x %d = %d\n", i, i*2);
//			i--;
//		}
		
		
		//문제
		//구구단 n단 출력(입력받기)
//		int i = 1;
//		System.out.print("원하는 구구단 숫자 입력 : ");
//		int j = sc.nextInt();
//		while(i < 10)
//		{
//			System.out.printf("%d x %d = %d\n", j, i, j * i);
//			i++;
//		}
		
		
		//문제
		//구구단 n단 출력(입력받기,역순출력) (별첨 .... 2<=N<=9)
//		int i = 9;
//		System.out.print("원하는 구구단 숫자 입력 : ");
//		int j = sc.nextInt();
//		while(i > 0)
//		{
//			System.out.printf("%d x %d = %d\n", j, i, j*i);
//			i--;
//		}
		
		
		//문제
		//프로그램 사용자로부터 양의 정수를 하나 입력받은 다음, 그 수만큼 3의 배수를 출력하는 프로그램 작성
		//ex)5를 입력 받았다면 3,6,9,12,15를 출력
//		System.out.print("원하는 출력 개수 입력 : ");
//		int input = sc.nextInt();
//		System.out.print("출력할 배수 입력 : ");
//		int input2 = sc.nextInt();
//		int i = input2;
//		while(i <= input2 * input)
//		{
//			if(i < input2 * input)
//				System.out.print(i+",");
//			else
//				System.out.print(i);
//			
//			i += input2;
//		}
		
		
		//문제
		//1부터 100까지 수 중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
//		int i = 1;
//		int oddsum = 0;
//		int evensum = 0;
//		while(i <= 100)
//		{
//			if(i % 2 == 0)
//			{
//				System.out.println("짝수 i = " + i);
//				evensum += i;
//			}
//			else
//			{
//				System.out.println("홀수 i = " + i);
//				oddsum += i;
//			}
//			i++;
//		}
//		System.out.println("짝수의 합 : " + evensum);
//		System.out.println("홀수의 합 : " + oddsum);
		
		
		//문제
		//1부터 N까지 수 중에 짝수의 합과 홀수의 합을 각각 구해서 출력하세요
//		int i = 1;
//		System.out.print("원하는 정수를 입력하세요 : " );
//		int input = sc.nextInt();
//		int oddsum = 0;
//		int evensum = 0;
//		while(i <= input)
//		{
//			if(i % 2 == 0)
//			{
//				evensum += i;
//			}
//			else
//			{
//				oddsum += i;
//			}
//			i++;
//		}
//		System.out.println("짝수의 합 : " + evensum);
//		System.out.println("홀수의 합 : " + oddsum);
		
		
		//문제
		//1부터 n까지 수 중에 3의 배수는 제외한 합을 구해서 출력해보세요
//		int i = 1;
//		System.out.print("정수 입력 : " );
//		int n = sc.nextInt();
//		int sum = 0;
//		while(i <= n)
//		{
//			if(i % 3 != 0)
//				sum += i;
//			i++;
//		}
//		System.out.println("1부터 " + n + " 까지의 수 중 3의 배수를 제외한 합 : " + sum);
		
		
		
		
//		String str = "안녕?";
//		System.out.println("길이 : " + str.length());
//		str = str + " 반갑다";
//		System.out.println(str);
		
		
		//문제
		//문자열을 입력받아서 각 문자를 거꾸로 출력해보세요
		//입력 : apple , 출력 : elppa		
		
//		System.out.print("문자열 입력 : ");
//		String s = sc.next();
//		int len = s.length()-1;
//		
//		//예제 1
//		while(len >= 0)
//		{
//			System.out.print(s.charAt(len));
//			len--;
//		}
//		
//		//예제 2
//		String r = "";
//		while(len >= 0)
//		{
//			r += s.charAt(len);
//			len--;
//		}
//		System.out.println(r);
//		
//		sc.close();
		
	}

}
