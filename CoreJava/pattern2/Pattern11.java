package pattern2;

public class Pattern11 {
	public static void main(String args[]) {
		int i, j, n, num = 4;

		for (i = 1; i <= num; i++) {

			for (j = 1; j <= num; j++) {
				n = (i + j) - 1;
				if (n > 4) {
					System.out.print(n - 4);
				} else {
					System.out.print(n);
				}
			}
			System.out.println("");

		}

	}

}