package k20191106;


/*
다형성
	- 여러가지 형태를 가질수있는 성질
	- 한타입의 참조변수로 여러타입의 객체를 참조할수있도록 함
	
	
overloading- 생성자 오버로딩, 메소드 오버로딩
		: 메소드이름을 동일하게 주되,
		 매개변수의 데이터타입과 갯수 순서를 다르게 주어서 구성
		 
		 **조건**: 오버로딩하려는 메소드이름이 같아야함
		 		메소드 매개변수의 데이터형, 갯수, 순서중 어느 하나는 달라야한다
		 		반환타입은 신경안쓴다(같든지 말든지)
*/

/*
class coffeeMachine 
{
	int coffee, sugar, cream;
	
	
//method overload
//메소드 이름을 동일하게 여러개 구성

1. 메소드명이 같아야함
2. 매개변수의 자료형이 다르거나, 갯수가 다르거나 순서가 달라야함
3. 반환타입은 신경안쓴다
		
	void makeTea(int c)
	void makeTea(int c, int s)
	void makeTea(int c, int s, int cr)
	
	
	//	constructor overload
	//	- 형식은 메소드 오버로드와 같음
	
}
*/

/*	
생성자 코드 다이어트
매개변수가 제일 많은녀석을 기본값으로 하기로 정하고 this() 사용

단,
	- this()는 생성자 안에서만 호출해야함 (=메소드에서 사용안돼)
	- this()를 호출할때는 반드시 생성자의 첫번째 문장이어야함
	- this()와 super()(상속받은 부모의 생성자 호출)는 공존할수 없다
*/

/*		주의!!	
*** 우리가 생성자를 하나라도 구성하면
	컴파일러가 제공해주던 기본생성자는 사라진다 ***
	교재 pp186~192
*/


/*
부모자식의 상속관계를 맺을 경우,
부모타입으로 변수를 선언하고,
자식의 객체를 생성하는 것이 가능

하지만 그 참조변수로 참조할 수 있는 범위는 제한이 있다
	- 자식의 고유한 변수나 메소드는 접근할 수 없다
	- 자식 클래스에 오버라이드한 메소드가 있다면,
		그 오버라이딩 메소드를 우선 호출한다
*/

/*
Human hs= new Superman("반슈퍼",33, 140);
System.out.println("hs.name: "+hs.name);
System.out.println("hs.height: "+hs.height);

//power는 자식의 변수이기때문에 human이 접근못함
//System.out.println("hs.power: "+hs.power);

//Human 타입의 hs를 Superman으로 캐스팅
//단 .연산자 우선순위가 높아서 ()묶어주기
System.out.println(((Superman)hs).power);

//자식클래스에 override한 getInfo()가 출력됨
System.out.println(hs.getInfo());
		
//자식클래스에서 overload한 메소드에는 적용안됨
//hs.getInfo("슈 퍼 맨");
//마찬가지로 메소드도 형변환
((Superman)hs).getInfo("===슈 퍼 맨===");
*/

/*
instanceof 연산자

	참조변수 instanceof 클래스명
		:	변수가 클래스의 객체이면 true, 아니면 false 반환
*/
/*
Human hero[]= {h1, s1, a1, hs, ha};
for(Human h: hero)
{
	if(h instanceof Superman)
	{
		((Superman)h).getInfo("===나만타이틀없어===");
		System.out.println();
	}
	else
	{
		System.out.println(h.getInfo());
		System.out.println();
	}
}
*/



public class Polymorphism {

	public static void main(String[] args) {
		System.out.println("이 클래스는 다형성과 오버로딩에 대한 설명이 있음");

	}

}
