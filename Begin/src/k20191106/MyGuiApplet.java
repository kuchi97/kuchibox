package k20191106;

import java.applet.Applet;
import java.awt.*;
//awt= Abstract Window Toolkit ==> �ü�� ������ �޴´�
//swing: �ü�� �������

//���ø��� �ݵ�� public class�̾����
public class MyGuiApplet extends Applet{

	Button b1, b2, b3;			//component(��ǰ)
								//   <--> container(==platform) ex> applet, frame, panel...
	TextField tf1, tf2;
	Label lb1, lb2, lb3;
	TextArea ta1, ta2, ta3;
	Checkbox c1, c2, c3, m, f;
	public void init()
	{
		//�� �ѹ� ȣ��Ǵ� �޼ҵ�
		
		this.setSize(500,500);			//���ø��� ���� ��������
		System.out.println("init()");
		
		b1= new Button();
		b2= new Button("HOME");
		b3= new Button("JOIN");
		b1.setLabel("���ڿ��� �ٽü���");
		this.add(b1);
		this.add(b2);
		add(b3);
		
		//b1 b2 b3 ���� ���� setBackground();
		b1.setBackground(Color.cyan);
		b2.setBackground(Color.magenta);
		b3.setBackground(Color.yellow);
		
		//���ڻ����� setForeground();
		b1.setForeground(Color.white);
		b2.setForeground(Color.white);
		b3.setForeground(Color.white);
		
		//���ø���� lightGray��
		setBackground(Color.lightGray);
		
		//TextField test
		tf1= new TextField(10);
		tf2= new TextField("Hello",20);
		add(tf1);
		add(tf2);
		
		//lb1 2 3 �����ؼ� ���̱� ��� �����ֱ�
		lb1= new Label("���̵�",Label.LEFT);			//label(string, int align) align 0= ����/ 1= ���/ 2= ������		�ٵ���� ó������ int�� ���� align������ ��
		lb2= new Label("��й�ȣ",Label.CENTER);		//api���� constructor summary���� ���ؾȵǴ°� ������ field summary ���� ��
		lb3= new Label("�̸���",Label.RIGHT);
		
		lb1.setBackground(Color.red);
		lb2.setBackground(Color.green);
		lb3.setBackground(Color.yellow);
		
		add(lb1);
		add(lb2);
		add(lb3);
		
		//textarea ta1 2 3�����ؼ� ���̵�
		//ta3�� ��ũ�ѹٰ� �������� �ٵ��� ����
		
		ta1= new TextArea();
		ta2= new TextArea(5,10);
		ta3= new TextArea("Hello World",10,10,TextArea.SCROLLBARS_VERTICAL_ONLY);
		
		ta1.setText("TextArea1");
		
		add(ta1);
		add(ta2);
		add(ta3);
		
		//checkbox c1 2 3 Ȱ��
		
		c1= new Checkbox("����",true);
		c2= new Checkbox("���",true);
		c3= new Checkbox("�ڵ���",true);
		
		add(c1);
		add(c2);
		add(c3);
		
		//checkbox mf�� �׷����� ����
		CheckboxGroup gender= new CheckboxGroup();		//�׷����� ��� �ϳ��� üũ�ǰ�
		m= new Checkbox("��",gender,false);
		f= new Checkbox("��",gender,false);
		
		add(m);
		add(f);
		
		
		
		
		
	}
	
	public void paint(Graphics g)
	{
		//�׷����Ҷ� ���÷� ȣ��Ǵ� �޼ҵ�
		System.out.println("paint()");
	}
}
