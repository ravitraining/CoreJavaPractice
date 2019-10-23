package logics;

public class RajaSoft {
public static void main(String[] args) {
	for(int i=1;i<=100;i++)
	{
		if(i%3==0 && i%5==0)
		{
		System.out.println("Raja Software");
		}
		else if(i%3==0)
		{
			System.out.println("Raja");
		}
		else if(i%5==0)
		{
			System.out.println("Software");
		}
		else
		{
			System.out.println(i);
		}
	}
} 

}
