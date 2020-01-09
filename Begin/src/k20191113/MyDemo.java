package k20191113;

interface Inter1
{
	void a();
	void b();
	
}//------EO.Inter1
interface Inter2
{
	int x=50;
}//-------EO.Inter2

// interface�� interface�� ��ӹ������� extends�� ������
// ���߻���� ����

//���� class <- interface >> implements
//		interface <- interface >> extends

interface HisInter extends Inter1, Inter2
{
	String c();
}//-------EO.HisInter

abstract class AbsClass
{
	int y=60;
	
	abstract void d();
}//-------EO.AbsClass

/*
MyDemo����
absclass�� hisinter�� ��ӹ޾�
�߻�޼ҵ� �������̵��ϱ�
*/
public class MyDemo extends AbsClass implements HisInter{

	@Override
	void d()
	{
		System.out.println("���� �߻��̾���d");
	}
	public void a()
	{
		System.out.println("���� ����1�Ҽ� a��");
	}
	public void b()
	{
		System.out.println("���� ����1�Ҽ� b��");
	}
	public String c()
	{
		return "���m";
	}
	
	public static void main(String[] args)
	{
		MyDemo md= new MyDemo();
		md.d();
		md.a();
		md.b();
		System.out.println(md.c());
		
		//absclass Ÿ���� mydemo��ü ���� �޼ҵ� ������ ���ٰ����Ѱ�
		AbsClass abs= new MyDemo();
		abs.d();
		System.out.println(abs.y);
		
		
		//hisinter Ÿ�� mydemo��ü ����
		HisInter hi= new MyDemo();
		hi.a();
		hi.b();
		hi.c();
		
		System.out.println(Inter2.x);				//�̰� static�̴ϱ� ���� ���ٰ���
		//HisInter.x �� MyDemo.x �ε� ���ٰ���- ��ӹ޾����ϱ�
		
	}
}
