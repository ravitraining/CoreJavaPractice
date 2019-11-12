package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapIterate {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1011, "Ravi");
		map.put(1016, "Avi");
		map.put(1017, "Santosh");
		map.put(1013, "Gajanan");
		map.put(1012, "Prakash");
		System.out.println(map);
		Iterator itr=map.entrySet().iterator();
		while(itr.hasNext())
		{
			Map.Entry me=(Map.Entry)itr.next();
			System.out.println("Key is:"+me.getKey()+"  Value:"+me.getValue());
		}
		
		for(Map.Entry entry: map.entrySet())
		{
			System.out.println("Key is:"+entry.getKey()+"   Value:"+entry.getValue());
		}
		
		
	}
}
