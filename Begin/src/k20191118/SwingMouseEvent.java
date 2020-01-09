package k20191118;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
Event Source: JPanel
Event: Container- MouseEvent (ActionEvent(N/A))
Event Handler: MouseListener

*/

public class SwingMouseEvent extends JFrame {

	int x=50, y=50;
	
	JPanel bg= new JPanel() {
		String str="나를 우클릭해";
		
		//anonymous class 생성
		@Override
		public void paint(Graphics g)
		{
			super.paint(g);
				//부모 JPanel을 불러서 부모가 해야할 작업을 다 하라고
			g.setColor(Color.blue);
			g.setFont(new Font("Dialog", Font.BOLD,22));
			g.drawString(str, x, y);
		}
	};//-	-	-	JPanel bg
	
	class MyHandler implements MouseListener
	{
		//MouseListener의 추상메소드 5개를 쓰지않아도 다 오버라이드 해야함
		@Override
		public void mouseClicked(MouseEvent e)
		{
			System.out.println("Click");
			
		}
		public void mousePressed(MouseEvent e) {
			System.out.println("Press");
			
			//마우스를 누른 지점의 xy 좌표를 얻어와서 jframe 타이틀에 씌우기
			//x좌표 y좌표 따오기
			int xx=e.getX();
			int yy=e.getY();

			System.out.println(xx+","+yy);
			String xStr=String.valueOf(xx);
			String yStr=String.valueOf(yy);
			setTitle(xStr+", "+yStr);
			
			//마우스를 누르면 문자열이 따라다니게
//			x=xx;
//			y=yy;		//xx yy 좌표를 x y에 전달
				//cf> 이러면 paint가 호출이 될때마다 전달되어 나오므로
				//	실시간으로 바뀌지는 않고 창을 내렸다 올렸을때 적용되거나 한다
				//	이때 paint()는 개발자가 호출하는 것이 아니라 JVM이 호출하는것
			
				//	따라서 개발자는 repaint()를 호출하여 JVM이 알아서 paint()를 호출하도록 해야함
				//		이때 repaint()는 JFrame이 아니라 JPanel을 다시 그리는것
//			bg.repaint();
			
			
			//오른마우스버튼을 누를때만 문자열이 따라가도록
			int mb= e.getButton();	//좌클릭1 휠클릭2 우클릭은 3
			System.out.println(mb);
			
			if(mb==MouseEvent.BUTTON3)
			{
				x=xx; y=yy;
				bg.repaint();
			}
		}
		public void mouseReleased(MouseEvent e) {
			System.out.println("Release");
		}
		public void mouseEntered(MouseEvent e) {
			bg.setBackground(Color.cyan);
		}	//마우스가 영역안에 들어왔을때
		public void mouseExited(MouseEvent e) {
			bg.setBackground(Color.white);
		}	//마우스가 영역밖으로 나갔을때
	}

	public SwingMouseEvent() {
		super("SwingMouseEvent");

		Container cp = this.getContentPane();
		cp.add(bg, "Center");
		bg.setBackground(Color.white);
		
		//add listener
		MyHandler myL= new MyHandler();
		bg.addMouseListener(myL);

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		SwingMouseEvent my = new SwingMouseEvent();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}
