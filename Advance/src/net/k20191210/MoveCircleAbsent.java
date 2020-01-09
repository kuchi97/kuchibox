package net.k20191210;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//1)
public class MoveCircleAbsent extends JApplet implements Runnable{
	JPanel p = new JPanel();
	JButton btStart, btStop;
	int x=50, y=250;
	Thread  tr=null;
	boolean isStop=false;

	public void init() {
		setSize(500,500);
		Container cp = this.getContentPane();//BorderLayout
		cp.add(p, "North");
		p.setBackground(Color.pink);
		p.add(btStart=new JButton("Start"));
		p.add(btStop=new JButton("Stop"));
		
		btStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//������ ������ ����
				isStop=false;
				if(tr==null) {
					tr=new Thread(MoveCircleAbsent.this);
					tr.start();
				}
				showStatus("Start��ư Ŭ��");//���ø� ���¹ٿ� ���
			}
		});
		btStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//������ ����
				isStop=true;
				showStatus("Stop��ư Ŭ��");//���ø� ���¹ٿ� ���
				if(tr!=null) {
					//tr.stop(); //[X]
					tr.interrupt();
					tr=null;
				}
			}
		});
		
	}
	//[�ǽ�] ������ �����ϱ�
	//�����尡 ����: �ݺ��� ���鼭 x��ǥ �Ǵ� y��ǥ�� ������Ų�� 
	//               �ٽ� �׷��ش�. �׸��� ��� sleep
	
	//[1] ���� ������ ���� �ٽ� �������� �ǵ��ƿ���
	
	//[2] ���� ������ ���� ƨ�ܼ� ������ ����
	
	//[3] ���� ��ư ������ ������Ű�� (�ڿ������� run()�� �� �����ϵ��� �Ѵ�)
	//    tip) interrupt()Ȱ��
	int sw=1;
	public void run() {
		while(!isStop) {
			if(x>this.getWidth()-70||x<0) {
				sw*=-1;
			}
			x+=3*sw;
			repaint();
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				//e.printStackTrace();
				break;
			}
		}//while-----------
	}//run()---------------
	
	public void paint(Graphics g) {
		super.paint(g);
		g.setColor(Color.blue);
		g.fillOval(x, y, 70, 70);
	}
	
}
