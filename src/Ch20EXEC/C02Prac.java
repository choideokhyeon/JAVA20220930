package Ch20EXEC;

import java.util.*;

public class C02Prac {

	public static void main(String[] args) {
		Set <String> set = new HashSet();
		Scanner sc = new Scanner(System.in);
		
		int i = 0;
		while(i < 6)
		{
			System.out.print("입력 : ");
			String s = sc.nextLine();
			set.add(s);
			i++;
		}
		
		for(String n : set)
			System.out.print(n + " ");
		System.out.println();
		System.out.println("총 객체수 : " + set.size());

	}
}
