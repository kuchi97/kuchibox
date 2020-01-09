package k20191113;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//JButton(�̺�Ʈ�ҽ�) => ActionEvent(JVM) => ActionListener(�̺�Ʈ�ڵ鷯)

public class SwingMySearchEngine extends JFrame implements ActionListener{
	
	JPanel p= new JPanel();
	JButton b[]= new JButton[4];
	String str[]= {"NAVER","GOOGLE","YAHOO","������"};
	//ColorŸ�� �����ϳ� �ְ�
	Color org;
	
	public SwingMySearchEngine() {
		//â Ÿ��Ʋ
		super("* M Y * S E A R C H * E N G I N E *");
		
		//�����̳�(Ʋ) ��������
		Container cp= this.getContentPane();
		
		//Ʋ�� �гκ��̱�
		cp.add(p,"Center");
		p.setLayout(new GridLayout(2,2,15,15));
		
		//��ư����
		for (int i = 0; i < b.length; i++) {
			b[i]= new JButton(str[i]);
			p.add(b[i]);
			
			//actionlistener ����
			b[i].addActionListener(this);
		}//-	-	-	-EOfor
		
		//default color �� console���� Ȯ���ϱ�
		org=b[0].getBackground();
		System.out.println("origin: "+org);
		
		//â�ݱ�ó��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Insets getInsets()
	{
		return new Insets(40,20,20,20);
	}

	public static void main(String[] args) {
		
		SwingMySearchEngine my= new SwingMySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj= e.getSource();
		
		//�÷�Ÿ�Ժ����� ��ư���� ����ȯ �� getbackground()�־���
		Color cr= ((JButton)obj).getBackground();
		
		if(cr==org)
		{
			if(obj==b[0])
			{
				b[0].setBackground(Color.cyan);
			}
			else if(obj==b[1])
			{
				b[1].setBackground(Color.magenta);
			}
			else if(obj==b[2])
			{
				b[2].setBackground(Color.yellow);
			}
			else if(obj==b[3])
			{
				b[3].setBackground(Color.lightGray);
			}
		}
		else
		{
			((JButton)obj).setBackground(org);
		}
		
	}

}
