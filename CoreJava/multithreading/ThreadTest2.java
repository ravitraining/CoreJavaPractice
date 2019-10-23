package multithreading;

import java.io.ObjectInputStream.GetField;

public class ThreadTest2 {
public static void main(String[] args) throws InterruptedException {
	MyThread1 mt=new MyThread1();
	Thread t=new Thread(mt);
	t.start();
	t.setPriority(9);
	t.join();
	for(int i=0;i<10;i++)
	{
		Thread.sleep(2000);
		System.out.print(" Parent Thread");
	}
}
}
class MyThread1 implements Runnable
{
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("Chind Thread");
		}
	}
}
