package collection;
import java.util.Comparator;
import java.util.TreeSet;
public class ComparatorDemo
{
public static void main(String[] args) {
	TreeSet<Integer> ts=new TreeSet<Integer>(new MyComparator());
	ts.add(112);
	ts.add(361);
	ts.add(341);
	ts.add(872);
	ts.add(3321);
	ts.add(9988);
	ts.add(111);
	System.out.println(ts);
	
}

}
