import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicOptionPaneUI.ButtonActionListener;

public class Cal1 implements ActionListener{
	JFrame jf;
	JLabel displaylabel;
	JButton button1;
	JButton button2;
	JButton button3;
	JButton button4;
	JButton button5;
	JButton button6;
	JButton button7;
	JButton button8;
	JButton button9;
	JButton button0;
	JButton buttonp;
	JButton buttonm;
	JButton buttond;
	JButton buttondiv;
	JButton buttonE;
	JButton buttonC,buttonmul;

public Cal1()
{
 	  jf=new JFrame("Calculator");
     jf.setLayout(null);
     jf.setSize(500,500);
     jf.setLocation(500, 200);
     
     displaylabel=new JLabel("");
     displaylabel.setBounds(10, 10, 470, 80);
     displaylabel.setBackground(Color.GRAY);
     displaylabel.setOpaque(true);
     displaylabel.setHorizontalAlignment(SwingConstants.RIGHT);
     displaylabel.setForeground(Color.WHITE);
     displaylabel.setFont(new Font("Serif", Font.BOLD,30));
     jf.add(displaylabel);
     
    button7=new JButton("7");
    button7.setBounds(30, 140, 70, 60);
    button7.setBackground(Color.WHITE);
    button7.setForeground(Color.BLACK);
    button7.setBorder(BorderFactory.createRaisedBevelBorder());;
    button7.setFont(new Font("Serif", Font.BOLD,20));
    button7.addActionListener(this);
    jf.add(button7);
    
    button8=new JButton("8");
    button8.setBounds(130, 140, 70, 60);
    button8.setBackground(Color.WHITE);
    button8.setForeground(Color.BLACK);
    button8.setBorder(BorderFactory.createRaisedBevelBorder());;
    button8.setFont(new Font("Serif", Font.BOLD,20));
    button8.addActionListener(this);
    jf.add(button8);
    
    button9=new JButton("9");
    button9.setBounds(230, 140, 70, 60);
    button9.setBackground(Color.WHITE);
    button9.setForeground(Color.BLACK);
    button9.setBorder(BorderFactory.createRaisedBevelBorder());;
    button9.setFont(new Font("Serif", Font.BOLD,20));
    button9.addActionListener(this);
    jf.add(button9);
    
    button4=new JButton("4");
    button4.setBounds(30, 220, 70, 60);
    button4.setBackground(Color.WHITE);
    button4.setForeground(Color.BLACK);
    button4.setBorder(BorderFactory.createRaisedBevelBorder());;
    button4.setFont(new Font("Serif", Font.BOLD,20));
    button4.addActionListener(this);
    jf.add(button4);
    
    button5=new JButton("5");
    button5.setBounds(130, 220, 70, 60);
    button5.setBackground(Color.WHITE);
    button5.setForeground(Color.BLACK);
    button5.setBorder(BorderFactory.createRaisedBevelBorder());;
    button5.setFont(new Font("Serif", Font.BOLD,20));
    button5.addActionListener(this);
    jf.add(button5);
    
    button6=new JButton("6");
    button6.setBounds(230, 220, 70, 60);
    button6.setBackground(Color.WHITE);
    button6.setForeground(Color.BLACK);
    button6.setBorder(BorderFactory.createRaisedBevelBorder());;
    button6.setFont(new Font("Serif", Font.BOLD,20));
    button6.addActionListener(this);
    jf.add(button6);
    
    button1=new JButton("1");
    button1.setBounds(30, 300, 70, 60);
    button1.setBackground(Color.WHITE);
    button1.setForeground(Color.BLACK);
    button1.setBorder(BorderFactory.createRaisedBevelBorder());;
    button1.setFont(new Font("Serif", Font.BOLD,20));
    button1.addActionListener(this);
    jf.add(button1);
    
    button2=new JButton("2");
    button2.setBounds(130, 300, 70, 60);
    button2.setBackground(Color.WHITE);
    button2.setForeground(Color.BLACK);
    button2.setBorder(BorderFactory.createRaisedBevelBorder());;
    button2.setFont(new Font("Serif", Font.BOLD,20));
    button2.addActionListener(this);
    jf.add(button2);
    
    button3=new JButton("3");
    button3.setBounds(230, 300, 70, 60);
    button3.setBackground(Color.WHITE);
    button3.setForeground(Color.BLACK);
    button3.setBorder(BorderFactory.createRaisedBevelBorder());;
    button3.setFont(new Font("Serif", Font.BOLD,20));
    button3.addActionListener(this);
    jf.add(button3);
    
    buttond=new JButton(".");
    buttond.setBounds(30, 380, 70, 60);
    buttond.setBackground(Color.WHITE);
    buttond.setForeground(Color.BLACK);
    buttond.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttond.setFont(new Font("Serif", Font.BOLD,20));
    buttond.addActionListener(this);
    jf.add(buttond);
    
    button0=new JButton("0");
    button0.setBounds(130, 380, 70, 60);
    button0.setBackground(Color.WHITE);
    button0.setForeground(Color.BLACK);
    button0.setBorder(BorderFactory.createRaisedBevelBorder());;
    button0.setFont(new Font("Serif", Font.BOLD,20));
    button0.addActionListener(this);
    jf.add(button0);
    
    buttonE=new JButton("=");
    buttonE.setBounds(230, 380, 70, 60);
    buttonE.setBackground(Color.WHITE);
    buttonE.setForeground(Color.BLACK);
    buttonE.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttonE.setFont(new Font("Serif", Font.BOLD,20));
    buttonE.addActionListener(this);
    jf.add(buttonE);
    
    buttonC=new JButton("Clear");
    buttonC.setBounds(330, 380, 70, 60);
    buttonC.setBackground(Color.WHITE);
    buttonC.setForeground(Color.BLACK);
    buttonC.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttonC.setFont(new Font("Serif", Font.BOLD,20));
    buttonC.addActionListener(this);
    jf.add(buttonC);
    
    buttondiv=new JButton("/");
    buttondiv.setBounds(330, 140, 70, 60);
    buttondiv.setBackground(Color.WHITE);
    buttondiv.setForeground(Color.BLACK);
    buttondiv.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttondiv.setFont(new Font("Serif", Font.BOLD,20));
    buttondiv.addActionListener(this);
    jf.add(buttondiv);
    
    buttonmul=new JButton("*");
    buttonmul.setBounds(410, 140, 70, 60);
    buttonmul.setBackground(Color.WHITE);
    buttonmul.setForeground(Color.BLACK);
    buttonmul.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttonmul.setFont(new Font("Serif", Font.BOLD,20));
    buttonmul.addActionListener(this);
    jf.add(buttonmul);
    
    buttonm=new JButton("-");
    buttonm.setBounds(330, 220, 70, 60);
    buttonm.setBackground(Color.WHITE);
    buttonm.setForeground(Color.BLACK);
    buttonm.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttonm.setFont(new Font("Serif", Font.BOLD,20));
    buttonm.addActionListener(this);
    jf.add(buttonm);
    
    buttonp=new JButton("+");
    buttonp.setBounds(330, 300, 70, 60);
    buttonp.setBackground(Color.WHITE);
    buttonp.setForeground(Color.BLACK);
    buttonp.setBorder(BorderFactory.createRaisedBevelBorder());;
    buttonp.setFont(new Font("Serif", Font.BOLD,20));
    buttonp.addActionListener(this);
    jf.add(buttonp);
    
    
     jf.setVisible(true);
     jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
}




public static void main(String[] args) {
	
Cal1 cal=new Cal1();


}
float oldvalue=0,newvalue=0,res=0;int count=0;

@Override
public void actionPerformed(ActionEvent e) {
    
	if(e.getSource()==button7)
	{
		displaylabel.setText(displaylabel.getText()+"7");
	}
	if(e.getSource()==button8)
	{
		displaylabel.setText(displaylabel.getText()+"8");
	}
	if(e.getSource()==button9)
	{
		displaylabel.setText(displaylabel.getText()+"9");
	}
	if(e.getSource()==button0)
	{
		displaylabel.setText(displaylabel.getText()+"0");
	}
	if(e.getSource()==button4)
	{
		displaylabel.setText(displaylabel.getText()+"4");
	}
	if(e.getSource()==button5)
	{
		displaylabel.setText(displaylabel.getText()+"5");
	}
	if(e.getSource()==button6)
	{
		displaylabel.setText(displaylabel.getText()+"6");
	}
	if(e.getSource()==button1)
	{
		displaylabel.setText(displaylabel.getText()+"1");
	}
	if(e.getSource()==button2)
	{
		displaylabel.setText(displaylabel.getText()+"2");
	}
	if(e.getSource()==button3)
	{
		displaylabel.setText(displaylabel.getText()+"3");
	}
	if(e.getSource()==buttond)
	{
		displaylabel.setText(displaylabel.getText()+".");
	}
	if(e.getSource()==buttondiv)
	{   count=1;
	    oldvalue=Float.parseFloat(displaylabel.getText());
	    displaylabel.setText("");
	}
	if(e.getSource()==buttonp)
	{ 
		count=2;
		oldvalue=Float.parseFloat(displaylabel.getText());
		displaylabel.setText("");
	}
	if(e.getSource()==buttonm)
	{
		count=3;
		oldvalue=Float.parseFloat(displaylabel.getText());
		displaylabel.setText("");
	}
    if(e.getSource()==buttonC)
    {
    	displaylabel.setText("");
    }
    if(e.getSource()==buttonmul)
	{
		count=4;
		oldvalue=Float.parseFloat(displaylabel.getText());
		displaylabel.setText("");
	}
    if(e.getSource()==buttonE)
	{
		if(count==2){
    	  newvalue=Float.parseFloat(displaylabel.getText());
		  res=oldvalue+newvalue;
		  displaylabel.setText(res+"");
    	}
		if(count==3) {
			  newvalue=Float.parseFloat(displaylabel.getText());
			  res=oldvalue-newvalue;
			  displaylabel.setText(res+"");	
		}
		if(count==1) {
			  newvalue=Float.parseFloat(displaylabel.getText());
			  res=oldvalue/newvalue;
			  displaylabel.setText(res+"");	
		}
	    if(count==4) {
	    	  newvalue=Float.parseFloat(displaylabel.getText());
			  res=oldvalue*newvalue;
			  displaylabel.setText(res+"");	
	    }
	
	
	}


}

public void sum()
{
	

  return;
}












}
