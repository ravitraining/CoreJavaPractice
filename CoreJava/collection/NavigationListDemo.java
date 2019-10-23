package collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NavigationListDemo {
public static void main(String[] args) {
	TreeSet<Integer> treeset=new TreeSet<>();
	treeset.add(101);
	treeset.add(601);
	treeset.add(201);
	treeset.add(801);
	treeset.add(901);
	System.out.println(treeset);
	System.out.println(treeset.lower(201));
	System.out.println(treeset.higher(201));
	System.out.println(treeset.descendingSet());
	
}
}
