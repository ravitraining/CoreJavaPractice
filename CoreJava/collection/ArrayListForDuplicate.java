package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
// prints only duplicate values
public class ArrayListForDuplicate {
public static void main(String[] args) {
	ArrayList<String> arrayList=new ArrayList<>();
	arrayList.add("Ravi");
	arrayList.add("avi");
	arrayList.add("Santoosh");
	arrayList.add("Gaju");
	arrayList.add("Ravi");
	arrayList.add("Prakash");
	Set<String> set=new HashSet<String>();
	for(String s1: arrayList)
	{
		if(set.add(s1)==true)
		{
			System.out.println(s1);
		}
	}
}
}
