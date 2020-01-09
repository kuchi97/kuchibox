package k20191106;

class Superman
{
	String name;
	int height;
	int power;

/*	method overload 
 * 		1. 메소드명이 같아야함
 * 		2. 매개변수의 자료형이 다르거나, 갯수가 다르거나 순서가 달라야함
 * 		3. 반환타입은 신경안쓴다
 */
//	constructor overload
//	- 형식은 메소드 오버로드와 같음
	
	// default constructor: 매개변수 없는 생성자
/*	public Superman()
	{
		name="아무개";
		height=198;
		power=0;
	}
	
	// 인자 생성자: 매개변수가 있는 생성자
	public Superman(String name)
	{
		this.name=name;
		height= 160;
		power= 50;
	}
	public Superman(String name, int height)
	{
		this.name=name;
		this.height=height;
		power=100;
	}
*/
	public Superman(String name, int height, int power)
	{
		this.name=name;
		this.height=height;
		this.power=power;
	}//#default constructor
/*	
	생성자 코드 다이어트
	매개변수가 제일 많은녀석을 기본값으로 하기로 정하고 this() 사용
	단,
	- this()는 생성자 안에서만 호출해야함 (=메소드에서 사용안돼)
	- this()를 호출할때는 반드시 생성자의 첫번째 문장이어야함
	- this()와 super()는 공존할수 없다
*/
	public Superman()
	{
		this("아무개",150,0);
	}
	//#default constructor를 참조하여 각 매개변수를 초기화
	public Superman(String name)
	{
		this(name, 160, 50);
	}
	public Superman(String name, int height)
	{
		this(name, height, 100);
	}
	public void showInfo()
	{
		System.out.println("- Superman Info. -");
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("power: "+power);
	}
}//.Superman

class Aquaman
{
	String name;
	int height;
	double speed;
	
	//생성자를 구성하고 3가지정도로 오버로드하세요
	//생성자 안에서 this 이용해서 코드줄여보기
	//main()에서 아쿠아맨 3개정도 호출
	public Aquaman(String name, int height, double speed)
	{
		this.name=name;
		this.height=height;
		this.speed=speed;
	}
//	public Aquaman()
//	{
//		this("이광어", 200, 150);
//	}
	
/*	
*** 우리가 생성자를 하나라도 구성하면
컴파일러가 제공해주던 기본생성자는 사라진다 ***
*/
	public Aquaman(String name)
	{
		this(name, 180, 100);
	}
	public Aquaman(String name, double speed)
	{
		this(name,170,speed);
	}
	public void showInfo()
	{
		System.out.println("- Aquaman Info. -");
		System.out.println("name: "+name);
		System.out.println("height: "+height);
		System.out.println("speed: "+speed);
	}
	
}//.Aquaman
public class Overloading {

	public static void main(String[] args) {
		// 슈퍼맨 정보 출력
		Superman sm= new Superman();
		sm.showInfo();
		
		sm.name= "clark";
		sm.height= 200;
		sm.power=20000000;
		sm.showInfo();
		
		Superman sm2= new Superman("김슈퍼");
		sm2.showInfo();
		
		//이름, 키 생성자
		Superman sm3= new Superman("짭슈퍼", 150);
		sm3.showInfo();
		
		//이름, 키, 초능력 생성자
		Superman sm4= new Superman("김씨", 170, 5);
		sm4.showInfo();
		
		//생성자 없어서 에러
//		Aquaman am= new Aquaman();
//		am.showInfo();
		
		Aquaman am2= new Aquaman("이송어");
		am2.showInfo();
		Aquaman am3= new Aquaman("이연어", 28.8);
		am3.showInfo();
		Aquaman am4= new Aquaman("이방어", 185, 34);
		am4.showInfo();
	}

}
