package Ch08;

class C13Simple
{
	//속성
	int x;		//0
	double y;	//0.0
	char z;		//' '
	boolean b;	//false
	String str;	//null
	
	//디폴트 생성자
	C13Simple()
	{
		System.out.println("디폴트 생성자 호출");
	}
	
	@Override
	public String toString() {
		return "C13Simple [x=" + x + ", y=" + y + ", z=" + z + ", b=" + b + ", str=" + str + "]";
	}

	C13Simple(int x)
	{
		this.x = x;
		System.out.println("C13Simple(int) 생성자 호출");
	}
	
	C13Simple(int x, double y)
	{
		this.x = x;
		this.y = y;
		System.out.println("C13Simple(int,double) 생성자 호출");
	}
	
	C13Simple(int x, double y, char z)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		System.out.println("C13Simple(int,double,char) 생성자 호출");
	}
	
	C13Simple(int x, double y, char z, boolean b)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.b = b;
		System.out.println("C13Simple(int,double,char,boolean) 생성자 호출");
	}
	
	C13Simple(int x, double y, char z, boolean b, String str)
	{
		this.x = x;
		this.y = y;
		this.z = z;
		this.b = b;
		this.str = str;
		System.out.println("C13Simple(int,double,char,boolean,str) 생성자 호출");
	}

	
}

public class C13ConstructorMain {

	public static void main(String[] args) {
		
		C13Simple obj = new C13Simple();	//디폴트 생성자
		System.out.println(obj.toString());
		System.out.println();
		
		C13Simple obj2 = new C13Simple(101);	//int 받는 생성자
		System.out.println(obj2.toString());
		System.out.println();
		
		C13Simple obj3 = new C13Simple(200, 3.14);	//int double 받는 생성자
		System.out.println(obj3.toString());
		System.out.println();
		
		C13Simple obj4 = new C13Simple(999, 10.13, 'Z');	//int double char 받는 생성자
		System.out.println(obj4.toString());
		System.out.println();
		
		C13Simple obj5 = new C13Simple(2022, 10.25, 'A', true);
		System.out.println(obj5.toString());
		System.out.println();
		
		C13Simple obj6 = new C13Simple(1972, 11.21, 'F', false, "안녕하세요");
		System.out.println(obj6.toString());
		System.out.println();
		
		
		
		
		
		
		
//		객체 ? 존재 사물 -> 공간을 차지하는 사물
//		인스턴스 ? 객체가 추상화 과정을 통해 자바프로그램 내의 메모리 공간에 저장된 상태
//		객체구조 ? 속성/기능/생성자
//		클래스 ? 객체 생성을 위한 자료형
//		기본코드 ? 클래스	참조변수	힙영역에 공간 할당	생성자함수	인자
//				Scanner	sc		= new			Scanner(System.in)
//		멤버변수 ? 속성, 필드 -> 객체의 개별정보 저장용
//		멤버메서드 ? -> 액션, 동사형, 특정 역할 수행위한 코드 블럭
//		메서드 기본구조 ? -> 헤더(반환자료형 함수명 (파라미터..) ) + 바디(처리 로직)
//		메서드 오버로딩 ? 메서드 파라미터의 형태를 다양하게 둘 수 있도록 허용한 문법
//		지역변수 ? {} 내에서 선언되는 변수, {} 벗어나면 기본적으로 소멸
//		생성자 ? 객체 생성시 1회 호출, 기본값 Setup 사용 메서드(함수)
//		생성자 오버로딩 ? 생성자 함수의 파라미터형을 다양하게 허용함으로써 외부로부터 다양한 초기값을 허용
		
		
		
		
		
		
	}

}
