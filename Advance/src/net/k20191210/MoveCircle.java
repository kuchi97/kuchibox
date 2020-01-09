package net.k20191210;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MoveCircle extends JApplet {

	JPanel bg;
	JButton btStart, btStop;
	int x=50, y=100;					//공을 그려줄 최초좌표

	public void init() {

		setSize(500,500);
		
		Container cp = this.getContentPane();		//default: borderLayout
		cp.add(bg = new JPanel(), "North");
		bg.setBackground(Color.pink);
		
		bg.add(btStart= new JButton("start!"));
		bg.add(btStop= new JButton("stop!!"));
		
		
		
		RollThread roll= new RollThread();			//RollThread객체생성
		btStart.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
//				showStatus("Start clicked");			//for test
				//스레드 생성 후에 동작
				roll.start();
			}
		});
		btStop.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
//				showStatus("Stop clicked");				//for test
				//스레드 중지
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
	
	//실습. 스레드 구현하기
	//스레드가 할일: 반복문 돌면서 x좌표 또는 y좌표를 증가시킨 후 다시그려준다
	//sleep 이용
	//공이 끝까지가면 다시 원점으로 되돌아오기
	//공이 끝까지가면 튕겨서 역으로가기
	//중지버튼 누르면 중지시키기:	interrupt 활용
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
				
				repaint();			//다시그려줘
				
				showStatus("돌굴러가유~    "+x+"/"+y);
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
