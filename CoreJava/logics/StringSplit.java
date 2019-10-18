package logics;

public class StringSplit {
public static void main(String[] args) {
	String str="Ravi, Raj, Rahl, SAntoh";
	String names[]=str.split(",");
	for(String s3: names)
	{
	System.out.println(s3);
	}
}
}
