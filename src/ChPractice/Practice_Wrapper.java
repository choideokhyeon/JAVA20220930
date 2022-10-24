package ChPractice;

import java.util.Scanner;

public class Practice_Wrapper {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		Integer num = new Integer(a);
		int n = num.intValue();
		System.out.println(n);
	}

}
