import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;
public class ChangeColor{
	public static int c =0 ;
	public static void main(String[] args) {
		
		JFrame f = new JFrame("Colour Changer");
		JPanel t = new JPanel();
		JButton b = new JButton("Click Me");

		f.setSize(300,300);
		f.setVisible(true);
		t.setLayout(null);
		f.add(t,BorderLayout.CENTER);
		
		t.add(b);
		b.setBounds(95,50,85,30);
		b.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent ae) {
				if(c==0)
				{
					t.setBackground(Color.BLUE);
					c++;
				}
				else if(c == 1)
				{
					t.setBackground(Color.GREEN);
					c++;
				}
				else if(c == 2)
				{
					t.setBackground(Color.ORANGE);
					c++;
				}
				else if(c == 3)
				{
					t.setBackground(Color.CYAN);
					c++;
				}
				else if(c == 4)
				{
					t.setBackground(Color.RED);
					c++;
				}
				else if(c == 5)
				{
					t.setBackground(Color.PINK);
					c++;
				}
				else if(c == 6)
				{
					t.setBackground(Color.DARK_GRAY);
					c = 0;
				}
			}
			
		});
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

}
