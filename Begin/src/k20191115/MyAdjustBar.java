package k20191115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import k20191112.MyJPanel;

public class MyAdjustBar extends JDialog implements AdjustmentListener{

	MyJPanel bg;
	JScrollBar rBr,gBr,bBr;
	JButton close;
	JLabel rLb,gLb,bLb;
	
	int red,green,blue;
	Color c;
	
	MyAdjustCanvas mycan;

	public MyAdjustBar(MyAdjustCanvas mcan) {

		mycan=mcan;
		
		Container cp = this.getContentPane();
		cp.add(bg = new MyJPanel(40,40,80,40), "Center");
		cp.add(close= new JButton("close"), "South");
		bg.setLayout(new GridLayout(3,1,10,40));
		bg.setBackground(Color.white);
		
		bg.add(rLb= new JLabel("R"+mycan.red));
		bg.add(rBr= new JScrollBar(JScrollBar.HORIZONTAL,1,10,0,255));
		bg.add(gLb= new JLabel("G"+mycan.green));
		bg.add(gBr= new JScrollBar(JScrollBar.HORIZONTAL,1,10,0,255));
		bg.add(bLb= new JLabel("B"+mycan.blue));
		bg.add(bBr= new JScrollBar(JScrollBar.HORIZONTAL,1,10,0,255));
		
		
		
		
		
		//add adjustlistnere
		rBr.addAdjustmentListener(this);
		gBr.addAdjustmentListener(this);
		bBr.addAdjustmentListener(this);
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				MyAdjustBar.this.dispose();
			}
		});

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
	}

	@Override
	public void adjustmentValueChanged(AdjustmentEvent e) {
		Object obj= new Object();
		obj= e.getSource();
		c=new Color(red,green,blue);
		mycan.can.setBackground(c);
		
		if(obj==rBr)
		{
			red=rBr.getValue();
			System.out.println("r: "+red);
		}
		else if(obj==gBr)
		{
			green=gBr.getValue();
			System.out.println("g: "+green);
		}
		else if(obj==bBr)
		{
			blue=bBr.getValue();
			System.out.println("b: "+blue);
		}		
	}
	
	

//	public static void main(String[] args) {
//		MyAdjustBar my = new MyAdjustBar();
//
////		my.setSize(400, 400);
//		my.pack();
//		my.setVisible(true);
//
//	}

}
