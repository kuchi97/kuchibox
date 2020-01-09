package k20191113;

interface Inter1
{
	void a();
	void b();
	
}//------EO.Inter1
interface Inter2
{
	int x=50;
}//-------EO.Inter2

// interface가 interface를 상속받을때는 extends로 받으며
// 다중상속은 가능

//따라서 class <- interface >> implements
//		interface <- interface >> extends

interface HisInter extends Inter1, Inter2
{
	String c();
}//-------EO.HisInter

abstract class AbsClass
{
	int y=60;
	
	abstract void d();
}//-------EO.AbsClass

/*
MyDemo에서
absclass와 hisinter를 상속받아
추상메소드 오버라이딩하기
*/
public class MyDemo extends AbsClass implements HisInter{

	@Override
	void d()
	{
		System.out.println("나는 추상이었다d");
	}
	public void a()
	{
		System.out.println("나는 인터1소속 a다");
	}
	public void b()
	{
		System.out.println("나는 인터1소속 b다");
	}
	public String c()
	{
		return "헤헿";
	}
	
	public static void main(String[] args)
	{
		MyDemo md= new MyDemo();
		md.d();
		md.a();
		md.b();
		System.out.println(md.c());
		
		//absclass 타입의 mydemo객체 생성 메소드 어디까지 접근가능한가
		AbsClass abs= new MyDemo();
		abs.d();
		System.out.println(abs.y);
		
		
		//hisinter 타입 mydemo객체 생성
		HisInter hi= new MyDemo();
		hi.a();
		hi.b();
		hi.c();
		
		System.out.println(Inter2.x);				//이건 static이니까 직접 접근가능
		//HisInter.x 나 MyDemo.x 로도 접근가능- 상속받았으니까
		
	}
}
