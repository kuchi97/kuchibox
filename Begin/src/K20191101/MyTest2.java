package K20191101;

import javax.swing.JOptionPane;

public class MyTest2 {
	
	public static void main(String[] args)
	{
		//String class�� charAt() �޼ҵ带 api�� ã�Ƽ� ����غ��ô�
		
		String str= JOptionPane.showInputDialog("���ĺ�, ����, �� �� ��Ÿ���� �Է�");
		System.out.println(str);
		
		//1. ����ڰ� �Է��� ���� ù���ڸ� �����ؼ� ����ϼ���
		//ABCDEFG ==> A, �ȳ��ϼ��� ==> ��
		
		char ch1= str.charAt(0);
		System.out.println("1st of str: "+ch1);
		
		//2. ������ ù���ڰ� ���ĺ��̸� -���ĺ��Դϴ�
		//	���ڸ� �����Դϴ�
		//	��Ÿ�Դϴ�				���
		
		for(int i=0; i<str.length(); i++)
		{
			char ch2= str.charAt(i);
			if(ch2>='0' && ch2<='9')
			{
				System.out.println("�����Դϴ�");
			}
			else if((ch2>='a'&&ch2<='z') || (ch2>='A'&&ch2<='Z'))
			{
				System.out.println("���ĺ��Դϴ�");
			}
			else
				System.out.println("��Ÿ�����Դϴ�");
		}
		
	}

}
