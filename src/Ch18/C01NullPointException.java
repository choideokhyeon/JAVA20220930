package Ch18;

public class C01NullPointException {

	public static void main(String[] args) {
		try {
		String str = null;
		System.out.println(str.toString());
		}
		catch(NullPointerException e)
		{
			System.out.println("예외 발생");
//			System.out.println("-----e.getCause()-----");
//			System.out.println(e.getCause());	//원인 가져오기
//			System.out.println("-----e.toString()-----");
//			System.out.println(e.toString());	//예외객체 정보
//			System.out.println("-----e.getStackTrace()-----");
//			System.out.println(e.getStackTrace());	//예외객체 식별 주소
//			System.out.println("-----e.printStackTrace()-----");
//			e.printStackTrace();	//프로그램 종료 전 예외발생정보 출력
		}
		
		System.out.println("실행코드1");
		System.out.println("실행코드2");

	}

}
