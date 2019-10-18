package collection;
import java.util.Comparator;
import java.util.TreeSet;


public class MyComparator implements Comparator<Integer> {
public int compare(Integer obj1, Integer obj2)
{
	Integer i1=(Integer)obj1;
	Integer i2=(Integer)obj2;
	if(i1<i2)
	{
		return +1;
	}
	else if(i1>i2)
	{
		return -1;
	}
	else
	{
		return 0;
	}
	
}

}
