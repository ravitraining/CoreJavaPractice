package ExceptionHandling;

public class CheckingCustomizedException {
	public static void main(String[] args) {
		int age = 441;
		if (age < 18) {
			int age1 = 18 - age;
			throw new TooYoungException();
		} else if (age > 60) {
			int age1 = age - 60;
			throw new TooOldExceptoin();
		} else {
			System.out.println("Welcome to Election booth");
		}
	}
}
