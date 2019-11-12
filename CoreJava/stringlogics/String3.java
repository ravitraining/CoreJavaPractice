package stringlogics;
// replace the character from string
public class String3 {
	public static void main(String args[]) {
		int j = 1;
		String s = "complete";
		int s1 = s.length() / 2;
		System.out.println(s1);
		for (int i = 0; i < s.length(); i++) {
			if (i < s1) {
				System.out.print(s.charAt(i));
			} else {
				System.out.print(s.charAt(s.length() - j));
				j++;

			}

		}

	}
}