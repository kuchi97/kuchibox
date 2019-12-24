package k07BearEatFish2;

import javax.swing.*;
import java.awt.*;


class DogThread extends Thread
{
	String name;
	
	DogThread(String name)
	{
		this.name=name;
	}
	
	@Override
	public void run()
	{
		int x=0;
		
		while(x>500)
		{
			try {
			sleep(200);
			System.out.println(x);
			}
			catch (InterruptedException e){
				return;
			}
			x+=5;
		}
	}
}

public class DogRace extends JFrame{

	JPanel p;
	JLabel dog;
	
	public DogRace()
	{
		Container cp= getContentPane();
		cp.add(p= new JPanel());
		setSize(500,500);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		dog= new JLabel("dog");
		
		dog= new JLabel("asdf");
		
		p.add(dog);
		
		DogThread th= new DogThread("¸Û¸Û");
		th.start();
	}
	
	public static void main(String[] args) {
		
		new DogRace();
	}

}
