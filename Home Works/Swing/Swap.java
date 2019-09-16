import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Swap  {
	
	Swap()
	{
		JFrame f = new JFrame("Swap");
		
		JLabel l1 = new JLabel("First");
		JLabel l2 = new JLabel("Second");
		
		
		JTextField t1 = new JTextField(5);
		JTextField t2 = new JTextField(5);
		Button b = new Button("Swap");
		
		f.add(l1);
		f.add(t1);
		f.add(l2);
		f.add(t2);
		f.add(b);
		
		f.setLayout(new FlowLayout());
		
		b.addActionListener(new ActionListener()
				{
		     	public void actionPerformed(ActionEvent ae)
			    {
		     		String temp = t1.getText();
		     		
		     		t1.setText(t2.getText());
		     		t2.setText(temp);
			    }
				}
				);
		
		
		
		
		f.setSize(300, 150);
		f.setVisible(true);			
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}
	
	public static void main(String[] args) {
		
		SwingUtilities.invokeLater(new Runnable()
				{
			     public void run()
			     {
			    	 new Swap();
			     }
				}				
				);
				
	}
}
