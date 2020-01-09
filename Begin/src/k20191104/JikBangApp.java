package k20191104;

/*
	- ��, �߰���, �ŵ���, �ż���... =��ü(Object) --(�ν��Ͻ�ȭ)--> object(instance)
	- �߻�ȭ ==> Ŭ������ �����ϴ°�
		1. �Ӽ�(�����) ==> ��������� ����
		2. �ൿ���(������) ==> �޼ҵ�� ����
	
*/
//�������� ���� �������� Ŭ���� ��������
//�� public �Ӽ��� �� Ŭ�������� �ο�����
//�ַ� ���ϸ�� ������ Ŭ������ main()�� �����ʿ� �ο�
class House
{
	int room;		//'has a' ���谡 �����ؾ��Ѵ�
					// ex) [house] has a [room]  ���谡 �����ؾ��Ѵ�
					//		house has an engine (x)
	String owner;
	String addr;
	
	//��������
	public void showInfo()
	{
		System.out.println("----House Info.----");
		System.out.println("owner: "+owner);
		System.out.println("room : "+room);
		System.out.println("address: "+addr);
	}
	
	//���ּ�
	public String existAt(int bunji)
	{
		String str=owner+"���� ��: "+addr+" "+bunji+"������ ��ġ�ؿ�";
		return str;
	}
	
}//House.class
//--------------------------------------------------------------------------

/*
	Ŭ���� :��ü�� ������ Ʋ (ex> ���赵, �ؾƲ)
	��  ü :Ŭ������ ���� ������� ������ (ex> ��, �ؾ)
	
*/


//JikBangApp.class
public class JikBangApp {

	public static void main(String[] args) {
		
		House h1= new House();			//instance, object
		House h2= new House();
		
		h1.showInfo();					//�ʱ�ȭ ���ؼ� �⺻������
		h2.showInfo();
		
		h1.owner="ȫ�浿";
		h1.room= 2;
		h1.addr="������ ������";
		
		h2.owner="��浿";
		h2.room= 3;
		h2.addr= "�������� ��굿";
		
		h1.showInfo();
		h2.showInfo();
		
		//q. ��ü������ �ʱⰪ�ο�. showinfo()
		//existat()ȣ���Ͽ� �����ּҵ� ���
		
		//�츮��
		House h3= new House();
		h3.owner="��";
		h3.room=2;
		h3.addr="���۱� �뷮����";
		
		String addrDetail= h3.existAt(255);
		
		h3.showInfo();
		System.out.println(addrDetail);
		System.out.println(h3.existAt(255));
		
	}

}
