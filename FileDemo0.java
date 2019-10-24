import java.io.*;
public class FileDemo0
{
	public static void main(String[] args) throws IOException
	{
		String str ;
		System.out.println("Enter the file name:");
		str = System.console().readLine();
		File f = new File(str);
		if(f.exists())
		{
			System.out.println("File is already Exists!");
		}
		else
		{
			System.out.println("File does not exists !");
			f.createNewFile();
			System.out.println(str + " file is Created now");
		}
	}
}