package k20191107;
//상속관계: "is a" 관계가 성립해야한다 (단일상속)
//Superman "is a" Human
//Human()에서 name height, getInfo 상속받음

//상속관계를 맺으면 자식클래스의 생성자에서는 묵시적으로 super()를 호출한다
//따라서 부모클래스에 디폴트 생성자 constructor() 가 존재해야한다
//또는 자식클래스 생성자에서 명시적으로 super()를 호출한다

//super()는 생성자 안에서만 호출가능
//생성자의 첫번째줄에 위치해야함
//따라서 this()와 같이 사용 불가, static 문구에서도 사용 불가

/*
//기본생성자
public Superman() 
{
	super("아무개",155);		//super()에는 내가 초기화해주고자 한 값을 대신 넣어준다
//	this.name="아무개";
//	this.height=155;
	power=1000;
}
*/

public class Inheritance {

	public static void main(String[] args) {
		
		System.out.println("이 클래스는 상속성에 대한 설명을 하고있다");
		
		//Human 객체 생성햇 getInfo()로 정보출력
		//Superman 객체생성해서 getInfo()
		
		Human hm= new Human("홍길동",166);
		System.out.println(hm.getInfo());
		
		Superman sm= new Superman();
		System.out.println(sm.getInfo());
		
		Aquaman am= new Aquaman();
		System.out.println(am.getInfo());
		Aquaman am1= new Aquaman("최우럭", 136, 203.12);
		System.out.println(am1.getInfo());
		

	}

}
