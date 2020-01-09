package k20191113;

import java.awt.Color;
import javax.swing.JTextArea;

public class MyTextArea extends JTextArea {

		Color c;
	
	public MyTextArea() {
		
	}
	public MyTextArea(Color c)
	{
		this.setBackground(c);
		this.setDisabledTextColor(c);
	}

}
