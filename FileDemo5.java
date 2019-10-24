import java.io.*;
public class FileDemo5
{
	public static void main(String[] args) throws IOException
	{
		String str;
		int i = 0, l =1 ,w =1,c =1;
		System.out.println("Enter the File Name :");
		str = System.console().readLine();
		FileInputStream fis = new FileInputStream(str);
		while((i = fis.read()) != -1 )
		{
			c++;
			if(i == 32 )
			{
				w = w+1;
			}
			else if(i == 10)
			{
				l++;
			}
		}
		System.out.println("No.of Characters in the "+str+" file : "+c);
		System.out.println("No.of Words in the "+str+" file : "+w);
		System.out.println("No.of Lines in the "+str+" file : "+l);
	}
}
