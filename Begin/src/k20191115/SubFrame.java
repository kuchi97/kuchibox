package k20191115;

import javax.swing.*;
import javax.swing.border.*;

import k20191115.MainFrame.MyHandler;

import java.awt.*;
import java.awt.event.*;

public class SubFrame extends JFrame {

	JPanel bg;
	Canvas can;				//��ȭ�� component
	JButton close;
	JLabel lb;
	
	int red= (int)(Math.random()*255);
	int green= (int)(Math.random()*255);
	int blue= (int)(Math.random()*255);
	
	MainFrame main;
	
	//.mainframe���� this�� �ѱ�ָ� �޾�
	public SubFrame(MainFrame mf) {
		super("SubFrame");
		main= mf;			//.MainFrame�� ������ �����ϴ³༮

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.setBackground(Color.white);
		can= new Canvas();			//������� ���� �����ؾ� Ȯ�ΰ���
		bg.add(can);
		can.setSize(100,100);
		
		//�����ϰ� rgb�� ���ϱ�
		Color c= new Color(red,green,blue);
		can.setBackground(c);
		
		lb= new JLabel("rgb: "+red+","+green+","+blue);
		bg.add(lb);
		lb.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		
		close= new JButton("close");
		cp.add(close,"South");
		close.setMnemonic('C');			//alt+c
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//subframe �ݱ�	-������ subframe�� actionlistener Ŭ������
				SubFrame.this.dispose();
				//sub ������ mainframe ta���ڻ� ĵ����������
				main.ta.setForeground(c);
			}
		});
		
		//â�ݱ⼳��
		//�����������϶��� dispose on close		- ���߿� �������÷��Ͱ� ���
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

//	public static void main(String[] args) {
//		SubFrame my = new SubFrame();
//
//		my.pack();				//������Ʈ���� �⺻������� ����
//		//my.setSize(300, 300);
//		my.setVisible(true);
//
//	}

}