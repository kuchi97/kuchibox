import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class TimerThreadTest extends Thread
{
	private JLabel timerLabel;
	
	public TimerThreadTest(JLabel timerLabel)
	{
		this.timerLabel=timerLabel;		//타이머카운트를 출력하는 라벨
	}
	
	@Override
	public void run()
	{
		int timer=0;
		
		while(true)
		{
			timerLabel.setText(Integer.toString(timer));
			timer++;
			
			try {
				sleep(1000);
			} catch (Exception e) {
				System.out.println("run()에서 인터럽트");
				return;
			}
			
		}
	}
}

public class PracticeThread extends JFrame
{
	public PracticeThread()
	{
		setTitle("Thread Practice");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//create label
		JLabel timerLabel= new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);
		
		//create thread
		TimerThreadTest th= new TimerThreadTest(timerLabel);		//만든 라벨을 스레드에 붙인다
		
		setSize(300,170);
		setVisible(true);
		
		//execute thread
		th.start();
		
		addMouseListener(new MouseAdapter() {
			
			public void mouseClicked(MouseEvent e)
			{
				th.interrupt();
				JOptionPane.showMessageDialog(PracticeThread.this, "타이머가 종료됩니다");
				System.out.println("마우스클릭종료");
				return;
			}
		});
		
	}
	
	public static void main(String[] args) {
		
		new PracticeThread();
	}
}