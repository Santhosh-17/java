import java.io.*;
public class FileDemo1
{
	public static void main(String[] args) throws IOException
	{
			String s;
			int i = 0;
			System.out.println("Enter the file name:");
		    String str = System.console().readLine();
			FileOutputStream fos = new FileOutputStream(str);
			System.out.println("Enter the text you wanna to Enter :");
			s = System.console().readLine();
			byte b[] = s.getBytes();
			fos.write(b);
			System.out.println("Successfully Created and Written");
			fos.close();      
	}
}