package IO.k20191209;

/*
InputStreamReader/OutputStreamWriter
	- 2byte��� ��Ʈ��
	- ����-��尣 �ٸ�����:	bridge stream
	- 1����Ʈ ��Ʈ���� 2����Ʈ ���ͽ�Ʈ�� ������ ���������� �Ѵ�
	- 1����Ʈ �Է�/����� 2����Ʈ�� �����Ͽ� �а���

*/

//�ǽ�. Ű����� �Է¹޾� �ֿܼ� ���
//		(System.in / System.out)


import java.io.*;

public class STDInOut {

	public static void main(String[] args) throws IOException{
		
		
		InputStreamReader ir= new InputStreamReader(System.in);			//�Է¹ް�
		//**�Է¹��� �������� encoding(charSet)�� ���� �� �ִ�
		OutputStreamWriter ow= new OutputStreamWriter(System.out);		//�����
		
		ow.write("�Է��ϼ���");
			//write(String)  /  write(char[])
		ow.flush();
	
		int n=0;
		while((n=ir.read())!=-1)
		{
			ow.write(n);
				//write(int)
			ow.flush();
			
		}
		
		
		ow.close();
		ir.close();
		
	}
}
