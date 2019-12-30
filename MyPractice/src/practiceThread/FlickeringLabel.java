package practiceThread;

import java.awt.*;
import javax.swing.*;

class MyLabel extends JLabel implements Runnable
{
//	private String name;
	private long delay;
	
	//constructor
	public MyLabel(String name, long delay)
	{
		super(name);
//		this.name=name;
		this.delay= delay;
		
		setOpaque(true);
		
		Thread th= new Thread(this);
		th.start();
	}
	
	@Override
	public void run()
	{
		boolean sw=false;
		
		while(true)
		{
			if(sw)
			{
				setBackground(Color.magenta);
				sw=false;
			}
			else
			{
				setBackground(Color.cyan);
				sw=true;
			}
			
				
			try {
				Thread.sleep(delay);
			}
			catch (InterruptedException e) {
				System.out.println("run() Interrupted");
				return;
			}
		}
	}
	
	
}
public class FlickeringLabel extends JFrame{

	public FlickeringLabel()
	{
		Container c= getContentPane();
		c.setLayout(new FlowLayout());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		MyLabel fLabel= new MyLabel("1¹ø±ôºýÀÌ", 500);
		JLabel nLabel= new JLabel("ÀÏ¹Ý¶óº§");
		MyLabel fLabel2= new MyLabel("2¹ø±ôºýÀÌ", 300);
		
		c.add(fLabel);
		c.add(nLabel);
		c.add(fLabel2);

		setSize(300,150);
		setVisible(true);
	}
	public static void main(String[] args) {
		
		new FlickeringLabel();
	}
}
