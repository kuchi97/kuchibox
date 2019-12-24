package practiceThread;
//�ƹ� Ű�� ������ bar�� ������� ���������� 1/100�� ����
//������ ������ �����忡 ���� 0.2�� �������� 1/100�� ����

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MyLabel extends JLabel
{
	private int barSize=0;		//�׷������� ���� ũ��
	private int maxBarSize;		//���� �ִ�ũ��
	
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
			return;			//ũ�Ⱑ 0�̱� ������ bar�� �ȱ׷��� �ȴ�
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	
	synchronized public void fill()
	{
		if(barSize == maxBarSize)
		{
			try {
				wait();			//�ٰ� �ִ��̸�, ConsumerThread�� ���� �ٰ� �پ�鶧���� ����Ѵ�
			}
			catch (InterruptedException e) {
				return;
			}
		}
		
		barSize++;
		repaint();
		notify();				//��ٸ��� ConsumerThread �����
	}
	
	synchronized public void consume()
	{
		if(barSize == 0)
		{
			try {
				wait();			//���� ũ�Ⱑ 0�̸� 0���� Ŀ�������� ����Ѵ�
			}
			catch(InterruptedException e) {
				return;
			}
		}
		barSize--;
		repaint();
		notify();				//��ٸ��� ConsumerThread �����
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
				bar.consume();		//0,2�ʸ��� �ٸ� 1�� ����
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
		bar.setOpaque(true);				//�󺧿� ���������� ����ũ Ʈ��
		bar.setLocation(20,50);
		bar.setSize(300,20);
		
		c.add(bar);
		
		//contentpane�� Ű �̺�Ʈ �ڵ鷯
		c.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e)
			{
//				System.out.println(e);
				if(e.getKeyCode()==KeyEvent.VK_RIGHT)
				bar.fill();					//Ű�� ���������� �ٰ� 1�� �þ   <<<�߿�!>>>
				
			}
		});
		
		setSize(350,200);
		setVisible(true);
		
		c.setFocusable(true);
		c.requestFocus();					//����Ʈ�гο� Űó������ �ο��Ѵ�(Ŀ���� �����ִ°���)
		
		ConsumerThread th= new ConsumerThread(bar);
		th.start();
	}
	
	public static void main(String[] args) {
		new TabAndThreadEx("�ƹ�Ű�� ������ �� ä��� �̴ϰ���");
	}
}
