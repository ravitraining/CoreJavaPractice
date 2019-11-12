package pattern2;
public class Pattern21
{
	public static void main(String args[])
	{
	   int i,j,p,r,num=7,m;
	   p=num/2;
	   r=num-p;
		for(i=1;i<=num;i++)
		{   m=p;
		              if(i<=r)
			{
			for(j=1;j<=i;j++)
			  { 
		                        System.out.print(" "+m);
				m--;
			   }
			}
			else
			  { m=num/2;
			    for(j=p;j>=1;j--)
			     {
				System.out.print(" "+m);
				m--;
			     }
				p--;
			} System.out.println("");
			
			
		}	
		
	}



}