import java.util.Scanner; // importing Scanner Class

 public class Circle extends Point{
	 	  
     public static void main(String[] args) {
     @SuppressWarnings("resource")
	 Scanner sc = new Scanner(System.in); //Creating Object for Scanner Class
	 Point c=new Point(); //Create a point center
	 System.out.println("Enter the x & y value:");
	 c.x=sc.nextDouble();
	 c.y=sc.nextDouble();
	 Point p=new Point();  //Create a point on circumference
	 System.out.println("Enter the x & y value:");
	 p.x=sc.nextDouble();
	 p.y=sc.nextDouble(); 
	 Circle c1=new Circle(); //Create an object of class Circle
	 c1.distance(c,p);  //Calculate radius of the circle
	
  }
 
}
class  Point 
{
	double x,y;
	double  d;
	void distance(Point p1,Point p2)
	{
		d = (Math.sqrt((p2.x-p1.x)*(p2.x-p1.x) + (p2.y-p1.y)*(p2.y-p1.y)));
		System.out.println("The Distance between Centre and given point is :");
		System.out.print(d);
	}
}
