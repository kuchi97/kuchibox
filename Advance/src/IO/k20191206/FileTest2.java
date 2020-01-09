package IO.k20191206;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
public class FileTest2 {

	public static void main(String[] args) {
		
		String dir= JOptionPane.showInputDialog("���丮���� �Է��ϼ�");
		
		if(dir==null) return;
		
		File dr= new File(dir);
		
		//dr�� ���丮���� ���� �Ǻ�
		if(!dr.isDirectory())
		{
			System.out.println("���丮�� �ƴϾ�");
			return;
		}
		//�ش� ���丮�� ���ϸ�� ��������
		// String[] list()  	//���ϸ� ������
		// File[] listFiles()  	//���Ͽ� ���� ������ ������(file �迭�̴ϱ�)
		// File[] listFiles(FileFilter filter)  //������������Ÿ� �����ü�����(filter�Ű�������)
		
//		System.out.println("\n******String[] list() ******\n");
//		String fileListStr[] = dr.list();
//		
//		if(fileListStr!=null)
//		{
//			for(String file: fileListStr)
//			{
//				System.out.println(file);
//			}			
//		}
		
		
		System.out.println("\n******File[] listFiles() *****\n");
		File fileListFile[]= dr.listFiles();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		if(fileListFile!=null)
		{
			for(File file: fileListFile)
			{
				System.out.println("name: "+file.getName());
				System.out.println("length: "+file.length());
				System.out.println("directory?: "+file.isDirectory());
				
				//java.util.Date�� ��¥�� long���� �޴� �����ڰ� ����
				String dateStr=sdf.format(new java.util.Date(file.lastModified()));
				System.out.println("lastModified: "+dateStr);
			}			
		}
	}
}
