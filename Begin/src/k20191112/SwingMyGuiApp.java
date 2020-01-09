package k20191112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
container
	+--- Window --- JFrame, JDialog (default: borderlayout) >> 독립적인 실행프로그램 만들때
	|
	+--- Panel ---- Applet >> 비독립적인(주로 웹문서에 포함시켜서) 프로그램

*/

/*
awt 이벤트 처리

1. 이벤트소스 event source
	: 이벤트가 발생된 행동
		주로 component, container들
	ex> JButton, JChectBox, JTextField..

2. 이벤트
	: event source마다 발생되는 이벤트가 달라져
		JVM이 발생시킨다
	ex> JButton >> action event
		JCheckBox >> item event
		JPanel	>> mouse event
	
3. 이벤트 처리자 event handler
	: 이벤트를 처리해주는 '클래스'


= action event
	1. XXXListener 인터페이스를 상속받아 구현한다
		* 인터페이스?
			- 추상메소드로만 이루어진 그거 비슷한거 그거
			ex> ActionListener, ItemListener, MouseListener...
			
	2. 추상메소드를 오버라이딩한다
	3. 이벤트소스에 addXXXListener() 메소드를 이용하여 센서를 부착
	4. 재정의한 추상메소드 바디에 이벤트처리 코드를 구현
	
	
= event handler 구성방법
	1. 이벤트소스를 가진 클래스가 핸들러가 되는방법
	2. inner class로 구성하는 방법
	3. 별도의 외부 class로 구성하는 방법

*/

public class SwingMyGuiApp extends JFrame implements ActionListener{
	
	JButton b1, b2, b3, b4;
	JPanel p;

	// applet의 init()역할은 생성자가 한다
	//constructor
	public SwingMyGuiApp()
	{
		super("::MyGuiApp::");					//public JFrame(String title)
		
		Container cp= this.getContentPane();	//default: borderlayout
		//component를 바로 못붙이고 container를 하나 불러와서 박아줘야함
		
		ImageIcon icon1= new ImageIcon("./images/red.png");
		ImageIcon icon2= new ImageIcon("./images/green.png");
		ImageIcon icon3= new ImageIcon("./images/blue.png");
		ImageIcon icon4= new ImageIcon("./images/jokericon.png");
		
		p= new JPanel();						//default: flowlayout
		b1= new JButton("Red", icon1);
		b2= new JButton("Green", icon2);
		b3= new JButton("Blue", icon3);
		b4= new JButton("Joker", icon4);
		
		p.setBackground(Color.orange);
		cp.add(p,"Center");
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//리스너 부착
		//이벤트소스.addXXXListener(이벤트핸들러 객체)
		b1.addActionListener(this);				//생성자 안에서 자기자신을 참조하려함
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		//창닫기 처리 (frame을 꺼도 console에서 계속 실행되며 메모리 잡아먹고있음)
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//JFrame.DISPOSE_ON_CLOSE (default)
		//JFrame.DO_NOTHING_ON_CLOSE (창닫기 안하고싶을때)
		
	}//----EOconstructor
	
	//method override
	@Override
	public void actionPerformed(ActionEvent e)				//for ActionListener
	{
		//이벤트소스에 대한 정보얻기
		Object obj= e.getSource();
		
		//이벤트소스가 가진 라벨 문자열값을 반환
		String cmd= e.getActionCommand();
		this.setTitle(cmd+"버튼을 눌렀구나");		//[버튼이름]+"String" 이 반환됨
		
		
		if(obj==b1)
		{
			p.setBackground(Color.red);	
		}
		else if(obj==b2)
		{
			p.setBackground(Color.green);	
		}
		else if(obj==b3)
		{
			p.setBackground(Color.blue);
		}
			
	}//-----EOactionPerformed()
	public static void main(String[] args)
	{
		SwingMyGuiApp gui= new SwingMyGuiApp();
		gui.setVisible(true);
		
		gui.setSize(500,500);
		//Window계열의 container는 **반드시 setVisible(true)를 호출**해야한다(화면확인)
	}
}
