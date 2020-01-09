package k20191112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
container
	+--- Window --- JFrame, JDialog (default: borderlayout) >> �������� �������α׷� ���鶧
	|
	+--- Panel ---- Applet >> �񵶸�����(�ַ� �������� ���Խ��Ѽ�) ���α׷�

*/

/*
awt �̺�Ʈ ó��

1. �̺�Ʈ�ҽ� event source
	: �̺�Ʈ�� �߻��� �ൿ
		�ַ� component, container��
	ex> JButton, JChectBox, JTextField..

2. �̺�Ʈ
	: event source���� �߻��Ǵ� �̺�Ʈ�� �޶���
		JVM�� �߻���Ų��
	ex> JButton >> action event
		JCheckBox >> item event
		JPanel	>> mouse event
	
3. �̺�Ʈ ó���� event handler
	: �̺�Ʈ�� ó�����ִ� 'Ŭ����'


= action event
	1. XXXListener �������̽��� ��ӹ޾� �����Ѵ�
		* �������̽�?
			- �߻�޼ҵ�θ� �̷���� �װ� ����Ѱ� �װ�
			ex> ActionListener, ItemListener, MouseListener...
			
	2. �߻�޼ҵ带 �������̵��Ѵ�
	3. �̺�Ʈ�ҽ��� addXXXListener() �޼ҵ带 �̿��Ͽ� ������ ����
	4. �������� �߻�޼ҵ� �ٵ� �̺�Ʈó�� �ڵ带 ����
	
	
= event handler �������
	1. �̺�Ʈ�ҽ��� ���� Ŭ������ �ڵ鷯�� �Ǵ¹��
	2. inner class�� �����ϴ� ���
	3. ������ �ܺ� class�� �����ϴ� ���

*/

public class SwingMyGuiApp extends JFrame implements ActionListener{
	
	JButton b1, b2, b3, b4;
	JPanel p;

	// applet�� init()������ �����ڰ� �Ѵ�
	//constructor
	public SwingMyGuiApp()
	{
		super("::MyGuiApp::");					//public JFrame(String title)
		
		Container cp= this.getContentPane();	//default: borderlayout
		//component�� �ٷ� �����̰� container�� �ϳ� �ҷ��ͼ� �ھ������
		
		ImageIcon icon1= new ImageIcon("./images/red.png");
		ImageIcon icon2= new ImageIcon("./images/green.png");
		ImageIcon icon3= new ImageIcon("./images/blue.png");
		ImageIcon icon4= new ImageIcon("./images/jokericon.png");
		
		p= new JPanel();						//default: flowlayout
		b1= new JButton("Red", icon1);
		b2= new JButton("Green", icon2);
		b3= new JButton("Blue", icon3);
		b4= new JButton("Joker", icon4);
		
		p.setBackground(Color.orange);
		cp.add(p,"Center");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//������ ����
		//�̺�Ʈ�ҽ�.addXXXListener(�̺�Ʈ�ڵ鷯 ��ü)
		b1.addActionListener(this);				//������ �ȿ��� �ڱ��ڽ��� �����Ϸ���
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		//â�ݱ� ó�� (frame�� ���� console���� ��� ����Ǹ� �޸� ��Ƹ԰�����)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.DISPOSE_ON_CLOSE (default)
		//JFrame.DO_NOTHING_ON_CLOSE (â�ݱ� ���ϰ������)
		
	}//----EOconstructor
	
	//method override
	@Override
	public void actionPerformed(ActionEvent e)				//for ActionListener
	{
		//�̺�Ʈ�ҽ��� ���� �������
		Object obj= e.getSource();
		
		//�̺�Ʈ�ҽ��� ���� �� ���ڿ����� ��ȯ
		String cmd= e.getActionCommand();
		this.setTitle(cmd+"��ư�� ��������");		//[��ư�̸�]+"String" �� ��ȯ��
		
		
		if(obj==b1)
		{
			p.setBackground(Color.red);	
		}
		else if(obj==b2)
		{
			p.setBackground(Color.green);	
		}
		else if(obj==b3)
		{
			p.setBackground(Color.blue);
		}
			
	}//-----EOactionPerformed()
	public static void main(String[] args)
	{
		SwingMyGuiApp gui= new SwingMyGuiApp();
		gui.setVisible(true);
		
		gui.setSize(500,500);
		//Window�迭�� container�� **�ݵ�� setVisible(true)�� ȣ��**�ؾ��Ѵ�(ȭ��Ȯ��)
	}
}
