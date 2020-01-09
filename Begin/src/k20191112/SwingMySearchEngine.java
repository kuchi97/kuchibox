package k20191112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SwingMySearchEngine extends JFrame implements ActionListener{
	
	MyJPanel p= new MyJPanel(10,10,10,10);
	JButton b1, b2, b3, b4;
	
	//constructor
	public SwingMySearchEngine()
	{
		super("::���̽�ġ����::");		//title
		
		b1= new JButton("NAVER");
		b2= new JButton("NAMU");
		b3= new JButton("DAUM");
		b4= new JButton("GOOGLE");
		
		//������
		Container cp= this.getContentPane();
		cp.add(p,"Center");
		p.setLayout(new GridLayout(2,2,20,20));
		p.setBackground(Color.white);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//������ ����
		//�̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�ڵ鷯 ��ü)
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		//â�ݱ�ó��
		//â�ݱ�ó���� �����ϸ� ������ ������ ���ּ���
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------EOconstructor
	
	//��ư�׼�- ������ ���ְ���
	//override
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//�̺�Ʈ�ҽ��� ���� ������ ����
		Object obj= e.getSource();
		
//		boolean swt1= false;
//		boolean swt2= false;
//		boolean swt3= false;
//		boolean swt4= false;
		

		if(obj==b1)
		{
			if(b1.getBackground()==Color.green)
			{
				b1.setBackground(getBackground());
			}
			else
			{
				b1.setBackground(Color.green);
			}
		}
		else if(obj==b2)
		{
			if(b2.getBackground()==Color.lightGray)
			{
				b2.setBackground(getBackground());
			}
			else
			{
				b2.setBackground(Color.lightGray);
			}
		}
		
		else if(obj==b3)
		{
			if(b3.getBackground()==Color.yellow)
			{
				b3.setBackground(getBackground());
			}
			else
			{
				b3.setBackground(Color.yellow);
			}
		}
		
		else if(obj==b4)
		{
			if(b4.getBackground()==Color.magenta)
			{
				b4.setBackground(getBackground());
			}
			else
			{
				b4.setBackground(Color.magenta);
			}
		}

	}
	@Override
	public Color getBackground()
	{
		return super.getBackground();
	}

	public static void main(String[] args)
	{
		SwingMySearchEngine my= new SwingMySearchEngine();
		my.setVisible(true);
		my.setSize(500,500);
	}

}
