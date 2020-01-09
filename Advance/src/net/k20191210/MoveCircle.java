package net.k20191210;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JApplet {

	JPanel bg;
	JButton btStart, btStop;
	int x=50, y=100;					//���� �׷��� ������ǥ

	public void init() {

		setSize(500,500);
		
		Container cp = this.getContentPane();		//default: borderLayout
		cp.add(bg = new JPanel(), "North");
		bg.setBackground(Color.pink);
		
		bg.add(btStart= new JButton("start!"));
		bg.add(btStop= new JButton("stop!!"));
		
		
		
		RollThread roll= new RollThread();			//RollThread��ü����
		btStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
//				showStatus("Start clicked");			//for test
				//������ ���� �Ŀ� ����
				roll.start();
			}
		});
		btStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
//				showStatus("Stop clicked");				//for test
				//������ ����
//				roll.interrupt();
				try {
					roll.wait();
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});

	}
	
	//�ǽ�. ������ �����ϱ�
	//�����尡 ����: �ݺ��� ���鼭 x��ǥ �Ǵ� y��ǥ�� ������Ų �� �ٽñ׷��ش�
	//sleep �̿�
	//���� ���������� �ٽ� �������� �ǵ��ƿ���
	//���� ���������� ƨ�ܼ� �����ΰ���
	//������ư ������ ������Ű��:	interrupt Ȱ��
	class RollThread extends Thread
	{
		boolean sw;
		@Override
		public void run()
		{
			sw= true;
			while(sw)
			{
				int goX=(int)(Math.random()*2);
				int goY=(int)(Math.random()*2);
				
				if(goX==0)
					x-=2;
				else if(goX==1)
					x+=2;
				
				if(goY==0)
					y-=2;
				else if(goY==1)
					y+=2;
				
				repaint();			//�ٽñ׷���
				
				showStatus("����������~    "+x+"/"+y);
				try {
					Thread.sleep(50);
				} catch (InterruptedException e) {
					e.printStackTrace();
					break;
				}
				
			}

		}
	}
	
	
	@Override
	public void paint(Graphics g)
	{
		super.paint(g);
		g.setColor(Color.blue);
		g.fillOval(x, y, 20, 20);
	}

}
