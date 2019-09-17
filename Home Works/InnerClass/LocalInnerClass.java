public class LocalInnerClass
{
	public void display()
	{
		class Local
		{
			void show()
			{
				System.out.println("Inside the Local Class!");
			}
		}
		
		Local l = new Local();
		l.show();
	}
	public static void main(String[] args)
	{
		LocalInnerClass li = new LocalInnerClass();
		li.display();
	}
}