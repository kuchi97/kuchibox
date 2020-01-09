package k20191115;

import java.util.Scanner;

/*
= ��������� ���ܸ����
	1. Exception�� ��ӹ޴´�
	2. �����ڸ� �����ϰ� �� �ȿ���
		super("�޽���")�� ȣ���Ѵ�

*/

class NotSupportedNameException extends Exception
{
	public NotSupportedNameException()
	{
		super("�������� �ʴ� �̸��Դϴ�");
	}
	public NotSupportedNameException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString()
	{
		return "NotSupportedNameException";
	}
}

public class PongApp {
	
	public static void login(String name) throws NotSupportedNameException
	{
		//�̸��� �� >> ȯ���մϴ� ��������
		//�̸��� �� >> ����
		if(name.charAt(0)=='��')
		{
			System.out.println("ȯ���մϴ� "+name+"�� ^^");
		}
		else if(name.startsWith("��"))
		//boolean startsWith(String str)
		{
			throw new NotSupportedNameException("������� �� ����������");
		}
			
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ���: ");
		String name= sc.next();
		
		try {
			PongApp.login(name);
			System.out.println("���� �̿� ��");
		} 
		catch (NotSupportedNameException e){
			//exception���� eȣ���ϸ� ������ ���ܸ޼ҵ� ���
			System.out.println(e);
			
			//��ϵ� ���ܸ޽����� ��ȯ
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
		sc.close();
	}

}
