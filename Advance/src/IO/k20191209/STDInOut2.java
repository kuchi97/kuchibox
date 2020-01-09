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
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.URL;

public class STDInOut2 {

	public static void main(String[] args) throws IOException{
		
		
		
		//�ٸ� ����Ʈ���� �ҽ��� �о� �ֿܼ� ����ϱ�
		String str="https://naver.com/";
		//�����ͼҽ�: ������ǻ���� ����
		
		URL url= new URL(str);
			//java.net.URL;
		InputStream is =url.openStream();			//��彺Ʈ��. 1byte ���
			//java.io.InputStream;
		
		//**�Է¹��� �������� encoding(charSet)�� ���� �� �ִ�
		InputStreamReader ir= new InputStreamReader(is,"EUC-KR");		//���ڵ� ��������
		
		OutputStreamWriter ow= new OutputStreamWriter(System.out,"EUC-KR");		//�����
		
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
