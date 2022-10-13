package Ch08;

class C09Simple
{
	String name;
	int sum(int x, int y)
	{
		System.out.println("sum(int,int)호출");
		return x + y;
	}
	
	int sum(double x, double y)
	{
		System.out.println("sum(double,double)호출");
		return (int)(x + y);
	}
	
	int sum(int x, int y, int z)
	{
		System.out.println("sum(int,int,int)호출");
		return x + y + z;
	}
	
	int sum(String str1, int x, int y)
	{
		System.out.println("sum(str,int,int)호출");
		name = str1;
		return x + y;
	}
	
}

public class C09MethodOverloading {
	
	public static void main(String[] args){
		C09Simple obj = new C09Simple();
		
		//이름이 같은(sum) 함수이지만 들어가는 매개변수(int / double 등)에 따라 달라짐
		int a = obj.sum(10, 20);
		System.out.println(a);
		int b = obj.sum(3.5, 4.5);
		System.out.println(b);
		int c = obj.sum(30, 40, 50);
		System.out.println(c);
		int d = obj.sum("홍길동", 60, 70);
		System.out.println(d);
	}
}
