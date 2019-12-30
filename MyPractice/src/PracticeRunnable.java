//Runnable �������̽��� �̿��Ͽ� 1�ʴ����� ����ϴ� Ÿ�̸ӽ����� �����

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
			//timerLabel�� ���� Runnable�� �����忡 �Ƿ���
		
		th.start();
		System.out.println(Thread.getAllStackTraces());
	}
	
	public static void main(String[] args) {
		
		new PracticeRunnable();
	}
}