import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class PracticeAnySwing extends JFrame {

	JPanel bg;
	JLabel lb[]= new JLabel[9];

	public PracticeAnySwing() {
		super("PracticeAnySwing");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(new GridLayout(3,3)));
		bg.setBackground(Color.white);
		
		for(int i=0; i<lb.length; i++)
		{
//			bg.add(lb[i]);
			lb[i].setText(""+i);
		}

		//Ã¢´Ý±â¼³Á¤
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		PracticeAnySwing my = new PracticeAnySwing();

		my.setSize(400, 400);
		my.setVisible(true);
		
	}
	

}
