package k20191115;

import javax.swing.*;
import javax.swing.border.*;

import k20191115.MainFrame.MyHandler;

import java.awt.*;
import java.awt.event.*;

public class SubFrame extends JFrame {

	JPanel bg;
	Canvas can;				//도화지 component
	JButton close;
	JLabel lb;
	
	int red= (int)(Math.random()*255);
	int green= (int)(Math.random()*255);
	int blue= (int)(Math.random()*255);
	
	MainFrame main;
	
	//.mainframe에서 this로 넘긴애를 받아
	public SubFrame(MainFrame mf) {
		super("SubFrame");
		main= mf;			//.MainFrame의 정보를 전달하는녀석

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.setBackground(Color.white);
		can= new Canvas();			//사이즈와 배경색 설정해야 확인가능
		bg.add(can);
		can.setSize(100,100);
		
		//랜덤하게 rgb값 구하기
		Color c= new Color(red,green,blue);
		can.setBackground(c);
		
		lb= new JLabel("rgb: "+red+","+green+","+blue);
		bg.add(lb);
		lb.setBorder(new EtchedBorder(EtchedBorder.RAISED));
		
		close= new JButton("close");
		cp.add(close,"South");
		close.setMnemonic('C');			//alt+c
		
		close.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//subframe 닫기	-지금은 subframe의 actionlistener 클래스임
				SubFrame.this.dispose();
				//sub 닫을때 mainframe ta글자색 캔버스색으로
				main.ta.setForeground(c);
			}
		});
		
		//창닫기설정
		//서브프레임일때는 dispose on close		- 나중에 가비지컬렉터가 쓸어감
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

//	public static void main(String[] args) {
//		SubFrame my = new SubFrame();
//
//		my.pack();				//컴포넌트들의 기본사이즈로 압축
//		//my.setSize(300, 300);
//		my.setVisible(true);
//
//	}

}