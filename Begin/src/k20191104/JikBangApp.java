package k20191104;

/*
	- 집, 중개인, 매도자, 매수자... =객체(Object) --(인스턴스화)--> object(instance)
	- 추상화 ==> 클래스로 구현하는것
		1. 속성(명사형) ==> 멤버변수로 구현
		2. 행동양식(동사형) ==> 메소드로 구현
	
*/
//한페이지 내에 여러개의 클래스 구현가능
//단 public 속성은 한 클래스에만 부여가능
//주로 파일명과 동일한 클래스나 main()을 가진쪽에 부여
class House
{
	int room;		//'has a' 관계가 성립해야한다
					// ex) [house] has a [room]  관계가 성립해야한다
					//		house has an engine (x)
	String owner;
	String addr;
	
	//개괄정보
	public void showInfo()
	{
		System.out.println("----House Info.----");
		System.out.println("owner: "+owner);
		System.out.println("room : "+room);
		System.out.println("address: "+addr);
	}
	
	//상세주소
	public String existAt(int bunji)
	{
		String str=owner+"님의 집: "+addr+" "+bunji+"번지에 위치해요";
		return str;
	}
	
}//House.class
//--------------------------------------------------------------------------

/*
	클래스 :객체를 만들어내는 틀 (ex> 설계도, 붕어빵틀)
	객  체 :클래스를 통해 만들어진 구현물 (ex> 집, 붕어빵)
	
*/


//JikBangApp.class
public class JikBangApp {

	public static void main(String[] args) {
		
		House h1= new House();			//instance, object
		House h2= new House();
		
		h1.showInfo();					//초기화 안해서 기본값있음
		h2.showInfo();
		
		h1.owner="홍길동";
		h1.room= 2;
		h1.addr="마포구 서교동";
		
		h2.owner="김길동";
		h2.room= 3;
		h2.addr= "영등포구 당산동";
		
		h1.showInfo();
		h2.showInfo();
		
		//q. 객체생성후 초기값부여. showinfo()
		//existat()호출하여 세부주소도 출력
		
		//우리집
		House h3= new House();
		h3.owner="나";
		h3.room=2;
		h3.addr="동작구 노량진동";
		
		String addrDetail= h3.existAt(255);
		
		h3.showInfo();
		System.out.println(addrDetail);
		System.out.println(h3.existAt(255));
		
	}

}
