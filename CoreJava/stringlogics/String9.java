package stringlogics;
// count number of occurences in string
import java.util.*;

public class String9 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The String");
		String s = sc.nextLine();

		int count = 0, count2 = 0, i;

		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				count++;
			}

		}
		if (count < 1) {
			count++;
			System.out.println(" No of words in String is = " + count);
		} else {
			count++;
			System.out.println(" No of words in String is = " + count);
		}
	}

}