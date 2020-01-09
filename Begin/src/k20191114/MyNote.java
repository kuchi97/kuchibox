package k20191114;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;//1)
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class MyNote extends JFrame implements ActionListener{
	JPanel p = new JPanel();
	
	JMenuBar bar;
	JMenu mnFile, mnColor;
	JMenuItem miOpen, miSave, miNew, miExit;
	
	JTextArea ta;
	JLabel lb;
	
	public MyNote() {
		super("::MyNote::");
		Container cp = this.getContentPane();
		
		
		//메뉴바 생성
		bar=new JMenuBar();
		setJMenuBar(bar);//메뉴바를 부착
		//메뉴 생성해서 메뉴바에 부착
		mnFile=new JMenu("File");
		bar.add(mnFile);
		
		//메뉴에 메뉴아이템 부착
		miNew=new JMenuItem("New", new ImageIcon("./images/new.PNG"));
		miOpen=new JMenuItem("Open",'O');
		miSave=new JMenuItem("Save",'S');
		miExit=new JMenuItem("Exit",'E');
		mnFile.add(miNew);
		mnFile.add(miOpen);
		mnFile.add(miSave);
		mnFile.addSeparator();//구분선 주기
		mnFile.add(miExit);
		
		//단축키생성
		miSave.setAccelerator(KeyStroke.getKeyStroke('S',InputEvent.CTRL_MASK));
		miOpen.setAccelerator(KeyStroke.getKeyStroke('O',InputEvent.CTRL_MASK));
		
		//메뉴에 메뉴를 붙이면 서브 메뉴가 됨
		JMenu subMenu=new JMenu("Sub Menu");
		mnFile.add(subMenu);
		subMenu.add(new JMenuItem("메뉴1"));
		subMenu.add(new JMenuItem("메뉴2"));
		subMenu.add(new JMenuItem("메뉴3"));
		//swing에서는 스크롤바가 생기지 않음
		//JScrollPane에 담아서 붙여야 함
		ta=new JTextArea();
		cp.add(new JScrollPane(ta),"Center");
		
		lb=new JLabel("^^");
		cp.add(lb,"South");
		lb.setOpaque(true);//라벨에 배경색 적용하려면 투명하게 설정
		lb.setBackground(Color.white);
		
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-	-	-	-	EO construct
	
	JFileChooser fc = new JFileChooser("C:/MyJava");		//filechooser 생성
												//JFileChooser("기본경로")

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyNote my = new MyNote();
		my.setSize(500, 500);
		my.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj=e.getSource();
		
		if(obj==miExit)
		{
			System.exit(0);
		}
		else if(obj==miOpen)
		{
			//1.JFileChooser 통해서 file dialog 띄우기
			//2. 선택한파일 알아내어 파일의 절대경로만들기
			//	해당 파일의 절대경로를 라벨에 설정하기
			
			//showOpenDialog(parent)	parent객체의 중앙에 창을 띄움
			int yn=fc.showOpenDialog(null);		//열기모드
			setTitle("yn: "+yn);				//열면 0 취소하면 1 반환하고있다
			if(yn==JFileChooser.APPROVE_OPTION)
				//public static final int APPROVE_OPTION
			{
				//public File getSelectedFile()
				File file=fc.getSelectedFile();
				String path=file.getAbsolutePath();
				lb.setText(path);
				setTitle(path);
				
				//fileExceptiontest의 reading()호출해서 ta에 붙이기
				FileExceptionTest2 exc= new FileExceptionTest2();
				try {
					ta.setText(exc.reading(path) + "\n");
				} 
				catch (FileNotFoundException a) {
					lb.setText("file not found");
				} 
				catch (IOException b) {
					lb.setText("IO error");
				}
			}
			
		}
		else if(obj==miSave)
		{
			fc.showSaveDialog(null);
		}
		else if(obj==miNew)
		{
			
		}
		
	}
}
