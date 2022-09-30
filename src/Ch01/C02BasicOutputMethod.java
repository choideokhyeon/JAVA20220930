package Ch01;

public class C02BasicOutputMethod {

	public static void main(String[] args) {
		
		//00 System.out	: 표준 출력 스트림
		//01 System.out.print()
		
		//ESCAPE 문자 사용
		// \n	: 개행문자
		// \b	: 백스페이스(C언어)
		// \t	: 탭 길이(기본 8칸)만큼 이동
		System.out.print("HELLO WORLD\n");
		System.out.print("HE\tLLO WORLD\n");
		System.out.print("HELLO WORLD\n");
		
		// 문제
		//    *
		//   ***
		//  *****
		// *******
		//*********
		System.out.print("    *\n");
		System.out.print("   ***\n");
		System.out.print("  *****\n");
		System.out.print(" *******\n");
		System.out.print("*********\n");
		
		
		//02 System.out.printf()
		//03 System.out.println()
	}

}
