package k20191108;

import java.applet.*;
import java.awt.*;

//flowlayout borderlayout gridlayout
public class MyBorder extends Applet{

	Button b1, b2, b3, b4, b5;
	
	@Override
	public void init()
	{
		setSize(400,400);
		setLayout(new BorderLayout(10,10));	//(hgap,vgap)
		//동 서 남 북 중앙 의 영역을 갖는 레이아웃
		//component 붙일때 영역을 지정해줘야함		안그러면 default는 중앙
		
		b1= new Button("B1");
		b2= new Button("B2");
		b3= new Button("B3");
		b4= new Button("B4");
		b5= new Button("B5");
		
		add(b1,BorderLayout.NORTH); 		//(권장)
		add(b2,BorderLayout.WEST); 
		add(b3,"East"); 
		add(b4,"South"); 
		add(b5,"Center");
		
		
	}//--EO init()
	
	
	//public Insets getInsets()		//애플릿(컨테이너)의 바깥여백을 주고자 할때
	@Override
	public Insets getInsets()
	{
		Insets i= new Insets(10,20,30,40);
		return i;
	}


}
