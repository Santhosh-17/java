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
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Calculator extends JFrame implements ActionListener
{
	String T ="";
	String Ans;
	JTextField t;
	JPanel p1;
	JPanel p2;
	Container c;
	Calculator()
	{
		super("Calculator");
		
        c = getContentPane();
		
		Dimension d = new Dimension(300,50);
		Dimension d1 = new Dimension(60,50);
	//	Dimension d2 = new Dimension(300,50);
	//	Dimension d3 = new Dimension(300,50);
		Dimension d4 = new Dimension(300,400);
		
		t = new JTextField();
		t.setEditable(true);
		t.setHorizontalAlignment(JTextField.RIGHT);
		
		p1 = new JPanel();
		p2 = new JPanel();

		
		
		p1.setLayout(new FlowLayout(FlowLayout.RIGHT));
		p2.setLayout(new FlowLayout(FlowLayout.CENTER));
		
		p1.setBackground(Color.white);
		p2.setBackground(Color.DARK_GRAY);
		
		t.setPreferredSize(d);
		p1.setPreferredSize(d);
		p2.setPreferredSize(d4);
		
		
		p1.add(t);
		
		FlowLayout f = new FlowLayout();

	//	setResizable(false);
		
		c.setLayout(f);
		c.setBackground(Color.DARK_GRAY);

		c.add(p1);
		c.add(p2);
	
	    String[] str = {"CE","C","<-","/","7","8","9","*","4","5","6","-","1","2","3","+","+-","0",".","="};			
	    JButton b[] = new JButton[str.length];
		for(int i =0;i<str.length;i++)
		{
			b[i] = new JButton(str[i]);
			b[i].setFont(new Font("monospaced", Font.BOLD,14));
			b[i].setPreferredSize(d1);
			b[i].setBackground(Color.WHITE);
			p2.add(b[i]);
		}	
		for(int i=0;i<str.length;i++)
		{
			b[i].addActionListener(this);
		}
		
		setVisible(true);
		setSize(300,450);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	public void convert(String foo) throws ScriptException
	{
		ScriptEngineManager mgr = new ScriptEngineManager();
	    ScriptEngine engine = mgr.getEngineByName("JavaScript");
	    
	    System.out.println(engine.eval(foo));
	    Ans = engine.eval(foo) +"";
	}

	public void actionPerformed(ActionEvent e)
	{
		String str1 =e.getActionCommand(); 
		if(str1.equals("1") || str1.equals("2") || str1.equals("3") || str1.equals("4") || str1.equals("5") || str1.equals("6") || str1.equals("7") || str1.equals("8") || str1.equals("9") ||str1.equals("0") || str1.equals("+") || str1.equals("-") || str1.equals("*") || str1.equals("/") || str1.equals(".") )
		{
			
			if(T.equals("") && str1.equals("0"))
			{
				T = "";
				t.setText("0");
			}
			else
			{
				T = T + str1;
				t.setText(T);
			}
			System.out.println("Total "+T);
			
		}
		else if(str1.equals("C"))
		{
			 T ="";
			 t.setText("0");
		}
		else if(str1.equals("CE"))
		{
			
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
			
			T = "";
			t.setText(Ans);
			System.out.println("Total "+T);
		}
	}

	public static void main(String[] args)
	{
		new Calculator();
	}
}