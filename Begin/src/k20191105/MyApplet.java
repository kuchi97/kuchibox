package k20191105;

//Applet 클래스를 상속받아야함
//반드시 public 이어야함
//application이 아니기때문에 main()은 없음 == 독립적이지 않음
//html에 포함시켜 사용한다
//대신 내장메소드들이 존재한다
//		paint, init(), start(), stop(), destroy()...

/*
 * 		java.awt.color클래스에있는 클래스변수들을 배열에 저장하라
 * 		white제외
 * 		그리고 저장한 배열로 문자열을 출력(루프)
 */
import java.applet.Applet;
import java.awt.*;

public class MyApplet extends Applet{		//Applet을 상속받겠습니다(extends)
	
	private String str= "내가 만든 애플릿";
	private int x= 50, y= 50;
	private Color colorSet[]= {Color.cyan, Color.magenta, Color.yellow, Color.blue,
								Color.green, Color.pink, Color.red, Color.orange};
	
	public void init()
	{
		setSize(400,400);			//애플릿의 폭,높이 지정
		
	}
	public void paint(Graphics g)
	{
		Font fnt= new Font("궁서", Font.BOLD+Font.ITALIC,22);
									//서체, 스타일, 글자크기
		g.setFont(fnt);				//폰트설정
//		g.setColor(Color.cyan);
//		g.drawString(str, x, y);
//		g.setColor(Color.magenta);
//		g.drawString(str, x,y+20);
		
		for(int i=0; i<colorSet.length;i++)
		{
			int tmp= (int)(Math.random()*8);
			g.setColor(colorSet[tmp]);
			g.drawString(str,(x+=10),(y+20*i));
			
			try {
				Thread.sleep(1000);
			}catch(Exception e) {}
			
		}
		
	}
	
}
