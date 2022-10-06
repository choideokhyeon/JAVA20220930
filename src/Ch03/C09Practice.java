package Ch03;

public class C09Practice {

	public static void main(String[] args) {

//		--------------------------------------------------------
//		문제
//		--------------------------------------------------------
//		1. 자동 타입 변환에 대한 내용입니다 컴파일 에러가 발생하는 것은 무엇입니까
//
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		char charValute = 'A';
//		----------------------------
//		1) int intValue = byteValue;
//		2) int intValue = charValue;
//		*3) short shortValue = charValue;
//		4) double doubleValue = byteValue;
//
//
//		2. 강제 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까
//
//		[예시]
//		----------------------------
//		int intValue = 10;
//		char charValue = 'A';
//		double doubleValue = 5.7;
//		String strValue = "A";
//		----------------------------
//		1) double var = (double)intValue;
//		2) byte var = (byte) intValue;
//		3) int var = (int)doubleVale;
//		*4) char var = (Char)strValue;
//
//
//		3. 연산식에서의 타입 변환에 대한 내용입니다. 컴파일 에러가 발생하는 것은 무엇입니까?
//		[예시]
//		----------------------------
//		byte byteValue = 10;
//		float floatValue = 2.5;
//		double doubleValue = 2.5;
//		----------------------------
//		*1) byte result = byteValue + byteValue;	//연산을 하면 int형이 되어버림
//		2) int result = 5 + byteValue;
//		3) float result = 5 + floatValue;
//		4) double result = 5 + doubleValue;
//
//		4. 다음 코드에서 컴파일 에러가 발생하는 위치와 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		short s1 = 1;
//		short s2 = 2;
//		int i1 = 3;
//		int i2 = 4;
//		*short result = s1 + s2;		//연산을 하게되면 s1+s2가 int형이 되어버림
//		int result = i1 + i2;
//		----------------------------
//
//		5. 알파벳 a의 유니코드는 97이고 b의 유니코드는 98입니다.
//		따라서 a의 유니코드에 1을 더하면 b의 유니코드가 되므로
//		다음과 같이 코드를 작성했습니다. 실행결과는 b가 출력되어야 하는데 
//		컴파일 에러가 발생하였습니다. 무엇이 문제이고, 어떻게 수정하면 좋을지
//		적어보세요
//		[예시]
//		----------------------------
//		char c1 = 'a';
//		char c2 = c1 + 1;	//3,4번문제와 동일하게 연산은 int형이 되므로 int로 바꿔줘야함
//		System.out.println(c2);	//int로 바꾼 후 c2를 다시 char로 형변환 시켜주면 됨
//		----------------------------
		char c1 = 'a';
		int c2 = c1 + 1;
		System.out.println((char)c2);
		
	}

}
