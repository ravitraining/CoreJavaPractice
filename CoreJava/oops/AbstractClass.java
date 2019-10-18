package oops;

public class AbstractClass {
public static void main(String[] args) {
//	MaheshPhone obj=new MaheshPhone(); // cannont instatioate the abstract class
//	obj.call();
	Suresh obj=new Suresh();
	obj.call();
	obj.cook();
	obj.dance();
	obj.move();
}
}

abstract class MaheshPhone
{
	public void call()
	{
		System.out.println("Calling...");
	}
	public abstract void move(); // abstract methods
	public abstract void dance();
	public abstract void cook();
}

abstract class Ramesh extends MaheshPhone
{
	public void move()
	{
		System.out.println("Moving...");
	}
}

class Suresh extends Ramesh // concrete class
{
	public void dance()
	{
		System.out.println("Dancing...");
	}
	public void cook()
	{
		System.out.println("Cooking...");
	}
}