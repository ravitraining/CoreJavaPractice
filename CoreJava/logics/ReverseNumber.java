package logics;

public class ReverseNumber {
public static void main(String[] args) {
	int num=1234;
	int a=0;
	int temp=num;
	while(num>0)
	{
		int reminder=num%10;
		a=a*10+reminder;
		num=num/10;
	}
	System.out.println("Palindrome Number:"+temp+"..to.."+a);
}
}
