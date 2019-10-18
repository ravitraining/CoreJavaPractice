package collection;
import java.util.ArrayList;
import java.util.ListIterator;


public class ListIteratorTest {
public static void main(String[] args) {
	ArrayList<Integer> al=new ArrayList<Integer>();
	al.add(123);
	al.add(4122);
	al.add(1243);
	al.add(3126);
	al.add(56123);
	al.add(13323);
	al.add(8123);
	al.add(5124);
	System.out.println(al);
	ListIterator<Integer> ltr=al.listIterator();
	while(ltr.hasNext())
	{
		Integer i1=ltr.next();
			if(i1%2==0)
			{
			System.out.println(i1);
		}
		else
		{
			ltr.remove();
		}
	}
}
}
