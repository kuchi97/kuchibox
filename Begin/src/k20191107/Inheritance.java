package k20191107;
//��Ӱ���: "is a" ���谡 �����ؾ��Ѵ� (���ϻ��)
//Superman "is a" Human
//Human()���� name height, getInfo ��ӹ���

//��Ӱ��踦 ������ �ڽ�Ŭ������ �����ڿ����� ���������� super()�� ȣ���Ѵ�
//���� �θ�Ŭ������ ����Ʈ ������ constructor() �� �����ؾ��Ѵ�
//�Ǵ� �ڽ�Ŭ���� �����ڿ��� ��������� super()�� ȣ���Ѵ�

//super()�� ������ �ȿ����� ȣ�Ⱑ��
//�������� ù��°�ٿ� ��ġ�ؾ���
//���� this()�� ���� ��� �Ұ�, static ���������� ��� �Ұ�

/*
//�⺻������
public Superman() 
{
	super("�ƹ���",155);		//super()���� ���� �ʱ�ȭ���ְ��� �� ���� ��� �־��ش�
//	this.name="�ƹ���";
//	this.height=155;
	power=1000;
}
*/

public class Inheritance {

	public static void main(String[] args) {
		
		System.out.println("�� Ŭ������ ��Ӽ��� ���� ������ �ϰ��ִ�");
		
		//Human ��ü ������ getInfo()�� �������
		//Superman ��ü�����ؼ� getInfo()
		
		Human hm= new Human("ȫ�浿",166);
		System.out.println(hm.getInfo());
		
		Superman sm= new Superman();
		System.out.println(sm.getInfo());
		
		Aquaman am= new Aquaman();
		System.out.println(am.getInfo());
		Aquaman am1= new Aquaman("�ֿ췰", 136, 203.12);
		System.out.println(am1.getInfo());
		

	}

}
