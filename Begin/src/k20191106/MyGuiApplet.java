package k20191106;

import java.applet.Applet;
import java.awt.*;
//awt= Abstract Window Toolkit ==> 운영체제 영향을 받는다
//swing: 운영체제 영향없음

//애플릿은 반드시 public class이어야함
public class MyGuiApplet extends Applet{

	Button b1, b2, b3;			//component(부품)
								//   <--> container(==platform) ex> applet, frame, panel...
	TextField tf1, tf2;
	Label lb1, lb2, lb3;
	TextArea ta1, ta2, ta3;
	Checkbox c1, c2, c3, m, f;
	public void init()
	{
		//딱 한번 호출되는 메소드
		
		this.setSize(500,500);			//애플릿의 폭과 높이지정
		System.out.println("init()");
		
		b1= new Button();
		b2= new Button("HOME");
		b3= new Button("JOIN");
		b1.setLabel("문자열을 다시설정");
		this.add(b1);
		this.add(b2);
		add(b3);
		
		//b1 b2 b3 배경색 설정 setBackground();
		b1.setBackground(Color.cyan);
		b2.setBackground(Color.magenta);
		b3.setBackground(Color.yellow);
		
		//글자색설정 setForeground();
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		//애플릿배경 lightGray로
		setBackground(Color.lightGray);
		
		//TextField test
		tf1= new TextField(10);
		tf2= new TextField("Hello",20);
		add(tf1);
		add(tf2);
		
		//lb1 2 3 생성해서 붙이기 모두 배경색주기
		lb1= new Label("아이디",Label.LEFT);			//label(string, int align) align 0= 왼쪽/ 1= 가운데/ 2= 오른쪽		근데사실 처음보면 int가 무슨 align값인지 모름
		lb2= new Label("비밀번호",Label.CENTER);		//api에서 constructor summary에서 이해안되는게 있으면 field summary 가서 봐
		lb3= new Label("이메일",Label.RIGHT);
		
		lb1.setBackground(Color.red);
		lb2.setBackground(Color.green);
		lb3.setBackground(Color.yellow);
		
		add(lb1);
		add(lb2);
		add(lb3);
		
		//textarea ta1 2 3생성해서 붙이되
		//ta3은 스크롤바가 수직에만 붙도록 생성
		
		ta1= new TextArea();
		ta2= new TextArea(5,10);
		ta3= new TextArea("Hello World",10,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		ta1.setText("TextArea1");
		
		add(ta1);
		add(ta2);
		add(ta3);
		
		//checkbox c1 2 3 활용
		
		c1= new Checkbox("낚시",true);
		c2= new Checkbox("등산",true);
		c3= new Checkbox("자동차",true);
		
		add(c1);
		add(c2);
		add(c3);
		
		//checkbox mf를 그룹으로 묶기
		CheckboxGroup gender= new CheckboxGroup();		//그룹으로 묶어서 하나만 체크되게
		m= new Checkbox("남",gender,false);
		f= new Checkbox("여",gender,false);
		
		add(m);
		add(f);
		
		
		
		
		
	}
	
	public void paint(Graphics g)
	{
		//그려야할때 수시로 호출되는 메소드
		System.out.println("paint()");
	}
}
