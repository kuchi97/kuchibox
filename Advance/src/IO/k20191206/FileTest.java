package IO.k20191206;

/*
�⺻������ �˾ƾ���
java.io.File Ŭ������ �ֿ� �޼ҵ�

*/

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file= new File("target.png");
		//���Ͽ� ���� �ֿ� ������ �� �� �ִ�
		
		long fileSize= file.length();
		System.out.println("����ũ��: "+fileSize);
		System.out.println("���ϸ�: "+file.getName());
		System.out.println("������: "+file.getAbsolutePath());
		System.out.println("�����: "+file.getPath());
		System.out.println("���翩��: "+file.exists());
		
		File dir= new File("sample","example");	//���丮�� ,�� �������丮 ����
		if(!dir.exists())
		{
			//�ش���丮�� ���ٸ� ��������
			boolean bool= dir.mkdirs();			//�ϳ��̸� mkdir()
			System.out.println("���丮 ��������"+bool);
		}
		else
		{
			boolean bool= dir.delete();
			System.out.println("��������: "+bool);
		}
		
		File dir2= new File("study");
		dir2.mkdir();
		
		//���丮 �̸����� >> study -> simple
		dir2.renameTo(new File("rename"));
		
		//���丮 ����
		//	������ �ش� ���丮�� ������ ������쿡 �����ȴ�
		dir2.delete();
	}
}
