package IO.k20191203;

/*
[�ǽ�] InOutTest.java ������ �о �ֿܼ� ����ϱ�

	- �����ͼҽ�: ���� (FileInputStream)
	- ������ ������: �ܼ� (System.out)

	- FileInputStream
		: 1byte ��� stream
		  node stream. ���ϰ� ��忬����
		
*/

import java.io.*;
public class FileInOut {

	public static void main(String[] args) throws IOException {
												//IOException > FileNotFoundException
		String file="src/IO/k20191203/InOutTest.java";		//������ �ҽ�
		FileInputStream fis= new FileInputStream(file);		//��� ����
		
		int n=0, count=0, total=0;
		
//		while((n=fis.read())!=-1)
//			//file ���� �����ϸ� -1�� ��ȯ��
//		{
//			System.out.write(n);
//			count++;
//		}
		
		//byte[]�� ��Ƽ� �ٲ㺸��
		byte data[]= new byte[10];
		while((n=fis.read(data))!=-1)
		{
			System.out.write(data,0,n);
			count++;
			total+=n;
		}
		
		System.out.println("�� "+total+" bytes");
		
		System.out.close();
		fis.close();
	}
}
