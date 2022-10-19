package Ch14;

//Upcasting
//상위클래스 참조변수 = 하위객체
//자동형변환
//상속관계의 하위객체 연결
//하위클래스의 확장된 멤버 접근 불가능
//->downcasting


//Downcasting
//하위클래스 참조변수 = 상위객체
//강제형변환 필요


//instanceof
//객체 타입을 확인하는 연산자
//형변환 가능 여부를 확인
//true/false 리턴
//기본형 : 객체 instanceof 클래스




class A {int n1 = 10;}

class B extends A {int n2 = 20;}
class C extends A {int n3 = 30;}
class D extends B {int n4 = 40;}
class E extends C{}
class F extends E{}
//A - B - D
//A - C - E - F

public class C06Upcasting {
	
	public static void UpcastingTest(A tmp)
	{
		System.out.println(tmp.n1);	//A tmp = ob1
		
		//instanceof
		if(tmp instanceof B)
		{
			B down = (B)tmp;
			System.out.println(down.n2);
		}
		
		if(tmp instanceof C)
		{
			C down = (C)tmp;
			System.out.println(down.n3);
		}
		
		if(tmp instanceof D)
		{
			D down = (D)tmp;
			System.out.println(down.n4);
		}
	}

	public static void main(String[] args) {
		//Nocasting
		B ob1 = new B();
		C ob2 = new C();
		D ob3 = new D();
		E ob4 = new E();
		F ob5 = new F();
		
		UpcastingTest(ob1);
		UpcastingTest(ob2);
		UpcastingTest(ob3);
		UpcastingTest(ob4);
		UpcastingTest(ob5);
	}

}
