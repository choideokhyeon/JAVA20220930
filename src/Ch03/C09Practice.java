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
//		3) int var = (int)doubleValue;
//		*4) char var = (Char)strValue;	-> strValue.charAt(var);
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
		
		
//		6. 자바에서 / 는 나눗셈 연산자 입니다 x/y 는 x 를 y 로 나누는 연산을 수행합니다
//		빈칸에 들어갈 타입은 무엇이며 출력되는 결과와 그 이유를 설명해 보세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
//		int result = x/y;
//		System.out.println(result);
//		----------------------------
//		int형으로 출력되므로 소수점 아랫부분이 버려져서 2가 됨
//
//		7. 6번 문제에서 출력되는 결과로 2.5가 나오게 하고 싶습니다 빈칸에 들어갈 코드를
//		작성하세요
//		[예시]
//		----------------------------
//		int x = 5;
//		int y = 2;
//		double result1 = (double)x/y;
//		double result2 = (1.0*x)/y;
//		System.out.println(result);
//		----------------------------
//
//		8. 두 실수를 덧셈 연산하고 소수점 이하 자리를 버리고 싶습니다
//		빈칸에 들어갈 코드를 작성해 보세요
//
//		[예시]
//		----------------------------
//		double var1 = 3.5;
//		double var2 = 2.7;
//		int result = (int)(var1 + var2);
//		----------------------------
//
//		9. var1 부터 var4까지 + 연산을 수행해서 int 타입 result변수에 9가 저장되도록
//		빈칸에 들어갈 코드를 작성해보세요
//		[예시]
//		----------------------------
//		long var1 = 2L;
//		float var2 = 1.8f;
//		double var3 = 2.5;
//		String var4 = "3.9";
//		int result = _______________;
//		System.out.println(result);
//		----------------------------
//
//
//		10. 다음코드를 실행했을 때 출력 결과를 적어보세요
//		[예시]
//		----------------------------
//		String str1 = 2 + 3 + "";	>>	5
//		String str2 = 2 + "" + 3;	>>	23
//		String str3 = "" + 2 + 3;	>>	23
//		System.out.println(str1);
//		System.out.println(str2);
//		System.out.println(str3);
//		----------------------------
//
//		11. 문자열을 기본 타입으로 변환하려고 합니다
//		빈칸에 알맞은 코드를 작성해 보세요
//		[예시]
//		----------------------------
//		 byte valueb	=	Byte.parseByte("10");
//		 int valuei		= 	Integer.parseInt("100");
//		 float valuef	=	Float.parseFloat("20.5");
//		 double valued	=	Double.parseDouble("3.14159");
//		----------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		[답]
//		1. 3 char 타입의 양의 허용 범위가 short 타입보다 더 큼
//	
//		2. 4 문자열을 char 타입으로 강제 타입 변환(캐스팅)할 수 없음
//	
//		3. 1 연산의 결과는 int 타입임
//	
//		4. 5 연산의 결과는 int 타입임
//	
//		5. 연산의 결과는 int 타입인데 , char 타입 변수 c2 에 저장했기 때문
//	
//		char c2 = (char) (c1 + 1);
//	
//		6. int 2, 연산의 결과는 int 타입임
//	
//		7. double, (double)x / y 또는 x / (double)y 또는 (double)x / (double)y
//	
//		8. (int) (var1 + var2)
//	
//		9. 
//		(int)var1 + (int)(var2 + var3) + (int)Double.parseDouble(var4) 또는
//		(int)(var1 + (int)var2 + var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + (int)var3 + Double.parseDouble(var4)) 또는
//		(int)(var1 + var2 + var3 + (int)Double.parseDouble(var4))
//	
//		10.실행결과
//		5
//		23
//		23
//	
//		11. 
//		Byte.parseByte
//		Integer.parseInt
//		Float.parseFloat
//		Double.parseDouble
		
	}

}
