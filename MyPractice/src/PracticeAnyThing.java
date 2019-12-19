import java.awt.*;
import java.util.Timer;

import javax.swing.*;

class TimerThread extends Thread
{
	private JLabel timer;
	
	public TimerThread(JLabel timer)
	{
		this.timer= timer;		//타이머카운트 출력
	}
	
	//thread
	@Override
	public void run()
	{
		int n=0;
		
		while(true)
		{
			timer.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;
			}
		}
	}
}

public class PracticeAnyThing extends JFrame
{
	//constructor
	public PracticeAnyThing()
	{
		setTitle("Thread 상속 타이머 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머값 출력할 라벨
		JLabel timer= new JLabel();
		timer.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timer);
		
		//타이머 스레드 생성
		TimerThread thrd= new TimerThread(timer);
		
		setSize(300,170);
		setVisible(true);
		
		thrd.start();
	}
	
	public static void main(String[] args) {
		
		new PracticeAnyThing();
	}
}