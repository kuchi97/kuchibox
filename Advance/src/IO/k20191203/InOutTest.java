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

public class InOutTest {
	
	public static void main(String[] args) throws IOException{
		
		int n=0, count=0;
		
		while((n=System.in.read())!=-1)
		{
//			System.out.print((char)n);
			System.out.write(n);
			count++;
		}
		System.out.println("total "+count+" bytes");
		
	}

}
