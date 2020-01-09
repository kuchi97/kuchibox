package k20191106;

class Superman
{
	String name;
	int height;
	int power;

/*	method overload 
 * 		1. �޼ҵ���� ���ƾ���
 * 		2. �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų� ������ �޶����
 * 		3. ��ȯŸ���� �Ű�Ⱦ���
 */
//	constructor overload
//	- ������ �޼ҵ� �����ε�� ����
	
	// default constructor: �Ű����� ���� ������
/*	public Superman()
	{
		name="�ƹ���";
		height=198;
		power=0;
	}
	
	// ���� ������: �Ű������� �ִ� ������
	public Superman(String name)
	{
		this.name=name;
		height= 160;
		power= 50;
	}
	public Superman(String name, int height)
	{
		this.name=name;
		this.height=height;
		power=100;
	}
*/
	public Superman(String name, int height, int power)
	{
		this.name=name;
		this.height=height;
		this.power=power;
	}//#default constructor
/*	
	������ �ڵ� ���̾�Ʈ
	�Ű������� ���� �����༮�� �⺻������ �ϱ�� ���ϰ� this() ���
	��,
	- this()�� ������ �ȿ����� ȣ���ؾ��� (=�޼ҵ忡�� ���ȵ�)
	- this()�� ȣ���Ҷ��� �ݵ�� �������� ù��° �����̾����
	- this()�� super()�� �����Ҽ� ����
*/
	public Superman()
	{
		this("�ƹ���",150,0);
	}
	//#default constructor�� �����Ͽ� �� �Ű������� �ʱ�ȭ
	public Superman(String name)
	{
		this(name, 160, 50);
	}
	public Superman(String name, int height)
	{
		this(name, height, 100);
	}
	public void showInfo()
	{
		System.out.println("- Superman Info. -");
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("power: "+power);
	}
}//.Superman

class Aquaman
{
	String name;
	int height;
	double speed;
	
	//�����ڸ� �����ϰ� 3���������� �����ε��ϼ���
	//������ �ȿ��� this �̿��ؼ� �ڵ��ٿ�����
	//main()���� ����Ƹ� 3������ ȣ��
	public Aquaman(String name, int height, double speed)
	{
		this.name=name;
		this.height=height;
		this.speed=speed;
	}
//	public Aquaman()
//	{
//		this("�̱���", 200, 150);
//	}
	
/*	
*** �츮�� �����ڸ� �ϳ��� �����ϸ�
�����Ϸ��� �������ִ� �⺻�����ڴ� ������� ***
*/
	public Aquaman(String name)
	{
		this(name, 180, 100);
	}
	public Aquaman(String name, double speed)
	{
		this(name,170,speed);
	}
	public void showInfo()
	{
		System.out.println("- Aquaman Info. -");
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("speed: "+speed);
	}
	
}//.Aquaman
public class Overloading {

	public static void main(String[] args) {
		// ���۸� ���� ���
		Superman sm= new Superman();
		sm.showInfo();
		
		sm.name= "clark";
		sm.height= 200;
		sm.power=20000000;
		sm.showInfo();
		
		Superman sm2= new Superman("�轴��");
		sm2.showInfo();
		
		//�̸�, Ű ������
		Superman sm3= new Superman("¬����", 150);
		sm3.showInfo();
		
		//�̸�, Ű, �ʴɷ� ������
		Superman sm4= new Superman("�达", 170, 5);
		sm4.showInfo();
		
		//������ ��� ����
//		Aquaman am= new Aquaman();
//		am.showInfo();
		
		Aquaman am2= new Aquaman("�̼۾�");
		am2.showInfo();
		Aquaman am3= new Aquaman("�̿���", 28.8);
		am3.showInfo();
		Aquaman am4= new Aquaman("�̹��", 185, 34);
		am4.showInfo();
	}

}
