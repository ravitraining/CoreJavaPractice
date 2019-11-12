package stringlogics;

import java.util.*;
// conting the vovels from string
public class String8 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();
		s.replace(" ","");
		int count = 0, count2 = 0, i;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i'
					|| s.charAt(i) == 'o' || s.charAt(i) == 'u'
					|| s.charAt(i) == 'A' || s.charAt(i) == 'E'
					|| s.charAt(i) == 'I' || s.charAt(i) == 'O'
					|| s.charAt(i) == 'U') {
				count++;
			} 
			else {
				count2++;
			}
		}
		System.out.println(" No of vowels in String is = " + count);
		System.out.println(" No of consonants in String= " + count2);
	}

}