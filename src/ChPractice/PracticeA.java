package ChPractice;

class Calculator
{
	void powerOn()
	{
		System.out.println("전원을 켭니다");
	}
	
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	int minus(int x, int y)
	{
		if(x > y)
		{
			int result = x - y;
			return result;
		}
		
		else
		{
			int result = y - x;
			return result;
		}
	}
	
	int multiple(int x, int y)
	{
		int result = x * y;
		return result;
	}
	
	int square(int x, int y)
	{
		int result = (int)Math.pow(x, y);
		return result;
	}
	
	double devide(int x, int y)
	{
		double result = (double)x / (double)y;
		return result;
	}
	
	void powerOff()
	{
		System.out.println("전원을 끕니다");
	}
}

public class PracticeA {

	public static void main(String[] args) {
		Calculator ca = new Calculator();
		
		ca.powerOn();
		System.out.println(ca.plus(5, 10));
		System.out.println(ca.devide(50, 5));
		System.out.println(ca.minus(10, 3));
		System.out.println(ca.minus(5, 10));
		System.out.println(ca.square(10, 3));
		ca.powerOff();

	}

}
