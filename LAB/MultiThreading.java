import java.util.*;
class Even extends Thread
{
	int n;
	Even(int num)
	{
		n = num;
	}
	public void run()
	{
		 System.out.println(n +" is even");
		 System.out.println("The Square of the Number is :"+(n*n));
	}
}
class Odd extends Thread
{
	int n;
	Odd(int num)
	{
		n = num;
	}
	public void run()
	{
		 System.out.println(n +" is odd");
		 System.out.println("The Cube of the Number is :"+(n*n*n));	
		
	}
}
class RandomGen extends Thread
{
	int n,no;
	Random obj = new Random();
	
	
	public void run()
	{

		for(int i=0;i<no;i++)
		{
			n = obj.nextInt(100);
			if(n%2 == 0)
			{
				Even t1 = new Even(n);
				t1.start();
			}
			else
			{
				Odd t2 = new Odd(n);
				t2.start();
			}
			try { Thread.sleep(1000); }catch(InterruptedException e) {}
		}
	}
	
}
public class MultiThreading {

	public static void main(String[] args) {
		RandomGen t = new RandomGen();
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the No .of Times:");
		t.no = scan.nextInt();
		t.start();
	}

}
