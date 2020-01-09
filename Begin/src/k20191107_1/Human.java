package k20191107_1;

public class Human {

	String name;
	int height;

	//constructor
	public Human()
	{
		this("박인간",189);
	}
	public Human(String name, int height)
	{
		this.name=name;
		this.height=height;
	}
	
	//method
	public String getInfo()
	{
		return "이름: "+name+"\n"+"키: "+height;
	}
}//--EO.Human

class Superman extends Human
{
	int power;
	
	public Superman()
	{
		this("김슈퍼", 184, 500);
	}
	
	//constructor
	public Superman(String name, int height, int power)
	{
		super(name,height);
		this.power=power;
	}
	
	//method override
/*	1. 메소드이름은 부모와 동일하게
	2. 매개변수도 동일하게
	3. 반환타입도 동일하게
	4. 접근지정자는 부모와 동일하거나 더 넓게			*/
	@Override				//annotation: 컴파일단계에서 override 문법에 맞는지 체크해줌  
							//jdk5.0부터
	public String getInfo()
	{
		//return "이름: "+name+"\n"+"키: "+height+"\n"+"power: "+power;
		return super.getInfo()+"\n"+"초능력★: "+power;
	}
	//overloading getInfo()
	public void getInfo(String title)
	{
		System.out.println(title);
		System.out.println(this.getInfo());
	}
	//문. overloading으로 초능력을 증가시키는 메소드로 만들기
	//		이전정보를 출력, 초능력충전 후 초능력정보 같이출력
	public void getInfo(int morePower)
	{
		System.out.println("====BEFORE=====");
		System.out.println(this.getInfo());
		this.power+=morePower;
		System.out.println("★★★★파 워 충 전★★★★");
		System.out.println(this.getInfo());
	}
}//--EO.Superman

class Aquaman extends Human
{
	double speed;
	
	//constructor
	public Aquaman()
	{
		super();
		speed=100.36;
	}
	public Aquaman(String name, int height, double speed)
	{
		super(name,height);
		this.speed=speed;
	}
	
	//overriding getInfo()
	@Override
	public String getInfo()
	{
		return super.getInfo()+"\n"+"스피드♨: "+speed;
	}
}//--EO.Aquaman