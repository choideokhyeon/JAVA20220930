package Ch02;

public class C05상수 {

	public static void main(String[] args) {
		
		//상수
		//항 '상' 같은 '수'
		
		
		//리터럴 상수 : 이름부여 x, 상수Pool에 저장, 수치, 값
		//심볼릭 상수 : 이름부여 o, final 예약어 사용
		
		//리터럴 접미사 : 리터럴값의 자료형 지정
		//l,L : long 자료형
		//f,F : float 자료형
		
		//심볼릭 상수 예제
		int n1 = 100;
		final int n2 = 200;	// n2 심볼릭 상수
		n1 = 300;	//가능
//		n2 = 400;	//불가능
		
		final double PI = 3.14;
		double result = PI*4*4;	//r * r * 3.14;
		
	}

}
