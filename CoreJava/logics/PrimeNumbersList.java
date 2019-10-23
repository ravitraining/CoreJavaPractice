package logics;

public class PrimeNumbersList {
public static void main(String[] args) {
	int maxnum=100;
	String primenum="";
	int num;
	System.out.println("The prime numbers are");
	for(int i=1;i<=100;i++)
	{
		int count=0;
		for(num=i;num>=1;num--)
		{
			if(i%num ==0)
			{
				count=count+1;
			}
		}
		if(count==2)
		{
			primenum=primenum+" "+i;
		}
	}
	System.out.println("Prime numbers are:"+primenum);
}
}
