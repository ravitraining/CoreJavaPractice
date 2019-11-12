package pattern;

public class Pattern6 {
	public static void main(String args[]) {
		int i, j, num = 4;

		for (i = 0; i < num; i++) {
			for (j = 0; j < num; j++) {
				if ((i > 0 && i < 3) && (j == 1 || j == 2)) {
					System.out.print("  ");
				} else {
					System.out.print(" *");
				}
			}
			System.out.println("");

		}

	}

}