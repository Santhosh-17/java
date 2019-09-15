import java.util.Scanner;
public class Prime {
public static void main(String[] args)
{
int num;
Scanner scan=new Scanner(System.in);
System.out.print("Enter the End range to find list of prime nos:");
num=scan.nextInt();
for(int i=1;i<=num;i++)
{
if(prime(i))
{
System.out.println(i);
}
}
scan.close();
}

static boolean prime(int n)
{
if(n<2)
return false;
else if(n==2)
	return true;
else
for(int i=2;i<n;i++)
{
if(n % i == 0)
{
return false;
}
}
return true;
}
}





