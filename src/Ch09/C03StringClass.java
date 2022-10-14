package Ch09;

public class C03StringClass {
	
	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "java";
		
		String str3 = new String("java");
		String str4 = new String("java");

		//위치정보가 같은지를 판단함
		System.out.println("str1 = str2 : "+(str1==str2));
		System.out.println("str3 = str4 : "+(str3==str4));
		System.out.println("str1 = str3 : "+(str1==str3));
		System.out.println("str1 = str4 : "+(str1==str4));
		
		//equals 매서드 사용하여 문자열 자체 비교하기
		//변수.equals(비교할변수);
		System.out.println("-----------------------");
		System.out.println(str1.equals(str2));
		System.out.println(str3.equals(str4));
		System.out.println(str1.equals(str3));
		System.out.println(str1.equals(str4));
		
	}
}
