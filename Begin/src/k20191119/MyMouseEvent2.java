package k20191119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMouseEvent2 extends JFrame implements MouseMotionListener{

	int x=30, y=50;

	JPanel bg;
	Canvas can= new Canvas() {
		
		public void paint(Graphics g)
		{
			g.drawOval(x, y, 3, 3);
		}
	};

	public MyMouseEvent2() {
		super("MyMouseEvent2");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.add(can);
		can.setLocation(200,100);
		can.setSize(200,200);
		can.setBackground(Color.white);
		
		//addlistener
		can.addMouseMotionListener(this);

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		x=e.getX();
		y=e.getY();
		
		e.translatePoint(x, y);
		System.out.println("dragging"+x+","+y);
		
		can.repaint();
		
		
	}
	
	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		MyMouseEvent2 my = new MyMouseEvent2();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}