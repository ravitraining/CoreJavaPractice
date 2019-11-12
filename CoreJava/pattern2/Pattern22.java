package pattern2;
public class Pattern22
{
	public static void main(String args[])
	{
	   int i,j,k,n=4;
	
		for(i=1;i<=n;i++)
		{	
		
		    for(k=n-1;k>=i;k--)
			{
			    System.out.print(" ");
			}
			for(j=1;j<=i;j++)
			{ 
				
			   System.out.print(" "+i);
			
			}	
			
			 System.out.println("");
			
			
		}	
		
	}



}