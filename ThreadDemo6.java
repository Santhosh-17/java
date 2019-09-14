package Multi_Threading;
class X
{
	synchronized void foo(Y y)
	{
		String name = Thread.currentThread().getName(); //get the name of current thread
		
		System.out.println(name +" Entered X.foo"); // print statement
		try { Thread.sleep(1000); }catch(InterruptedException e) {}
		
		System.out.println(name + " trying to call Y.last()"); //  print statement
		y.last(); // will lock on this
	}
	synchronized void last()
	{
		System.out.println("Inside X.last");
	}
	
}
class Y
{
	synchronized void bar(X x)
	{
		String name = Thread.currentThread().getName();//get the name of current thread
		
		System.out.println(name +" Entered Y.foo");// print statement
		
		try { Thread.sleep(1000); }catch(InterruptedException e) {}
		
		System.out.println(name + " trying to call X.last()");//  print statement
		x.last();// will lock on this
	}
	synchronized void last()
	{
		System.out.println("Inside Y.last");
	}
}
public class ThreadDemo6 implements Runnable{
	X x = new X();
	Y y = new Y();
	ThreadDemo6()
	{
		Thread.currentThread().setName("MainThread"); //set thread name as "MainThread"
		Thread t = new Thread(this,"RacingThread"); // Creating another Thread with name as RacingThread
		t.start(); // starting  Racing thread
		
		x.foo(y); //Thread run by MainThread
		System.out.println("Back in the Main Thread");
	}
	public void run()
	{
		
		y.bar(x); //Thread run by Racing Thread
		System.out.println("Back in the Another Thread");
	}

	public static void main(String[] args) {
		new ThreadDemo6(); // calling constructor
	}

}
