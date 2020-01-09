package K20191101;

/*
	지역변수:	특정 블럭(메소드블럭, 인스턴스블럭 등) 내부에서 선언한 변수
	
	멤버변수:	class 내부에서 선언한 변수
		1. instance var.: 	객체변수
					[객체명.변수]
		2. class var.:		static변수
					[class명.변수]

*/

public class MyMemVar {
	
	int aaa= 10;			//instance var.
	static int bbb= 20;		//class var.
	
	public static void main(String[] args)
	{
		///aaa와 bbb변수 값을 출력
//		System.out.println(aaa);
//		객체생성을 해야 메모리에 올라감
//		얘는 객체생성 안해서 아직 안올라갔음
		System.out.println(MyMemVar.bbb);
		//static으로 선언하면 class로딩때 이미 메모리에 올라가있음
		//static var. 는 class이름 붙여서 호출하는걸 권장(자기클래스라도)
		
		MyMemVar mv= new MyMemVar();
		//MyMemVar객체 생성
		System.out.println(mv.aaa);
		
		System.out.println(mv.bbb);
		//static var.도 객체명으로 접근하는것도 가능,, 근데 경고는 뜨네
		
		MyMemVar mv2= new MyMemVar();
		System.out.println(mv2.aaa);
		System.out.println(mv2.bbb);
		
		System.out.println("\nchange mv2=============");
		mv2.aaa=500;
		mv2.bbb=800;
		
		//mv.aaa, bbb 출력
		//mv2.aaa, bbb출력
		
		System.out.println("mv.aaa: "+mv.aaa);
		System.out.println("mv.bbb: "+mv.bbb);			//static이라 mv도 바뀌어있음
		System.out.println("mv2.aaa: "+mv2.aaa);
		System.out.println("mv2.bbb: "+mv2.bbb);
	}

}
