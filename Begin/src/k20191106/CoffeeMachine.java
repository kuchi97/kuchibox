package k20191106;

class Yuja
{
	private int yuja;
	private int sugar;
	
	public int getYuja() {
		return yuja;
	}
	public void setYuja(int yuja) {
		this.yuja = yuja;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	
}
public class CoffeeMachine {
	
	int coffee, sugar, cream;
	
/*	method overload 
 * 		1. 메소드명이 같아야함
 * 		2. 매개변수의 자료형이 다르거나, 갯수가 다르거나 순서가 달라야함
 * 		3. 반환타입은 신경안쓴다
 */
	
	//커피만들기 메소드- 블랙커피
	public void makeTea(int coffee)
	{
		this.coffee=coffee;
		System.out.println("블랙커피 나갑니다");
	}
	//커피만들기- 설탕커피
	public void makeTea(int coffee, int sugar)
	{
		this.coffee=coffee;
		this.sugar=sugar;
		System.out.println("설탕커피 나갑니다");
	}
	//커피만들기- 크림커피
	//커피&크림 이면 같은 메소드명에 같은자료형(int int)이므로 중복된 메소드 에러뜸
	public void makeTea(int coffee, short cream)			//int가 포함할 수 있는 자료형 short로 교체
	{
		this.coffee=coffee;
		this.cream=cream;
		System.out.println("크림커피 나갑니다");
	}
	//똑같은 크림커피
	public void makeTea(short cream, int coffee)			//int short 순서가 바뀌어도 중복오류 안뜸
	{
		this.makeTea(coffee, cream);						//자기 클래스의 크림커피(int short)를 호출
	}
	
	public String makeTea(int coffee, int sugar, int cream)
	{
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		return "밀크커피 나가요";
	}
	
	public void makeTea(Yuja yuja)
	{
		System.out.println("유자차 나가요");
		System.out.println("유자: "+yuja.getYuja());
		System.out.println("설탕: "+yuja.getSugar());
		System.out.println("유자차농도: "+(yuja.getYuja()+yuja.getSugar()));
	}

}
