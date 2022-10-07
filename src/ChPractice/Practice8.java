package ChPractice;

import java.util.Scanner;

public class Practice8 {

	public static void main(String[] args) {
		
		//이중배열
		
		int [][] mathscores = new int[2][3];
		Scanner sc = new Scanner(System.in);
		int i, j;
		for(i = 0; i < mathscores.length; i++)
		{
			for(j = 0; j < mathscores[i].length; j++)
			{
				System.out.printf("mathscores[%d][%d] 값 입력 : ",i , j);
				mathscores[i][j] = sc.nextInt();
				System.out.printf("mathscores[%d][%d] : %d\n", i, j, mathscores[i][j]);
			}
		}
		System.out.println();
		
		
		
		int [][] englishscores = new int[2][];
		englishscores[0] = new int[2];
		englishscores[1] = new int[3];
		
		for(i = 0; i < englishscores.length; i++)
		{
			for(j = 0; j < englishscores[i].length; j++)
			{
				System.out.printf("englishscores[%d][%d] 값 입력 : ",i , j);
				englishscores[i][j] = sc.nextInt();
				System.out.printf("englishscores[%d][%d] : %d\n", i, j, englishscores[i][j]);
			}
		}
		System.out.println();
		
		
		
		int [][] javascores = { {95,80} , {92,96,80} };
		for(i = 0; i < javascores.length; i++)
		{
			for(j = 0; j < javascores[i].length; j++)
			{
				System.out.printf("javascores[%d][%d] : %d\n", i, j, javascores[i][j]);
			}
		}
		
		System.out.println();
	}

}
