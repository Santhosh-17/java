import java.awt.*;
import javax.swing.*;
public class SwingDemo2 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Demo2");
		JLabel l = new JLabel("Hello World");
		
		f.setLayout(new FlowLayout() );
		f.setSize(300,300);
		f.setVisible(true);
		f.add(l);
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}

/*
import java.awt.*;
import javax.swing.*;
public class SwingDemo2 {
	public static void main(String[] args) {
		 new A();	
	}
}
@SuppressWarnings("serial")
class A extends JFrame
{
	A()
	{
		super("Demo2");
		JLabel l = new JLabel("Hello World");
		setLayout(new FlowLayout() );
		setVisible(true); //Methods in JFrame
		setSize(400,400); //Methods in JFrame
		add(l);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
*/
