package k20191113;

/*
final modifier
	1. final+class: ����� ���ް�
	2. final+method: �������̵� ���ϰ�
	3. final+����: ���Ҵ� ���ϰ�



*/

class Super
{
	void foo()
	{
		System.out.println("Super foo()");
	}
	
	final void bar()
	{
		System.out.println("Super bar()");
	}
	
}//----EO.Super

final class Sub extends Super
{
	@Override
	protected void foo()
	{
		System.out.println("Sub foo()");
	}
	//final method�� �������̵� �ȵ�
//	public void bar()
//	{
//		System.out.println("Sub bar()");
//	}
}//------EO.Sub

//final class�� ��� �ȵ�
class SubSub //extends Sub
{
	int x=10;
	public static final int Y= 20;		//final���� = ���
}
public class FinalTest {

	public static void main(String[] args) {

		//SubSub�� x y �� ���
		SubSub ssub= new SubSub();
		
		System.out.println(ssub.x);			//instance
		System.out.println(SubSub.Y);		//static
		
		ssub.x= 100;
//		SubSub.Y=200;
		System.out.println(ssub.x);			//instance
		System.out.println(SubSub.Y);		//static
		

	}

}
