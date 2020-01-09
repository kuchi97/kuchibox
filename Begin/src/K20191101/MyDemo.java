package K20191101;

/*
	- 클래스의 member
		1. 생성자constructor:	객체를 생성할 때 호출되는 일종의 메소드
					[생성자구성규칙]
						접근지정자(ex> public) 생성자이름()
						{
						
						}
						- 단, 생성자이름은 class명과 동일해야함
						- ** 반환타입은 명시하지 않는다
					[역할]
						member var.(=instance var.) 초기화
						
								
		2. member var.
		3. method
*/
public class MyDemo {
	int x;		//멤버변수(전역변수-instance변수/객체변수)
	static int y;	//멤버변수(전역변수-class변수/static변수)
// **전역변수는 초기화안하면 기본값 들어감
	
	public MyDemo()
	{
		System.out.println("MyDemo() constructor.x: "+x);
		x=100;		//instance var. init;
		int z;	//지역변수(local var./automatic변수)
		
		//System.out.println("z: "+z);
		System.out.println("x: "+x);
	}

}
