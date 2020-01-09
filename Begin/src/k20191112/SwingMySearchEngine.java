package k20191112;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class SwingMySearchEngine extends JFrame implements ActionListener{
	
	MyJPanel p= new MyJPanel(10,10,10,10);
	JButton b1, b2, b3, b4;
	
	//constructor
	public SwingMySearchEngine()
	{
		super("::마이써치엔진::");		//title
		
		b1= new JButton("NAVER");
		b2= new JButton("NAMU");
		b3= new JButton("DAUM");
		b4= new JButton("GOOGLE");
		
		//배경부착
		Container cp= this.getContentPane();
		cp.add(p,"Center");
		p.setLayout(new GridLayout(2,2,20,20));
		p.setBackground(Color.white);
		
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		
		//리스너 부착
		//이벤트소스.addXXXListener(이벤트핸들러 객체)
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		
		//창닫기처리
		//창닫기처리는 가능하면 생성자 끝에서 해주세여
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//------EOconstructor
	
	//버튼액션- 누르면 색넣고빼기
	//override
	@Override
	public void actionPerformed(ActionEvent e)
	{
		//이벤트소스에 대한 정보를 얻어요
		Object obj= e.getSource();
		
//		boolean swt1= false;
//		boolean swt2= false;
//		boolean swt3= false;
//		boolean swt4= false;
		

		if(obj==b1)
		{
			if(b1.getBackground()==Color.green)
			{
				b1.setBackground(getBackground());
			}
			else
			{
				b1.setBackground(Color.green);
			}
		}
		else if(obj==b2)
		{
			if(b2.getBackground()==Color.lightGray)
			{
				b2.setBackground(getBackground());
			}
			else
			{
				b2.setBackground(Color.lightGray);
			}
		}
		
		else if(obj==b3)
		{
			if(b3.getBackground()==Color.yellow)
			{
				b3.setBackground(getBackground());
			}
			else
			{
				b3.setBackground(Color.yellow);
			}
		}
		
		else if(obj==b4)
		{
			if(b4.getBackground()==Color.magenta)
			{
				b4.setBackground(getBackground());
			}
			else
			{
				b4.setBackground(Color.magenta);
			}
		}

	}
	@Override
	public Color getBackground()
	{
		return super.getBackground();
	}

	public static void main(String[] args)
	{
		SwingMySearchEngine my= new SwingMySearchEngine();
		my.setVisible(true);
		my.setSize(500,500);
	}

}
