package practiceThread;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


class RandomThread extends Thread
{
	private Container contentPane;
	private boolean flag= false;				//�������� �������� ǥ���ϴ� �÷���. true= ����
	
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
			contentPane.repaint();				//repaint()�� �߰��� ���� ���̰���
			
			try {
				Thread.sleep(300);
				
				if(flag==true)			//�����尡 �����ϵ��� ���ù������
				{
					contentPane.removeAll();		//contentPane�� ��� ���̺� ����
					label= new JLabel("finish");
					label.setLocation(100,100);
					label.setSize(80,30);
					label.setForeground(Color.red);
					
					contentPane.add(label);
					contentPane.repaint();
					return;				//������ ����
					
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
	private RandomThread th;		//������ ��ü
	
	//constructor
	public ThreadFinishFlagEx()
	{
		this.setTitle("::ThreadFinishFlag::");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c= getContentPane();
		c.setLayout(null);
		
		//���콺������ ���(�����)
		c.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e)
			{
				th.finish();		//RandomThread ������
			}
		});
		
		setSize(300,200);
		setVisible(true);
		
		th= new RandomThread(c);			//������ ����, �����忡 ����Ʈ�г� ����
		th.start();
	}
	
	public static void main(String[] args)
	{
		new ThreadFinishFlagEx();
	}
	
}
