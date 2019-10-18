package logics;

public class SwappingNumbers {
public static void main(String[] args) {
	int a=5;
	int b=6;
	System.out.println("Before Swapping A:"+a+"..B:"+b);
	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("After Swapping A:"+a+"..B:"+b);

}
}
