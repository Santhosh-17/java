/*1.Creating an arraylist using add(element)
2.Adding elements to arraylist using add(n,element)
3.Search element in Arraylist using indexOf(element) ,using iterator and using equals(element)
4.Display the elements starts with given letter using startswith(character),using charAt(index)
And also Displaying the elements starts with same Character in the ArrayList using CharAt(index)
*/
import java.util.ArrayList;
import java.util.Scanner;

class  List{
	ArrayList<String> al = new ArrayList<String>();
	Scanner scan = new Scanner(System.in);
	public void append() {
		
		int n;
		String values;
		System.out.println("Enter the no. of Elements:");
		n = scan.nextInt();
		for(int i =0 ; i<n; i++) {
			System.out.println("Enter The String");
			values = scan.next();
			al.add(values);
		}
		
		System.out.println("The strings are..");
		System.out.println(al);

	}
	
	public void insert() {
		int p;
		String str;
		System.out.println("To insert at Particular position enter position:");
		p = scan.nextInt();
		System.out.println("Enter The String");
		str = scan.next();
		al.add(p-1,str);
		
		System.out.println("The strings are..");
		System.out.println(al);

	}
	
	public  void search() {
		String search;/*
		METHOD 1-------
		//Iterator<String> it = al.iterator();
		System.out.println("Enter the Element to search!!");
		search = scan.next();
		while(it.hasNext())
		{
			String element = it.next();
			System.out.println("Element is :"+element+" - "+"Search is:"+search);
			if(search.equals(element) ) {
				System.out.println("Found!!");
			}
			
		}
		
		METHOD 2-------
		byte count = 1;
		for(String list : al) {
			if(search.equals(list) ) {
				System.out.println("Found at the position "+count);
			}
			count++;
		}*/
		
		//METHOD 3-------
		System.out.println("Enter the String to search:");
		search = scan.next();
		int pos;
		pos = al.indexOf(search);
		System.out.println(search+" is found at the position "+(pos+1));
		
	}
	
	public void search2() 
	{
		//METHOD  1--------
		//List all String Starts with same character
		/*char i,j;String str1,str2;
		
		for(int a=0;a<al.size()-1;a++) {
			str1 = al.get(a);
			i = str1.charAt(0);
			for(int b=a+1; b<al.size(); b++) {
			
			str2 = al.get(b);
			j = str2.charAt(0);
			if(i==j) {
				System.out.println("string starts with same char :"+str1+ " -- "+str2);
			}
		}
		}*/
		
		
		/*
		
		METHOD 2--------
		char a;
		String str1;
		boolean check = false;
		System.out.println("Enter the Letter :");
		char x = scan.next().charAt(0);
		System.out.println("String Starting with Given Letter:");
		for(int i=0;i<al.size();i++) {
			str1 = al.get(i);
			a = str1.charAt(0);
		
			if(x == a) {
				System.out.println(str1);
				check = true;
			}			
		}
		if(check == false){
			System.out.println(" Oops! Sorry "+ x +" is not found in the ArrayList");
		}*/
		
		//METHOD 3--------
		String str1;
		boolean check = false;
		System.out.println("Enter the character :");
		String c = scan.next();
		System.out.println("Strings Starts with Same character:");
		for(int i=0;i<al.size();i++) {
			str1 = al.get(i);
			if(str1.startsWith(c)) {
				check = true;
				System.out.println(str1);
			}
		}
		if(!check)
		{
			System.out.println(" Oops! Sorry "+ c +" is not found in the ArrayList");
		}		
	}
}
public class ListArray {

	public static void main(String[] args) {
		
		List obj = new List();
		Scanner scan = new Scanner(System.in);
		byte ch;
		while(true) {
			System.out.println("\n\t\tOperations of ArrayList\n1.Append the String\n2.Insert at particular position\n3.Search For a element\n4.List all string starts with given letter\n5.Exit\nEnter your option:");
			ch = scan.nextByte();
			switch(ch)
			{
			case 1 :obj.append();break;
			case 2 :obj.insert();break;
			case 3 :obj.search();break;
			case 4 :obj.search2();break;
			case 5 :System.exit(0);break;
			default :System.out.println("Invalid!");
			}
		}	
	}
}
