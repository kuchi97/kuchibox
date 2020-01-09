package k20191114;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;

import java.awt.*;
import java.awt.event.*;

//텍스트필드나 버튼에 입력후 엔터치거나 클릭시
//입력한값을 텍스트에어리어에 출력하되 메시지가 누적되어나오도록 처리

//이벤트소스 tf, bt
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
		
		//타이틀 붙이기
		tf.setBorder(new TitledBorder("정수를 입력하세요"));
		top.setBorder(new LineBorder(Color.black,3,true));
		
		ta.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		//add actionlistener
		input.addActionListener(this);
		tf.addActionListener(this);	//tf에 액션리스너 주면 엔터키칠때 액션으로 잡을수있음
		
		ta.setEditable(false);
		
		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj= e.getSource();
		
		if(obj==input||obj==tf)
			//버튼input이 눌렸을때나 tf에서 엔터가 쳐졌을경우
		{
			String inputStr;
			int inputInt;
			inputStr=tf.getText();
			//입력값에 정수가 아니면
			//ta에 정수를 입력해야해요 를 출력하세요
			//정수가 맞으면 해당값이 들어가야됨
			try {
				inputInt = Integer.parseInt(inputStr.trim());	//공백제거까지!
				// void append(String str)
				ta.append(inputInt + "\n"); // append: string 누적시키는 메소드
			} catch (NumberFormatException a) {
				ta.append("숫자를 입력하세요 이놈아\n");
			}
			tf.setText(null);
			tf.requestFocus();
			//tf에 입력포커스주기- 버튼으로 입력해도 커서가 다시 입력위치로 돌아옴
		}
		
	}
	public static void main(String[] args) {
		InputGui my = new InputGui();

		my.setSize(400, 400);
		my.setVisible(true);

	}


}