package k20191106;


/*
������
	- �������� ���¸� �������ִ� ����
	- ��Ÿ���� ���������� ����Ÿ���� ��ü�� �����Ҽ��ֵ��� ��
	
	
overloading- ������ �����ε�, �޼ҵ� �����ε�
		: �޼ҵ��̸��� �����ϰ� �ֵ�,
		 �Ű������� ������Ÿ�԰� ���� ������ �ٸ��� �־ ����
		 
		 **����**: �����ε��Ϸ��� �޼ҵ��̸��� ���ƾ���
		 		�޼ҵ� �Ű������� ��������, ����, ������ ��� �ϳ��� �޶���Ѵ�
		 		��ȯŸ���� �Ű�Ⱦ���(������ ������)
*/

/*
class coffeeMachine 
{
	int coffee, sugar, cream;
	
	
//method overload
//�޼ҵ� �̸��� �����ϰ� ������ ����

1. �޼ҵ���� ���ƾ���
2. �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų� ������ �޶����
3. ��ȯŸ���� �Ű�Ⱦ���
		
	void makeTea(int c)
	void makeTea(int c, int s)
	void makeTea(int c, int s, int cr)
	
	
	//	constructor overload
	//	- ������ �޼ҵ� �����ε�� ����
	
}
*/

/*	
������ �ڵ� ���̾�Ʈ
�Ű������� ���� �����༮�� �⺻������ �ϱ�� ���ϰ� this() ���

��,
	- this()�� ������ �ȿ����� ȣ���ؾ��� (=�޼ҵ忡�� ���ȵ�)
	- this()�� ȣ���Ҷ��� �ݵ�� �������� ù��° �����̾����
	- this()�� super()(��ӹ��� �θ��� ������ ȣ��)�� �����Ҽ� ����
*/

/*		����!!	
*** �츮�� �����ڸ� �ϳ��� �����ϸ�
	�����Ϸ��� �������ִ� �⺻�����ڴ� ������� ***
	���� pp186~192
*/


/*
�θ��ڽ��� ��Ӱ��踦 ���� ���,
�θ�Ÿ������ ������ �����ϰ�,
�ڽ��� ��ü�� �����ϴ� ���� ����

������ �� ���������� ������ �� �ִ� ������ ������ �ִ�
	- �ڽ��� ������ ������ �޼ҵ�� ������ �� ����
	- �ڽ� Ŭ������ �������̵��� �޼ҵ尡 �ִٸ�,
		�� �������̵� �޼ҵ带 �켱 ȣ���Ѵ�
*/

/*
Human hs= new Superman("�ݽ���",33, 140);
System.out.println("hs.name: "+hs.name);
System.out.println("hs.height: "+hs.height);

//power�� �ڽ��� �����̱⶧���� human�� ���ٸ���
//System.out.println("hs.power: "+hs.power);

//Human Ÿ���� hs�� Superman���� ĳ����
//�� .������ �켱������ ���Ƽ� ()�����ֱ�
System.out.println(((Superman)hs).power);

//�ڽ�Ŭ������ override�� getInfo()�� ��µ�
System.out.println(hs.getInfo());
		
//�ڽ�Ŭ�������� overload�� �޼ҵ忡�� ����ȵ�
//hs.getInfo("�� �� ��");
//���������� �޼ҵ嵵 ����ȯ
((Superman)hs).getInfo("===�� �� ��===");
*/

/*
instanceof ������

	�������� instanceof Ŭ������
		:	������ Ŭ������ ��ü�̸� true, �ƴϸ� false ��ȯ
*/
/*
Human hero[]= {h1, s1, a1, hs, ha};
for(Human h: hero)
{
	if(h instanceof Superman)
	{
		((Superman)h).getInfo("===����Ÿ��Ʋ����===");
		System.out.println();
	}
	else
	{
		System.out.println(h.getInfo());
		System.out.println();
	}
}
*/



public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("�� Ŭ������ �������� �����ε��� ���� ������ ����");

	}

}
