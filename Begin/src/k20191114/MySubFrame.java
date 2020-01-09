package k20191114;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MySubFrame extends JFrame implements ActionListener{

	JPanel bg;
	JTextArea ta;
	JButton close;

	public MySubFrame() {
		super("MySubFrame");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		cp.add(ta= new JTextArea(), "Center");
		cp.add(close= new JButton("CLOSE"),"South");
		bg.setBackground(Color.white);
		
		close.addActionListener(this);

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		MySubFrame my = new MySubFrame();
		my.setSize(400, 400);
		my.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		if(obj==close)
		{
			this.setVisible(false);
		}
		
	}

}