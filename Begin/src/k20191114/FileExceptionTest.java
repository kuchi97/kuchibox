package k20191114;
/*
Exception
	+---------IOException
					+----------FileNotFoundException
*/

import java.io.*;			//����� ��Ű��
import javax.swing.JOptionPane;

public class FileExceptionTest {
	
	public static String reading(String fileName)
	{
		System.out.println(fileName);
		String contents= "";
		
		FileReader fr=null;
		char data[]= new char[1000];
		
		try {
			fr= new FileReader(fileName);		//���ϰ� ��忬��
			
			fr.read(data,0,1000);				//������ �о data �迭�� ����
			
			int n=fr.read(data,0,1000);
			contents= new String(data,0,n);
			
			fr.close();
		} catch (FileNotFoundException e) { 
			System.out.println("������ ��ã�ھ�");
		} catch (IOException e) {
			System.out.println("���ۿ���");
		}
		
		
		return contents;
	}

	public static void main(String[] args) {
		String fname= JOptionPane.showInputDialog("�������ϸ��� �Է�");
		//./src/k20191114/ExceptionTest.java
		//C:\Myjava\workspace\Begin\src\k20191114\ExceptionTest.java
		String str= FileExceptionTest.reading(fname);
		System.out.println(str);			//���ϳ��� ���
	}
}
