public class InnerClassDemo1
{
	private int a = 100;
	class InnerClass
	{
		public void show()
		{
			System.out.println("Value of a :"+a);
		}
	}
	public static void main(String[] args)
	{
		InnerClassDemo1 obj = new InnerClassDemo1();
		InnerClassDemo1.InnerClass obj1 = obj.new InnerClass();
		obj1.show();
	}
	
}