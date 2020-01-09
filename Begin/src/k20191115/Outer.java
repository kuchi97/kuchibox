package k20191115;

public class Outer {
			int a= 10;		//instance var.
	static  int b= 20;		//class var.
	
	class Inner
	{
//		static int c= 30;  [x]
		int c= 30;
		
		void sub()
		{
			System.out.println("wassub()");
		}
		
	}//- - - -EO.Inner		member Class
	
	static class SInner
	{
		static  int d= 40;
				int e= 50;
				
		void foo()
		{
			System.out.println("foo()");
		}
				
	}//- - - -EO.SInner		memberClass

	void test()
	{
		//.inner c Ãâ·Â
		Inner in= new Inner();
			//Outer.Inner in= this.new Inner();
		System.out.println(in.c);
		
	}
}//-	-	-	-	-EO.Outer

