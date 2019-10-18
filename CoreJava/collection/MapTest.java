package collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapTest {
public static void main(String[] args) {
	Map<String, String> map=new HashMap<>();
	map.put("Name", "Ravi");
	map.put("bro","avi");
	map.put("sis", "bharu");
	System.out.println(map);
	Set<Map.Entry<String, String>> vaues=map.entrySet();
	for(Map.Entry<String, String> e: vaues)
	{
		System.out.println(e.getKey()+"...."+e.getValue());
	}
	
	
	
	
}
}
