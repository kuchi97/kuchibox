package k20191108;

//부모클래스= super class, base class
class Super
{
	int a=10;
	int b=20;
	
	void func()
	{
		System.out.println("***********");
		
		
	}
}//--EO.Super

//자식클래스= sub class, derived class
class Sub extends Super
{
	int b=30;
	int c=40;
	
	@Override
	void func()
	{
		System.out.println("EEEEEEEEEE");
	}
}//EO.Sub


public class Polymorphism2 {

	public static void main(String[] args) {
		
		System.out.println(("1----------------"));
		Super sp= new Super();
		System.out.println("sp.a: "+sp.a);	//10
		System.out.println("sp.b: "+sp.b);	//20
		sp.func();							//*****
		
		System.out.println("\n=============\n");
		
		System.out.println(("2----------------"));
		Sub sb= new Sub();
		System.out.println("sb.a: "+sb.a);	//10
		System.out.println("sb.b: "+sb.b);	//30
		System.out.println("sb.c: "+sb.c);	//40
		sb.func();							//EEEEE
		
		System.out.println("\n=============\n");

		System.out.println(("3----------------"));
		Super ss= new Sub();
		System.out.println("ss.a: "+ss.a);	//10
		System.out.println("ss.b: "+ss.b);	//20
		//System.out.println("ss.c: "+ss.c);
		ss.func();							//EEEEE
		
		System.out.println("\n=============\n");
		
		System.out.println(("4----------------"));
		//문. sp sb ss를 저장할 배열을 선언하고 위 객체를 저장
		//반복문 돌면서 func호출
		
		Super family[]= new Super[3];
		family[0]= sp;
		family[1]= sb;
		family[2]= ss;
		
		for(Super s:family)
		{
			s.func();
		}

	}

}//
