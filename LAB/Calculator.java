import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener 
{
	String T ="";
	String Ans;
	int ch =0;
	int val = 0;
	int count = 0;
	JTextField t;
	JTextField t1;
	JPanel p1;
	JPanel p2;
	JPanel p3; 
	JPanel p4; 
  
	boolean check = false;
	boolean hyp = false;
	Container c;
	Calculator()
	{
		super("Calculator");
		
        c = getContentPane();
		
		Dimension d = new Dimension(300,50);
		Dimension d1 = new Dimension(60,55);
		Dimension d2 = new Dimension(70,35);
		Dimension d4 = new Dimension(300,400);
		
		Dimension de = new Dimension(300,450);
		
		t = new JTextField();
		t.setEditable(false);
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		t1 = new JTextField();
		t1.setEditable(false);
		t1.setHorizontalAlignment(JTextField.RIGHT);
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		
		
		p1.setLayout(new BorderLayout());
		p4.setLayout(new BorderLayout());
		p2.setLayout(new FlowLayout());
		p3.setLayout(new FlowLayout());
		
		p1.setBackground(Color.white);
		p4.setBackground(Color.white);
		p2.setBackground(Color.DARK_GRAY);
		p3.setBackground(Color.DARK_GRAY);
		
		t.setPreferredSize(d);
		t1.setPreferredSize(d);
		p1.setPreferredSize(d);
		p4.setPreferredSize(d);
		p2.setPreferredSize(d4);
		p3.setPreferredSize(d4);
		
		
		
		p1.add(t,BorderLayout.NORTH);
		p4.add(t1,BorderLayout.NORTH);
		
		 
		JPanel last =new JPanel();
		JPanel last1 =new JPanel();
		
		last.setLayout(new BorderLayout());
		last1.setLayout(new BorderLayout());
		
	    JTabbedPane tp=new JTabbedPane();
	    setLayout(null);
	    tp.setBounds(10, 2, 250, 400);
	    tp.setSize(de);
	    
		

		last.add(p1,BorderLayout.NORTH);
		last.add(p2,BorderLayout.CENTER);
		
		last1.add(p4,BorderLayout.NORTH);
		last1.add(p3,BorderLayout.CENTER);
		
		tp.add(last,"Standard");
		tp.add(last1,"Scientific");
		

		
		c.setLayout(new FlowLayout());
		c.setBackground(Color.DARK_GRAY);

		c.add(tp);
		
	
	    String[] str = {"00","C","<-","/","7","8","9","*","4","5","6","-","1","2","3","+","+-","0",".","="};			
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
		
		
		 String[] x = {"cosh","sinh","tanh","log","cos","sin","tan","ln","π","√","(",")","00","C","<-","/","7","8","9","*","4","5","6","-","1","2","3","+","%","0",".","="};			
		 JButton a[] = new JButton[x.length];
		 for(int i =0;i<x.length;i++)
	     {
			a[i] = new JButton(x[i]);
			a[i].setFont(new Font("monospaced", Font.BOLD,14));
			a[i].setPreferredSize(d2);
			a[i].setBackground(Color.WHITE);
			p3.add(a[i]);
		}	
		for(int i=0;i<x.length;i++)
		{
			a[i].addActionListener(this);
		}
		
		setResizable(false);
		setVisible(true);
		setSize(325,530);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	public void tri(int x1)
	{
		Double z;
		if(ch == 1)
		{
			z = Math.cosh(x1);
			T = T +z;
		}
		else if(ch == 2)
		{
			z = Math.sinh(x1);
			T = T +z;
		}
		else if(ch == 3)
		{
			z = Math.tanh(x1);
			T = T +z;
		}
		else if(ch == 4)
		{
			z = Math.log10(x1);
			T = T + z;
		}
		t.setText(T);
		t1.setText(T);
	}
	 
	public void convert(String foo) throws ScriptException
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	  //  System.out.println(engine.eval(foo));
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
				t1.setText(j);
			}
			else
			{
				T = T + str1;
				t.setText(T);
				t1.setText(T);
			}
		}
		else if(str1.equals("π"))
		{
			String temp = T;
			check = true;
			temp = temp +"π";
			T = T + "Math.PI";
			t.setText(temp);
			t1.setText(temp);
		//	System.out.println(T);
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
			t1.setText(temp);
		//	System.out.println(T);
		}
		else if(str1.equals("cosh") || str1.equals("sinh") || str1.equals("tanh") || str1.equals("log"))
		{
			String s ="";
			if(str1.equals("cosh"))
			{
				s = s + "cosh(";
				ch = 1;
				hyp = true;
			}
			if(str1.equals("sinh"))
			{
				s = s + "sinh(";
				ch = 2;
				hyp = true;
			}
			if(str1.equals("tanh"))
			{
				s = s + "tanh(";
				ch = 3;
				hyp = true;
			}
			if(str1.equals("log"))
			{
				s = s + "log(";
				ch = 4;
				hyp = true;
			}
			t.setText(T+s);
			t1.setText(T+s);
		//	System.out.println("Total"+T);
		}
		else if(str1.equals("√") )
		{
			String temp = T;
			check = true;
			temp = temp +"√(";
			T = T + "Math.sqrt(";
			t.setText(temp);
			t1.setText(temp);
		//	System.out.println(T);
		}
		
		else if(  str1.equals("(") || str1.equals(")") || str1.equals("%") || str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") ||str1.equals("0") || str1.equals("+") || str1.equals("-") || str1.equals("*") || str1.equals("/")  )
		{
			if(hyp)
			{
				
				String s1 ="";
				String s = t.getText();
				if(hyp && str1.equals(")"))
				{
					s = s + str1;
					t.setText(s);
					t1.setText(s);
					tri(val);
					hyp = false;
					ch = 0;
				}
				else
				{
					
					System.out.println(T);
					s = s+str1;
					s1 = s1 + str1;
					val = Integer.parseInt(s1);
					t.setText(s);
					t1.setText(s);
				//	System.out.println(s);
					
				}
				
			}
			else if(T.equals("") && str1.equals("0"))
			{
				T = "";
				t.setText("0");
				t1.setText("0");
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
					t1.setText(temp);
				//	System.out.println(T);
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
						t1.setText(temp);
				//		System.out.println(T);
					}
					else
					{
						T = T + str1;
						t.setText(T);
						t1.setText(T);
					}
				}

			}
		//	System.out.println("Total "+T);
			
		}
		else if(str1.equals("C"))
		{
			 T ="";
			 if(T.equals(""))
			 {
				 t.setText("0");
				 t1.setText("0");
			 }
			 else
			 {
				 t.setText("0");
				 t1.setText("0");
			 }
		}
		else if(str1.equals("00"))
		{
			 if(T.equals(""))
			 {
				 t.setText("0");
				 t1.setText("0");
			 }
			 else
			 {
				 T = T + str1;
			   	 t.setText(T);
			   	t1.setText(T);
			 }
		}
		else if(str1.equals("<-"))
		{
			String str2 = t.getText();
			if(T.equals("") && str2.equals(""))
			{
				T ="";
				t.setText(T);
				t1.setText(T);
			}
			else if(str2.equals(T))
			{
				T = T.substring(0,T.length()-1);
				t.setText(T);
				t1.setText(T);
			//	System.out.println("Total "+T);
			}
			
		}
		else if(str1.equals("+-"))
		{
			Double val = Double.parseDouble(t.getText());
			val = val * -1;
			T = val+"";
			t.setText(T);
			t1.setText(T);
	//		System.out.println("Total "+T);
		}
		else if(T.equals("") && str1.equals("=") )
		{
			t.setText(Ans);
			t1.setText(Ans);
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
			t1.setText(Ans);
	//		System.out.println("Total "+T);
		}
		Ans = "0";
	}

	public static void main(String[] args)
	{
		new Calculator();
	}
}
