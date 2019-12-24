package k07BearEatFish2;

import javax.swing.*;
import java.awt.*;

class BearThread extends Thread
{
	JLabel bear;
	
	BearEatFish2 game= new BearEatFish2();
	
	//constructor
	BearThread()
	{
		this.bear=new JLabel("B");
		
		bear.setLocation((int)(Math.random()*game.getWidth()), (int)(Math.random()*game.getHeight()));
	}
	
	@Override
	public void run()
	{
		
	}
}



public class BearEatFish2 extends JFrame{
	
	JPanel p;
	JLabel bear, fish;
	
	//constructor
	public BearEatFish2()
	{
		Container cp= this.getContentPane();
		cp.add(p= new JPanel());
		p.setBackground(Color.lightGray);
		setSize(500,500);
		setVisible(true);
		
		BearThread th= new BearThread();
		bear=th.bear;
		
		p.add(bear);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
	}
	
	public static void main(String[] args) {
	
		BearEatFish2 game= new BearEatFish2();

	}

}
