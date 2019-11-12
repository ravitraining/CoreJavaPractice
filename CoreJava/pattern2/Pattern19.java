package pattern2;
public class Pattern19
{
	public static void main(String args[])
	{
	   int i,j,k,num=7,n=1,r=0,p;
		r=num/2;
		p=num-r;
		for(i=1;i<=p;i++)
		{
		       for(k=r;k>=i;k--)
		        {
		             System.out.print(" ");
                                               } 
				
		          for(j=1;j<=n;j++)
		           {
                                              System.out.print(j);  
			
                                                  
		           }
                                                     n+=2;
                                                     System.out.println("");
		}







	}

}