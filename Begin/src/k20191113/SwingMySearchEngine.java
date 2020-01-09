package k20191113;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
//JButton(이벤트소스) => ActionEvent(JVM) => ActionListener(이벤트핸들러)

public class SwingMySearchEngine extends JFrame implements ActionListener{
	
	JPanel p= new JPanel();
	JButton b[]= new JButton[4];
	String str[]= {"NAVER","GOOGLE","YAHOO","국정원"};
	//Color타입 변수하나 주고
	Color org;
	
	public SwingMySearchEngine() {
		//창 타이틀
		super("* M Y * S E A R C H * E N G I N E *");
		
		//컨테이너(틀) 가져오기
		Container cp= this.getContentPane();
		
		//틀에 패널붙이기
		cp.add(p,"Center");
		p.setLayout(new GridLayout(2,2,15,15));
		
		//버튼생성
		for (int i = 0; i < b.length; i++) {
			b[i]= new JButton(str[i]);
			p.add(b[i]);
			
			//actionlistener 부착
			b[i].addActionListener(this);
		}//-	-	-	-EOfor
		
		//default color 를 console에서 확인하기
		org=b[0].getBackground();
		System.out.println("origin: "+org);
		
		//창닫기처리
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public Insets getInsets()
	{
		return new Insets(40,20,20,20);
	}

	public static void main(String[] args) {
		
		SwingMySearchEngine my= new SwingMySearchEngine();
		my.setSize(500,500);
		my.setVisible(true);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj= e.getSource();
		
		//컬러타입변수에 버튼으로 형변환 한 getbackground()넣어줘
		Color cr= ((JButton)obj).getBackground();
		
		if(cr==org)
		{
			if(obj==b[0])
			{
				b[0].setBackground(Color.cyan);
			}
			else if(obj==b[1])
			{
				b[1].setBackground(Color.magenta);
			}
			else if(obj==b[2])
			{
				b[2].setBackground(Color.yellow);
			}
			else if(obj==b[3])
			{
				b[3].setBackground(Color.lightGray);
			}
		}
		else
		{
			((JButton)obj).setBackground(org);
		}
		
	}

}
