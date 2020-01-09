package k20191107_1;

/*
overriding
- 물려받은 메소드를 재정의하는것

조건:
	- 오버라이드 하려는 메소드가 부모에 존재해야함
	- 메소드 이름이 동일해야함
	- 메소드의 매개변수, 갯수, 데이터타입이 동일해야함
	- 반환타입도 같아야함
	- 메소드의 접근지정자는 부모클래스와 동일하거나, 더 넓어야함
	- Exception일경우, 부모클래스의 메소드와 동일하거나
		더 구체적인 Exception을 발생시켜야함
*/

//@Override				annotation: 컴파일단계에서 override 문법에 맞는지 체크해줌  
//jdk5.0부터

public class Overriding {
	
	public static void main(String[] args)
	{
		System.out.println("이 클래스는 오버라이딩에 대한 설명이 있다");
		//object
		Human hm1= new Human();
		System.out.println(hm1.getInfo());
		
		Superman sm1= new Superman("나영웅",212,4000);
		System.out.println(sm1.getInfo());
		
		Aquaman am1= new Aquaman();
		System.out.println(am1.getInfo());
		
		System.out.println();
		
		System.out.println("타이틀넣고 출력하기");
		sm1.getInfo("=====Superman=====");
		//파워충전 getInfo()
		sm1.getInfo(500);
		System.out.println();
		
		//2 more Superman object
		Superman sm2= new Superman("고질라",820,30000);
		Superman sm3= new Superman("오인용",198,30);
		
		//superman배열생성
		Superman smArr[]= new Superman[3];
		
		smArr[0]=sm1;
		smArr[1]=sm2;
		smArr[2]=sm3;
		
		for (int i = 0; i < smArr.length; i++) {
			smArr[i].getInfo("슈퍼맨"+(i+1)+" Info");
			System.out.println("\n=============\n");
		}
	}

}
