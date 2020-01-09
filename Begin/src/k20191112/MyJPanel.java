package k20191112;
import java.awt.*;

//getInsets 메소드를 패널에다 오버라이딩하기
public class MyJPanel extends Panel{

	int top, left, right, bottom;
	
	public MyJPanel()
	{
		this(10,10,10,10);
	}
	
	public MyJPanel(int top, int left, int bottom, int right)
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
