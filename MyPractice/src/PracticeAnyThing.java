interface PhoneInterface
{
	final int TIMEOUT= 10000;
	void sendCall();
	void receiveCall();
	
	default void printLogo()
	{
		System.out.println("***Phone***");
	}
}//.PhoneInterface

interface MobilePhoneInterface extends PhoneInterface
{
	void sendSMS();			//public ������
	void receiveSMS();
}

interface MP3Interface
{
	public void play();
	public void stop();
}

class PDA
{
	public int calculate(int x, int y)
	{
		return x+y;
	}
}

//Smartphone Ŭ������ pda ��ӹް�,
//mobilephoneinterface�� mp3interface �������̽��� ����� �߻�޼ҵ� ��� ����
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
	@Override
	public void sendCall()
	{
		System.out.println("��ȭ��");
	}
	public void receiveCall()
	{
		System.out.println("��ȭ��");
	}
	public void sendSMS()
	{
		System.out.println("���ڸ� �߼��Ͽ����ϴ�");
	}
	public void receiveSMS()
	{
		System.out.println("���ڰ� �����Ͽ����ϴ�");
	}
	public void play()
	{
		System.out.println("�������");
	}
	public void stop()
	{
		System.out.println("����");
	}
	
	//.smartphone���� �߰��� �ۼ��ϴ� �޼ҵ�
	public void schedule()
	{
		System.out.println("���� �̰��ؾ���");
	}
}

public class PracticeAnyThing
{
	public static void main(String[] args) {
		
		SmartPhone sp= new SmartPhone();
		
		sp.printLogo();
		sp.sendCall();
		sp.play();
		
		System.out.println
		("3+5: "+sp.calculate(3, 5));
		sp.schedule();
	}
}