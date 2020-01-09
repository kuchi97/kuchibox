package k20191108;

/*
Component ------ Button, Label, TextField...
	|
	+----Container
			|
			+-----Window-----Frame, Dialog
			+-----Panel-----Applet
			
			- Window �迭�� �⺻ ���̾ƿ� ==> BorderLayout
			- Panel �迭�� �⺻ ���̾ƿ� ==> FlowLayout
			
java�� ���� layout ����
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

		Panel p= new Panel();					//container �̸鼭 component ���ҵ� ��
		add(p);
		p.setBackground(Color.orange);
		p.add(new Button("OK"));
		p.add(new Button("Cancel"));
		
		//2��1�� �׸��巹�̾ƿ����� p�� ���̾ƿ� ����
		p.setLayout(new GridLayout(2,1,3,3));
		
	}//--EOinit()
	
	
	
	
	@Override
	public Insets getInsets()
	{
		Insets i= new Insets(20,20,20,20);
		return i;
	}//--EO.getInsets
}
