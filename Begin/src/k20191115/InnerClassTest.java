package k20191115;

import k20191115.Outer.Inner;

public class InnerClassTest {

	public static void main(String[] args) {

		//.outer a b 출력
		Outer o= new Outer();
		System.out.println(o.a);
		System.out.println(Outer.b);	//static
		
		System.out.println("=========================");
		
		//.outer 안의 inner 안의 c 출력 sub() 호출
		Outer.Inner oi= o.new Inner();
		System.out.println(oi.c);
		oi.sub();
		
		Outer.Inner oi2= new Outer().new Inner();
		oi2.sub();
		
		
		
		//.outer 의 sinner 안의 d e 출력 foo() 호출
		Outer.SInner os= new Outer.SInner();
		System.out.println(Outer.SInner.d);
		System.out.println(os.e);
		os.foo();								//static method
		
	}

}
