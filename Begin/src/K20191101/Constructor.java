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


/* 	������ ��ü�����

 	class������ ���� ����
		= (class var.name= new �������̸�();)
*/


//MyDemo md;						//md��� ��ü�� ����, md�� stack�� ����
//md= new MyDemo();				//new �ϸ� MyDemo�����ڰ� heap�� ����ǰ�
//MyDemo md2= new MyDemo();		//md�� MyDemo�� �ּҸ� ����Ŵ
//MyDemo md3= new MyDemo();
//MyDemo md4= md;
//
//System.out.println(md);			//���� MyDemo�� ����������
//System.out.println(md2);		//���� ����Ű�� �ּҰ��� �� �ٸ�
//System.out.println(md3);		//���� �����Ȱ��� ����
//System.out.println(md4);

//OurDemo od= new OurDemo();		//������ �ȸ��� ��ü�� ȣ�Ⱑ��?
//System.out.println(od.z);
//�����ڸ� �������� ������ �����Ϸ��� ����Ʈ�����ڸ� ��������





/*
	��������:	Ư�� ��(�޼ҵ��, �ν��Ͻ��� ��) ���ο��� ������ ����
	
	�������:	class ���ο��� ������ ����
		1. instance var.: 	��ü����
					[��ü��.����]
		2. class var.:		static����
					[class��.����]

*/

/*
public class MyMemVar {
	
	int aaa= 10;			//instance var.
	static int bbb= 20;		//class var.
	
	public static void main(String[] args)
	{
		///aaa�� bbb���� ���� ���
		System.out.println(aaa);
		//��ü������ �ؾ� �޸𸮿� �ö�
		//��� ��ü���� ���ؼ� ���� �ȿö���
		System.out.println(MyMemVar.bbb);
		//static���� �����ϸ� class�ε��� �̹� �޸𸮿� �ö�����
		//static var. �� class�̸� �ٿ��� ȣ���ϴ°� ����(�ڱ�Ŭ������)
		
		
		//static var.�� ��ü������ �����ϴ°͵� ����,, �ٵ� ���� �߳�
		 
*/

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�̰Ž� constructor�� ���� ������ ������ Ŭ�����Դϴ�");

	}

}
