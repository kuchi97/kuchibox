import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FlickeringLabel extends JLabel implements Runnable
{
	private long delay;	//����� �ٲ�� �����ð�
	
	public FlickeringLabel(String text, long delay)
	{
		super(text);		//JLabel�� ������ ȣ��
		this.delay= delay;
		setOpaque(true);	//label ���� �ٲٷ��� ����ũ Ʈ�� �����
		
		Thread th= new Thread(this);		//������ �����ڿ� this�� �ѱ�� ����
											//�ٷ� �� Ŭ������ Runnable�� ��ӹ޾� run()�� ������ ��ü���� ǥ���ϴ°�
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

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		FlickeringLabel fLabel= new FlickeringLabel("����", 500);
		
		JLabel label= new JLabel("�ȱ���");
		
		FlickeringLabel fLabel2= new FlickeringLabel("���⵵ ����", 300);
		
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