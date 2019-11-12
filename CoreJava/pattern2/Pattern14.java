package pattern2;
public class Pattern14
{
	public static void main(String args[])
	{
	   int i,j,k,num=4;
	                     
		for(i=1;i<=num;i++)
		{
		            for(k=num-1;k>=i;k--)
			{ 
			   System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{ 
			   System.out.print(i);
			 }
			 System.out.println("");
					
		}	
	}
}