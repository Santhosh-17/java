import java.util.Scanner;
abstract class Car
{
	Scanner scan = new Scanner(System.in);
    String regno,model,date;
	Car()
	{
		System.out.println("Enter the Vehicle Register number:");
		regno = scan.next();
		System.out.println("Enter the model name :");
		model = scan.next();
		System.out.println("Enter the Register date:(dd/mm/yy)");
		date = scan.next();
	}
}
class transportVehicles extends Car
{
	int Validity;
	String Sdate,period;
	transportVehicles()
	{
		super();
		System.out.println("Enter the Validity no.");
		Validity = scan.nextInt();
		System.out.println("Enter the Start date:(dd/mm/yy)");
		Sdate = scan.next();
		System.out.println("Enter the period (in Years):");
		period = scan.next();
	}
	void display()
	{
		System.out.println("**********Details**************");
		System.out.println("Vehicle Register Number: "+regno);
		System.out.println("Vehicle Model Name     : "+model);
		System.out.println("Vehicle Register Date  : "+date);
		System.out.println("Validity No.           : "+Validity);
		System.out.println("Start Date  		   : "+Sdate);
		System.out.println("Period     		       : "+period);
		System.out.println("*******************************\n");
	}
	
}
class privateVehicle extends Car
{
	String name,address;
	privateVehicle()
	{
		super();
		System.out.println("Enter The Owner Name:");
		name= scan.next();
		System.out.println("Enter the Owner address:");
		scan.nextLine();
		address = scan.nextLine();
	}
	void display()
	{
		System.out.println("**********Details**************");
		System.out.println("Owner Name             : "+name);
		System.out.println("Owner Address          : "+address);
		System.out.println("Vehicle Register Number: "+regno);
		System.out.println("Vehicle Model Name     : "+model);
		System.out.println("Vehicle Register Date  : "+date);
		System.out.println("*******************************\n");
	}
}
public class Vehicle {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		transportVehicles[] tv = new transportVehicles[10];
		privateVehicle[] pv = new privateVehicle[10];	
		int n=0,ch,o=0;
		while(true)
		{
			System.out.println("\n\t\tMenu\n1.Register\n2.Display\n3.Exit\nEnter your Option:");
			ch = scan.nextInt();
			switch(ch)
			{
			case 1: 
				    System.out.println("1.Transport\n2.Private\nEnter your choice:");
				    o = scan.nextInt();
				    System.out.println("Enter the Number of Costumers:");
				    n = scan.nextInt();
				    switch(o)
				    {
				    case 1 :for(int i=0;i<n;i++)
						    {
				    		    System.out.println("Enter details of "+(i+1)+" Costumer:");
							    tv[i]=new transportVehicles();
						    }
				    	    break;
				    case 2 :for(int i=0;i<n;i++)
				    		{
				    			System.out.println("Enter details of "+(i+1)+" Costumer:");
				    			pv[i]= new privateVehicle();
				    		}
				    		break;
				    default :System.out.println("Invalid!");
				    }
					break;
			case 2: switch(o)
					{
					case 1 :System.out.println(tv[0].model);
						    for(int i=0;i<n;i++)
							{
								tv[i].display();
							}
							break;
					case 2:for(int i=0;i<n;i++)
						   {
								pv[i].display();	
						   }
						   break;
					default :System.out.println("Invalid!");
					}
			case 3:System.exit(0);break;
			default:System.out.println("Invalid!");
			}
		}
	}

}
