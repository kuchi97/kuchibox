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
				return;				//예외발생시 스레드 종료
			}
			
		}
	}
	
	
}


public class ThreadInterruptEx extends JFrame{

	private Thread th;
	
	public ThreadInterruptEx ()
	{
		setTitle("::ThreadInterruptEx");
		//창닫기설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		
		//타이머값 출력할 label
		JLabel timerLabel= new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		
		//타이머스레드로 사용할 Runnable객체 생성
		//타이머값을 출력할 라벨 컴포넌트를 생성자에 전달
		TimerRunnable runnable= new TimerRunnable(timerLabel);
		th= new Thread(runnable);
		c.add(timerLabel);
		
		//버튼 생성하고 액션리스너 등록
		JButton bt= new JButton("kill Timer");
		bt.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				th.interrupt();			//타이머스레드 강제종료
				JButton bt=(JButton)e.getSource();
				
				bt.setEnabled(false);	//버튼 비활성화
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
