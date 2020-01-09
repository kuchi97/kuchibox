package IO.k20191206;

/*
FileReader/FileWriter
	- 2byte���(char���) ��Ʈ��
	- node stream (���ϰ� ��忬��)
	
	- 1byte��� ��Ʈ������ ������
		: int read()	>> 1byte��� ��Ʈ��
		: int read(char[] buf)	>>2byte��� ��Ʈ��

*/

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String file="src/io/k20191206/BIStream.java";
		
		//text����̸� FileReader�� ���� ����
		FileReader fr= new FileReader(file);		//2byte ���
		
		//console�� ���
		//2byte ��� ��Ʈ���̸� 2byte��� ������� �����ִ°� ����
		PrintWriter pw= new PrintWriter(System.out);	//2byte ���
		
		//copy.txt���Ͽ� BIStream.java ���� ������ �����ϱ�
		//	>>FileWriter(2byte��� ��Ʈ��)�̿��ϱ�
		String fileTo="copy.txt";
		FileWriter fw= new FileWriter(fileTo);
		
		
		int n=0;
		
//		while((n=fr.read())!=-1)
//		{
//			pw.write(n);
//			pw.flush();
//		}
		
		//�迭�� ��Ƽ� �а� ����
		//�� �迭�� char[]
		char box[]= new char[1000];
		while((n=fr.read(box))!=-1)
		{
			//printwriter
			pw.write(box,0,n);
			pw.flush();
			
			//filewriter
			fw.write(box,0,n);
			fw.flush();
		}
		
		
		//close
		pw.println("copy.txt�� ����Ϸ�");
		fw.close();
		pw.close();
		fr.close();
	}
}
