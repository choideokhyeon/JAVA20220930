package Ch20;

import java.util.*;

public class C05Map {

	public static void main(String[] args) {
		Map <String, Integer> map = new HashMap();
		map.put("aaa", 111);
		map.put("bbb", 222);
		map.put("ccc", 333);
		map.put("ddd", 444);
		map.put("ddd", 123);	//id 중복인 경우(나중에 요청된 K:V 저장)
		map.put("eee", 123);	//pw 중복인 경우(문제없이 저장)
		
		//개수
		System.out.println("저장 수 : " + map.size());
		
		//조회
		Set <String> set = map.keySet();	//map안의 모든 key를 Set형태로 반환
		for(String key : set)
		{
			int value = map.get(key);
			System.out.println("KEY:" + key + " VALUE:" + value);
		}
	}

}
