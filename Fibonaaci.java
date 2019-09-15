import java.util.Scanner; //This package for reading input
public class Fibonaaci { 
    
    public static void main(String args[]) { 
     @SuppressWarnings("resource")
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter an integer:");
	 int n=sc.nextInt(); //Read an integer
     System.out.println("The sum of Fibonacci Series is:"+fib(n)); //Generate and print the nth Fibonacci                
                                     //number
    } 
 static int fib(int n) {
	 int f1 = 0,f2 =1;
	 int sum = 0;
	 if(n == 2) {
		 sum = 1;
	 }
	 else {
	 for(int i=2;i<n;i++) {
		 sum = f2+ f1;
		 f1 = f2;
		 f2 = sum;	
		 System.out.println(sum);
	 }
	 }
	 return sum ;
 }
}
