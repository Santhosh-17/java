import java.util.Scanner;
@SuppressWarnings("serial")
class HelloException extends Exception 
{
	Scanner  scan = new Scanner(System.in);
	String str;
	void check()
	{
		try
		{
			System.out.println("Enter the string:");
			str = scan.next();
			if(str.equals("hello"))
			{
				throw new HelloException();
			}
			else
			{
				System.out.println("There is no Exception!");
			}
		}catch(HelloException e)
		{
			System.out.println(e);
			System.out.println("There is an Exception !");
		}
	}
	public String toString()
	{
		return "User Input is hello";
	}
}
public class MyException1 {

	public static void main(String[] args) {
		HelloException HE = new HelloException();
        HE.check();
	}

}
