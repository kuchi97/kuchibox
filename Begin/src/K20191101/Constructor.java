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


/* 	생성자 객체만들기

 	class유형의 변수 생성
		= (class var.name= new 생성자이름();)
*/


//MyDemo md;						//md라는 객체를 생성, md는 stack에 저장
//md= new MyDemo();				//new 하면 MyDemo생성자가 heap에 저장되고
//MyDemo md2= new MyDemo();		//md는 MyDemo의 주소를 가리킴
//MyDemo md3= new MyDemo();
//MyDemo md4= md;
//
//System.out.println(md);			//같은 MyDemo를 생성했지만
//System.out.println(md2);		//각자 가리키는 주소값이 다 다름
//System.out.println(md3);		//새로 생성된거임 ㅇㅇ
//System.out.println(md4);

//OurDemo od= new OurDemo();		//생성자 안만든 객체도 호출가능?
//System.out.println(od.z);
//생성자를 구성하지 않으면 컴파일러가 디폴트생성자를 제공해줌





/*
	지역변수:	특정 블럭(메소드블럭, 인스턴스블럭 등) 내부에서 선언한 변수
	
	멤버변수:	class 내부에서 선언한 변수
		1. instance var.: 	객체변수
					[객체명.변수]
		2. class var.:		static변수
					[class명.변수]

*/

/*
public class MyMemVar {
	
	int aaa= 10;			//instance var.
	static int bbb= 20;		//class var.
	
	public static void main(String[] args)
	{
		///aaa와 bbb변수 값을 출력
		System.out.println(aaa);
		//객체생성을 해야 메모리에 올라감
		//얘는 객체생성 안해서 아직 안올라갔음
		System.out.println(MyMemVar.bbb);
		//static으로 선언하면 class로딩때 이미 메모리에 올라가있음
		//static var. 는 class이름 붙여서 호출하는걸 권장(자기클래스라도)
		
		
		//static var.도 객체명으로 접근하는것도 가능,, 근데 경고는 뜨네
		 
*/

public class Constructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("이거슨 constructor에 대한 설명을 저장한 클래스입니다");

	}

}
