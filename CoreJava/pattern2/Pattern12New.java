package pattern2;
public class Pattern12New
{
	public static void main(String args[])
	{
	   int i,j,num=10,n=1,m=1;
	
		for(i=1;i<=num;i++)
		{       m=i;
		         n=i;
			
			for(j=1;j<=6;j++)
			{ 
			    if(j%2==0){	
			       System.out.print(" "+n);
			       n++; 
			       }
			     else{
                                                                 System.out.print(" "+n);
			       n+=9;
			        }
			  }
			System.out.println("");
			
			
		}	
		
	}
}