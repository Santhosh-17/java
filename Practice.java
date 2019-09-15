import java.util.Scanner;
class A {
	void mul(float a,float b) {
		System.out.println("RECATANGLE IS :"+a*b);
	}
	void mul(double a ,double b)
	{
		System.out.println("TRIANGLE IS :"+ 0.5*a*b);
	}
}

public class Practice {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		A obj = new A();
		float x,y;
		double x1,y1;
		System.out.println("Enter values for Rectangle :");
		x = scan.nextFloat();
		y = scan.nextFloat();
		System.out.println("Enter values for Triangle:");
		x1 = scan.nextDouble();
		y1 = scan.nextDouble();
		obj.mul(x,y);
		obj.mul(x1, y1);
		scan.close();
	}

}
