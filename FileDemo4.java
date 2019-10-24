import java.io.*;
class FileCount extends Thread
{
	String s;
	FileInputStream fin;
	FileCount(String str)
	{
		super(str);
		s = str;
		try{ fin = new FileInputStream(str); }catch(Exception e){}
		start();
	}
	public void run() 
	{
		try {
			int i = 0;
			int count = 1;
			while((i=fin.read())!=-1){    
				if ((i == 10)) //1310
				{
					count++;
				}
			}    
			System.out.println("\nSucessfully Readed!");
			System.out.println("Total No.of Words in " + s +" File:"+count);
			fin.close();
		}catch(Exception e){}
	}
}
public class FileDemo4
{
	public static void main(String[] args)
	{
		for(int i=0;i<args.length;i++)
		{
			new FileCount(args[i]);
		}
	}
}