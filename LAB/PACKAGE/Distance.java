package distancepack;
import java.util.Scanner;
public class Distance
{
	public double m,km,miles;
	Scanner scan = new Scanner(System.in);
	public void km_m()
	{
                System.out.println();
		System.out.println("Enter Kilometer:");
		km = scan.nextDouble();
		m = km*1000;
		System.out.println(km + "Kilometer =" + m +"Meter");
                System.out.println();
	}
	public void km_miles()
	{
                System.out.println();
		System.out.println("Enter Kilometer:");
		km = scan.nextDouble();
		miles = km/1.60934;
		System.out.println(km + "Kilometer =" + miles +"Miles");
                System.out.println();
	}
	public void miles_km()
	{
                System.out.println();
		System.out.println("Enter Miles:");
		miles = scan.nextDouble();
		km = miles *1.60934 ;
		System.out.println(miles +"Miles =" + km + "Kilometer");
                System.out.println();
	}
	public void miles_m()
	{
                System.out.println();
		System.out.println("Enter Miles:");
		miles = scan.nextDouble();
		m = miles * 1609.34 ;
		System.out.println(miles +"Miles =" + m +"Meter");
                System.out.println();
	}
	public void m_km()
	{
                System.out.println();
		System.out.println("Enter Meter:");
		m = scan.nextDouble();
		km = m/1000;
		System.out.println(m + "Meter ="+ km + "Kilometer");
                System.out.println();
	}
	public void m_miles()
	{
                System.out.println();
		System.out.println("Enter Meter:");
		m = scan.nextDouble();
		miles = m/1609.34;
		System.out.println(m + "Meter ="+ miles +"Miles");
                System.out.println();
	}
	
}