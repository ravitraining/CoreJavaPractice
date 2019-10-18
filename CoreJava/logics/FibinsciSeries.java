package logics;

public class FibinsciSeries {
public static void main(String[] args) {
	int a=0,b=1,c;
	int len=10;
	for(int i=0;i<=len;i++)
	{
		System.out.println(a);
		c=a+b;
		a=b;
		b=c;
	}
}
}
