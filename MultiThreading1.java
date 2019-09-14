package Multi_Threading;
class Thread1 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread1 : "+(-1 * i));
				sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		
		System.out.println("Thread1 exit!");
	}
}
class Thread2 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2 : "+(1 * i));

				sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		
		System.out.println("Thread2 exit!");
	}
}
class Thread3 extends Thread
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread3 : "+(0 * i));
				sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		
		System.out.println("Thread3 exit!");
	}
}
public class MultiThreading1 {
	public static void main(String[] args)
	{
		Thread t =new Thread();
		new Thread1().start();
		new Thread2().start();
		new Thread3().start();
		t=Thread.currentThread();
		System.out.println("Current thread:"+t);
		System.out.println("Main Exists!");
	}

}
