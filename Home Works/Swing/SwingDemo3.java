import java.awt.*;
import javax.swing.*;
public class SwingDemo3 {
	public static void main(String[] args) {
		JFrame f = new JFrame("Demo3"); //Creating Objects for JFrame
		Button b = new Button("Click Here!");
		
		f.setLayout(null );
		f.setVisible(true); //Methods in JFrame
		f.setSize(400,400); //Methods in JFrame
		
		b.setBounds(150,90,90,35);
		f.add(b);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}

/*
import java.awt.*;
import javax.swing.*;
public class SwingDemo3 {
	public static void main(String[] args) {
		 new A();	
	}
}
@SuppressWarnings("serial")
class A extends JFrame
{
	A()
	{
		super("Demo3");
		Button b = new Button("Click Here!");
		
		setLayout(null );
		setVisible(true); //Methods in JFrame
		setSize(400,400); //Methods in JFrame
		
		b.setBounds(150,90,90,35);
		add(b);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
*/
