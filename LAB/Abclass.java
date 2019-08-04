import  java.util.Scanner;

abstract class Shape{
	double a;
	double b;
	abstract void area();
}

class Rectangle extends Shape{
	Rectangle(double l,double b)
	{
		a = l;
		this.b = b;
	}
	
	void area() {
		double Result = a*b;
	    System.out.println("The Area of Rectangle is : "+Result);
	}
}

class Triangle extends Shape{
	Triangle(double h,double b)
	{
		a = h;
		this.b = b;
	}
	
	void area() {
		double Result =  (a * b)/2;
	    System.out.println("The Area of Triangle is "+Result);
	}
}

class Circle extends Shape{
	Circle(double r)
	{
		a = r;
	}
	
	void area() {
		double Result = (int)22/7 * a*a;
	    System.out.println("The Area of circle is "+Result);
	}
}
public class Abclass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Shape s;
		
		while(true) {
		System.out.println("\n\t\tMenu\n1.Rectangle\n2.Triangle\n3.Circle\n4.Exit\nEnter your option:");
		int ch;
		ch = scan.nextInt();
		
		switch(ch)
		{
		case 1: double l,b;
			    System.out.println("Enter length and breadth:");
		        l= scan.nextInt();
		        b = scan.nextInt();
		        s  = new Rectangle(l,b);
		        s.area();
		        break;
		case 2 :double h,ba;
	            System.out.println("Enter Height and base :");
                h = scan.nextInt();
                ba = scan.nextInt();
                s  = new Triangle(h,ba);
                s.area();
                break;
		case 3 :double r;
		        System.out.println("Enter Radius :");
		        r = scan.nextInt();
		        s  = new Circle(r);
		        s.area();
		        break;
		case 4 :System.exit(0);break;
		default : System.out.println("Invalid Number!!");break;		
		}
		}
		
		
	}

}
