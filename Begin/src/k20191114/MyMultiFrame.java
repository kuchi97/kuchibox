package k20191114;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;

public class MyMultiFrame extends JFrame implements ActionListener{

	JTextField tf;
	JButton open, close;
	JTextArea ta;
	JPanel bg;

	public MyMultiFrame() {
		super("MyMultiFrame");

		//bglayout
		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		cp.add(tf= new JTextField(),"North");
		cp.add(open= new JButton("OPEN"), "South");
		bg.setBackground(Color.white);
		
		open.addActionListener(this);

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MyMultiFrame my = new MyMultiFrame();

		my.setSize(400, 400);
		my.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		if(obj==open)
		{
			System.out.println("ok");

			MySubFrame sub= new MySubFrame();
			sub.setSize(300,300);
			sub.setVisible(true);
		}

	}

}