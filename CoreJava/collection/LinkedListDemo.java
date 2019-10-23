package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedHashSet<Integer> lhashSet = new LinkedHashSet<>();
		lhashSet.add(1232);
		lhashSet.add(1232); // duplicate keys are not allowed but you added then
							// no any CE or RE it returns only false
		lhashSet.add(4232);
		lhashSet.add(8232);
		lhashSet.add(1252);
		lhashSet.add(1262);
		System.out.println(lhashSet);
	}
}
