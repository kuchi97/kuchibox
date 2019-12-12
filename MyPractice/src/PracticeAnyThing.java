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
	void sendSMS();			//public 생략됨
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

//Smartphone 클래스는 pda 상속받고,
//mobilephoneinterface와 mp3interface 인터페이스에 선언된 추상메소드 모두 구현
class SmartPhone extends PDA implements MobilePhoneInterface, MP3Interface
{
	@Override
	public void sendCall()
	{
		System.out.println("전화함");
	}
	public void receiveCall()
	{
		System.out.println("전화옴");
	}
	public void sendSMS()
	{
		System.out.println("문자를 발송하였습니다");
	}
	public void receiveSMS()
	{
		System.out.println("문자가 도착하였습니다");
	}
	public void play()
	{
		System.out.println("재생시작");
	}
	public void stop()
	{
		System.out.println("정지");
	}
	
	//.smartphone에서 추가로 작성하는 메소드
	public void schedule()
	{
		System.out.println("오늘 이거해야지");
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