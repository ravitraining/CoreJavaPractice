package logics;

public class StringReplace {
public static void main(String[] args) {
	// Using String class
	String string="Hello World";
	int position=6;
	char replacechar='M';
	string=string.substring(0, position)+replacechar+string.substring(position+1);
	System.out.println(string);
}
}
