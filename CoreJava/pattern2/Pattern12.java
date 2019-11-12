package pattern2;

public class Pattern12 {

	public static void main(String args[]) {

		int a = 1, b = 10, c = 11, d = 20, e = 21, f = 30, i;

		for (i = 1; i <= 10; i++) {
			System.out.print(a + " " + b + " " + c + " " + d + " " + e + " "
					+ f);
			a++;
			b--;
			c++;
			d--;
			e++;
			f--;
			System.out.println("");

		}

	}

}