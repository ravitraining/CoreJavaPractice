package pattern;

public class Pattern7 {
	public static void main(String args[]) {
		int i, j, num = 5;

		for (i = 1; i <= num; i++) {
			for (j = 1; j <= num; j++) {
				if ((i > 1 && i < 5) && (j > 1 && j < 5)) {
					if (i == 3 && j == 3) {
						System.out.print(" #");
					} else {
						System.out.print("  ");
					}
				} else {
					System.out.print(" *");
				}
			}
			System.out.println("");

		}

	}

}