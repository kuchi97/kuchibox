package K20191101;

/*
	- Ŭ������ member
		1. ������constructor:	��ü�� ������ �� ȣ��Ǵ� ������ �޼ҵ�
					[�����ڱ�����Ģ]
						����������(ex> public) �������̸�()
						{
						
						}
						- ��, �������̸��� class��� �����ؾ���
						- ** ��ȯŸ���� ������� �ʴ´�
					[����]
						member var.(=instance var.) �ʱ�ȭ
						
								
		2. member var.
		3. method
*/
public class MyDemo {
	int x;		//�������(��������-instance����/��ü����)
	static int y;	//�������(��������-class����/static����)
// **���������� �ʱ�ȭ���ϸ� �⺻�� ��
	
	public MyDemo()
	{
		System.out.println("MyDemo() constructor.x: "+x);
		x=100;		//instance var. init;
		int z;	//��������(local var./automatic����)
		
		//System.out.println("z: "+z);
		System.out.println("x: "+x);
	}

}
