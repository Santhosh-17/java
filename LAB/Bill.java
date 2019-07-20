import java.util.Scanner;
public class Bill
{
	public static void main(String args[])
	{
	Scanner scan = new Scanner (System.in);
	Bclass ob = new Bclass();
	int Eb;
	System.out.println("Enter your connection (1.Domestic/2.Commerical):");
	Eb = scan.nextInt();
	switch(Eb)
	{
	case 1:ob.domestic();break;
	case 2:ob.commerical();break;
	default : System.out.println("Invlaid number!");
	}
	ob.display();
	}
}

class Bclass
{
    Scanner scan = new Scanner (System.in);
	public int no;
	public double pre,now,ru,con;
	public String name;
	Bclass()
	{
		System.out.println("Enter Consumer no. and Consumer name:");
		no = scan.nextInt();
		name=scan.next();
		System.out.println("Enter Your Previous month reading and Current month reading:");
		pre = scan.nextDouble();
		now = scan.nextDouble();
	}
	public void domestic()
	{
		ru = now-pre;
		con = ru;
		if(ru<=100)
		{
			ru = 1*ru;
		}
		else if(ru>=101 && ru<=200)
		{
			ru = 2.50*ru;
		}
		else if(ru>=201 && ru<=500)
		{
			ru = 4*ru;
		}
		else if(ru>501)
		{
			ru = 6*ru;
		}
	}
	public void commerical()
	{
		ru = now-pre;
		con = ru;
		if(ru<=100)
		{
			ru = 2*ru;
		}
		else if(ru>=101 && ru<=200)
		{
			ru = 4.50*ru;
		}
		else if(ru>=201 && ru<=500)
		{
			ru = 6*ru;
		}
		else if(ru>501)
		{
			ru = 7*ru;
		}
	}
	public void display()
	{
		System.out.println("|------------ Electricity Bill ------------|");
		System.out.println("\tConsumer no.          :"+ no);
		System.out.println("\tConsumer Name         :"+name);
		System.out.println("\tPrevious Month Reading:"+pre);
		System.out.println("\tCurrent Month Reading :"+now);
		System.out.println("\tConsumption           :"+con);
		System.out.println("\tAmount to be pay      :Rs."+ru);
		System.out.println("|------------------------------------------|");
	}
	
}
