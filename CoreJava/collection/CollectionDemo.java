package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class CollectionDemo {
public static void main(String[] args) {
	List l=new ArrayList();
	l.add(1223);
	l.add("ARavi");
	l.add(110.99);
	
	Collection c=new ArrayList();
	c.add(123);
	c.add("Ravi");
	c.add(10.99);
	c.addAll(l);
	System.out.println(c);
	for(Object o:c)
	{
		System.out.println(o);
	}
}
}
