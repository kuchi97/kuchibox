import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FlickeringLabel extends JLabel implements Runnable
{
	private long delay;	//배경이 바뀌는 지연시간
	
	public FlickeringLabel(String text, long delay)
	{
		super(text);		//JLabel의 생성자 호출
		this.delay= delay;
		setOpaque(true);	//label 배경색 바꾸려면 오파크 트루 줘야함
		
		Thread th= new Thread(this);		//스레드 생성자에 this를 넘기는 것은
											//바로 이 클래스가 Runnable을 상속받아 run()을 구현한 객체임을 표시하는것
		th.start();
	}
	
	@Override
	public void run()
	{
		int n=0;
		
		while(true)
		{
			if(n==0)
			{
				setBackground(Color.yellow);
			}
			else
				setBackground(Color.cyan);
			
			if(n==0)
				n=1;
			else
				n=0;
			
			try {
				Thread.sleep(delay);
			} catch (InterruptedException e) {
				return;
			}
		}
	}
}

public class PracticeAnySwing extends JFrame {

	JPanel bg;

	public PracticeAnySwing() {
		super("PracticeAnySwing");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.setBackground(Color.white);

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlickeringLabel fLabel= new FlickeringLabel("깜빡", 500);
		
		JLabel label= new JLabel("안깜빡");
		
		FlickeringLabel fLabel2= new FlickeringLabel("여기도 깜빡", 300);
		
		bg.add(fLabel);
		bg.add(label);
		bg.add(fLabel2);
		
	}

	public static void main(String[] args) {
		PracticeAnySwing my = new PracticeAnySwing();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}