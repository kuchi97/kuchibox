package k20191108;
import java.applet.*;
import java.awt.*;

public class MyAppletTest extends Applet{

	Button b[]= new Button[6];
	Panel p1, p2;
	MyPanel my= new MyPanel();
	
	public void init()
	{
		setSize(500,500);
		setLayout(new BorderLayout());
		
		//button init
		for (int i = 0; i < b.length; i++) {
			b[i]= new Button("B"+(i+1));
		}
		
		//panel init
		//오버라이딩한 .MyPanel을 적용시키기 
		p1= new MyPanel(30,15,30,15);
		p2= new MyPanel();

		add(p1,BorderLayout.CENTER);
		add(p2,BorderLayout.SOUTH);
		
		
		//panel bgsetting
		p1.setLayout(new GridLayout(2,2,10,10));	//상단
		p2.setLayout(new GridLayout(2,1,20,20));	//하단
		p1.setBackground(Color.green);
		p2.setBackground(Color.blue);

		//add button
		for (int i = 0; i < 4; i++) {
			p1.add(b[i]);
		}
		p2.add(b[4]);
		p2.add(b[5]);

	}
	
//	public Insets getInsets()
//	{
//		Insets i= new Insets(30,30,30,30);
//		return i;
//	}
	
}
