@SuppressWarnings("serial")
class NegativeException extends Exception
{
	public String toString()
	{
		return "Input Should be Positive\nCheck the input";
	}
}
@SuppressWarnings("serial")
class InvalidValueException extends Exception
{
	public String toString()
	{
		return "The second should be larger than the first";
	}
}
public class MyException3 {

	public static void main(String[] args) {
		int a,b,ch=0;
		a=Integer.parseInt(args[0]);
		b=Integer.parseInt(args[1]);
		try
		{
			if(a<0 || b<0)
			{
				throw new NegativeException();
			}
		}catch(NegativeException n)
		{
			ch=1;
			System.out.println(n);
		}
		try
		{
			if(b<=a)
			{
				throw new InvalidValueException();
			}
		}catch(InvalidValueException e)
		{
			ch =2;
			System.out.println(e);
		}
		if(ch ==0 )
		{
			System.out.println("Prime Numbers are:");
			for(int i=a;i<=b;i++)
			{
				if(prime(i))
				{
					System.out.print(i+" ");
				}
			}
			
		}		
	}
	static boolean prime(int n)
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0 && n!=i)
			{
				return false;
			}
		}
		return true;
	}

}
