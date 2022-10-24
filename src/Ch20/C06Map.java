package Ch20;

import java.util.*;

public class C06Map {
	//저장멤버 MAP
	static Map <String, Integer> map = new HashMap();
	
	public static void Insert(String k, Integer v)
	{
		if((!map.containsKey(k)) && (!map.containsValue(v)))
			map.put(k, v);		// key,value 저장
		else
			System.out.println("동일한 key가 존재합니다");
	}
	
	public static void ShowInfo()
	{
		// 조회
		Set<String> set = map.keySet(); // map안의 모든 key를 Set형태로 반환
		for (String key : set)
		{
			int value = map.get(key);
			System.out.println("KEY:" + key + " VALUE:" + value);
		}
	}
	
	public static void Remove(String key)
	{
		Integer result = map.remove(key);
		if(result == null)
			System.out.println("삭제 실패");
		else
			System.out.println("삭제 성공");
	}
	
	public static void Remove(Integer value)
	{
		boolean result = map.values().remove(value);
		if(result)
			System.out.println("삭제 성공");
		else
			System.out.println("삭제 실패");
	}

	public static void main(String[] args) {
		
		Insert("aaa", 1111);
		Insert("bbb", 2222);
		Insert("ccc", 3333);
		Insert("ddd", 4444);
		Insert("ddd", 1234);	//중복 key가 들어가는 경우
		Insert("eee", 1234);	//중복 value가 들어가는 경우
		
		//개수
		System.out.println("저장 수 : " + map.size());
		
		
		//조회
		ShowInfo();
		System.out.println();
		
		
		//삭제
		Remove("aaa");	//삭제성공
		Remove("abc");	//삭제실패
		ShowInfo();
		System.out.println("저장 수 : " + map.size());
		System.out.println();
		
		Remove(3333);
		Remove(1234);
		Remove(4567);
		ShowInfo();
		System.out.println("저장 수 : " + map.size());
		

	}
}
