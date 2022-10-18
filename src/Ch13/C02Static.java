package Ch13;

class C02Simple
{
	int n1;
	static int n2;
	
	void Func1()
	{
		n1 = 10;
		n2 = 20;
	}
	
	static void Func2()	//static은 static끼리 사용가능
	{
//		n1 = 10;	//static메서드에서는 기본멤버변수 사용 불가능
		n2 = 20;
		int num = 10;
	}
}

public class C02Static {

	public static void main(String[] args) {

	}

}
