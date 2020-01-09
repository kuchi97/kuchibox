package k20191119;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// 이벤트핸들러를 외부클래스로 별도로 만들기
class MyHandler extends MouseMotionAdapter{
	
	//인자생성자를 구성하여 이벤트소스를 갖는 객체를 매개변수로 받는다
	MyMouseEvent3 mainF;
	public MyHandler(MyMouseEvent3 me)
	{
		mainF=me;
	}
	
	@Override
	public void mouseDragged(MouseEvent e)
	{
		//마우스드래그지점의 x,y좌표 알아내서 
		//can에 적용되도록
		int xx=e.getX();
		int yy=e.getY();
		mainF.x=xx;
		mainF.y=yy;
		mainF.can.repaint();
		/*
		repaint는 그전 그림을 지우고 새 그림을 그림
			그전그림을 지워주는것이 update()메소드임
			그래서 update()를 오버라이딩하면 지워지지않고 남길수있어
		*/
		
		System.out.println(xx+","+yy);
	}
}


public class MyMouseEvent3 extends JFrame {

	int x=30, y=50;

	JPanel bg;
	Canvas can= new Canvas() {
		
		//public void update(Graphics g)
		public void update(Graphics g)
		{
			//1. 기존그림을 지움: 이걸 못하게하고
			//2. paint(g)호출
			paint(g);
		}
		public void paint(Graphics g)
		{
			g.drawOval(x, y, 2, 2);
		}
	};

	public MyMouseEvent3() {
		super("MyMouseEvent3");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(), "Center");
		bg.add(can);
		can.setLocation(200,100);
		can.setSize(200,200);
		can.setBackground(Color.white);
		
		//addlistener
		MyHandler mh= new MyHandler(this);		//외부클래스로 만들었을때 매개변수 this
		can.addMouseMotionListener(mh);

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		MyMouseEvent3 my = new MyMouseEvent3();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}