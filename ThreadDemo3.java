package Multi_Threading;
class Q
{
	int n;
	boolean valueset = false;
	synchronized void put(int num)
	{
		if(valueset)
		{
			try { wait(); }catch(InterruptedException e) {}
		}
		n = num;
		System.out.println("Put : "+n);
		valueset = true;
		notify();
	}
	synchronized void get()
	{
		if(!valueset)
		{
			try { wait(); }catch(InterruptedException e) {}
		}
		
		System.out.println("Get : "+n);
		valueset = false;
		notify();
	}
	
}
class Producer extends Thread
{
	Q q;
	Producer(Q q)
	{
		this.q =q;
		new Thread("Producer");
		start();
	}
	public void run()
	{
		int i=0;
		while(true)
		{
			q.put(i++);
			try { Thread.sleep(1000); }catch(InterruptedException e) {}
		}
	}
}
class Consumer extends Thread
{
	Q q;
	Consumer(Q q)
	{
		this.q =q;
		new Thread("Consumer");
		start();
	}
	public void run()
	{
		while(true)
		{
			q.get();
			try { Thread.sleep(1000); }catch(InterruptedException e) {}
		}
	}
}
public class ThreadDemo3
{
	public static void main(String[] args)
	{
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
	}
}
