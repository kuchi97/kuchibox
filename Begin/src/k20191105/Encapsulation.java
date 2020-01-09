package k20191105;

/*
캡슐화(은닉화)
	- data를 캡슐화하고
	- data에 접근할때는 메소드로
	
//자판기에서

class CoffeeMachine
{
	>> private 접근지정자 <<
	private int coffee;
	private int sugar;
		int cream;

메소드를 만들때...
	- setter, getter ==> setXXX(), getXXX()...
	-메소드는 public으로
	
	//매개변수는 멤버변수명이랑 동일하게
	public void setCoffee(int coffee)			//setter는 반환타입이 없다(보통은)
	{
	
		//지역변수와 멤버변수이름이 동일할 경우
		//**지역변수에 우선권**이 있다
		//따라서 멤버변수와 지역변수를 구분하기위하여
		//멤버변수 앞에 this. 를 붙여준다
		//this. 는 static 메소드 안에서는 사용할 수 없다

		this.coffee= coffee;
	}
	public void setSugar(short s)
	{
		sugar= s;
	}
	
	public int getCoffee()					//getter는 매개변수가 없다
	{
		return coffee;
	}
	public short getSugar()
	{
		return sugar;
	}
}
*/

public class Encapsulation {

	public static void main(String[] args) {
		System.out.println("이 페이지는 캡슐화에 대한 설명을 담은것");

	}

}
