package pattern;

public class Pattern4 {
	public static void main(String args[]) {
		int i, j, k, n = 4;

		for (i = n; i >= 1; i--) {

			for (k = i; k < n; k++) {
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++) {

				System.out.print("*");

			}

			System.out.println("");

		}

	}

}