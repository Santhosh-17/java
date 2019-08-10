import java.util.Scanner;
import static java.lang.System.out;
interface ADT{
    int m = 5;
	void push();
	void pop();
    
}
class Stck implements ADT
{
Scanner scan = new Scanner (System.in);
int top = -1;

int stack[] = new int[m];
public void create() {
	Scanner scan = new Scanner(System.in);
	int n;
	System.out.println("Enter the No.of Elements:");
	n = scan.nextInt();
	if(n<=m) {
		System.out.println("Enter the elements:");
		for(int i =0 ;i<n;i++) {
			stack[i]=scan.nextInt();
		}
		top = n-1;
	}
}

public void push(){
	try {
		out.println("Enter the Element :");
		stack[++top] = scan.nextInt();
		}catch(ArrayIndexOutOfBoundsException e) {
			out.println("Stack Overflow!");	
			--top;
		}
		
	
}
public void pop(){
	try {
	    out.println("Popped element is :"+stack[top]);
		--top;
	}catch(ArrayIndexOutOfBoundsException e) {
		out.println("Stack Underflow!");
	}
}

public void display()
{
out.println("Elements in the stack:");
	for(int i = top;i>=0;i--)
	{
		out.println(stack[i]);
	}
}
 
	
}
public class StackADT
{
	public static void main(String []args){
	
		Stck s = new Stck();
		Scanner scan = new Scanner (System.in);
		int ch;
		while(true){
		out.println("\n\t\tMenu\n1.Create\n2.Push\n3.Pop\n4.Display\n5.Exit\nEnter your choice:");
		ch = scan.nextInt();
		
		switch(ch){
			case 1 :s.create();
			        break;
			case 2 :s.push();break;
			case 3 :s.pop();break;
			case 4 :s.display();break;
			case 5 :System.exit(0);break;
			default :out.println("Invalid!!");break;
		}
		}
		
			
		
		
		
	}
}