package k20191107;

public class Human {				//클래스를 만들면 묵시적으로 Object라는 친구를 상속받고있음
	
	String name;
	int height;
	
	public Human(String name, int height)
	{
		this.name= name;
		this.height=height;
	}
	
	public String getInfo()
	{
		return "이름: "+name+"\n"+"키: "+height;
	}

}
//--EO.Human

class Superman extends Human		//상속관계: "is a" 관계가 성립해야한다 (단일상속)
{									//Superman "is a" Human
									//Human()에서 name height, getInfo 상속받음
	int power;
	
	//constructor
	public Superman() 
	{
		//상속관계를 맺으면 자식클래스의 생성자에서는 묵시적으로 super()를 호출한다
		//따라서 부모클래스에 디폴트 생성자 constructor() 가 존재해야한다
		//또는 자식클래스 생성자에서 명시적으로 super()를 호출한다
		
		super("아무개",155);		//super()에는 내가 초기화해주고자 한 값을 대신 넣어준다
//		this.name="아무개";
//		this.height=155;
		power=1000;
	}
	public Superman(String name, int height, int power)
	{
		super(name, height);		//super()는 생성자 안에서만 호출가능
//		this.name=name;				//생성자의 첫번째줄에 위치해야함
//		this.height=height;			//따라서 this()와 같이 사용 불가, static 문구에서도 사용 불가
		this.power=power;
	}
}
//EO.Superman

class Aquaman extends Human
{
	double speed;
	
	public Aquaman()
	{
		super("김광어",195);
//		this.name="김광어";
//		this.height=195;
		speed= 38.38;
	}
	public Aquaman(String name, int height, double speed)
	{
		super(name,height);
//		this.name=name;
//		this.height=height;
		this.speed=speed;
	}
}
//EO.Aquaman