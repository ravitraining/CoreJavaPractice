package stringlogics;
// printing each charadcter in reverse order
public class String2 {
	public static void main(String args[]) {
		String s = "complete";
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.print(s.charAt(i));
		}

	}

}