package k20191115;

import k20191115.Outer.Inner;

public class InnerClassTest {

	public static void main(String[] args) {

		//.outer a b ���
		Outer o= new Outer();
		System.out.println(o.a);
		System.out.println(Outer.b);	//static
		
		System.out.println("=========================");
		
		//.outer ���� inner ���� c ��� sub() ȣ��
		Outer.Inner oi= o.new Inner();
		System.out.println(oi.c);
		oi.sub();
		
		Outer.Inner oi2= new Outer().new Inner();
		oi2.sub();
		
		
		
		//.outer �� sinner ���� d e ��� foo() ȣ��
		Outer.SInner os= new Outer.SInner();
		System.out.println(Outer.SInner.d);
		System.out.println(os.e);
		os.foo();								//static method
		
	}

}
