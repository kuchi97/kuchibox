package K20191101;

//반환타입이 있는 메소드

public class HerDemo {
	
	//반환타입이 존재하면 반드시 return 해줘야됨
	public static int giveMe(int money)
	{
		System.out.println("giveMe() money: "+money);
		return money*3;
	}
	
	public String show(String abc)
	{
		System.out.println("-----show()------");
		return abc.toUpperCase();
	}

	public static void main(String[] args)
	{
		System.out.println("옛다 "+HerDemo.giveMe(1000));
		
		HerDemo str= new HerDemo();	//HerDemo 객체를 생성
		System.out.println(str.show("give me chocolate"));
	}
}
