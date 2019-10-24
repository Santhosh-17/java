import java.io.*;
public class FileDemo2
{
	public static void main(String[] args) throws IOException
	{
			String str;
			int i = 0;
			System.out.println("enter the File Name to read:");
			str = System.console().readLine();
			FileInputStream fin = new FileInputStream(str);     
            while((i=fin.read())!=-1){    
             System.out.print((char)i);    
            }    
			System.out.println("\nSucessfully Readed!");
            fin.close(); 
	}
}