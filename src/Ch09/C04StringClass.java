package Ch09;

import java.util.Scanner;

public class C04StringClass {

	public static void main(String[] args) {
		int alength, blength;
		char achar, bchar;
		String str1 = new String("java Powerful");
		String str2 = new String("java Programming");
		String str3 = str1 + str2;
			
		System.out.println(str3);
		
		alength = str1.length();	//String변수.length(); 해당 변수의 문자열 길이
		blength = str2.length();
		achar = str1.charAt(5);
		bchar = str2.charAt(10);
		System.out.println("Str1에 저장 ="+str1 + " 길이 = "+alength);
		System.out.println("Str2에 저장 ="+str2 + " 길이 = "+blength);
		System.out.println("Str1의 5번째 문자 ="+achar);
		System.out.println("Str1의 10번째 문자 ="+bchar);
		System.out.println("Str1의 대문자로 변환 : "+str1.toUpperCase());	//toUpperCase()
		System.out.println("Str1의 소문자로 변환 : "+str1.toLowerCase());	//toLowerCase()
		System.out.println("Str2의 a를 A로 변환 : "+str2.replace('a','A'));	//replace('바꾸기전','바꾸기후')
		System.out.println("---------------------------");
		
		//trim() : 앞 뒤 공백 제거
		Scanner sc = new Scanner(System.in);
		String tmp = sc.nextLine();
		
		System.out.println(tmp);
		System.out.println(tmp.trim());
		
		
		//substring() : 해당 번호 앞 까지의 문자열 자르기
		//			예 : substring(2) : 안녕하세요 -> 하세요(0,1번 삭제)
		System.out.println(tmp.substring(2));
		//			예 : substring(2,5) : HELLOWORLD -> LLO(2~4번 출력)
		System.out.println(tmp.substring(2,5));
		
		
		//indexOf('문자') : 문자 또는 문자열의 index 번호 확인(가장 빠른번호), 없을경우 -1 출력
		System.out.println(tmp.indexOf('L'));
		//LastIndexOf('문자') : 문자 또는 문자열의 가장 뒤에 있는 index 번호
		System.out.println(tmp.lastIndexOf('O'));
		
		
		//String변수.contains('문자') : 해당 문자열 포함 여부(true/false) 확인
//		★시험에 나옴★
		System.out.println(tmp.contains("HELL"));
		
		
		//split("구분자") : 구분자를 기준으로 문자열을 분할(배열형으로 저장)
//		ex)Hello my name is kim		-> arr[0] : Hello
//		split(" ")일 경우				-> arr[1] : my
//			띄워쓰기					-> arr[2] : name
//									-> arr[3] : is
//									-> arr[4] : kim
		String arr[] = tmp.split(" ");	//띄워쓰기가 구분자
		for(int i = 0; i < arr.length; i++)
		{
			System.out.printf("arr[%d] = %s\n", i, arr[i]);
		}
		
		
	}

}
