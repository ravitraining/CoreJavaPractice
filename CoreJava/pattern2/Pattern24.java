package pattern2;
public class Pattern24
{
	public static void main(String args[])
	{
	   int i,j,p,r,k,num=7;
	   p=num/2;
	   r=num-p;
		for(i=1;i<=num;i++)
		{
		              if(i<=r)
			{ 
 			   for(k=r-1;k>=i;k--)
			     {
			        System.out.print(" ");
                                                               }
			     for(j=1;j<=i;j++)
			     { 
		                           System.out.print(" "+i);
			      }
			  }
			else
			  {    
 				
				
			       for(k=r+1;k<=i;k++)
			     {
			        System.out.print(" ");
	
                                                               }
			      for(j=p;j>=1;j--)
			     {
				System.out.print(" "+p);
			     }
				p--;
				
			} System.out.println("");
			
			
		}	
		
	}



}