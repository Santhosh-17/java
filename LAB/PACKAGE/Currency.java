package currencypack;
import java.util.Scanner;
public class Currency
{
    Scanner scan = new Scanner(System.in);
    public double dol,inr,yen,euro;
	public void dol_inr()
	{
		System.out.println("Enter the dollar :");
		dol = scan.nextDouble();
		inr = 68.92*dol;
		System.out.println(inr+"Rupees");
	}
	public void euro_inr()
	{
		System.out.println("Enter the Euro :");
		euro = scan.nextDouble();
		inr = 77.42*euro;
		System.out.println(inr+"Rupees");
	}
	public void yen_inr()
	{
		System.out.println("Enter the yen :");
		yen = scan.nextDouble();
		inr = 0.64*yen;
		System.out.println(inr+"Rupees");
	}
	public void inr_dol()
	{
		System.out.println("Enter the Rupees:");
		inr = scan.nextDouble();
		dol = inr/68.92;
		System.out.println(dol+"Dollars");
	}
	public void inr_euro()
	{
		System.out.println("Enter the Rupees:");
		inr = scan.nextDouble();
		euro = inr/77.42;
		System.out.println(euro+"euro");
	}
	public void inr_yen()
	{
		System.out.println("Enter the Rupees:");
		inr = scan.nextDouble();
		yen = inr/0.64;
		System.out.println(yen+"yen");
	}
}
