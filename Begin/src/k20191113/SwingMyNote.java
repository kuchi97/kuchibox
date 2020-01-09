package k20191113;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingMyNote extends JFrame implements ActionListener{

	JPanel bg;
	
	JMenuBar bar;
	JMenu menuFile, menuColor, fontColor;
	JMenuItem itemOpen, itemSave, itemNew, itemExit,
				itemYellow, itemGray, itemRed, itemBlue;
	
	JTextArea ta;
	MyTextArea ma;
	JScrollPane sp;
	JLabel lb;

	public SwingMyNote() {
		super("SwingMyNote");

		Container cp = this.getContentPane();
//		cp.add(bg = new JPanel(), "Center");
//		bg.setBackground(Color.white);
		
		//�޴��� ����/����
		bar= new JMenuBar();
		setJMenuBar(bar);			//add�ƴϰ� setJMenuBar
		
		//�޴������ؼ� �޴��ٿ� ����
		menuFile= new JMenu("File");
		menuColor= new JMenu("Color");
		bar.add(menuFile);
		bar.add(menuColor);
				
		//�޴��� �޴������� ����
		//���ϸ޴�
		itemNew= new JMenuItem("New",new ImageIcon("./images/new.png"));
		itemOpen= new JMenuItem("Open",'O');
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(itemSave= new JMenuItem("Save",'S'));
		//���м��߱�
		menuFile.addSeparator();
		menuFile.add(itemExit= new JMenuItem("Exit",'X'));
		
		//�޴��� �޴��� ���̸� ����޴��� �ȴ�
		JMenu subMenu= new JMenu("SubMenu");
		menuFile.add(subMenu);
		subMenu.add(new JMenuItem("menu1"));
		subMenu.add(new JMenuItem("menu2"));
		subMenu.add(new JMenuItem("menu3"));
		
		//�÷��޴�
		itemYellow= new JMenuItem("���");
		itemGray= new JMenuItem("ȸ��");
		itemRed= new JMenuItem("����");
		itemBlue= new JMenuItem("�Ķ�");
		fontColor= new JMenu("���ڻ�");
		menuColor.add(itemYellow);
		menuColor.add(itemGray);
		//�÷������޴�
		menuColor.add(fontColor);
		fontColor.add(itemRed);
		fontColor.add(itemBlue);
		
		
		
		
		//textarea����
		//swing������ textarea ��ũ�ѹٰ� �Ȼ��ܿ�
		//�׷��� ��ũ�ѹ� ����� �ִ� �г��� JScrollPane�� ��Ƽ� �ٿ�����
		ta= new JTextArea();
		sp= new JScrollPane(ta);
		cp.add(sp,"Center");
		
		//�󺧻��� �ϴܺ���
		lb= new JLabel("���� 2�����̴�");
		cp.add(lb,"South");
		//�󺧿� �������̱�
		//�׳��� �ȵǰ� ���İ� �������� �Կ�����
		lb.setOpaque(true);					//opaque true �����ϰ� �آa
		lb.setBackground(Color.white);
		
		//�׼Ǹ����� ����
		itemYellow.addActionListener(this);
		itemGray.addActionListener(this);
		itemRed.addActionListener(this);
		itemBlue.addActionListener(this);

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj= e.getSource();
		
		//��������� ������� ȸ���� ȸ��
		//����/�Ķ� ������ ���ڻ� �Ķ�
		if(obj==itemYellow)
		{
			ta.setBackground(Color.yellow);
		}
		else if(obj==itemGray)
		{
			ta.setBackground(Color.lightGray);
		}
		else if(obj==itemRed)
		{
			ta.setForeground(Color.red);
		}
		else if(obj==itemBlue)
		{
			ta.setForeground(Color.blue);
		}
	}

	public static void main(String[] args) {
		SwingMyNote my = new SwingMyNote();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}
