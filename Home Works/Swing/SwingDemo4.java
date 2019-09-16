import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class SwingDemo4 {

	public static void main(String[] args) {
		JFrame f = new JFrame("Demo4"); //Creating Objects for JFrame
		Button b = new Button("Click Here!");
		JTextField t = new JTextField("CLick the Below Button");
		
		t.setBounds(130,30,135,35);
		f.setLayout(null );
		f.setVisible(true); //Methods in JFrame
		f.setSize(400,400); //Methods in JFrame
		
		b.setBounds(145,90,90,35);
		f.add(b);
		f.add(t);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b.addActionListener(new ActionListener()
		{
	     	public void actionPerformed(ActionEvent ae)
		    {
	     		t.setText("Successfull");
		    }
		}
		);

	}

}

/*
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SwingDemo4{
	public static void main(String[] args) {
		 new A();	
	}
}
@SuppressWarnings("serial")
class A extends JFrame
{
	A()
	{
		super("Demo4");
		Button b = new Button("Click Here!");
		JTextField t = new JTextField("CLick the Below Button");
		
		t.setBounds(130,30,135,35);
		setLayout(null );
		setVisible(true); //Methods in JFrame
		setSize(400,400); //Methods in JFrame
		
		b.setBounds(145,90,90,35);
		add(b);
		add(t);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		b.addActionListener(new ActionListener()
				{
					public void actionPerformed(ActionEvent ae)
					{
						t.setText("Successfull");
					}

				});
	}
}
*/