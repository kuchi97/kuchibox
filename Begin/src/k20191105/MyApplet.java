package k20191105;

//Applet Ŭ������ ��ӹ޾ƾ���
//�ݵ�� public �̾����
//application�� �ƴϱ⶧���� main()�� ���� == ���������� ����
//html�� ���Խ��� ����Ѵ�
//��� ����޼ҵ���� �����Ѵ�
//		paint, init(), start(), stop(), destroy()...

/*
 * 		java.awt.colorŬ�������ִ� Ŭ������������ �迭�� �����϶�
 * 		white����
 * 		�׸��� ������ �迭�� ���ڿ��� ���(����)
 */
import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet{		//Applet�� ��ӹްڽ��ϴ�(extends)
	
	private String str= "���� ���� ���ø�";
	private int x= 50, y= 50;
	private Color colorSet[]= {Color.cyan, Color.magenta, Color.yellow, Color.blue,
								Color.green, Color.pink, Color.red, Color.orange};
	
	public void init()
	{
		setSize(400,400);			//���ø��� ��,���� ����
		
	}
	public void paint(Graphics g)
	{
		Font fnt= new Font("�ü�", Font.BOLD+Font.ITALIC,22);
									//��ü, ��Ÿ��, ����ũ��
		g.setFont(fnt);				//��Ʈ����
//		g.setColor(Color.cyan);
//		g.drawString(str, x, y);
//		g.setColor(Color.magenta);
//		g.drawString(str, x,y+20);
		
		for(int i=0; i<colorSet.length;i++)
		{
			int tmp= (int)(Math.random()*8);
			g.setColor(colorSet[tmp]);
			g.drawString(str,(x+=10),(y+20*i));
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
		
	}
	
}
