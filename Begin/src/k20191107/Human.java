package k20191107;

public class Human {				//Ŭ������ ����� ���������� Object��� ģ���� ��ӹް�����
	
	String name;
	int height;
	
	public Human(String name, int height)
	{
		this.name= name;
		this.height=height;
	}
	
	public String getInfo()
	{
		return "�̸�: "+name+"\n"+"Ű: "+height;
	}

}
//--EO.Human

class Superman extends Human		//��Ӱ���: "is a" ���谡 �����ؾ��Ѵ� (���ϻ��)
{									//Superman "is a" Human
									//Human()���� name height, getInfo ��ӹ���
	int power;
	
	//constructor
	public Superman() 
	{
		//��Ӱ��踦 ������ �ڽ�Ŭ������ �����ڿ����� ���������� super()�� ȣ���Ѵ�
		//���� �θ�Ŭ������ ����Ʈ ������ constructor() �� �����ؾ��Ѵ�
		//�Ǵ� �ڽ�Ŭ���� �����ڿ��� ��������� super()�� ȣ���Ѵ�
		
		super("�ƹ���",155);		//super()���� ���� �ʱ�ȭ���ְ��� �� ���� ��� �־��ش�
//		this.name="�ƹ���";
//		this.height=155;
		power=1000;
	}
	public Superman(String name, int height, int power)
	{
		super(name, height);		//super()�� ������ �ȿ����� ȣ�Ⱑ��
//		this.name=name;				//�������� ù��°�ٿ� ��ġ�ؾ���
//		this.height=height;			//���� this()�� ���� ��� �Ұ�, static ���������� ��� �Ұ�
		this.power=power;
	}
}
//EO.Superman

class Aquaman extends Human
{
	double speed;
	
	public Aquaman()
	{
		super("�豤��",195);
//		this.name="�豤��";
//		this.height=195;
		speed= 38.38;
	}
	public Aquaman(String name, int height, double speed)
	{
		super(name,height);
//		this.name=name;
//		this.height=height;
		this.speed=speed;
	}
}
//EO.Aquaman