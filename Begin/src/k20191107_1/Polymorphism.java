package k20191107_1;

public class Polymorphism {

	public static void main(String[] args) {
		
		Human h1= new Human("김미남", 150);
		System.out.println(h1.getInfo());
		
		Superman s1=new Superman("양슈퍼", 223, 5000);
		s1.getInfo("=====★슈☆퍼★맨☆=====");
		
		Aquaman a1= new Aquaman("송방어", 124, 500);
		System.out.println(a1.getInfo());

/*
부모자식의 상속관계를 맺을 경우,
부모타입으로 변수를 선언하고,
자식의 객체를 생성하는 것이 가능

하지만 그 참조변수로 참조할 수 있는 범위는 제한이 있다
	- 자식의 고유한 변수나 메소드는 접근할 수 없다
	- 자식 클래스에 오버라이드한 메소드가 있다면,
		그 오버라이딩 메소드를 우선 호출한다
*/
		System.out.println("\n=============\n");
		
		
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
		
		System.out.println("\n=============\n");
		
		Human ha= new Aquaman();
		System.out.println("ha.name: "+ha.name);
		System.out.println("ha.height: "+ha.height);
		
		//System.out.println("ha.speed: "+ha.speed);
		System.out.println(ha.getInfo());
		
		System.out.println("\n=============\n");
		
		//문 h1, s1 ,a1, hs, ha 저장배열선언
		//for로 돌려
		//Superman 객체라면 타이틀붙인 메소드로 출력
		
		Human hero[]= {h1, s1, a1, hs, ha};
		for(Human h: hero)
		{
/*
instanceof 연산자

	참조변수 instanceof 클래스명
		:	변수가 클래스의 객체이면 true, 아니면 false 반환
*/
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
	}

}
