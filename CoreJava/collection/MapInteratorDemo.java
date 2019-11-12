package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedMap;

public class MapInteratorDemo {
public static void main(String[] args) {
	Map<Integer, String> fruitMap=new HashMap<Integer, String>();
	fruitMap.put(101, "Apple");
	fruitMap.put(501, "Banana");
	fruitMap.put(201, "Orange");
	fruitMap.put(701, "Apple");
	System.out.println(fruitMap);
	iteratorMap(fruitMap);
}

private static void iteratorMap(Map<Integer, String> fruitMap) {
	for(SortedMap.Entry<Integer, String> entry:fruitMap.entrySet())
	{
		System.out.print("Key="+entry.getKey());
		System.out.println("Value="+entry.getValue());
		
	}
}

}
