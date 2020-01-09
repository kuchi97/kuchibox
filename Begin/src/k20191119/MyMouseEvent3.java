package k20191119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// �̺�Ʈ�ڵ鷯�� �ܺ�Ŭ������ ������ �����
class MyHandler extends MouseMotionAdapter{
	
	//���ڻ����ڸ� �����Ͽ� �̺�Ʈ�ҽ��� ���� ��ü�� �Ű������� �޴´�
	MyMouseEvent3 mainF;
	public MyHandler(MyMouseEvent3 me)
	{
		mainF=me;
	}
	
	@Override
	public void mouseDragged(MouseEvent e)
	{
		//���콺�巡�������� x,y��ǥ �˾Ƴ��� 
		//can�� ����ǵ���
		int xx=e.getX();
		int yy=e.getY();
		mainF.x=xx;
		mainF.y=yy;
		mainF.can.repaint();
		/*
		repaint�� ���� �׸��� ����� �� �׸��� �׸�
			�����׸��� �����ִ°��� update()�޼ҵ���
			�׷��� update()�� �������̵��ϸ� ���������ʰ� ������־�
		*/
		
		System.out.println(xx+","+yy);
	}
}


public class MyMouseEvent3 extends JFrame {

	int x=30, y=50;

	JPanel bg;
	Canvas can= new Canvas() {
		
		//public void update(Graphics g)
		public void update(Graphics g)
		{
			//1. �����׸��� ����: �̰� ���ϰ��ϰ�
			//2. paint(g)ȣ��
			paint(g);
		}
		public void paint(Graphics g)
		{
			g.drawOval(x, y, 2, 2);
		}
	};

	public MyMouseEvent3() {
		super("MyMouseEvent3");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.add(can);
		can.setLocation(200,100);
		can.setSize(200,200);
		can.setBackground(Color.white);
		
		//addlistener
		MyHandler mh= new MyHandler(this);		//�ܺ�Ŭ������ ��������� �Ű����� this
		can.addMouseMotionListener(mh);

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		MyMouseEvent3 my = new MyMouseEvent3();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}