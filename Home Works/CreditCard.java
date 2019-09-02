import java.util.Scanner;
interface CreditCardInterface
{
	Scanner scan = new Scanner(System.in);
	void viewCreditAmount();
	void viewPin();
	void changePin();
	void payBalance();	
}
class Customer implements CreditCardInterface
{
	String name,cardno;
	int pin,creditamount;
	Customer()
	{
		System.out.println("Enter the Name:");
		name = scan.next();
		System.out.println("Enter the Card No. :");
		cardno = scan.next();
		System.out.println("Enter the PIN:");
		pin = scan.nextInt();
		creditamount = 0;
	}
	public void viewPin()
	{
		System.out.println("PIN Number of "+name+" :"+pin);
	}
	public void changePin()
	{
		int n;
		System.out.println("Enter your New PIN:");
		n = scan.nextInt();
		pin = n;
	}
	void Credit()
	{
		int c;
		System.out.println("Enter the Amount to Credit:");
		c = scan.nextInt();
		creditamount += c;	
		System.out.println("Successfully Credited!");
	}
	public void payBalance()
	{
		int b;
		System.out.println("Enter the Amount to be pay:");
		b = scan.nextInt();
		creditamount -= b;
		System.out.println("Successfully Paid!");
	}
	public void viewCreditAmount()
	{
		System.out.println("Your Credit Amount is :"+creditamount);
	}
	
}
public class CreditCard {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		Customer[] obj = new Customer[10];
		int no,ch,x;
		System.out.println("Enter the Number of Customers:");
		no = scan.nextInt();
		for(int i=0;i<no;i++)
		{
			System.out.println("Details of "+(i+1));
	        obj[i] = new Customer();
   	    }
		while(true)
		{
			System.out.println("\n\t\tMenu\n1.Credit\n2.ViewCreditAmount\n3.Pay the Balance\n4.Change the PIN\n5.View PIN\n6.Exit\nEnter your Option:");
			ch = scan.nextInt();
			switch(ch)
			{
			case 1:int ck=0;
				   System.out.println("Enter the PIN:");
		           x = scan.nextInt();
				   for(int i=0;i<no;i++)
				   {
				       if(obj[i].pin == x)
				       {
				    	   ck = 1;
				    	   obj[i].Credit();
				       }
				   }
				   if(ck == 0)
				   {
					   System.out.println("Invalid  PIN!");
				   }
			       break;
			case 2:int ck1=0;
			       System.out.println("Enter the PIN:");
	               x = scan.nextInt();
	           	   for(int i=0;i<no;i++)
			       {
	           		   if(obj[i].pin == x)
	           		   {
	           			   ck1 = 1;
	           			   obj[i].viewCreditAmount();
	           		   }
			       }
	           	   if(ck1 == 0)
	           	   {
	           		   System.out.println("Invalid  PIN!");
	           	   }
	           	   break;
			case 3:ck1 =0;
			   	  System.out.println("Enter the PIN:");
				  x = scan.nextInt();
			 	  for(int i=0;i<no;i++)
				  {
					  if(obj[i].pin == x)
					  {
						  ck1 = 1;
						  obj[i].payBalance();
					  }
				  }
				  if(ck1 == 0)
				  {
					  System.out.println("Invalid  PIN!");
				  }
				  break;

			case 4:ck1 =0;
				   System.out.println("Enter the PIN:");
				   x = scan.nextInt();
				   for(int i=0;i<no;i++)
				   {
					   if(obj[i].pin == x)
					   {
						   ck1 = 1;
						   obj[i].changePin();
					   }
				   }
				   if(ck1 == 0)
				   {
					   System.out.println("Invalid  PIN!");
				   }
				   break;

			case 5:for(int i=0;i<no;i++)
				   {
	       				obj[i].viewPin();
				   }
					break;
			case 6:System.exit(0);break;
		    default:System.out.println("Invalid!"); 
			}
		}
		

	}

}
