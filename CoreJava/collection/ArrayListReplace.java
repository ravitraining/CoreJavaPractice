package collection;

import java.util.ArrayList;

public class ArrayListReplace {
public static void main(String[] args) {
	ArrayList<String> al=new ArrayList<>();
	al.add("ravi");
	al.add("avi");
	al.add("gaju");
	al.add("santosh");
	al.add("prakash");
	System.out.println(al);
	
	for(String s1: al)
	{
		if(s1.contains("s")==true)
		{
			System.out.println();
		}
		else
		{
			System.out.println(s1);
		}
	}
			
}
}
