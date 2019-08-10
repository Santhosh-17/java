/* Stack Implementation using array without using 
the concept of exception handling 
(try ...catch)*/

import java.util.Scanner;
import static java.lang.System.out;
interface ADT{
    int m = 10;
	void push();
	void pop();
    
}
class Stck implements ADT
{
Scanner scan = new Scanner (System.in);
int top = 0,n;
int stack[] = new int[m];
public void create()
{
	out.println("Enter No.of Elements in Stack:");
	n = scan.nextInt();
	top = n-1;
	if(n<=m){
	out.println("Enter the Elements :");
	for(int i=0; i<n;i++)
	{
		stack[i] = scan.nextInt();
	}
	
	}
	else{
		out.println("Out of Limit!!");
	}
	
}

public void push(){
	if(top<m-1)
	{
		out.println("Enter the Element :");
		stack[++top] = scan.nextInt();
	}
	else{
		out.println("Stack Overflow");
	}
}
public void pop(){
	if(top>=0){
	    out.println("Popped element is :"+stack[top]);
		top = top-1;
	}
	else
	{
		out.println("stack underflow");
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
			case 1 :s.create();break;
			case 2 :s.push();break;
			case 3 :s.pop();break;
			case 4 :s.display();break;
			case 5 :System.exit(0);break;
			default :out.println("Invalid!!");break;
		}
		}
		
		
	}
}
