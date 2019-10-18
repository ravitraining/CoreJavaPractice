package oops;

public class AbstractClassPhone {

	public static void main(String[] args) {
		IPhone iphone=new IPhone();
		iphone.showConfig();
		SamsungPhone s=new SamsungPhone();
		s.showConfig();
	}
}
abstract class Phone
{
	public abstract void showConfig();
}
class IPhone extends Phone{
	public void showConfig()
	{
		System.out.println("2 Gb Ram");
	}
}
class SamsungPhone extends Phone
{
	public void showConfig()
	{
		System.out.println("4 Gb Ram");
	}
}
