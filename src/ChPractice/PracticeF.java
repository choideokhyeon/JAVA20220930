package ChPractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class PracticeF {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] str1 = {"체리" , "메달" , "7" , "폭탄", "바나나"};
		
		for(String str: str1)
			System.out.println(str);
		System.out.println();
//		for(타입 새변수명: 가져올배열명)
		
		//예제
		int[] int1 = {1, 3, 5, 7, 11, 13};
		for(int num: int1)
			System.out.println(num);
		System.out.println();
		
		char[] char1 = {'a', 'b', 'c', 'd'};
		for(char alphabet: char1)
			System.out.println(alphabet);
		System.out.println();
		
		
		
		ArrayList<String> numbers = new ArrayList<>(Arrays.asList("One", "Two", "Three"));
		for(String number : numbers)
			System.out.println(number);
		System.out.println();
		
		//다른예시
		//리스트명.forEach(새리스트명 -> System.out.println(새리스트명));
		numbers.forEach(number -> System.out.println(number));
		System.out.println();
		
		
		sc.close();
	}

}
