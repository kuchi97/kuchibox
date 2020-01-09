package IO.k20191203;
/*
System.in: InputStream Ÿ��
	- 1byte ��� stream
	- Ű����� ��忬���� �ϴ� Node stream (�����ͼҽ�(���⼭�� Ű����)�� ��������)
	- public int read(): ����Ʈ�Է��� �����ϰ�
						�Է��� ����(ctrl+c/ctrl+d)�Ǹ� -1��
						�����Ѵ�.

System.out: PrintStream Ÿ��
	- 1byte ��� stream
	- ���������� �ְܼ� ��忬���� �ϰ�����
	- print(), println(), printf()...
	- public void write(int b)

*/

import java.io.*;

public class InOutTest2 {
	
	public static void main(String[] args) throws IOException{
		
		int n=0, count=0, total=0;
		
		//�����͸� �ް��ǿ� ��� �о��: byte[]
		byte[] data= new byte[6];			//6������ �ް���
		
		//data: �迭�� ����,
		//n: 	�迭�� ��byte ��Ҵ���
		
		while((n=System.in.read(data))!=-1)
		{
			System.out.write(data,0,n);
			
			System.out.flush();				//Stream�� �����ִ� �����Ͱ� ������ �о�� �������
			
			//n: ���� �ް� ����, ���� byte ��
			
//			System.out.println("n: "+n);
			
			count++;	//�ݺ��� Ƚ��
			total+=n;	//�� ����Ʈ��
		}
		System.out.println("total "+total+" bytes");
		
		System.in.close();
		System.out.close();
	}

}
