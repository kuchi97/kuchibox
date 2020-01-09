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
		//타이틀
		super("::My Plus Calc::");
		
		//container붙이기
		Container cp= this.getContentPane();
				
		//레이아웃 세팅
		p1= new JPanel();
		p1.setLayout(new GridLayout(4,2,10,30));
		p2= new JPanel();
		p2.setLayout(new GridLayout(1,2,10,30));
		
		//구분용 배경색
//		p1.setBackground(Color.yellow);
//		p2.setBackground(Color.green);
		
		//라벨세팅
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
		
		//버튼에 단축키부여 setMnemonic
		plus.setMnemonic('P');			//Alt+P
		reset.setMnemonic('R');			//Alt+R
		//풍선도움말
		plus.setToolTipText("더해라");
		reset.setToolTipText("레드썬");
		
		//편집이 불가능하도록
		resultTF.setEditable(false);
		
		//눌렀을때 그림뜨기
		plus.setPressedIcon(new ImageIcon("./images/jokericon.png"));
		//롤오버했을때 그림뜨기
		plus.setRolloverIcon(new ImageIcon("./images/blue.png"));
		
		//액션리스너 부착
		plus.addActionListener(this);
		reset.addActionListener(this);
		
		cp.add(p1,"Center");
		cp.add(p2,"South");
				
		//창크기 세팅
		setSize(500,500);
		setVisible(true);
		
		//사이즈조정불가 메소드
		this.setResizable(false);
		//창닫기
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
			//tf12에 입력한값 받아오기
			//12값 더해서 3에 넣어주기
			int input1, input2,result;
			
			//string 받은거 int 변환  parseInt(int.trim()); 공백을 제거해줌
			input1=Integer.parseInt(firstTF.getText().trim());
			input2=Integer.parseInt(secondTF.getText().trim());
			
			result=input1+input2;
			
			//int 받은거 string변환 String.valueOf();
			resultTF.setText(String.valueOf(result));
			//resultTF.setText(input1+input2+"");		//문자열과 숫자가 결합하면 문자열이 되니 이런방법이!!
			
		}
		else if(obj==reset)
		{
			//tf123값 초기화하기
			firstTF.setText("");
			secondTF.setText(null);
			resultTF.setText(null);
		}
		

	}
	
	

}
