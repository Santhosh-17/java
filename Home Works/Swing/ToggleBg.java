import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class ToggleBg{
	public static int c =0 ;
	public static void main(String[] args) {
		JFrame f = new JFrame("Colour Changer");
		JPanel t = new JPanel();
		JButton b = new JButton("Click Me");
		f.setSize(300,300);
		f.setVisible(true);
		t.setLayout(null);
		f.add(t,BorderLayout.CENTER);
		t.setBackground(Color.GREEN);
		t.add(b);
		b.setBounds(95,50,85,30);
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent ae) {
				if(c==0)
				{
					t.setBackground(Color.YELLOW);
					c++;
				}
				else if(c == 1)
				{
					t.setBackground(Color.GREEN);
					c=0;
				}
			}		
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
