package Ch14;

class C05Super
{
	int num1;
}

class C05Sub extends C05Super
{
	int num2;//확장
}

public class C05Upcasting {

	public static void main(String[] args) {
		//Nocasting
		C05Super ob1 = new C05Super();
		ob1.num1 = 100;
		C05Sub ob2 = new C05Sub();
		ob2.num1 = 10;
		ob2.num2 = 20;
		
		//Upcasting(상위클래스 참조변수 = 하위객체)
		C05Super ob3 = new C05Sub();
		ob3.num1 = 10;	//가능
//		ob3.num2 = 20;	//불가능(참조변수가 num2를 찾지 못함)
		
		//Downcasting(클래스의 형변환)
		C05Sub down = (C05Sub)ob3;
		down.num2 = 10;
		
		
	}
}
