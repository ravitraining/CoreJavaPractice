package collection;
import java.util.ArrayList;
import java.util.Iterator;


public class IteratorDemo {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	for(int i=0;i<10;i++)
	{
		al.add(i);
	}
	System.out.println(al);
	Iterator<Integer> itr=al.iterator();
	while(itr.hasNext())
	{
		Integer i1=itr.next();
		if(i1%2==0)
		{
			System.out.println(i1);
		}
		else
		{
			itr.remove();
		}
	}
}
 }
