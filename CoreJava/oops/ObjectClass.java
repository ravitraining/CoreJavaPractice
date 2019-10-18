package oops;

public class ObjectClass {
	static String str1;
	String str2;
ObjectClass(String s1)
{
	this.str1=s1;
	
}
public static void main(String[] args) {
	ObjectClass obj=new ObjectClass("Ravi");
	System.out.println(obj);
}
}
