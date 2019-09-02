import java.util.Scanner;
@SuppressWarnings("serial")
class NonIntException extends Exception
{
	Scanner scan = new Scanner(System.in);
	int a,b,sum,er =0;
	void getdata()
	{
		try 
		{
			System.out.println("Enter First Integer:");
			a = scan.nextInt();
			System.out.println("Enter Second Integer:");
			b = scan.nextInt();
			if(!(a >=0 && a<=9 ) )
			{
				er = 1;
				throw new NonIntException();
			}
			else if(!(b>=0 && b<=9))
			{
				er = 2;
				throw new NonIntException();
			}			 
		}catch(NonIntException e)
		{
			System.err.println(e);
			System.err.println("Enter the values between (0 to 9)");
			if(er == 1)
			{
				System.err.println("Enter the value of First Integer again:");
				a = scan.nextInt();
			}
			if(er == 2)
			{
				System.err.println("Enter the value of Second Integer again:");
				b = scan.nextInt();
			}
		}
		sum = a+b;
		System.out.println("The Sum of two Integers is "+sum);
	}
	public String toString()
	{
		return "Check the Input";
	}
}
public class MyException2 {

	public static void main(String[] args) 
	{
		NonIntException obj = new NonIntException();
		obj.getdata();
	}
}
