import currencypack.Currency;
import timepack.Time;
import java.util.Scanner;
public class Convert
{
	public static void main(String args[])
	{
	    Scanner scan = new Scanner(System.in);
		while(true){
	    int ch;
	    
		System.out.println("Main Menu\n1.Currency Convertor\n2.time Convertor\n3.Kilometre convertor\n4.Exit\nEnter ur choice:");
		ch = scan.nextInt();
		if(ch==1){
		Currency obj = new Currency();
		int opt;
		System.out.println("Menu!\n1.Dollar to rupees\n2.Euro to Rupees\n3.Yen to rupees\n4.Rupees to Dollar\n5.Rupees to Euro\n6.Rupees to Yen\nEnter your option:");
		opt = scan.nextInt();
		switch(opt)
		{
			case 1 :obj.dol_inr();break;
			case 2 :obj.euro_inr();break;
			case 3 :obj.yen_inr();break;
			case 4 :obj.inr_dol();break;
			case 5 :obj.inr_euro();break;
			case 6 :obj.inr_yen();break;
			default : System.out.println("Invalid number!!");break;
		}
		}
		else if(ch == 2)
		{
	    Time obj1 = new Time();
		int opt;
		System.out.println("Menu!\n1.Hours to seconds\n2.Hours to Minutes \n3.Minutes to hours \n4.Minutes to Seconds\n5.Seconds to hours\n6.Seconds to minutes\nEnter your option:");
		opt = scan.nextInt();
		switch(opt)
		{
			case 1 :obj1.hr_sec();break;
			case 2 :obj1.hr_min();break;
			case 3 :obj1.min_hr();break;
			case 4 :obj1.min_sec();break;
			case 5 :obj1.sec_hr();break;
			case 6 :obj1.sec_min();break;
			default : System.out.println("Invalid number!!");break;
		}
		}
		else if(ch==4)
		{
			System.exit(0);
		}
	}
	}
}