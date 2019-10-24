import java.io.*;
public class FileDemo6
{
	public static void main(String[] args) throws IOException
	{
		String str;
		int i = 0,c =1;
		System.out.println("Enter the File Name :");
		str = System.console().readLine();
		FileInputStream fis = new FileInputStream(str);
		System.out.println();
		System.out.print(c+". ");
		while((i = fis.read()) != -1 )
		{
			System.out.print((char)i);
			if(i == 10)
			{
				c++;
				System.out.print("\n"+c+". ");
			}
		}
		System.out.println();
	}
}
