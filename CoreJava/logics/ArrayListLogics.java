package logics;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ArrayListLogics {
public static void main(String[] args) {
	List<Integer> arraylist=Arrays.asList(10,20,33,11);
	System.out.println(arraylist);
	Collections.sort(arraylist);
	System.out.println("Using for Loop[");
	for(Integer i1: arraylist)
	{
		System.out.println(i1);
	}
	System.out.println("Using iteratior");
	ListIterator<Integer> listiteratot=arraylist.listIterator();
	while ((listiteratot).hasNext()) {
		Integer type = (Integer) listiteratot.next();
		System.out.println(type);
	}
}
}
