/* Checking Bank Balance ,deposit and withdraw using 
User defined Exception called NoMoneyException
*/
import java.util.Scanner;
class NoMoneyException extends Exception{
	Scanner scan = new Scanner(System.in);
	double bal,depo,wd;
	int accno;
	String name;
	
	public String toString() {
		return "You Cannot be withdraw";
	}
	
	void getdata() {
		System.out.println("Enter Account Holder Name:");
		name = scan.next();
		System.out.println("Enter Account number:");
		accno = scan.nextInt();
	}
	void deposit() {
		System.out.println("Enter amount to deposit:");
		depo = scan.nextDouble();
		bal = bal+depo;
		System.out.println("Successfully Credited!");
	}
	void withdraw()
	{
		
		System.out.println("Enter amount to be withdraw:");
		wd = scan.nextDouble();
		bal = bal-wd;
		try {
			if(bal<=0) {
				bal = bal + wd;
				throw new NoMoneyException();
			}
		System.out.println("Successfully Debited!");
		check();
		}catch(NoMoneyException e) {
			System.out.println(e);
			System.out.println("Your Balance is "+bal);
		}
		
	}
	void check() {
		System.out.println("|---------------------BALANCE CHECK --------------------|");
		System.out.println("Name of the Account Holder :"+name);
		System.out.println("Account Number             :"+accno);
		System.out.println("");
		System.out.println("*********************************************************");
		System.out.println("\nBalance is                 :"+bal);
		System.out.println("\n*********************************************************\n");
		System.out.println("|------------------   THANK YOU   ----------------------|");

	}
	
}
public class MyException {

	public static void main(String[] args) {
		NoMoneyException obj = new NoMoneyException();
		Scanner scan = new Scanner(System.in);
		short ch;
		System.out.println("Enter the details:");
		obj.getdata();
		while(true) {
			System.out.println("\n\t\tMenu\n1.Deposits\n2.Withdraw\n3.Check the account balance\n4.Exit\nEnter your option:");
			ch = scan.nextShort();
			switch(ch)
			{
			case 1:obj.deposit();break;
			case 2:obj.withdraw();break;
			case 3:obj.check();break;
			case 4:System.exit(0);break;
			default:System.out.println("Enter Correct Option!");break;
			}
		}


	}

}
