package IO.k20191203;

/*
System.in: InputStream Ÿ��
	- 1byte ��� stream
	- Ű����� ��忬���� �ϴ� Node stream (�����ͼҽ�(���⼭�� Ű����)�� ��������)
	- public int read(): ����Ʈ�Է��� �����ϰ�
						�Է��� ����(ctrl+c/ctrl+d)�Ǹ� -1��
						�����Ѵ�.

*/

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) throws IOException
	{	
		InputStream in= System.in;
		
		//int read(byte[] b)  
		int input=0, count=0;
		System.out.println("�Է��Ͻ��: ");				// ASCII \r=13 \n=10
		
		while((input=in.read())!=-1)
			//ctrl+c ������ -1�� ��ȯ�Ǳ� ������ ����
		{
			System.out.println("input: "+((char)input));
			count++;
		}
		
//		while(true)
//		{
//			input= in.read();
//			System.out.println("input: "+input);
//			count++;
//			
//			if(input=='x')
//				break;
//		}
		System.out.println("�� "+count+"bytes �Է¹���");
		
		//����� stream �ݱ�
		in.close();
		System.out.close();
		
	}
}
