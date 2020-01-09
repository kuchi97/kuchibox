package k20191108;

/*
Component ------ Button, Label, TextField...
	|
	+----Container
			|
			+-----Window-----Frame, Dialog
			+-----Panel-----Applet
			
			- Window 계열의 기본 레이아웃 ==> BorderLayout
			- Panel 계열의 기본 레이아웃 ==> FlowLayout
			
java가 가진 layout 종류
*/

import java.applet.*;
import java.awt.*;

public class MyGrid extends Applet{

	Button b[]= new Button[5];
	Panel p;
		
	@Override
	public void init()
	{
		setSize(400,400);
		setLayout(new GridLayout(2,3,10,10));		//public GridLayout(rows, cols, hgap, vgap)
		
		for (int i = 0; i < b.length; i++) {
			b[i]= new Button("B"+(i+1));
			add(b[i]);
		}//EOfor

		Panel p= new Panel();					//container 이면서 component 역할도 함
		add(p);
		p.setBackground(Color.orange);
		p.add(new Button("OK"));
		p.add(new Button("Cancel"));
		
		//2행1열 그리드레이아웃으로 p의 레이아웃 변경
		p.setLayout(new GridLayout(2,1,3,3));
		
	}//--EOinit()
	
	
	
	
	@Override
	public Insets getInsets()
	{
		Insets i= new Insets(20,20,20,20);
		return i;
	}//--EO.getInsets
}
