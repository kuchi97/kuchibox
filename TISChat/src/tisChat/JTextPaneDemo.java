package tisChat;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;

/*
JTextPane
	: 폰트 굵기 기울임 정렬 등과 같은 다양한 서식을 사용할 수 있다
	
	* 사용절차
		1. SimpleAttributeSet 객체를 생성
		2. StyleConstants클래스의 Static메소드를 통해
			1번 객체에 속성을 설정
		3. 이들 속성을 문서에 적용할 경우, StyledDocument(TextPane의 문서모델) 의 
			setCharacterAttribute(attr, false) 또는
			setParagraphAttributes() 등의 메소드를 통하여, 
			원하는 영역에 적용시킨다


*/

public class JTextPaneDemo extends JFrame {

	JPanel bg;
	JTextPane tp;
	StyledDocument sd;		//문서모델:	JTextPane이 사용함  javax.swing.text.StyledDocument;
	JLabel lb;

	public JTextPaneDemo() {
		super("JTextPaneDemo");

		Container cp = this.getContentPane();
		cp.add(bg = new JPanel(new BorderLayout()), "Center");
		bg.setBackground(Color.white);

		tp= new JTextPane();
		bg.add(new JScrollPane(tp),"Center");
		tp.setText("독립운동에 있어서는 3.1 운동, 대한민국 임시정부(외무부 차장) 등에 참여했다."
				+ " 또한 언론 활동과 민족 문화 사업, 체육 활동 등 다채로운 분야에서 이름을 날렸다."
				+ " 제2차 세계대전의 종전이 가까워지던 1944년 조선건국동맹을 구성하여 해외 독립 운동 단체들과 연계를 시도하였으며,"
				+ " 8.15 광복 직후 조선 건국 동맹의 조직을 확대하여 조선 건국 준비 위원회를 결성하고 혼란 정국을 예방하였으나,"
				+ " 건준이 박헌영 등의 활동으로 좌경화되고 미군정이 이들의 활동을 인정하지 않자 여운형은 미군정기 한 명의 정치인으로 활동하게 되었다."
				+ " 이후에 미군정의 한반도 문제 개입을 반대하고 조선 민족이 자력으로 국가를 건설해야 하며,"
				+ " 친일파를 제외한 좌우 세력 모두가 공평하게 참여한 연대를 통해 통일 국가를 이룩하자고 주장하였다");
		
		
		//1. 문서모델 얻기
		sd= tp.getStyledDocument();
		
		//2. 속성을 지정할 객체를 만들고 여러가지 속성을 부여하자
		SimpleAttributeSet attr= new SimpleAttributeSet();		//여러가지 속성을 부여할 세트메뉴
		StyleConstants.setFontFamily(attr, "궁서체");
		StyleConstants.setFontSize(attr, 20);
		
		//3. 문서모델에 attr을 적용
		sd.setCharacterAttributes(0, 16, attr, true);
			//void setCharacterAttributes(int offset, int length, AttributeSet s, boolean replace)
		
		attr= new SimpleAttributeSet();							//세트메뉴 초기화
		StyleConstants.setUnderline(attr,true);
		StyleConstants.setItalic(attr,true);
		StyleConstants.setForeground(attr,Color.cyan);
		StyleConstants.setBackground(attr,Color.magenta);
		
		sd.setCharacterAttributes(20, 41, attr, true);
		
		//중앙정렬 속성을 갖는 문단특성 적용하기
		attr= new SimpleAttributeSet();
		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_CENTER);
		sd.setParagraphAttributes(0, tp.getText().length(), attr, true);
		
		
		//문서끝에 문자열 추가하기(append 비슷한)
		try {
			int caretPos=sd.getEndPosition().getOffset()-1;				//커서의 위치를 잡기 위함
			sd.insertString(caretPos, "\n대한독립만세!!\n", attr);
			
		} catch (BadLocationException e) {
			e.printStackTrace();
		}
		
		//라벨을 붙여볼까
		lb= new JLabel(new ImageIcon("C:/Myjava/workspace/TISChat/bin/images/bonobono.jpg"));
		lb.setOpaque(true);
		lb.setBackground(Color.cyan);
		lb.setPreferredSize(new Dimension(400,50));		//width,height
		lb.setForeground(Color.blue);
		
		attr= new SimpleAttributeSet();
		StyleConstants.setAlignment(attr, StyleConstants.ALIGN_RIGHT);
		
		int caretPos=sd.getEndPosition().getOffset()-1;				//커서의 위치를 잡기 위함
		tp.setCaretPosition(caretPos);
		
		
		//insertComponent()
		tp.insertComponent(lb);
		
		tp.setParagraphAttributes(attr, true);
		
		
		
		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		JTextPaneDemo my = new JTextPaneDemo();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}