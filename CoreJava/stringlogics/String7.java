package stringlogics;

import java.util.*;
// count character from string
public class String7 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();

		int count = 0, i;

		for (i = 0; i < s.length(); i++) {
			count++;
		}

		System.out.println("No of char in String= " + count);
	}

}