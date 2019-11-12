package logics;

public class FindSmallestNumber {
	public static void main(String[] args) {
		String count = "";
		for (int i = 1; i <= 30000; i++) {
			if (i % 1 == 0 && i % 2 == 0 && i % 3 == 0 && i % 4 == 0
					&& i % 5 == 0 && i % 6 == 0 && i % 7 == 0 && i % 8 == 0
					&& i % 9 == 0 && i % 10 == 0) {
				count = count + i + " ";
			}
		}
		System.out.println("Hello");
		System.out.println(count);
	}
}
