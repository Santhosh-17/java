import java.awt.*;
import java.awt.event.*;
import javax.script.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class MiniCalculator extends JFrame implements ActionListener 
{
	String T ="";
	String Ans;
	int ch =0;
	int val = 0;
	int count = 0;
	JTextField t;
	JPanel p1;
	JPanel p2;
	boolean check = false;
	Container c;
	MiniCalculator()
	{
		super("MiniCalculator");
		
                c = getContentPane();
		
		Dimension d = new Dimension(300,50);
		Dimension d1 = new Dimension(70,35);
		Dimension d4 = new Dimension(300,400);

		t = new JTextField();
		t.setEditable(false);
		t.setHorizontalAlignment(JTextField.RIGHT);
		p1 = new JPanel();
		p2 = new JPanel();
		p1.setLayout(new BorderLayout());
		p2.setLayout(new FlowLayout());
		p1.setBackground(Color.white);
		p2.setBackground(Color.DARK_GRAY);
		t.setPreferredSize(d);
		p1.setPreferredSize(d);
		p2.setPreferredSize(d4);
		
		p1.add(t,BorderLayout.NORTH); 
		c.add(p1,BorderLayout.NORTH);
		c.add(p2,BorderLayout.CENTER);

		c.setLayout(new FlowLayout());
		c.setBackground(Color.DARK_GRAY);

	    String[] str = {"cos","sin","tan","ln","π","√","(",")","00","C","<-","/","7","8","9","*","4","5","6","-","1","2","3","+","+-","0",".","="};			
	    JButton b[] = new JButton[str.length];
		for(int i =0;i<str.length;i++)
		{
			b[i] = new JButton(str[i]);
			b[i].setFont(new Font("monospaced", Font.BOLD,16));
			b[i].setPreferredSize(d1);
			b[i].setBackground(Color.WHITE);
			p2.add(b[i]);
		}	
		for(int i=0;i<str.length;i++)
		{
			b[i].addActionListener(this);
		}
		
		setResizable(false);
		setVisible(true);
		setSize(325,385);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	 
	public void convert(String foo) throws ScriptException
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    Ans = engine.eval(foo) +"";
	}

	public void actionPerformed(ActionEvent ae)
	{
		String str1 =ae.getActionCommand(); 
		if(str1.equals("."))
		{
			if(T.equals("") && str1.equals("."))
			{
				String j = t.getText();
				j = j + str1;
				t.setText(j);
			}
			else
			{
				T = T + str1;
				t.setText(T);
			}
		}
		else if(str1.equals("π"))
		{
			String temp = T;
			check = true;
			temp = temp +"π";
			T = T + "Math.PI";
			t.setText(temp);
		}
		else if(str1.equals("cos") || str1.equals("sin") || str1.equals("tan") || str1.equals("ln"))
		{
			String temp = T;
			check = true;
			temp = temp +str1+ "(";
			if(str1.equals("cos"))
			{
				T = T + "Math.cos(";
			}
			if(str1.equals("sin"))
			{
				T = T + "Math.sin(";
			}
			if(str1.equals("tan"))
			{
				T = T + "Math.tan(";
			}
			if(str1.equals("ln"))
			{
				T = T + "Math.log(";
			}
			t.setText(temp);	
		}
		else if(str1.equals("√") )
		{
			String temp = T;
			check = true;
			temp = temp +"√(";
			T = T + "Math.sqrt(";
			t.setText(temp);
		}
		
		else if(  str1.equals("(") || str1.equals(")") || str1.equals("%") || str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") ||str1.equals("0") || str1.equals("+") || str1.equals("-") || str1.equals("*") || str1.equals("/")  )
		{
			
			if(T.equals("") && str1.equals("0"))
			{
				T = "";
				t.setText("0");
			}
			else
			{
				if(str1.equals(")"))
				{
					check = false;
				}
				if(check)
				{
					String temp = t.getText();
					temp = temp + str1;
					T = T + str1;
					t.setText(temp);
					check = true;
				}
				else
				{
					if(str1.equals(")"))
					{
						String temp = t.getText();
						temp = temp + str1;
						T = T + str1;
						t.setText(temp);
					}
					else
					{
						T = T + str1;
						t.setText(T);
					}
				}
			}
			
		}
		else if(str1.equals("C"))
		{
			 T ="";
			 if(T.equals(""))
			 {
				 t.setText("0");
			 }
			 else
			 {
				 t.setText("0");
			 }
		}
		else if(str1.equals("00"))
		{
			 if(T.equals(""))
			 {
				 t.setText("0");
			 }
			 else
			 {
				 T = T + str1;
			   	 t.setText(T);
			 }
		}
		else if(str1.equals("<-"))
		{
			String str2 = t.getText();
			if(T.equals("") && str2.equals(""))
			{
				T ="";
				t.setText(T);
			}
			else if(str2.equals(T))
			{
				T = T.substring(0,T.length()-1);
				t.setText(T);
			}
			else
			{
				String temp = t.getText();
				temp = temp .substring(0,temp.length()-1);
				T = T.substring(0,T.length()-1);
				t.setText(temp);
			}
		}
		else if(str1.equals("+-"))
		{
			Double val = Double.parseDouble(t.getText());
			val = val * -1;
			T = val+"";
			t.setText(T);
		}
		else if(T.equals("") && str1.equals("=") )
		{
			t.setText(Ans);
		}
		else if(str1.equals("="))
		{
		
			try {
				convert(T);
			} catch (ScriptException e1) {
				e1.printStackTrace();
			}
			
			T = Ans;
			t.setText(Ans);
		}
		Ans = "0";
	}
	public static void main(String[] args)
	{
		new MiniCalculator();
	}
}
