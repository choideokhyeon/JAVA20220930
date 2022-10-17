package Ch11;

import java.util.Scanner;

public class C04ArrayPrac2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] score = new int[5][3];
		
		for(int i = 0; i < score.length; i++)
		{
			for(int j = 0; j < score[i].length; j++)
			{
				System.out.printf("%d 번째 학생 국/영/수 점수 입력 : ", i+1);
				score[i][j] = sc.nextInt();
			}
			System.out.println();
		}
		
		//학생별 총점 구하기
		int std[] = new int[5];
		int i = 0;
		for(int tmp[] : score)
		{
			for(int n : tmp)
			{
				std[i] += n;
			}
			i++;
		}
		
		
		//학생별 평균 구하기
		for(i = 0; i < std.length; i++)
		{
			System.out.println(i+1 + "번째 학생 총점 : " + std[i]);
			System.out.println(i+1 + "번째 학생 평균 : " + (double)std[i]/3);
		}
		
	
		//과목별 총점 구하기
		int subject[] = new int[3]; //0 idx:국어총점, 1 idx:영어총점, 2 idx:수학총점
		for(int j = 0; j < 3; j++)
		{
			for(i = 0; i < score.length; i++)
			{
				subject[j] += score[i][j];
			}
			System.out.println("과목별 총점 : " + subject[j]);
		}
		
		
		//과목별 평균 구하기
		for(i = 0; i < 3; i++)
		{
			System.out.println("과목별 평균 : " + (double)subject[i]/5);
		}

		
		
		//각 행의 합과 전체 합
		//각 행의 평균과 전체 평균을 출력하세요
		
	}

}
