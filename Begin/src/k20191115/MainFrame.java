package k20191115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

	

	JPanel bg= new JPanel(new BorderLayout());
	JTextArea ta;
	JButton open;

	public MainFrame() {
		super("MainFrame");

		Container cp = this.getContentPane();
		cp.add(bg, "Center");
		bg.setBackground(Color.white);
		
		ta= new MyJTextArea();
		bg.add(new JScrollPane(ta),"Center");
		
		open= new JButton("Open");
		open.setMnemonic('O');
		bg.add(open,"South");
		
		ta.setFont(new Font("Dialog", Font.BOLD,22));
		
		//������ ���̱�
		//�̳�Ŭ������ �׼Ǹ����ʰ� �����ϱ� �����;���
		MyHandler my= new MyHandler();
		open.addActionListener(my);
			//open.addActionListener(new MyHandler());
			

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//-	-	-	- construct
	
	
	//innerClass�� �̺�Ʈ�ڵ鷯 ����
	class MyHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object obj= new Object();
			obj=e.getSource();
			
			if(obj==open)
			{
				//SubFrame �����Ҷ� MainFrame�� �ڱ������� �����ڿ� �����ϱ�
				SubFrame sub= new SubFrame(MainFrame.this);		//���⼭ this�� myhandler��
				sub.pack();
				//���������� ������ġ
				sub.setLocation(400, 0);
				
//				Color c= new Color(sub.red,sub.green,sub.blue);
//				ta.setForeground(c);
								
				sub.setVisible(true);
				sub.setResizable(false);
			}
		}
	}
	
	//JTextArea�� ����̹��� �ֱ�
	//inner
	class MyJTextArea extends JTextArea
	{
		ImageIcon icon= new ImageIcon("./images/joker.png");
		
		@Override
		public void paint(Graphics g)
		{
			this.setOpaque(false);
			//�̹��������� ��ü�� ������
			Image bgImg=icon.getImage();
			
			g.drawImage(bgImg,0,0,this.getWidth(),this.getHeight(),bg);
			//abstract boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver obs)
			
			super.paint(g);
			
			
		}
		
	}//- - - EO.mainframe.myjtextarea
	
	public static void main(String[] args) {
		MainFrame my = new MainFrame();

		my.setSize(400, 400);
		my.setVisible(true);
		my.setResizable(false);

	}

}