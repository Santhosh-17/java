import java.util.Scanner;
@SuppressWarnings("serial")
class AgeNotWithinRangeException extends Exception
{
	public String toString()
	{
		return "Age is not Acceptable";
	}
}
@SuppressWarnings("serial")
class NameNotValidException extends Exception
{
	public String toString()
	{
		return "Invalid Name";
	}
}
class Doctor
{
	String str;
	String Dept;
	char i;
	int Age,Id;
	Doctor(String name,int age,int id,String dept)
	{
		str = name;
		Age = age;
		Id = id;
		Dept = dept;
	}
	void check()
	{
		int ch=0;
		try 
		{
			char[] Name =str.toCharArray();
			for(int i=0;i<str.length();i++)
			{
				if(!((Name[i]>='a' && Name[i]<='z') || ( Name[i]>='A' && Name[i]<='Z')))
				{
					throw new NameNotValidException();
					
				}
			}
		}catch(NameNotValidException n)
		{
			ch=1;
			System.out.println(n);
		}
		
		try 
		{
			if(Age>=25 && Age <=65);
			else
			{
				throw new AgeNotWithinRangeException();
			}
		}catch(AgeNotWithinRangeException e)
		{
			ch=2;
			System.out.println(e);
		}
		if(ch == 0)
		{
			System.out.println("There were no exception!");
		}
		
	}

}
public class DoctorException
{
	public static void main(String[] args)
	{
		String name,dept;
		int age,id;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Doctor Name:");
		name = scan.next();
		System.out.println("Enter the Doctor ID:");
		id = scan.nextInt();
		System.out.println("Enter the Doctor Age:");
		age = scan.nextInt();
		System.out.println("Enter the department of doctor:");
		dept = scan.next();
		Doctor d = new Doctor(name,age,id,dept);
		d.check();
	}

}

