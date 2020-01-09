package K20191101;
/*
	method:
		1. 구성방식
			접근지정자access modifier(public..) 반환타입(void..) 이름(매개변수)
			{
				기능;
			}
			
			method명: 동사형, 소문자시작, camel표기 혹은 _
			
		2. 메소드 종류
			2.1. instance method( =non-static method)
				- 객체 생성 후, 
					[객체명.메소드()]
			2.2. class method( =static method)
				- [클래스명.메소드()]
					
*/
public class HisDemo {
	
	public void sayHello()
	{
		System.out.println("Hello");
	}
	
	public static void sayHi(String str)
	{
		System.out.println("Hi "+str);
	}
	
	//매개변수를 받아들이는 메소드
	public static void plus(int a,int b)
	{
		System.out.println(a+"+"+b+"="+(a+b));
	}
	
	public void minus(float a, float b)
	{
		System.out.println(a+"-"+b+"="+(a-b));
	}

	
	public static void main(String[] args)
	{
		//sayHello 호출
		
		HisDemo hello= new HisDemo();		//[class] [var.name]= new [class]();
		hello.sayHello();					//메소드덩어리를 부를거니까 클래스에서 찾아야됨
		
		
		//sayHi호출
		HisDemo.sayHi("길동");

		HisDemo.plus(56, 46);

		hello.minus(2020.39f, 29.222f);

	}

}
