package loops;

public class BreakStatement {
public static void main(String[] args) {
	// we can use break in for loop and switch case
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<=5;j++)
		{
			if(i==j)
			{
				break;
			}
		}
		System.out.println();
	}
}
}
