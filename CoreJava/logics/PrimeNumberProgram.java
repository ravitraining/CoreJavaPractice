package logics;

public class PrimeNumberProgram {
public static void main(String[] args) {
	int num=777;
	int count=0;
	String coun="";
	for(int i=1;i<=num;i++)
	{
		if(num%i==0)
		{
			coun=coun+i+" ";
			count++;
		}
	}
	System.out.println("The Divisible numbers are:"+coun);
System.out.println(count);
	if(count==2)
	{
		System.out.println("The Number is Prime");
	}
	else
	{
		System.out.println("The Num is Not  prime");
	}
}
}
