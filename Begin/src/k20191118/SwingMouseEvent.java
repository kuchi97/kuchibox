package k20191118;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
Event Source: JPanel
Event: Container- MouseEvent (ActionEvent(N/A))
Event Handler: MouseListener

*/

public class SwingMouseEvent extends JFrame {

	int x=50, y=50;
	
	JPanel bg= new JPanel() {
		String str="���� ��Ŭ����";
		
		//anonymous class ����
		@Override
		public void paint(Graphics g)
		{
			super.paint(g);
				//�θ� JPanel�� �ҷ��� �θ� �ؾ��� �۾��� �� �϶��
			g.setColor(Color.blue);
			g.setFont(new Font("Dialog", Font.BOLD,22));
			g.drawString(str, x, y);
		}
	};//-	-	-	JPanel bg
	
	class MyHandler implements MouseListener
	{
		//MouseListener�� �߻�޼ҵ� 5���� �����ʾƵ� �� �������̵� �ؾ���
		@Override
		public void mouseClicked(MouseEvent e)
		{
			System.out.println("Click");
			
		}
		public void mousePressed(MouseEvent e) {
			System.out.println("Press");
			
			//���콺�� ���� ������ xy ��ǥ�� ���ͼ� jframe Ÿ��Ʋ�� �����
			//x��ǥ y��ǥ ������
			int xx=e.getX();
			int yy=e.getY();

			System.out.println(xx+","+yy);
			String xStr=String.valueOf(xx);
			String yStr=String.valueOf(yy);
			setTitle(xStr+", "+yStr);
			
			//���콺�� ������ ���ڿ��� ����ٴϰ�
//			x=xx;
//			y=yy;		//xx yy ��ǥ�� x y�� ����
				//cf> �̷��� paint�� ȣ���� �ɶ����� ���޵Ǿ� �����Ƿ�
				//	�ǽð����� �ٲ����� �ʰ� â�� ���ȴ� �÷����� ����ǰų� �Ѵ�
				//	�̶� paint()�� �����ڰ� ȣ���ϴ� ���� �ƴ϶� JVM�� ȣ���ϴ°�
			
				//	���� �����ڴ� repaint()�� ȣ���Ͽ� JVM�� �˾Ƽ� paint()�� ȣ���ϵ��� �ؾ���
				//		�̶� repaint()�� JFrame�� �ƴ϶� JPanel�� �ٽ� �׸��°�
//			bg.repaint();
			
			
			//�������콺��ư�� �������� ���ڿ��� ���󰡵���
			int mb= e.getButton();	//��Ŭ��1 ��Ŭ��2 ��Ŭ���� 3
			System.out.println(mb);
			
			if(mb==MouseEvent.BUTTON3)
			{
				x=xx; y=yy;
				bg.repaint();
			}
		}
		public void mouseReleased(MouseEvent e) {
			System.out.println("Release");
		}
		public void mouseEntered(MouseEvent e) {
			bg.setBackground(Color.cyan);
		}	//���콺�� �����ȿ� ��������
		public void mouseExited(MouseEvent e) {
			bg.setBackground(Color.white);
		}	//���콺�� ���������� ��������
	}

	public SwingMouseEvent() {
		super("SwingMouseEvent");

		Container cp = this.getContentPane();
		cp.add(bg, "Center");
		bg.setBackground(Color.white);
		
		//add listener
		MyHandler myL= new MyHandler();
		bg.addMouseListener(myL);

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingMouseEvent my = new SwingMouseEvent();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}
