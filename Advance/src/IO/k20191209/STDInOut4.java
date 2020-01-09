package IO.k20191209;

/*
PrintWriter
	- 2byte��� ��Ʈ��
	- ���ͽ�Ʈ��
	- write()�� �ְ� print(), println()�޼ҵ嵵 �ִ�!
	- autoflush ����: �����ڿ��� �Ű������� true�� �ش�
	
*/

//�ǽ�. Ű�����Է�, �ܼ����



import java.io.*;

public class STDInOut4 {

	public static void main(String[] args) throws IOException{
		
//		BufferedReader br= new BufferedReader(System.in);	//������ 1byte-2byte��� ��Ʈ���� �浹
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
												//�ٸ������� InputStreamReader�� �Է¹���

		PrintWriter pw= new PrintWriter(System.out, true);
											//true�� �ָ� autoflush()!!!
											//newLine()������ �ڵ����� flush ����

		pw.println("�Է��ϼ���");
		
		String line="";
		while((line=br.readLine())!=null)
				//String readLine();
		{
			pw.println(line);			//pw.write(line+"\n") �������
			
		}
		
		//�Է¹ް� ����(\r\n)ġ�� ����ġ�� �������� line������ �־��� (���Ͱ� ������)
		//�׷��� �ٹٲ����ַ��� newLine()�� �߰��� �־������
		
		br.close();
		
		
	}
}
