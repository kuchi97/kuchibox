package K20191101;

import javax.swing.JOptionPane;

public class MyTest3 {
	
	public static void main(String[] args)
	{
		//String class�� charAt() �޼ҵ带 api�� ã�Ƽ� ����غ��ô�
		
		String str= JOptionPane.showInputDialog("������ �Է��ϼ���");
		System.out.println(str);
		
//		�Է��� ��� ���� �ݺ������� ������ �˻��Ͽ�
//		���ڰ� �ƴ� ���ڰ� ������ ���ڿ����մϴ� ���
//		���ڰ� ������ �����Դϴ� ���
		
		for(int i=0; i<str.length(); i++)
		{
			char ch2= str.charAt(i);
			if(ch2>='0' && ch2<='9')
			{
				System.out.println(ch2+": �����Դϴ�");
			}
			else
				System.out.println(ch2+": ���ڿ����մϴ�");
		}

	}

}

