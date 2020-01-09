package k20191108;
import java.applet.*;
import java.awt.*;

public class MyAppletTest2 extends Applet{

	Label email, refer;
	TextField emailField, referField;
	TextArea body;
	Button send, rewrite;
	
	Panel emailPane, referPane, topPane, bottomPane, mainPane;
	
	public void init()
	{
		setSize(400,300);
		setLayout(new BorderLayout());				//애플릿 레이아웃
		
		//inits
		email= new Label("Email:        ",Label.LEFT);
		refer= new Label("Reference:",Label.LEFT);
		emailField= new TextField(30);
		referField= new TextField(30);
		body= new TextArea(20,30);
		send= new Button("Send");
		rewrite= new Button("Rewrite");
		topPane= new Panel();
		bottomPane= new Panel();
		emailPane= new Panel();
		referPane= new Panel();
		
		//paneColorset
//		emailPane.setBackground(Color.red);
//		referPane.setBackground(Color.blue);
//		topPane.setBackground(Color.black);
//		bottomPane.setBackground(Color.green);
		
		
		//bgsetting
		topPane.setLayout(new GridLayout(2,1));		//상단부 2줄
		emailPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		referPane.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		topPane.add(emailPane);
		topPane.add(referPane);
		emailPane.add(email);
		emailPane.add(emailField);
		referPane.add(refer);
		referPane.add(referField);
		bottomPane.add(send);
		bottomPane.add(rewrite);
		
		add(topPane, BorderLayout.NORTH);
		add(bottomPane, BorderLayout.SOUTH);
		add(body, BorderLayout.CENTER);

	}
	
	@Override
	public Insets getInsets()
	{
		Insets i= new Insets(10,10,10,10);
		return i;
	}
}
