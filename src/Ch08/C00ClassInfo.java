package Ch08;

public class C00ClassInfo {

	public static void main(String[] args) {
		
		//1 객체(Object)
		// - 존재하는 사물(Object)
		// - 존재한다 -> 공간(독점적이고 배타적인)을 차지 -> 메모리 공간
		
		
		
		//2 객체의 기본 구조
		//속성 : 객체만의 고유 자료 -> (멤버)변수를 통해 저장
		//기능 : 객체가 수행할 수 있는 Action -> (멤버)함수를 통해 구현
		
		
		
		//3 객체 지향(Object-Oriented Programming)
		// 현실 객체의 정보(속성/기능) 중에 필요한 부분만 추출(추상화) 하여 프로그램에 저장하기 위해 고안된 문법체계
		
		
		
		//4 클래스 (자료형)
		// 동일한 종류의 객체를 구현하기 위해 객체의 속성/기능을 미리 선언한 자료형
		// 클래스는 사용하기 전에는 기본적으로 메모리 공간을 차지하지 않는다
		// 클래스 자료형에 의해 객체가 생성되는 순간 클래스에서 선언한 속성과 기능대로 공간이 형성되어진다.
		
		// 나무 존재? x	-> 클래스
		// 자동차 존재? x
		// 사람 존재? x
		
		
		
		//5 기본코드 해석
		
		//자바의 메모리 영역
		//1) 스택영역			: {} 내에서 생성(int, double ...)
		//2) 클래스(메서드)영역	: 공유 메모리 영역(생성자메서드,일반메서드,static메서드,static변수 ...)
		//3) 힙영역			: 객체 저장 영역(new 예약어 사용시 할당)
		
//		1)		2)	 3)	 4)		 5)
//		Scanner sc = new Scanner(System.in);
//		
//		1)Scanner	: 클래스 자료형
//		2)sc		: 참조변수
//		3)new		: 힙영역에 개체 공간 할당
//		4)Scanner()	: 생성자(객체에 초기값 부여)
//		5)System.in	: 인자,인수
		
		
		
	}

}