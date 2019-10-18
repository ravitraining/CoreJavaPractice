package logics;

public class ClassB {
public static void main(String[] args) {
	new ClassA().setI(10);
	System.out.println(new ClassA().getI());
}
}
