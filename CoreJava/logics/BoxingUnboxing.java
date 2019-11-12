package logics;

public class BoxingUnboxing {
public static void main(String[] args) {
	int i=99;
	Integer ii=new Integer(i);  // Boxing
	int jj=ii.intValue();
	System.out.println(jj); 	// unboxing
}
}
