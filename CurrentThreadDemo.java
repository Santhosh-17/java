package Multi_Threading;

public class CurrentThreadDemo {
	public static void main(String[] args)
	{
		Thread t = new Thread();
		t = Thread.currentThread();
		System.out.println("Current Thread:"+t);
		t.setName("MY Thread");
		System.out.println("Current Thread:"+t);
	}
}
