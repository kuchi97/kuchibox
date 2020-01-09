package k20191118;

import javax.swing.JFrame;

public class Local {

	String str="!@#";			//멤버변수
	
	void bar()
	{
		int num= 100;			//지역변수
		
		System.out.println("str: "+str);
		System.out.println("num: "+num);

		
		class LocalInner 			//local inner class
		{
			String lstr="abc";
			
			public void foo()
			{
				//str, num, lstr 출력
				System.out.println("str: "+str);
				System.out.println("num: "+num);
				System.out.println("lstr: "+lstr);
					/*jdk 7.0 이전에는 로컬이너클래스에서 final이 아닌지역변수는 접근 안됨*/
				
			}
		}
		
		LocalInner li= new LocalInner ();
		li.foo();

		/*
		로컬이너클래스는 자기가 속한 메소드 안에서 객체생성을 해야함
		다른 메소드에서는 객체 생성이 불가능하며, 
		클래스를 구성한 후에 객체생성 가능
		지역변수처럼 생각해
		*/

	}//-	-	-.bar
	
	
	
	public static void main(String[] args) {
		
		Local l= new Local();
		l.bar();

		
	}
}
