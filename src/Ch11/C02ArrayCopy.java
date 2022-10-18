package Ch11;

import java.util.Arrays;

public class C02ArrayCopy {

	public static void main(String[] args) {
		int [] arr1 = {10,20,30};
		
		//얕은 복사(위치값 복사)
		//arr1 : [I@626b2d4a
		//arr2 : [I@626b2d4a
		int [] arr2 = arr1;
		
		
		int [] arr3 = new int[3];
		for(int i = 0; i < arr3.length; i++)
		{
			arr3[i] = arr1[i];	//깊은 복사(데이터값 복사)
		}
		
		
		//깊은 복사
		//Arrays.copyOf(복사해올배열, 배열의길이);
		int [] arr4 = Arrays.copyOf(arr1, arr1.length);
		
		System.out.println("arr1 : " + arr1);
		System.out.println("arr2 : " + arr2);
		System.out.println("arr3 : " + arr3);
		System.out.println("arr3 : " + arr4);
		
		
		
		arr2[0] = 100;
		arr2[1] = 200;
		arr2[2] = 300;
		
		for(int n : arr1)
			System.out.println(n);
		
		for(int n : arr4)
			System.out.println(n);
	}

}
