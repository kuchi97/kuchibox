package k20191114;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

//�ؽ�Ʈ�ʵ峪 ��ư�� �Է��� ����ġ�ų� Ŭ����
//�Է��Ѱ��� �ؽ�Ʈ���� ����ϵ� �޽����� �����Ǿ������ ó��

//�̺�Ʈ�ҽ� tf, bt
//event: actionevent
//handler: actionlistener

public class InputGui extends JFrame implements ActionListener{

	JPanel top;
	JTextField tf;
	JTextArea ta;
	JButton input;

	public InputGui() {
		super("InputGui");

		//bglayout
		Container cp = this.getContentPane();
		cp.add(top= new JPanel(), "North");
		cp.add(new JScrollPane(ta= new JTextArea()), "Center");
		top.setLayout(new FlowLayout());

//		ta.setBackground(Color.magenta);
		top.setBackground(Color.white);
		
		//adding
		top.add(tf= new JTextField(20));
		top.add(input= new JButton("input"));
		
		//Ÿ��Ʋ ���̱�
		tf.setBorder(new TitledBorder("������ �Է��ϼ���"));
		top.setBorder(new LineBorder(Color.black,3,true));
		
		ta.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		//add actionlistener
		input.addActionListener(this);
		tf.addActionListener(this);	//tf�� �׼Ǹ����� �ָ� ����Űĥ�� �׼����� ����������
		
		ta.setEditable(false);
		
		//â�ݱ⼳��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		if(obj==input||obj==tf)
			//��ưinput�� ���������� tf���� ���Ͱ� ���������
		{
			String inputStr;
			int inputInt;
			inputStr=tf.getText();
			//�Է°��� ������ �ƴϸ�
			//ta�� ������ �Է��ؾ��ؿ� �� ����ϼ���
			//������ ������ �ش簪�� ���ߵ�
			try {
				inputInt = Integer.parseInt(inputStr.trim());	//�������ű���!
				// void append(String str)
				ta.append(inputInt + "\n"); // append: string ������Ű�� �޼ҵ�
			} catch (NumberFormatException a) {
				ta.append("���ڸ� �Է��ϼ��� �̳��\n");
			}
			tf.setText(null);
			tf.requestFocus();
			//tf�� �Է���Ŀ���ֱ�- ��ư���� �Է��ص� Ŀ���� �ٽ� �Է���ġ�� ���ƿ�
		}
		
	}
	public static void main(String[] args) {
		InputGui my = new InputGui();

		my.setSize(400, 400);
		my.setVisible(true);

	}


}