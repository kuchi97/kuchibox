package k20191107_1;

/*
overriding
- �������� �޼ҵ带 �������ϴ°�

����:
	- �������̵� �Ϸ��� �޼ҵ尡 �θ� �����ؾ���
	- �޼ҵ� �̸��� �����ؾ���
	- �޼ҵ��� �Ű�����, ����, ������Ÿ���� �����ؾ���
	- ��ȯŸ�Ե� ���ƾ���
	- �޼ҵ��� ���������ڴ� �θ�Ŭ������ �����ϰų�, �� �о����
	- Exception�ϰ��, �θ�Ŭ������ �޼ҵ�� �����ϰų�
		�� ��ü���� Exception�� �߻����Ѿ���
*/

//@Override				annotation: �����ϴܰ迡�� override ������ �´��� üũ����  
//jdk5.0����

public class Overriding {
	
	public static void main(String[] args)
	{
		System.out.println("�� Ŭ������ �������̵��� ���� ������ �ִ�");
		//object
		Human hm1= new Human();
		System.out.println(hm1.getInfo());
		
		Superman sm1= new Superman("������",212,4000);
		System.out.println(sm1.getInfo());
		
		Aquaman am1= new Aquaman();
		System.out.println(am1.getInfo());
		
		System.out.println();
		
		System.out.println("Ÿ��Ʋ�ְ� ����ϱ�");
		sm1.getInfo("=====Superman=====");
		//�Ŀ����� getInfo()
		sm1.getInfo(500);
		System.out.println();
		
		//2 more Superman object
		Superman sm2= new Superman("������",820,30000);
		Superman sm3= new Superman("���ο�",198,30);
		
		//superman�迭����
		Superman smArr[]= new Superman[3];
		
		smArr[0]=sm1;
		smArr[1]=sm2;
		smArr[2]=sm3;
		
		for (int i = 0; i < smArr.length; i++) {
			smArr[i].getInfo("���۸�"+(i+1)+" Info");
			System.out.println("\n=============\n");
		}
	}

}
