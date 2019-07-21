package timepack;
import java.util.Scanner;
public class Time
{
        Scanner scan = new Scanner(System.in);
	public int hr,sec,min;
	public void hr_sec()
	{
        System.out.println();
	System.out.println("Enter Hours");
	hr = scan.nextInt();
	sec = hr * 3600;
	System.out.println(hr+"Hours ="+sec+" Seconds");
        System.out.println();
	}
	public void hr_min()
	{
        System.out.println();
	System.out.println("Enter Hours");
	hr = scan.nextInt();
        min = hr * 60;
	System.out.println(hr+ "Hours =" + min + " Minutes");
        System.out.println();
	}
	public void min_sec()
	{
        System.out.println();
	System.out.println("Enter Minutes");
	min = scan.nextInt();
	sec = min * 60;
	System.out.println(min + "Minutes =" + sec + " Seconds");
        System.out.println();
	}
	public void min_hr()
	{
        System.out.println();
	System.out.println("Enter Minutes");
	min = scan.nextInt();
	hr = min / 60;
	System.out.println(min+ "Minutes =" + hr + " Hours");
        System.out.println();
	}
	public void sec_min()
	{
        System.out.println();
	System.out.println("Enter Seconds");
	sec = scan.nextInt();
        min = sec / 60;
	System.out.println(sec+ "Seconds =" + min + " Minutes");
        System.out.println();
	}
	public void sec_hr()
	{
        System.out.println();
	System.out.println("Enter Seconds");
	sec = scan.nextInt();
        hr = sec / 3600;
	System.out.println(sec+ "Seconds =" + hr + "Hours");
        System.out.println();
	}
}
