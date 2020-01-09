package k20191113;

/*
final modifier
	1. final+class: 상속을 못받게
	2. final+method: 오버라이딩 못하게
	3. final+변수: 값할당 못하게



*/

class Super
{
	void foo()
	{
		System.out.println("Super foo()");
	}
	
	final void bar()
	{
		System.out.println("Super bar()");
	}
	
}//----EO.Super

final class Sub extends Super
{
	@Override
	protected void foo()
	{
		System.out.println("Sub foo()");
	}
	//final method라 오버라이드 안됨
//	public void bar()
//	{
//		System.out.println("Sub bar()");
//	}
}//------EO.Sub

//final class라 상속 안됨
class SubSub //extends Sub
{
	int x=10;
	public static final int Y= 20;		//final변수 = 상수
}
public class FinalTest {

	public static void main(String[] args) {

		//SubSub의 x y 값 출력
		SubSub ssub= new SubSub();
		
		System.out.println(ssub.x);			//instance
		System.out.println(SubSub.Y);		//static
		
		ssub.x= 100;
//		SubSub.Y=200;
		System.out.println(ssub.x);			//instance
		System.out.println(SubSub.Y);		//static
		

	}

}
