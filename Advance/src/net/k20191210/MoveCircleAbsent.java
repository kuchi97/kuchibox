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
				//스레드 생성후 동작
				isStop=false;
				if(tr==null) {
					tr=new Thread(MoveCircleAbsent.this);
					tr.start();
				}
				showStatus("Start버튼 클릭");//애플릿 상태바에 출력
			}
		});
		btStop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//스레드 중지
				isStop=true;
				showStatus("Stop버튼 클릭");//애플릿 상태바에 출력
				if(tr!=null) {
					//tr.stop(); //[X]
					tr.interrupt();
					tr=null;
				}
			}
		});
		
	}
	//[실습] 스레드 구현하기
	//스레드가 할일: 반복문 돌면서 x좌표 또는 y좌표를 증가시킨후 
	//               다시 그려준다. 그리고 잠깐 sleep
	
	//[1] 공이 끝까지 가면 다시 원점에서 되돌아오기
	
	//[2] 공이 끝까지 가면 튕겨서 역으로 가기
	
	//[3] 중지 버튼 누르면 중지시키기 (자연스럽게 run()을 다 수행하도록 한다)
	//    tip) interrupt()활용
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
