package oops;

public class InterfaceTest {

	public static void main(String[] args) {
		
		A b=new B();
		b.display();
//		b.show();
	}
}

interface A
{
	public void display();
}
class B implements A
{
	public void display()
	{
		System.out.println("Display");
	}
	public void show()
	{
		System.out.println("Show method");
	}
}

interface Inter
{
	public void show1();
}