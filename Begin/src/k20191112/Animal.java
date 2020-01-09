package k20191112;

//�߻�޼ҵ屸��
//�����Ҹ�	public void crySound()
//��������	public void getBaby(int num);

//�ڽ�Ŭ���� ������ ����� ����
//override	�۸�	�߿�	�в�
//����		x����	x����	x�� ��

abstract public class Animal {
	
	int num;
	
	abstract public void crySound();
	abstract public void getBaby(int num);

}

class Dog extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("�o�o");
	}
	public void getBaby(int num)
	{
		System.out.println("������ "+num+"���� ���Ҿ��");
	}
}
class Cat extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("�̾߿�");
	}
	public void getBaby(int num)
	{
		System.out.println("������ "+num+"���� ���Ҿ��");
	}
}
class Duck extends Animal
{
	@Override
	public void crySound()
	{
		System.out.println("�x�x");
	}
	public void getBaby(int num)
	{
		System.out.println("���� "+num+"�� ���Ҿ��");
	}
}