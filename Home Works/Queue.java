import java.util.Scanner;
interface QueueOperations
{
	int MAX = 10;
	Scanner scan = new Scanner(System.in);
	public void insert();
	public void delete();
	public void display();
}
class MyQueue implements QueueOperations {
	int[] a = new int[MAX];
	int front ,rear,n;
	MyQueue()
	{
		front =-1;
		rear = 0;
	}
	public void insert()
	{
		if(front == -1)
		{
			System.out.println("Enter the No. of Elements to be insert:");
			n = scan.nextInt();
			if(n<=MAX)
			{
				front = 0;	
				for(int i=0;i<n;i++)
				{
					System.out.println("Enter the Element "+i+" :");
					a[i]=scan.nextInt();
					rear = i;
				}
				
			}
			else
				System.out.println("Enter value less than "+MAX);
		}
		else
		{
			if(front != 0 && MAX-1>rear)
			{
				rear = rear+1;
				System.out.println("Enter the Element to be inserted:");
				a[rear] = scan.nextInt();
			}
			else
			{
				System.out.println("Queue Overflow!");
			}
		}
	}
	public void delete()
	{
		
		if(front > rear || front == -1)
		{
			System.out.println("Queue underflow!");
		}
		else
		{
			front = front + 1;
		    System.out.println("Sucessfully Deleted!");
		}
	}
	public void display()
	{
		if(front > rear || front == -1)
		{
			System.out.println("Queue is Empty!");
		}
		else
		{
			System.out.println("The values are..");
			for(int i =front;i<=rear;i++)
			{
				System.out.print(a[i]+" ");
			}
		}

	}
}

public class Queue {

	public static void main(String[] args) {
		int ch;
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		MyQueue m = new MyQueue();
		while(true)
		{
			
			System.out.println("\t\tMenu\n**********************************\n1.Insert\n2.Delete\n3.Display\n4.Exit\n**********************************\nEnter Your Option:");
			ch = scan.nextInt();
			switch(ch)
			{
			case 1:m.insert();break;
			case 2:m.delete();break;
			case 3:m.display();break;
			case 4:System.exit(0);break;
			default:System.out.println("Invalid!");
			}
		}
	}

}
