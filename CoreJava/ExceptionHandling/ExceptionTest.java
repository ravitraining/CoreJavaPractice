package ExceptionHandling;

public class ExceptionTest {
public static void main(String[] args) {
	int i=0;
	int j=5;
	try
	{
	int k=j/i;
	System.out.println(k);
	}
	catch(ArithmeticException e)
	{
		if(i==0)
		{
		System.out.println(i+" i chi value badal");
		}
		else
		{
			System.out.println(j+" j chi value badal");
		}
	}
}
}
