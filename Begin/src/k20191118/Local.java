package k20191118;

import javax.swing.JFrame;

public class Local {

	String str="!@#";			//�������
	
	void bar()
	{
		int num= 100;			//��������
		
		System.out.println("str: "+str);
		System.out.println("num: "+num);

		
		class LocalInner 			//local inner class
		{
			String lstr="abc";
			
			public void foo()
			{
				//str, num, lstr ���
				System.out.println("str: "+str);
				System.out.println("num: "+num);
				System.out.println("lstr: "+lstr);
					/*jdk 7.0 �������� �����̳�Ŭ�������� final�� �ƴ����������� ���� �ȵ�*/
				
			}
		}
		
		LocalInner li= new LocalInner ();
		li.foo();

		/*
		�����̳�Ŭ������ �ڱⰡ ���� �޼ҵ� �ȿ��� ��ü������ �ؾ���
		�ٸ� �޼ҵ忡���� ��ü ������ �Ұ����ϸ�, 
		Ŭ������ ������ �Ŀ� ��ü���� ����
		��������ó�� ������
		*/

	}//-	-	-.bar
	
	
	
	public static void main(String[] args) {
		
		Local l= new Local();
		l.bar();

		
	}
}
