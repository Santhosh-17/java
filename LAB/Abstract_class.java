import  java.util.Scanner;

abstract class Shape{
	int a;
	int b;
	abstract void Area();
}

class Rectangle extends Shape{	
	Scanner scan = new Scanner(System.in);
	void Area()
	{
		System.out.println("Enter Length and Breadth:");
		a = scan.nextInt();
		b = scan.nextInt();
		double Result = a*b;
		System.out.println("The Area of Rectangle is :"+Result);
	}
}

class Triangle extends Shape{
	Scanner scan = new Scanner(System.in);
	void Area()
	{
		System.out.println("Enter Base and height:");
		a = scan.nextInt();
		b = scan.nextInt();
		double Result = (a*b)/2;
		System.out.println("The Area of Triangle is :"+Result);
	}
}

class Circle extends Shape{
	Scanner scan = new Scanner(System.in);
	void Area()
	{
		System.out.println("Enter Radius :");
		a = scan.nextInt();
		double Result = 3.14*a*a;
		System.out.println("The Area of Rectangle is :"+Result);
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
		case 1: s  = new Rectangle();
		        s.Area();
		        break;
		case 2 :s  = new Triangle();
                        s.Area();
                        break;
		case 3 :s  = new Circle();
		        s.Area();
		        break;
		case 4 :System.exit(0);break;
		default : System.out.println("Invalid Number!!");break;		
		}
		}
		
		
	}

}
