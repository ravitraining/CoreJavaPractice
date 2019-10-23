package logics;

public class StringReverseInbuild {
public static void main(String[] args) {
	String string="Hello Ravi yiou are fool";
	String [] words=string.split(" ");
	String reverse="";
	for(String s1: words)
	{
		StringBuilder sb=new StringBuilder(s1);
		sb.reverse();
		reverse=reverse+sb.toString()+" ";
	}
	System.out.println(reverse);
}
}
