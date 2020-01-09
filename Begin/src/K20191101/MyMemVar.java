package K20191101;

/*
	��������:	Ư�� ��(�޼ҵ��, �ν��Ͻ��� ��) ���ο��� ������ ����
	
	�������:	class ���ο��� ������ ����
		1. instance var.: 	��ü����
					[��ü��.����]
		2. class var.:		static����
					[class��.����]

*/

public class MyMemVar {
	
	int aaa= 10;			//instance var.
	static int bbb= 20;		//class var.
	
	public static void main(String[] args)
	{
		///aaa�� bbb���� ���� ���
//		System.out.println(aaa);
//		��ü������ �ؾ� �޸𸮿� �ö�
//		��� ��ü���� ���ؼ� ���� �ȿö���
		System.out.println(MyMemVar.bbb);
		//static���� �����ϸ� class�ε��� �̹� �޸𸮿� �ö�����
		//static var. �� class�̸� �ٿ��� ȣ���ϴ°� ����(�ڱ�Ŭ������)
		
		MyMemVar mv= new MyMemVar();
		//MyMemVar��ü ����
		System.out.println(mv.aaa);
		
		System.out.println(mv.bbb);
		//static var.�� ��ü������ �����ϴ°͵� ����,, �ٵ� ���� �߳�
		
		MyMemVar mv2= new MyMemVar();
		System.out.println(mv2.aaa);
		System.out.println(mv2.bbb);
		
		System.out.println("\nchange mv2=============");
		mv2.aaa=500;
		mv2.bbb=800;
		
		//mv.aaa, bbb ���
		//mv2.aaa, bbb���
		
		System.out.println("mv.aaa: "+mv.aaa);
		System.out.println("mv.bbb: "+mv.bbb);			//static�̶� mv�� �ٲ������
		System.out.println("mv2.aaa: "+mv2.aaa);
		System.out.println("mv2.bbb: "+mv2.bbb);
	}

}
