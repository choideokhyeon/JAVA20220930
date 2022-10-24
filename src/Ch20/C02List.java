package Ch20;

import java.util.*;

public class C02List {

	public static void main(String[] args) {
		
		//List, Vector, LinkedList 셋 다 별 차이 없음
//		List<String> list = new Vector();
		List<String> list = new LinkedList();

		//추가
		list.add("JAVA");				//0
		list.add("JDBC");				//1
		list.add("OracleDB");			//2
		list.add("JSP");				//3
		list.add("Servelt");			//4
		list.add("SpringFrameWork");	//5
		
		
		
		//확인(저장 수)
		System.out.println("총 개체수 : " + list.size());
		
		
		
		//조회(요소)
		System.out.println("확인 idx 2 : " + list.get(2));
		System.out.println("--------------------");
		
		
		
		//전체 조회
		//기존방식
		for(int i = 0; i < list.size(); i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("--------------------");
		//개량방식
		for(String a : list)
		{
			System.out.println(a);
		}
		System.out.println("--------------------");
		
		
		
		//삭제
		list.remove(2);
		System.out.println("삭제 후 확인");
		for(String tmp : list)
		{
			System.out.println(tmp);
		}
		
	}

}
