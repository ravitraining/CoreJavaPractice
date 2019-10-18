package collection;

public class MyThread extends Thread 
{
	Dislay d;
	String name;
	MyThread(Dislay d,String name) {
		this.d=d;
		this.name=name;
	}
}
