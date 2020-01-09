package K20191101;
/*
	method:
		1. �������
			����������access modifier(public..) ��ȯŸ��(void..) �̸�(�Ű�����)
			{
				���;
			}
			
			method��: ������, �ҹ��ڽ���, camelǥ�� Ȥ�� _
			
		2. �޼ҵ� ����
			2.1. instance method( =non-static method)
				- ��ü ���� ��, 
					[��ü��.�޼ҵ�()]
			2.2. class method( =static method)
				- [Ŭ������.�޼ҵ�()]
					
*/
public class HisDemo {
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public static void sayHi(String str)
	{
		System.out.println("Hi "+str);
	}
	
	//�Ű������� �޾Ƶ��̴� �޼ҵ�
	public static void plus(int a,int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	public void minus(float a, float b)
	{
		System.out.println(a+"-"+b+"="+(a-b));
	}

	
	public static void main(String[] args)
	{
		//sayHello ȣ��
		
		HisDemo hello= new HisDemo();		//[class] [var.name]= new [class]();
		hello.sayHello();					//�޼ҵ嵢��� �θ��Ŵϱ� Ŭ�������� ã�ƾߵ�
		
		
		//sayHiȣ��
		HisDemo.sayHi("�浿");

		HisDemo.plus(56, 46);

		hello.minus(2020.39f, 29.222f);

	}

}
