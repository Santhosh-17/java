import java.util.*;
public class String_Tester {

	public static void main(String[] args) {
		
		int sum = 0;
		int c = 0;
		StringTokenizer st = new StringTokenizer("10 10 20 30");
		
	    while(st.hasMoreTokens())
	    {
	    	c = st.countTokens();
	    	sum += Integer.parseInt(st.nextToken(" "));
	    }
	    System.out.println("Sum be:"+sum);
	    
	    
	    System.out.println("Count ="+ c);

	}

}
