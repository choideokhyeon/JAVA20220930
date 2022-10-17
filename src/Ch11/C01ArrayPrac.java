package Ch11;

import java.util.Arrays;
import java.util.Scanner;

public class C01ArrayPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int sum = 0;
		int i = 0;
		for(i = 0; i < arr.length; i++)
		{
			System.out.printf("ar[%d] = ", i);
			arr[i] = sc.nextInt();
			//총합
			sum += arr[i];
		}
		
		int max = arr[0];
		int min = arr[0];
		
		for(i = 0; i < arr.length; i++)
		{
			//최대값
			if(arr[i] > max)
			{
				max = arr[i];
			}
			
			//최소값
			if(arr[i] < min)
			{
				min = arr[i];
			}
		}
		//평균
		double avg = (double)sum / arr.length;
		System.out.println("총합 : " + sum);
		System.out.println("평균 : " + avg);
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
		System.out.println("============================");
	
		
		
//또 다른 방법
		//오름차순 정렬
		Arrays.sort(arr);
		for(int a : arr)
			System.out.print(a + " ");
		System.out.println();
		
		//최대값 최소값
		//Arrays.stream(배열이름).max().getAsInt();
		//					  .min().getAsInt();
		int max1 = Arrays.stream(arr).max().getAsInt();
		int min1 = Arrays.stream(arr).min().getAsInt();
		System.out.println("최대값 : " + max1);
		System.out.println("최소값 : " + min1);
		
		sc.close();
	}

}
