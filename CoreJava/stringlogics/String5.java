package stringlogics;

// count the charcter from string
public class String5 {
	public static void main(String args[]) {

		int count = 0, i;
		String s = "raviraj";
		for (i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a') {
				count++;
			}

		}
		System.out.println(" a= " + count);
	}

}