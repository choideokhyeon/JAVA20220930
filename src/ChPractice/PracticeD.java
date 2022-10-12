package ChPractice;

class Calculator2
{
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	double avg(int x, int y)
	{
		double sum = plus(x, y);
		double result = sum / 2;
		return result;
	}
	
	void execute()
	{
		double result = avg(7, 10);
		System.out.println("실행결과 : " + result);
	}
	
	void println(String message)
	{
		System.out.println(message);
	}
	
	
	
}

public class PracticeD {

	public static void main(String[] args) {
		Calculator2 mycalc = new Calculator2();
		
		mycalc.execute();
		mycalc.println("아이우에오");
		System.out.println(mycalc.plus(10, 20));
	}

}
