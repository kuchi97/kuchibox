package k20191107;

import java.applet.*;
import java.awt.*;

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

public class MyFlow extends Applet{
	Button b1, b2, b3, b4, b5, b6, b7, b8;
	
	
	
	@Override
	public void init()
	{
		setSize(400,400);
		
		//layout �ٲٱ�
		//BorderLayout border= new BorderLayout();
		//GridLayout border= new GridLayout(4,1);
		//setLayout(border);
		
		//��. flowlayout���� �����ϵ� �������ĵǵ���
		FlowLayout fw= new FlowLayout(FlowLayout.RIGHT,30,30);
		setLayout(fw);
		
		
		b1=new Button("B1");
		b2=new Button("B2");
		b3=new Button("B3");
		b4=new Button("B4");
		b5=new Button("B5");
		b6=new Button("B6");
		b7=new Button("B7");
		b8=new Button("B8");
		
		add(b1); add(b2); add(b3); add(b4);
		add(b5); add(b6); add(b7); add(b8);
	}//--EO init()
}
