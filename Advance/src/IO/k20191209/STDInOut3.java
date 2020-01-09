package IO.k20191209;

/*
BufferedReader/BufferedWriter
	- 2byte��� ��Ʈ��
	- ���ͽ�Ʈ��
	- ���ۿ� ��Ƽ� �а� ����
	- line ������ �о���̴� ����� �ִ�
		: Scanner�� ������������ BufferedReader�� ���� ���

*/

//�ǽ�. Ű�����Է�, �ܼ����



import java.io.*;

public class STDInOut3 {

	public static void main(String[] args) throws IOException{
		
//		BufferedReader br= new BufferedReader(System.in);	//������ 1byte-2byte��� ��Ʈ���� �浹
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
												//�ٸ������� InputStreamReader�� �Է¹���
//		BufferedWriter bw= new BufferedWriter(System.out);
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("�Է��ϼ���\n");
		bw.flush();
		
		String line="";
		while((line=br.readLine())!=null)
				//String readLine();
		{
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//�Է¹ް� ����(\r\n)ġ�� ����ġ�� �������� line������ �־��� (���Ͱ� ������)
		//�׷��� �ٹٲ����ַ��� newLine()�� �߰��� �־������
		
		bw.close();
		br.close();
		
		
	}
}
