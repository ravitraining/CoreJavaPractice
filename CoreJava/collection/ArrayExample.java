package collection;
import java.util.Arrays;

public class ArrayExample {
	public static void main(String[] args) {
		int a[] = { 120, 33, 44, 55, 22, 333, 77, 665, 332, 55 };
		Arrays.sort(a);
		for(int i1: a)
		{
			System.out.println(i1);
		}
	}
}
