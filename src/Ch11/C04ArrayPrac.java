package Ch11;

import java.util.Scanner;

public class C04ArrayPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [][] score = new int[5][3];
		int sum = 0;
		
		for(int i = 0; i < score.length; i++)
		{
			for(int j = 0; j < score[i].length; j++)
			{
				System.out.printf("%d 번째 학생 국/영/수 점수 입력 : ", i+1);
				score[i][j] = sc.nextInt();
				sum += score[i][j];
			}
			System.out.println();
		}
		double avg = (double)sum / (score.length * score[0].length);
		System.out.println("전체 총합 점수 : " + sum);
		System.out.println("전체 총합 평균 : " + avg);
		System.out.println();

		
		for(int i = 0; i < score.length; i++)
		{
			sum = 0;
			for(int j= 0; j < score[i].length; j++)
			{
				sum += score[i][j];
			}
			System.out.printf("%d 번째 학생의 총합점수 : %d\n", i+1, sum);
			System.out.printf("%d 번째 학생의 평균점수 : %.2f\n", i+1, (double)sum/score[i].length);
		}
		System.out.println();
		
		
		for(int j = 0; j < score[0].length; j++)
		{
			sum = 0;
			for(int i = 0; i < score.length; i++)
			{
				sum += score[i][j];
			}
			System.out.printf("%d 번째 과목 총합 점수 : %d\n", j+1, sum);
			System.out.printf("%d 번째 과목 평균 점수 : %.2f\n", j+1, (double)sum/score.length);
		}
		
	}

}
