package Ch20;

import java.util.*;

public class C04Set {

	public static void main(String[] args) throws InterruptedException {
		Random rand = new Random();
		Set<Integer> lotto = new HashSet();
		
		//로또 만들기
		//set을 이용하여 6자리 난수를 저장(1-45까지)
		//저장 이후 정렬(오름차순)
		
		while(lotto.size() < 7)
		{
			lotto.add(rand.nextInt(45)+1);
		}
		System.out.println("---------SET---------");
		for(int n : lotto)
			System.out.print(n + " ");
		
		
		
		System.out.println("\n---------LIST(정렬 전)---------");
		List<Integer> list = new ArrayList(lotto);
		for(int i : list)
			System.out.print(i + " ");
		
		
		//정렬
		System.out.println("\n---------LIST(정렬 후)---------");
//		Collections.sort(list);								//오름차순
		Collections.sort(list, Collections.reverseOrder());	//내림차순
		for(int i : list)
			System.out.print(i + " ");

	}

}


////난수만들기 코드
//while(true)
//{
//	System.out.println(rand.nextInt(45)+1);
//	Thread.sleep(500);
//}