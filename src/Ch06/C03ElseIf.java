package Ch06;

import java.util.Scanner;

public class C03ElseIf {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 국어(40점) / 영어(40점) / 수학(40점)
		// 국어 < 40 - 불합격
		// 영어 < 40 - 불합격
		// 수학 < 40 - 불합격
		// 평균 < 60 - 불합격
		// 그외 : 합격
//		System.out.print("국어 점수 입력 : ");
//		int kor = sc.nextInt();
//		System.out.print("영어 점수 입력 : ");
//		int eng = sc.nextInt();
//		System.out.print("수학 점수 입력 : ");
//		int math = sc.nextInt();
//		double avg = (double)(kor+eng+math)/3;
//		
//		if(kor < 40)
//			System.out.println("불합격 입니다");
//		else if(eng < 40)	//kor>=40
//			System.out.println("불합격 입니다");
//		else if(math < 40)	//kor>=40 && eng>=40
//			System.out.println("불합격 입니다");
//		else if(avg < 60)	//kor>=40 && eng>=40 && math>=40
//			System.out.println("평균 점수가 " + avg + "점이라 불합격 입니다");
//		else
//			System.out.println("합격 입니다");

		
		
		// 나이별로 요금을 부과하는 else if문을 만드세요
		// 8세 미만 : 요금은 1000원
		// 14세미만 : 요금은 2000원
		// 20세미만 : 요금은 2500원
		// 20세이상 : 요금은 3000원
//		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//		int charge = 0;
//
//		if (age < 8)
//			charge = 1000;
//		else if (age < 14)
//			charge = 2000;
//		else if (age < 20)
//			charge = 2500;
//		else
//			charge = 3000;
//		System.out.println("나이는 " + age + "세 이며 요금은 " + charge + "원 입니다");
		
		
		
		// 점수 >= 90 A
		// 점수 >= 80 B
		// 점수 >= 70 C
		// 점수 >= 60 D
		// 그 외 : F
		// 또는
		// 점수 < 60 F
		// 점수 < 70 D
		// 점수 < 80 C
		// 점수 < 90 B
		// 그 외 : A
		
		System.out.print("점수를 입력하세요(0~100) : ");
		int score = sc.nextInt();

		if (score >= 90)
			System.out.println("A등급 입니다");
		else if (score >= 80)
			System.out.println("B등급 입니다");
		else if (score >= 70)
			System.out.println("C등급 입니다");
		else if (score >= 60)
			System.out.println("D등급 입니다");
		else
			System.out.println("F등급 입니다");
		

		
	}

}
