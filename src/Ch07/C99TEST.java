package Ch07;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class C99TEST {
	
	public static void main(String[] args) {
		List<String> lists = new ArrayList();
		lists.add("JAVA");
		lists.add("JSP");
		lists.add("Servlet");
		lists.add("Spring");
		lists.add("Databases");
		
//		for(String str : lists)
//		{
//			System.out.println(str);
//		}
		
		lists.forEach(tmp -> System.out.println(tmp));
		
		Map<String,String> map = new HashMap();
		map.put("k1", "V1");
		map.put("k2", "V2");
		map.put("k3", "V3");
		map.put("k4", "V4");
		
		for(String key : map.keySet())
		{
			System.out.println("KEY : " + key + ",VAL : " + map.get(key));
		}
		
	}
		
}
