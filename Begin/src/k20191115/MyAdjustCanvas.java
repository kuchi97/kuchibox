package k20191115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyAdjustCanvas extends JFrame implements ActionListener{

	JPanel bg;
	Canvas can;
	JButton open;
	
	int red,green,blue;
	Color c= new Color(red,green,blue);
	
	public MyAdjustCanvas() {
		super("MyAdjustCanvas");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		cp.add(open= new JButton("open"), "South");
		bg.setBackground(Color.lightGray);
		
		bg.add(can= new Canvas());
		can.setBackground(Color.white);
		can.setSize(200,200);
		
		//actionlistener
		open.addActionListener(this);
		
		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= new Object();
		obj=e.getSource();
		
		if(obj==open)
		{
			MyAdjustBar adbar= new MyAdjustBar(this);
			adbar.pack();
			adbar.setLocation(500,0);
			
			adbar.setVisible(true);
		}
		
		
	}

	public static void main(String[] args) {
		MyAdjustCanvas my = new MyAdjustCanvas();
		
		my.setSize(400, 400);
		my.setVisible(true);
		
	}
}