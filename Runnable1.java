package Multi_Threading;
class Thread4 implements Runnable
{
	public void run()    
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread1 : "+(0 * i));
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		
		System.out.println("Thread1 exit!");
		Thread t = new Thread();
		t = Thread.currentThread();
		System.out.println(t);
	}
}
class Thread5 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2 : "+(1 * i));
				Thread.sleep(500);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		System.out.println("Thread2 exit!");
		Thread t = new Thread();
		t = Thread.currentThread();
		System.out.println(t);
	}
}
class Thread6 implements Runnable
{
	public void run()
	{
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread3 : "+(2 * i));
				Thread.sleep(100);
			}
		}catch(InterruptedException e)
		{
			System.out.println("Exception!");
		}
		
		System.out.println("Thread3 exit!");
		Thread t = new Thread();
		t = Thread.currentThread();
		System.out.println(t);
	}
}
public class Runnable1    
{
	public static void main(String[] args)
	{
		Thread t1 = new Thread(new Thread4());
		Thread t2 = new Thread(new Thread5());
		Thread6 c3 = new Thread6();
		Thread t3 = new Thread(c3);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Main exit!");
		Thread t = new Thread();
		t = Thread.currentThread();
		System.out.println(t);
	}
}
