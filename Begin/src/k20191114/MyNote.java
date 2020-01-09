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
		
		
		//�޴��� ����
		bar=new JMenuBar();
		setJMenuBar(bar);//�޴��ٸ� ����
		//�޴� �����ؼ� �޴��ٿ� ����
		mnFile=new JMenu("File");
		bar.add(mnFile);
		
		//�޴��� �޴������� ����
		miNew=new JMenuItem("New", new ImageIcon("./images/new.PNG"));
		miOpen=new JMenuItem("Open",'O');
		miSave=new JMenuItem("Save",'S');
		miExit=new JMenuItem("Exit",'E');
		mnFile.add(miNew);
		mnFile.add(miOpen);
		mnFile.add(miSave);
		mnFile.addSeparator();//���м� �ֱ�
		mnFile.add(miExit);
		
		//����Ű����
		miSave.setAccelerator(KeyStroke.getKeyStroke('S',InputEvent.CTRL_MASK));
		miOpen.setAccelerator(KeyStroke.getKeyStroke('O',InputEvent.CTRL_MASK));
		
		//�޴��� �޴��� ���̸� ���� �޴��� ��
		JMenu subMenu=new JMenu("Sub Menu");
		mnFile.add(subMenu);
		subMenu.add(new JMenuItem("�޴�1"));
		subMenu.add(new JMenuItem("�޴�2"));
		subMenu.add(new JMenuItem("�޴�3"));
		//swing������ ��ũ�ѹٰ� ������ ����
		//JScrollPane�� ��Ƽ� �ٿ��� ��
		ta=new JTextArea();
		cp.add(new JScrollPane(ta),"Center");
		
		lb=new JLabel("^^");
		cp.add(lb,"South");
		lb.setOpaque(true);//�󺧿� ���� �����Ϸ��� �����ϰ� ����
		lb.setBackground(Color.white);
		
		miNew.addActionListener(this);
		miOpen.addActionListener(this);
		miSave.addActionListener(this);
		miExit.addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}//-	-	-	-	EO construct
	
	JFileChooser fc = new JFileChooser("C:/MyJava");		//filechooser ����
												//JFileChooser("�⺻���")

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
			//1.JFileChooser ���ؼ� file dialog ����
			//2. ���������� �˾Ƴ��� ������ �����θ����
			//	�ش� ������ �����θ� �󺧿� �����ϱ�
			
			//showOpenDialog(parent)	parent��ü�� �߾ӿ� â�� ���
			int yn=fc.showOpenDialog(null);		//������
			setTitle("yn: "+yn);				//���� 0 ����ϸ� 1 ��ȯ�ϰ��ִ�
			if(yn==JFileChooser.APPROVE_OPTION)
				//public static final int APPROVE_OPTION
			{
				//public File getSelectedFile()
				File file=fc.getSelectedFile();
				String path=file.getAbsolutePath();
				lb.setText(path);
				setTitle(path);
				
				//fileExceptiontest�� reading()ȣ���ؼ� ta�� ���̱�
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
