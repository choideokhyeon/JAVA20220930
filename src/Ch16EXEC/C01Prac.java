package Ch16EXEC;

import java.util.Scanner;

abstract class Converter
{
	abstract protected double convert(double src);
	abstract protected String getSrcString();	//원
	abstract protected String getDestString();	//달러
	protected double ratio;
	public void run()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println(getSrcString() + "을 " + getDestString() + "로 바꿉니다");
		System.out.print(getSrcString() + "을 입력하세요 >> ");
		double val = sc.nextDouble();
		double res = convert(val);
		System.out.println("변환결과 : " + res + getDestString() + "입니다");
		sc.close();
	}
}

class Won2Dollar extends Converter
{

	public Won2Dollar(double ratio)
	{
		this.ratio = ratio;
	}

	@Override
	protected String getSrcString()
	{
		return "원";
	}

	@Override
	protected String getDestString()
	{
		return "달러";
	}

	@Override
	protected double convert(double src) {
		return Math.round(((src/ratio)*100) / 100);
	}
}

class Km2Mile extends Converter
{
	public Km2Mile(double ratio)
	{
		this.ratio = ratio;
	}

	@Override
	protected String getSrcString() {
		return "km";
	}

	@Override
	protected String getDestString() {
		return "mile";
	}
	
	@Override
	protected double convert(double src) {
		return Math.round(((src/ratio)*100) / 100);
	}
}

class Won2JPY extends Converter
{
	public Won2JPY(double ratio)
	{
		this.ratio = ratio;
	}

	@Override
	protected double convert(double src)
	{
		return Math.round(((src/ratio)*100) / 100);
	}

	@Override
	protected String getSrcString()
	{
		return "원";
	}

	@Override
	protected String getDestString()
	{
		return "엔";
	}
}

public class C01Prac {

	public static void main(String[] args) {
//		Won2Dollar toDollar = new Won2Dollar(1200);
//		toDollar.run();
//		
//		Km2Mile toMile = new Km2Mile(1.6);
//		toMile.run();
		
		Won2JPY toJPY = new Won2JPY(9.5);
		toJPY.run();
	}

}
