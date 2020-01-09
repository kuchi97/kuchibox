package k20191113;

interface MyInterface
{
	void foo();				//public , abstract 가 생략되어있음
	
	
}//-----------EO.MyInterface

interface YourInterface
{
	String STR="Hello";		//public static final이 자동으로 붙음
	
	String bar();
}//----------EO.YourInterface

//인터페이스를 상속받을 때는 implements 로 상속받으며
//다중상속이 가능하다

public class MyClass implements MyInterface, YourInterface{
	
	@Override
	public void foo()
	{
		System.out.println("this is foo");
	}
	public String bar()
	{
		return "안녕하쎄요우";
	}

	public static void main(String[] args) {
		
		MyClass my= new MyClass();
		my.foo();
		System.out.println(my.bar());
		
		//인터페이스도 타입선언은 가능하지만,
		//객체생성은 불가능하다
//		MyInterface mi; (o)
//		mi= new MyInterface(); (x)
		
		//mi타입으로 foo bar 부르기
		MyInterface mi= new MyClass();
		mi.foo();
		//bar()는 출력되는거 없음
		((MyClass)mi).bar();
		
		
		//yi타입으로 foo bar 부르기
		YourInterface yi= new MyClass();
		((MyClass)yi).foo();
		System.out.println(yi.bar());

		//STR값 출력
		System.out.println(YourInterface.STR);		//static이니까 class명으로
		System.out.println(MyClass.STR);			//MyClass가 상속받았으니 이것도 가능
//		MyClass.STR="Hi";							//final은 변경불가
	}

}
