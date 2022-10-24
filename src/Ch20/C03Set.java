package Ch20;

import java.util.*;

public class C03Set {

	public static void main(String[] args) {
		
		Set <String> set = new HashSet();

		//추가
		set.add("JAVA");
		set.add("JDBC");
		set.add("OracleDB");
		set.add("JSP");
		set.add("Servelt");
		set.add("SpringFrameWork");
		set.add("JAVA");				//중복 허용 불가... 총 개수 6개
		
		
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + set.size());
		
		
		
		//조회(간편)
		for(String tmp : set)
			System.out.println(tmp);
		System.out.println("-----------------------");
		
		
		
		//조회(복잡)
		Iterator<String> iter = set.iterator();
		while(iter.hasNext())
		{
			String tmp = iter.next();
			System.out.println(tmp);
		}
		
		
		
		set.remove("JAVA");
		//확인(저장 수)
		System.out.println("총 개체수 : " + set.size());
		
	}

}
