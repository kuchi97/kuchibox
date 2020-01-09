package k20191119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyMouseEvent extends JFrame{

	JPanel bg;
	int x=10, y=20;
	
	//mycanvas setting
	Canvas can= new Canvas() {
		public void paint(Graphics g)
		{
//			super.paint(g);
			g.drawOval(x,y,3,3);
		}
	};
	
	class MyMouseHandler implements MouseMotionListener{
		@Override
		public void mouseDragged(MouseEvent e) {
			//static int MOUSE_DRAGGED 
			System.out.println("dragging");
			
			System.out.println(x+","+y);
			

			x=e.getX();
			y=e.getY();
			
			e.translatePoint(x, y);
			can.repaint();
		}
		
		@Override
		public void mouseMoved(MouseEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}//-	-	.MyMouseHandler

	public MyMouseEvent() {
		super("MyMouseEvent");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.add(can);
		
		can.setSize(200,200);
		can.setLocation(100, 0);
		can.setBackground(Color.white);
		

		//addlistener
		MyMouseHandler mh= new MyMouseHandler();
		can.addMouseMotionListener(mh);

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//mousemotionlistener override
	
	
	public static void main(String[] args) {
		MyMouseEvent my = new MyMouseEvent();

		my.setSize(400, 400);
		my.setVisible(true);

	}


}