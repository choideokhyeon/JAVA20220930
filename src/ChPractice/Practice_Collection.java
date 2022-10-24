package ChPractice;

import java.util.*;

public class Practice_Collection {

	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>();
		
		arrList.add("넷");
		arrList.add("하나");
		arrList.add("셋");
		arrList.add("둘");
		
		for(int i = 0; i < arrList.size(); i++)
		{
			System.out.println("arrList[" + i + "] : " + arrList.get(i));
		}
		
		arrList.remove(1);
		System.out.println(arrList.get(1));
		
		arrList.set(2, "하나");
		System.out.println(arrList.get(2));
		
		System.out.println(arrList.size());
	}
}
