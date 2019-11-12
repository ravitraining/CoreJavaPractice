package logics;

import java.util.HashMap;

public class WordCount {
	public static void main(String[] args) {
		String string="This is the the real word is that";
		String mianString[]=string.split(" ");
		int count=0;
		HashMap<String, Integer> hashmap=new HashMap<String, Integer>();
		for(int i=0;i<mianString.length-1;i++)	
		{
			if(hashmap.containsKey(mianString[i])){
				hashmap.put(mianString[i], count++);
			}
			else
			{
				hashmap.put(mianString[i], 1);
			}
		}
		System.out.println(hashmap);
	}
}
