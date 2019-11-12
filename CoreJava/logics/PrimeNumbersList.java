package logics;

public class PrimeNumbersList {
public static void main(String[] args) {
	
	String primenum="";
	int num;
	int totalcount=0;
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
			totalcount++;
		}
	}
	System.out.println(totalcount+" Prime numbers are:"+primenum);
}
}
