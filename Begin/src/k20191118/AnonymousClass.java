package k20191118;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Insets;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;

public class AnonymousClass extends JFrame {

	JPanel bg, p;
	JRadioButton rbR, rbG, rbB;
	Canvas can;
	
	
	public AnonymousClass() {
		super("AnonymousClass");

		//bgsetting
		Container cp = this.getContentPane();
		cp.add(bg = new JPanel() {
			//이름없는 클래스, JPanel을 상속받는 자식클래스가 된다
			
			//getInsets()오버라이드
			public Insets getInsets()
			{
				return new Insets(30,10,10,10);
			}
			
		}, "Center");
		
		cp.add(p= new JPanel() {
			public Insets getInsets()
			{
				return new Insets(20,10,20,10);
			}
		}, "North");
		
		bg.setBackground(Color.white);
		p.setBackground(Color.white);
		p.setBorder(new EtchedBorder(EtchedBorder.RAISED));
			// ctrl + shift + o
		p.add(rbR= new JRadioButton("Red",true));
		p.add(rbG= new JRadioButton("Grn",true));
		p.add(rbB= new JRadioButton("Blu",true));
		rbR.setOpaque(false);
		rbG.setOpaque(false);
		rbB.setOpaque(false);
		
		//라디오버튼은 그룹을 지어주어야 단일선택 가능
		ButtonGroup group= new ButtonGroup();
		group.add(rbR);
		group.add(rbG);
		group.add(rbB);
		
		//canvas setting
		can= new Canvas();
		can.setSize(200,200);
		can.setBackground(Color.cyan);
		bg.add(can);
		
		//anonymous class 로 이벤트처리하기
		//1회성 클래스를 이용한 처리라고 생각하고,
		//이렇게 처리하면 이벤트 각각에 대한 할당을 해줄수 있어서
		//명확하게 처리가 가능함
		rbB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				can.setBackground(Color.blue);
			}
		});
		//rbR과 rbG도 이벤트 처리해보기
		rbR.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				can.setBackground(Color.red);
			}
		});
		rbG.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				can.setBackground(Color.green);
			}
		});
		
		
		

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		AnonymousClass my = new AnonymousClass();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}