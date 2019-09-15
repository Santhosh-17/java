//import java.util.Calendar;

public class Main {

  public static void main(String[] args) {
	  java.util.Calendar now = java.util.Calendar.getInstance();
    // 
    System.out.println("Current Year is : " + now.get(java.util.Calendar.YEAR));
    // month start from 0 to 11
    System.out.println("Current Month is : " + (now.get(java.util.Calendar.MONTH) + 1));
    System.out.println("Current Date is : " + now.get(java.util.Calendar.DATE));
  }
}

