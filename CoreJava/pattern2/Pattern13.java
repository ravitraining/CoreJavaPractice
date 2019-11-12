package pattern2;
public class Pattern13  
{
	public static void main(String args[])
	{
	   int i,j,num=5;
	
		for(i=1;i<=num;i++)
		 {    
		
			
		         for(j=1;j<=i;j++)
			     {  
			          if((i+j)%2==1)
			           {
			            System.out.print(1);
			           }
			           else
			          { 
  				System.out.print(0);
			           }
						
			}
			 System.out.println("");
			
			
		}	
		
	} 



}