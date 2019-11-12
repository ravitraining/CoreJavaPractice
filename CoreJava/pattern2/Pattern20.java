package pattern2;
public class Pattern20
{
	public static void main(String args[])
	{
	   int i,j,k,num=21,n=1,r=0,p,m=1;
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
                                              System.out.print(" "+m);  
			m--;
                                                  
		           }
                                                     n+=2;
			m=n;
                                                     System.out.println("");
		}







	}

}