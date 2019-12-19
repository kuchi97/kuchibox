package practiceThread;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class TimerRunnable implements Runnable
{
	private JLabel timerLabel;
	
	
	//constructor
	public TimerRunnable(JLabel timerLabel)
	{
		this.timerLabel= timerLabel;
	}//-- constructor
	

	
	//run()
	@Override
	public void run()
	{
		int n=0;		//timer count
		
		while(true)
		{
			timerLabel.setText(Integer.toString(n));
			n++;
			
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;				//���ܹ߻��� ������ ����
			}
			
		}
	}
	
	
}


public class ThreadInterruptEx extends JFrame{

	private Thread th;
	
	public ThreadInterruptEx ()
	{
		setTitle("::ThreadInterruptEx");
		//â�ݱ⼳��
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//Ÿ�̸Ӱ� ����� label
		JLabel timerLabel= new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//Ÿ�̸ӽ������ ����� Runnable��ü ����
		//Ÿ�̸Ӱ��� ����� �� ������Ʈ�� �����ڿ� ����
		TimerRunnable runnable= new TimerRunnable(timerLabel);
		th= new Thread(runnable);
		c.add(timerLabel);
		
		//��ư �����ϰ� �׼Ǹ����� ���
		JButton bt= new JButton("kill Timer");
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				th.interrupt();			//Ÿ�̸ӽ����� ��������
				JButton bt=(JButton)e.getSource();
				
				bt.setEnabled(false);	//��ư ��Ȱ��ȭ
			}
		});
		
		c.add(bt);
		
		this.setSize(300,170);
		this.setVisible(true);
		
		th.start();
		
		
		
	}
	
	
	public static void main(String[] args) {
		
		new ThreadInterruptEx();
		
	}
}
