package practiceThread;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class RandomThread extends Thread
{
	private Container contentPane;
	private boolean flag= false;				//스레드의 종료명령을 표시하는 플래그. true= 종료
	
	//constructor
	public RandomThread(Container contentPane)
	{
		this.contentPane= contentPane;
	}
	
	//thread quit flag method
	public void finish()
	{
		flag=true;
	}
	
	
	//run()
	@Override
	public void run()
	{
		int count=1;
		while(true)
		{
			int x=(int)(Math.random()*contentPane.getWidth());
			int y=(int)(Math.random()*contentPane.getHeight());
			
			JLabel label= new JLabel("java");
			//label setting
			label.setSize(80,30);
			label.setLocation(x,y);
			System.out.println(count+": "+x+", "+y);
			count++;
			
			contentPane.add(label);
			contentPane.repaint();				//repaint()로 추가한 라벨이 보이게함
			
			try {
				Thread.sleep(300);
				
				if(flag==true)			//스레드가 종료하도록 지시받은경우
				{
					contentPane.removeAll();		//contentPane의 모든 레이블 제거
					label= new JLabel("finish");
					label.setLocation(100,100);
					label.setSize(80,30);
					label.setForeground(Color.red);
					
					contentPane.add(label);
					contentPane.repaint();
					return;				//스레드 종료
					
				}
				
			} catch(InterruptedException e) {
				e.printStackTrace();
				return;
			}
			
		}
	}
}


public class ThreadFinishFlagEx extends JFrame{

	//global var.
	private RandomThread th;		//스레드 객체
	
	//constructor
	public ThreadFinishFlagEx()
	{
		this.setTitle("::ThreadFinishFlag::");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		
		//마우스리스너 등록(어댑터)
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				th.finish();		//RandomThread 종료명령
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
		th= new RandomThread(c);			//스레드 생성, 스레드에 컨텐트패널 전달
		th.start();
	}
	
	public static void main(String[] args)
	{
		new ThreadFinishFlagEx();
	}
	
}
