package k20191113;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingMyPlusCalc extends JFrame implements ActionListener{

	JLabel first, second, result;
	JTextField firstTF, secondTF, resultTF;
	JButton plus, reset;
	JPanel p1,p2;
	
	public SwingMyPlusCalc() {
		//Ÿ��Ʋ
		super("::My Plus Calc::");
		
		//container���̱�
		Container cp= this.getContentPane();
				
		//���̾ƿ� ����
		p1= new JPanel();
		p1.setLayout(new GridLayout(4,2,10,30));
		p2= new JPanel();
		p2.setLayout(new GridLayout(1,2,10,30));
		
		//���п� ����
//		p1.setBackground(Color.yellow);
//		p2.setBackground(Color.green);
		
		//�󺧼���
		first= new JLabel("Input 1");
		second= new JLabel("Input 2");
		result= new JLabel("RESULT");
		
		//textfield setting
		firstTF= new JTextField(50);
		secondTF= new JTextField(50);
		resultTF= new JTextField(50);

		p1.add(first);
		p1.add(firstTF);
		p1.add(second);
		p1.add(secondTF);
		p1.add(result);
		p1.add(resultTF);
		
		//button setting
		plus= new JButton("PLUS", new ImageIcon());
		reset= new JButton("RESET");
		p1.add(plus);
		p1.add(reset);
		
		//��ư�� ����Ű�ο� setMnemonic
		plus.setMnemonic('P');			//Alt+P
		reset.setMnemonic('R');			//Alt+R
		//ǳ������
		plus.setToolTipText("���ض�");
		reset.setToolTipText("�����");
		
		//������ �Ұ����ϵ���
		resultTF.setEditable(false);
		
		//�������� �׸��߱�
		plus.setPressedIcon(new ImageIcon("./images/jokericon.png"));
		//�ѿ��������� �׸��߱�
		plus.setRolloverIcon(new ImageIcon("./images/blue.png"));
		
		//�׼Ǹ����� ����
		plus.addActionListener(this);
		reset.addActionListener(this);
		
		cp.add(p1,"Center");
		cp.add(p2,"South");
				
		//âũ�� ����
		setSize(500,500);
		setVisible(true);
		
		//�����������Ұ� �޼ҵ�
		this.setResizable(false);
		//â�ݱ�
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);;
	}
	
	public Insets getInsets()
	{
		return new Insets(100,80,80,80);
	}

	public static void main(String[] args) {
		new SwingMyPlusCalc();

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj= e.getSource();
		
		if(obj==plus)
		{
			//tf12�� �Է��Ѱ� �޾ƿ���
			//12�� ���ؼ� 3�� �־��ֱ�
			int input1, input2,result;
			
			//string ������ int ��ȯ  parseInt(int.trim()); ������ ��������
			input1=Integer.parseInt(firstTF.getText().trim());
			input2=Integer.parseInt(secondTF.getText().trim());
			
			result=input1+input2;
			
			//int ������ string��ȯ String.valueOf();
			resultTF.setText(String.valueOf(result));
			//resultTF.setText(input1+input2+"");		//���ڿ��� ���ڰ� �����ϸ� ���ڿ��� �Ǵ� �̷������!!
			
		}
		else if(obj==reset)
		{
			//tf123�� �ʱ�ȭ�ϱ�
			firstTF.setText("");
			secondTF.setText(null);
			resultTF.setText(null);
		}
		

	}
	
	

}
