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
			//�̸����� Ŭ����, JPanel�� ��ӹ޴� �ڽ�Ŭ������ �ȴ�
			
			//getInsets()�������̵�
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
		
		//������ư�� �׷��� �����־�� ���ϼ��� ����
		ButtonGroup group= new ButtonGroup();
		group.add(rbR);
		group.add(rbG);
		group.add(rbB);
		
		//canvas setting
		can= new Canvas();
		can.setSize(200,200);
		can.setBackground(Color.cyan);
		bg.add(can);
		
		//anonymous class �� �̺�Ʈó���ϱ�
		//1ȸ�� Ŭ������ �̿��� ó����� �����ϰ�,
		//�̷��� ó���ϸ� �̺�Ʈ ������ ���� �Ҵ��� ���ټ� �־
		//��Ȯ�ϰ� ó���� ������
		rbB.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e)
			{
				can.setBackground(Color.blue);
			}
		});
		//rbR�� rbG�� �̺�Ʈ ó���غ���
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
		
		
		

		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		AnonymousClass my = new AnonymousClass();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}