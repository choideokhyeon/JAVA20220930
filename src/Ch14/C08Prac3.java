package Ch14;

import java.util.Scanner;

abstract class Calc
{
	protected int a;
	protected int b;
	public void setValue(int a, int b)
	{
		this.a = a;
		this.b = b;
	}
	abstract int calculate();
}

class Add extends Calc
{
	public int calculate()
	{
		System.out.printf("%d + %d = ", a, b);
		return a+b;
	}
}

class Minus extends Calc
{
	public int calculate()
	{
		System.out.printf("%d - %d = ", a, b);
		return a-b;
	}
}

class Multiple extends Calc
{
	public int calculate()
	{
		System.out.printf("%d * %d = ", a, b);
		return a*b;
	}
}

class Divide extends Calc
{
	public int calculate()
	{
		System.out.printf("%d / %d = ", a, b);
		if(b == 0)
		{
			return -1;
		}
		return a/b;
	}
}

public class C08Prac3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int result = 0;
		System.out.print("두 정수를 입력하세요 >> ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("========================");
		System.out.println("1.덧셈|2.뺄셈|3.곱셈|4.나눗셈");
		System.out.println("========================");
		System.out.print("입력하세요 >> ");
		int input = sc.nextInt();
		Calc cal = null;
		
		switch(input)
		{
			case 1:
				cal = new Add();
				break;
			case 2:
				cal = new Minus();
				break;
			case 3:
				cal = new Multiple();
				break;
			case 4:
				cal = new Divide();
				break;
			default:
				System.out.println("잘못된 입력입니다");
				sc.close();
				break;
		}
		cal.setValue(a, b);
		result = cal.calculate();
		System.out.println(result);
		sc.close();

	}

}
