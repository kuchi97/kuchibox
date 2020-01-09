package k20191113;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwingMyNote extends JFrame implements ActionListener{

	JPanel bg;
	
	JMenuBar bar;
	JMenu menuFile, menuColor, fontColor;
	JMenuItem itemOpen, itemSave, itemNew, itemExit,
				itemYellow, itemGray, itemRed, itemBlue;
	
	JTextArea ta;
	MyTextArea ma;
	JScrollPane sp;
	JLabel lb;

	public SwingMyNote() {
		super("SwingMyNote");

		Container cp = this.getContentPane();
//		cp.add(bg = new JPanel(), "Center");
//		bg.setBackground(Color.white);
		
		//메뉴바 생성/부착
		bar= new JMenuBar();
		setJMenuBar(bar);			//add아니고 setJMenuBar
		
		//메뉴생성해서 메뉴바에 부착
		menuFile= new JMenu("File");
		menuColor= new JMenu("Color");
		bar.add(menuFile);
		bar.add(menuColor);
				
		//메뉴에 메뉴아이템 부착
		//파일메뉴
		itemNew= new JMenuItem("New",new ImageIcon("./images/new.png"));
		itemOpen= new JMenuItem("Open",'O');
		menuFile.add(itemNew);
		menuFile.add(itemOpen);
		menuFile.add(itemSave= new JMenuItem("Save",'S'));
		//구분선긋기
		menuFile.addSeparator();
		menuFile.add(itemExit= new JMenuItem("Exit",'X'));
		
		//메뉴에 메뉴를 붙이면 서브메뉴가 된다
		JMenu subMenu= new JMenu("SubMenu");
		menuFile.add(subMenu);
		subMenu.add(new JMenuItem("menu1"));
		subMenu.add(new JMenuItem("menu2"));
		subMenu.add(new JMenuItem("menu3"));
		
		//컬러메뉴
		itemYellow= new JMenuItem("노랑");
		itemGray= new JMenuItem("회색");
		itemRed= new JMenuItem("빨강");
		itemBlue= new JMenuItem("파랑");
		fontColor= new JMenu("글자색");
		menuColor.add(itemYellow);
		menuColor.add(itemGray);
		//컬러하위메뉴
		menuColor.add(fontColor);
		fontColor.add(itemRed);
		fontColor.add(itemBlue);
		
		
		
		
		//textarea부착
		//swing에서는 textarea 스크롤바가 안생겨요
		//그래서 스크롤바 기능이 있는 패널인 JScrollPane에 담아서 붙여야함
		ta= new JTextArea();
		sp= new JScrollPane(ta);
		cp.add(sp,"Center");
		
		//라벨생성 하단부착
		lb= new JLabel("나는 2ㅏ벨이다");
		cp.add(lb,"South");
		//라벨에 배경색먹이기
		//그냥은 안되고 알파값 조정한후 먹여야함
		lb.setOpaque(true);					//opaque true 투명하게 해줭
		lb.setBackground(Color.white);
		
		//액션리스너 부착
		itemYellow.addActionListener(this);
		itemGray.addActionListener(this);
		itemRed.addActionListener(this);
		itemBlue.addActionListener(this);

		//창닫기설정
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		Object obj= e.getSource();
		
		//노랑누르면 배경색노랑 회색은 회색
		//빨강/파랑 누르면 글자색 파랑
		if(obj==itemYellow)
		{
			ta.setBackground(Color.yellow);
		}
		else if(obj==itemGray)
		{
			ta.setBackground(Color.lightGray);
		}
		else if(obj==itemRed)
		{
			ta.setForeground(Color.red);
		}
		else if(obj==itemBlue)
		{
			ta.setForeground(Color.blue);
		}
	}

	public static void main(String[] args) {
		SwingMyNote my = new SwingMyNote();

		my.setSize(400, 400);
		my.setVisible(true);

	}

}
