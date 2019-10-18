package logics;

public class Testing {
public static void main(String[] args) {
	ABC a=new ABC(5);
	ABC a1=new ABC();
}
}
class ABC{
	public ABC(int i)
	{
	System.out.println("Hello:"+i);
	}
	public ABC()
	{
	System.out.println("No Args:");
	}

}
