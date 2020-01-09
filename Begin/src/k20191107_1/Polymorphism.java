package k20191107_1;

public class Polymorphism {

	public static void main(String[] args) {
		
		Human h1= new Human("��̳�", 150);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("�罴��", 223, 5000);
		s1.getInfo("=====�ڽ����ۡڸǡ�=====");
		
		Aquaman a1= new Aquaman("�۹��", 124, 500);
		System.out.println(a1.getInfo());

/*
�θ��ڽ��� ��Ӱ��踦 ���� ���,
�θ�Ÿ������ ������ �����ϰ�,
�ڽ��� ��ü�� �����ϴ� ���� ����

������ �� ���������� ������ �� �ִ� ������ ������ �ִ�
	- �ڽ��� ������ ������ �޼ҵ�� ������ �� ����
	- �ڽ� Ŭ������ �������̵��� �޼ҵ尡 �ִٸ�,
		�� �������̵� �޼ҵ带 �켱 ȣ���Ѵ�
*/
		System.out.println("\n=============\n");
		
		
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
		
		System.out.println("\n=============\n");
		
		Human ha= new Aquaman();
		System.out.println("ha.name: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		
		//System.out.println("ha.speed: "+ha.speed);
		System.out.println(ha.getInfo());
		
		System.out.println("\n=============\n");
		
		//�� h1, s1 ,a1, hs, ha ����迭����
		//for�� ����
		//Superman ��ü��� Ÿ��Ʋ���� �޼ҵ�� ���
		
		Human hero[]= {h1, s1, a1, hs, ha};
		for(Human h: hero)
		{
/*
instanceof ������

	�������� instanceof Ŭ������
		:	������ Ŭ������ ��ü�̸� true, �ƴϸ� false ��ȯ
*/
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
	}

}
