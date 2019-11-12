package pattern2;
public class Pattern16
{
	public static void main(String args[])
	{
	   int i,j,k,num=4;
	                     
		for(i=num;i>=1;i--)
		{
		            for(k=i;k<num;k++)
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