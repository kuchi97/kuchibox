package k20191114;

/*
����ó��2: �����ϴ¹��
throws �̿��ϱ�
�޼ҵ带 ȣ���ϴ������� �ѱ�¹�

	- �߻��� ���ܸ� �޼ҵ� ����κп� throws�� ����Ѵ�
	- ���ܸ� ���� ó�������ʰ� �ش� �޼ҵ带 ȣ���� ������
		�ѱ�ڴٴ� �ǹ�
		�ᱹ�� ��𼱰� ó���� �������
*/

import java.io.*;			//����� ��Ű��
import javax.swing.JOptionPane;

public class FileExceptionTest2 {
	
	public static String reading(String fileName)
		//����
		throws FileNotFoundException, IOException
	{
		System.out.println(fileName);
		String contents= "";
		
		FileReader fr=null;
		char data[]= new char[1000];
		
		
		fr= new FileReader(fileName);		//���ϰ� ��忬��

		fr.read(data,0,1000);				//������ �о data �迭�� ����

		int n=fr.read(data,0,1000);
		contents= new String(data,0,n);
		
		fr.close();
		
		return contents;
	}

	public static void main(String[] args) 
	throws FileNotFoundException, IOException
	{
		String fname= JOptionPane.showInputDialog("�������ϸ��� �Է�");
		
		String str= FileExceptionTest2.reading(fname);
		System.out.println(str);			//���ϳ��� ���
	}
}
