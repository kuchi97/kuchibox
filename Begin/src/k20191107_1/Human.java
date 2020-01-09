package k20191107_1;

public class Human {

	String name;
	int height;

	//constructor
	public Human()
	{
		this("���ΰ�",189);
	}
	public Human(String name, int height)
	{
		this.name=name;
		this.height=height;
	}
	
	//method
	public String getInfo()
	{
		return "�̸�: "+name+"\n"+"Ű: "+height;
	}
}//--EO.Human

class Superman extends Human
{
	int power;
	
	public Superman()
	{
		this("�轴��", 184, 500);
	}
	
	//constructor
	public Superman(String name, int height, int power)
	{
		super(name,height);
		this.power=power;
	}
	
	//method override
/*	1. �޼ҵ��̸��� �θ�� �����ϰ�
	2. �Ű������� �����ϰ�
	3. ��ȯŸ�Ե� �����ϰ�
	4. ���������ڴ� �θ�� �����ϰų� �� �а�			*/
	@Override				//annotation: �����ϴܰ迡�� override ������ �´��� üũ����  
							//jdk5.0����
	public String getInfo()
	{
		//return "�̸�: "+name+"\n"+"Ű: "+height+"\n"+"power: "+power;
		return super.getInfo()+"\n"+"�ʴɷ¡�: "+power;
	}
	//overloading getInfo()
	public void getInfo(String title)
	{
		System.out.println(title);
		System.out.println(this.getInfo());
	}
	//��. overloading���� �ʴɷ��� ������Ű�� �޼ҵ�� �����
	//		���������� ���, �ʴɷ����� �� �ʴɷ����� �������
	public void getInfo(int morePower)
	{
		System.out.println("====BEFORE=====");
		System.out.println(this.getInfo());
		this.power+=morePower;
		System.out.println("�ڡڡڡ��� �� �� ���ڡڡڡ�");
		System.out.println(this.getInfo());
	}
}//--EO.Superman

class Aquaman extends Human
{
	double speed;
	
	//constructor
	public Aquaman()
	{
		super();
		speed=100.36;
	}
	public Aquaman(String name, int height, double speed)
	{
		super(name,height);
		this.speed=speed;
	}
	
	//overriding getInfo()
	@Override
	public String getInfo()
	{
		return super.getInfo()+"\n"+"���ǵ��: "+speed;
	}
}//--EO.Aquaman