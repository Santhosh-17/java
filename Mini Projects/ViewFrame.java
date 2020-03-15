package mp;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
@SuppressWarnings("serial")
public class ViewFrame extends JFrame{
	JButton b1,b2;
	JLabel l1,l2,l3,l4,l5,l6;
	ViewFrame()
	{
		super("My Contacts");
	}
	public void Vcon() throws Exception
	{
		setLayout(null);
        l3 = new JLabel("-");
        add(l3);
        l3.setBounds(20, 90, 120, 40);
        l4 = new JLabel("-"); 
        add(l4);
        l4.setBounds(150, 90, 200, 40);
        l5 = new JLabel("Contact Name");
        add(l5);
        l5.setBounds(20, 30, 120, 40);
        l6 = new JLabel("Contact Number");
        add(l6);
        l6.setBounds(150, 30, 200, 40);
        b1 = new JButton("NEXT >>");    
        add(b1);
        b1.setBounds(170, 190, 100, 40);
        b2 = new JButton("<< PREVIOUS");
        add(b2);
        b2.setBounds(30, 190, 120, 40);
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","System","Santhosh2001");
		Statement st = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		ResultSet rs = st.executeQuery("select * from PhoneBook");
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	try {
        		rs.next();
        		l3.setText("" + rs.getString(1));
        		l4.setText(""+rs.getString(2));	
            	}catch(Exception e) {}
            	
        	}});
        b2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
            	try {
                	
            		rs.previous();
            		l3.setText("" + rs.getString(1));
            		l4.setText(""+rs.getString(2));
            		
                	}catch(Exception e) {}
                }});
        setSize(333,320);
        setVisible(true);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);		
	}
	public static void main(String[] args) throws Exception
	{
		ViewFrame v = new ViewFrame();
		v.Vcon();
	}
}