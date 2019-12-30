//Runnable 인터페이스를 이용하여 1초단위로 출력하는 타이머스레드 만들기

import java.awt.*;
import javax.swing.*;

class TimerRunnable implements Runnable
{
	private JLabel timerLabel;
	
	//constructor
	public TimerRunnable(JLabel timerLabel)
	{
		this.timerLabel=timerLabel;
	}
	
	@Override
	public void run()
	{
		int count=0;
		
		while(true)
		{
			timerLabel.setText(Integer.toString(count));
			count++;
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				System.out.println("run() interrupted");
				return;
			}
		}
	}
}

public class PracticeRunnable extends JFrame
{
	//constructor
	public PracticeRunnable()
	{
		setSize(300,150);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		JLabel timerLabel= new JLabel();
		timerLabel.setFont(new Font("Verdana", Font.ITALIC, 80));
		c.add(timerLabel);
		
		Thread th= new Thread(new TimerRunnable(timerLabel));	
			//timerLabel을 업은 Runnable이 스레드에 실려감
		
		th.start();
		System.out.println(Thread.getAllStackTraces());
	}
	
	public static void main(String[] args) {
		
		new PracticeRunnable();
	}
}