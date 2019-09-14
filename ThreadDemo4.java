package Multi_Threading;
class A extends Thread
{
	Thread t = new Thread("A");
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Value of "+t+" "+i);
			try {  Thread.sleep(1000);  }catch(InterruptedException e) { }
		}
		System.out.println("Class A is exited!");
	}
}
class B extends Thread
{
	Thread t = new Thread("B");
	public void run()
	{
		for(int i=0;i<5;i++)
		{
			System.out.println("Value of "+t+" "+i);
			try {  Thread.sleep(1000);  }catch(InterruptedException e) { }
		}
		System.out.println("class B is exited!");
	}
}
public class ThreadDemo4 {
	public static void main(String[] args)
	{
		A t1 = new A();
		B t2 = new B();
		t1.start();
		t2.start();
		try
		{
			t1.join();
			t2.join();
		}catch(InterruptedException e){}
		System.out.println("Main Class Exited!");
	}
}
