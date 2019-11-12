package stringlogics;

public class String6 {
public static void main(String[] args) {
	String string="Raviraj";
	char cha='A';
	int position=5;
	string=string.substring(0,position)+cha+string.substring(position+1);
	System.out.println(string);
}
}
