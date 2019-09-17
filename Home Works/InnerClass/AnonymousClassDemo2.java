interface Shape
{
   void show();
}
public class AnonymousClassDemo2
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