package Multi_Threading;

class MyThread1 implements Runnable
{
	Thread t1;
	MyThread1(String Name)
	{
		 t1 = new Thread(this,Name);
		 t1.start();
		 System.out.println("Thread1 Starts");
	}
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread1 :"+t1.getName());
				System.out.println("Thread1 :"+i);
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread 1 exit!");
	}
}
class TestThread extends Thread
{
	TestThread()
	{
		super("Demo1");
		System.out.println("Thread 2 Starts");
		start();
	}
	Thread t = new Thread();
	
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2 :"+getName());
				System.out.println("Thread2 :"+(-1 * i));
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}
		System.out.println("Thread 2 exists!");
	}
}
public class ThreadDemo2 {
	public static void main(String[] args)
	{
		Thread t = new Thread();
		new MyThread1("Thread 1");
	    new TestThread();
		System.out.println("Main Thread Starts!");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Main Thread:"+t.getName());
				System.out.println("Main Thread :"+(2*i));
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}	
		System.out.println("Main Thread exist!");
	}
}
