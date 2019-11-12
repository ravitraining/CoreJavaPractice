package stringlogics;

public class String4 {
	public static void main(String args[]) {
		int j = 1;
		String s = "complete";
		int s1 = s.length() / 2;
		int s2;
		s2 = s1;
		s2++;
		for (int i = 0; i < s.length(); i++) {
			if (i < s1) {

				System.out.print(s.charAt(s.length() - s2));
				s2++;
			} else {
				System.out.print(s.charAt(i));

			}

		}

	}
}