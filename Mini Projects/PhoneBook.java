package mp;
import javax.swing.*;
import java.awt.event.*;
import mp.Connect1;
import mp.ViewFrame;
@SuppressWarnings("serial")
public class PhoneBook extends JFrame {
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t2;
	JButton b1,b2,b3;
	Connect1 c ;
	ViewFrame vf;
	PhoneBook()
	{
		super("Phone Book");
		ImageIcon image = new ImageIcon("E:/just.png");
        l1 = new JLabel(image);
        add(l1);
        l1.setBounds(0, 0, 80, 60);
        l2 = new JLabel("Phone Book");
        add(l2);
        l2.setBounds(90, 0, 390, 60);
        l3 = new JLabel("Contact Name");
        add(l3);
        l3.setBounds(20, 80, 100, 50);
        l4 = new JLabel("Contact Number");
        add(l4);
        l4.setBounds(20, 140, 100, 50);
        t1 = new JTextField();
        add(t1);
        t1.setBounds(130, 80, 210, 40);
        t2 = new JTextField();
        add(t2);
        t2.setBounds(130, 150, 210, 40);
        ImageIcon image1 = new ImageIcon("E:/ct.png");
        l5 = new JLabel(image1);
        add(l5);
        l5.setBounds(370, 80, 100, 100);
        b1 = new JButton("CANCEL");
        add(b1);
        b1.setBounds(240, 230, 110, 40);
        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1.setText(" ");
                t2.setText(" ");
        }});
        c  = new Connect1();
        b2 = new JButton("ADD TO CONTACTS");
        add(b2);
        b2.setBounds(80, 230, 145, 40);
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	String s1 = t1.getText();
            	String s2 = t2.getText();
            	if(s1.equals("") & s2.equals("") )
            	{
            		JOptionPane.showMessageDialog(null,"Please Enter the Name and Number!");
            	}
            	else
            	{
            		try { c.connect(s1,s2); }catch(Exception e) {};
            		JOptionPane.showMessageDialog(null,"Contact added Successfully!");
                    t1.setText("");
                    t2.setText("");
            	}
                
         }});
        
        b3 = new JButton("View Contacts");
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	vf = new ViewFrame();
        		try {
					vf.Vcon();
				} catch (Exception e) {
					
					e.printStackTrace();
				}
            }
        });
        add(b3);
        b3.setBounds(160, 300, 120, 40);
        
        t1.addKeyListener(new KeyAdapter() {
        	public void keyReleased(KeyEvent e)
            {
            	int key = e.getKeyCode();
            	if(e.getSource()==t1)
            	{
            		if (key == KeyEvent.VK_ENTER)
            		{
            			t2.requestFocus();
            		}
            	}
            }
        });
        
        	
        
        setLayout(null);
        setSize(481,380);
        setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);   
    }
	public static void main(String[] args) {
		new PhoneBook();
	}
}
