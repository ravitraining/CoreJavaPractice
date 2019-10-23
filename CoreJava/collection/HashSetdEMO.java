package collection;

import java.util.HashSet;

public class HashSetdEMO {
	public static void main(String[] args) {
		HashSet<Integer> hashSet = new HashSet<>();
		hashSet.add(1232);
		hashSet.add(1232); // duplicate keys are not allowed but you added then
							// no any CE or RE it returns only false
		hashSet.add(4232);
		hashSet.add(8232);
		hashSet.add(1252);
		hashSet.add(1262);
		System.out.println(hashSet);
	}
}
