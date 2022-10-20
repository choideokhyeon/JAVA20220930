package ChPractice;

class OP_Calculator
{
	double areaCircle(double r)
	{
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return 3.14159 * r * r;
	}
}

class OP_Computer extends OP_Calculator
{
	@Override
	double areaCircle(double r)
	{
		System.out.println("Computer 객체의 areaCirlce() 실행");
		return Math.PI * r * r;
	}
}

public class Practice_Overriding {

	public static void main(String[] args) {
		int r = 10;
		
		OP_Calculator cal = new OP_Calculator();
		System.out.println("원의 면적 : " + cal.areaCircle(r));
		System.out.println();
		
		OP_Computer com = new OP_Computer();
		System.out.println("원의 면적 : " + com.areaCircle(r));
		
	}

}
