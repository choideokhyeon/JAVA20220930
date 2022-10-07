package Ch05;

public class C04ShiftArith {

	public static void main(String[] args) {
		int num1 = 15;		//00000000 00000000 00000000 00001111
		int num2 = num1<<2; //00000000 00000000 00000000 00111100	//2칸 왼쪽 밀기
		int num3 = num1>>2; //00000000 00000000 00000000 00000011	//2칸 오른쪽 밀기
		
		System.out.println("<<Shift 연산결과 :" + num2);
		System.out.println(">>Shift 연산결과 :" + num3);

	}

}
