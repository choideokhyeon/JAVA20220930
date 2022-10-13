package Ch08;

import java.util.Scanner;

class Sub
{
	Scanner sc = new Scanner(System.in);
	
//  int=반환값타입	  (매개변수)
	int sub1(int x, int y)
	{
		if(x > y)
			return x - y;
		else
			return y - x;
	}
	
	int sub2()
	{
		System.out.print("sub2 함수 정수 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		return x - y;
	}
	
	void sub3()
	{
		System.out.print("sub3 함수 정수 2개 입력 : ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.printf("%d - %d = %d\n", x, y, (x-y));
	}
	
	void sub4(int x, int y)
	{
		System.out.println("sub4(x,y) : " + (x+y));
	}
}

public class C99Practice {

	public static void main(String[] args) {
		//다음 코드를 실행할 수 있는 Sub 클래스를 만드세요
		
		Sub calc = new Sub();
		
		int r1 = calc.sub1(20,10);
		System.out.println("sub1(x,y) = " + r1);
		
		int r2 = calc.sub2();
		System.out.println("sub2() = " + r2);
		
		calc.sub3();
		calc.sub4(10,20);

	}

}
