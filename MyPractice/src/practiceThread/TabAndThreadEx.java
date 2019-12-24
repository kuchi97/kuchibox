package practiceThread;
//아무 키나 누르면 bar의 보라색이 오른쪽으로 1/100씩 진행
//가만히 있으면 스레드에 의해 0.2초 간격으로 1/100씩 감소

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel
{
	private int barSize=0;		//그려져야할 바의 크기
	private int maxBarSize;		//바의 최대크기
	
	//constructor
	public MyLabel(int maxBarSize)
	{
		this.maxBarSize= maxBarSize;
	}
	
	@Override
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		
		int width=(int)(((double)(this.getWidth()))/maxBarSize*barSize);
		
		if(width==0)
			return;			//크기가 0이기 때문에 bar를 안그려도 된다
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	
	synchronized public void fill()
	{
		if(barSize == maxBarSize)
		{
			try {
				wait();			//바가 최대이면, ConsumerThread에 의해 바가 줄어들때까지 대기한다
			}
			catch (InterruptedException e) {
				return;
			}
		}
		
		barSize++;
		repaint();
		notify();				//기다리는 ConsumerThread 깨우기
	}
	
	synchronized public void consume()
	{
		if(barSize == 0)
		{
			try {
				wait();			//바의 크기가 0이면 0보다 커질때까지 대기한다
			}
			catch(InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();				//기다리는 ConsumerThread 깨우기
	}
}


class ConsumerThread extends Thread
{
	private MyLabel bar;
	
	//constructor
	public ConsumerThread(MyLabel bar)
	{
		this.bar= bar;
	}
	
	@Override
	public void run()
	{
		while(true)
		{
			try {
				sleep(200);
				bar.consume();		//0,2초마다 바를 1씩 줄임
			}
			catch(InterruptedException e) {
				return;
			}
		}
	}
}


public class TabAndThreadEx extends JFrame{

	private MyLabel bar= new MyLabel(100);
	
	//constructor
	public TabAndThreadEx(String title)
	{
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(null);;
		
		bar.setBackground(Color.orange);
		bar.setOpaque(true);				//라벨에 색넣으려면 오파크 트루
		bar.setLocation(20,50);
		bar.setSize(300,20);
		
		c.add(bar);
		
		//contentpane에 키 이벤트 핸들러
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
//				System.out.println(e);
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				bar.fill();					//키를 누를때마다 바가 1씩 늘어남   <<<중요!>>>
				
			}
		});
		
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();					//컨텐트패널에 키처리권을 부여한다(커서를 갖다주는거임)
		
		ConsumerThread th= new ConsumerThread(bar);
		th.start();
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx("아무키나 눌러서 바 채우기 미니게임");
	}
}
