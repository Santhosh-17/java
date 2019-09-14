package Multi_Threading;
class MyThread implements Runnable
{
	Thread t1;
	MyThread(String Name)
	{
		 t1 = new Thread(this,Name);
		 System.out.println("Thread1 :"+t1.getName());
		 t1.start();
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
	}
}
public class ThreadDemo1 {
	public static void main(String[] args)
	{
		Thread t = new Thread();
		new MyThread("Thread 1");
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println("Thread2:"+t.getName());
				System.out.println("Thread2 :"+(2*i));
				Thread.sleep(1000);
			}
		}catch(InterruptedException e)
		{
			System.out.println(e);
		}	
		System.out.println();
	}
}
