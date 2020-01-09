package k20191108;
import java.awt.*;

//getInsets 메소드를 패널에다 오버라이딩하기
public class MyPanel extends Panel{

	int top, left, right, bottom;
	
	public MyPanel()
	{
		this(10,10,10,10);
	}
	
	public MyPanel(int top, int left, int bottom, int right)
	{
		this.top=top;
		this.bottom=bottom;
		this.left=left;
		this.right=right;
	}
	
	@Override
	public Insets getInsets()
	{
		Insets i= new Insets(top,left,bottom,right);
		return i;
	}
}
