package IO.k20191203;

/*
[�ǽ�] Ű����� �Է��� ������ file(result.txt)�� �����غ��ô�

	- �����ͼҽ�: Ű����(System.in)
	- �����͸�����: file(FileOutputStream)
	
*/
import java.io.*;

public class FileInOut2 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("����� �Է��� ������ result.txt�� ����˴ϴ�");
		System.out.println("�Է��ϼ���");
		
		String file="c:/MyJava/result.txt";
		FileOutputStream fos= new FileOutputStream(file, true);	//��� ����
												//true�� �ָ� append���: �������Ͽ� ������
		
		int n=0, count=0, total=0;
		byte data[]= new byte[100];
		while((n=System.in.read(data))!=-1)
		{
			fos.write(data,0,n);
			fos.flush();
			count++;
			total+=n;
		}
		
		System.out.println("total: "+total+" bytes");
		
		System.in.close();
		fos.close();
		
	}
}
