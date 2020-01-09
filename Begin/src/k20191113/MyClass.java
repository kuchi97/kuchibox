package k20191113;

interface MyInterface
{
	void foo();				//public , abstract �� �����Ǿ�����
	
	
}//-----------EO.MyInterface

interface YourInterface
{
	String STR="Hello";		//public static final�� �ڵ����� ����
	
	String bar();
}//----------EO.YourInterface

//�������̽��� ��ӹ��� ���� implements �� ��ӹ�����
//���߻���� �����ϴ�

public class MyClass implements MyInterface, YourInterface{
	
	@Override
	public void foo()
	{
		System.out.println("this is foo");
	}
	public String bar()
	{
		return "�ȳ��Ͻ���";
	}

	public static void main(String[] args) {
		
		MyClass my= new MyClass();
		my.foo();
		System.out.println(my.bar());
		
		//�������̽��� Ÿ�Լ����� ����������,
		//��ü������ �Ұ����ϴ�
//		MyInterface mi; (o)
//		mi= new MyInterface(); (x)
		
		//miŸ������ foo bar �θ���
		MyInterface mi= new MyClass();
		mi.foo();
		//bar()�� ��µǴ°� ����
		((MyClass)mi).bar();
		
		
		//yiŸ������ foo bar �θ���
		YourInterface yi= new MyClass();
		((MyClass)yi).foo();
		System.out.println(yi.bar());

		//STR�� ���
		System.out.println(YourInterface.STR);		//static�̴ϱ� class������
		System.out.println(MyClass.STR);			//MyClass�� ��ӹ޾����� �̰͵� ����
//		MyClass.STR="Hi";							//final�� ����Ұ�
	}

}
