package Ch11;

public class C04MultiArray {

	public static void main(String[] args) {
		int [][] arr2 =
		{
			{10,20},
			{30,40,50},
			{60,70,80,90},
			{100,110,120,130,140}
		};		
		//열의 개수는 행에 따라 달라질 수 있음
		
		//길이 확인
		System.out.println("arr2 의 행의 길이 : " + arr2.length);
		System.out.println("arr2의 0번째 요소 길이 : " + arr2[0].length);
		System.out.println("arr2의 1번째 요소 길이 : " + arr2[1].length);	
		System.out.println("arr2의 2번째 요소 길이 : " + arr2[2].length);	
		System.out.println("arr2의 3번째 요소 길이 : " + arr2[3].length);
		
		for(int a[] : arr2)
		{
			for(int b : a)
				System.out.print(b + " ");
			System.out.println();
		}
	}

}
