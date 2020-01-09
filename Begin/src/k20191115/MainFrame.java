package k20191115;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MainFrame extends JFrame {

	

	JPanel bg= new JPanel(new BorderLayout());
	JTextArea ta;
	JButton open;

	public MainFrame() {
		super("MainFrame");

		Container cp = this.getContentPane();
		cp.add(bg, "Center");
		bg.setBackground(Color.white);
		
		ta= new MyJTextArea();
		bg.add(new JScrollPane(ta),"Center");
		
		open= new JButton("Open");
		open.setMnemonic('O');
		bg.add(open,"South");
		
		ta.setFont(new Font("Dialog", Font.BOLD,22));
		
		//리스너 붙이기
		//이너클래스에 액션리스너가 있으니까 꺼내와야함
		MyHandler my= new MyHandler();
		open.addActionListener(my);
			//open.addActionListener(new MyHandler());
			

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}//-	-	-	- construct
	
	
	//innerClass로 이벤트핸들러 생성
	class MyHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			Object obj= new Object();
			obj=e.getSource();
			
			if(obj==open)
			{
				//SubFrame 생성할때 MainFrame의 자기정보를 생성자에 전달하기
				SubFrame sub= new SubFrame(MainFrame.this);		//여기서 this는 myhandler임
				sub.pack();
				//서브프레임 출현위치
				sub.setLocation(400, 0);
				
//				Color c= new Color(sub.red,sub.green,sub.blue);
//				ta.setForeground(c);
								
				sub.setVisible(true);
				sub.setResizable(false);
			}
		}
	}
	
	//JTextArea에 배경이미지 주기
	//inner
	class MyJTextArea extends JTextArea
	{
		ImageIcon icon= new ImageIcon("./images/joker.png");
		
		@Override
		public void paint(Graphics g)
		{
			this.setOpaque(false);
			//이미지파일을 객체로 가져옴
			Image bgImg=icon.getImage();
			
			g.drawImage(bgImg,0,0,this.getWidth(),this.getHeight(),bg);
			//abstract boolean drawImage(Image img, int x, int y, Color bgcolor, ImageObserver obs)
			
			super.paint(g);
			
			
		}
		
	}//- - - EO.mainframe.myjtextarea
	
	public static void main(String[] args) {
		MainFrame my = new MainFrame();

		my.setSize(400, 400);
		my.setVisible(true);
		my.setResizable(false);

	}

}