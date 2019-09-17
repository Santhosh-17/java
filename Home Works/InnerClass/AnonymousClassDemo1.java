abstract class Shape
{
	abstract void show();
}
public class AnonymousClassDemo1
{
	public static void main(String[] args)
	{
		Shape s = new Shape()
		{
			int a = 4,b = 6;
			public void show()
			{
				System.out.println("The Sum of "+a+" and "+b+" is: "+(a+b));
			}
		};
		s.show();
	}
}