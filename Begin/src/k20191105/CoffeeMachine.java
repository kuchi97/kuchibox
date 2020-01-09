package k20191105;

//access modifier: private, 생략형, protected, public
public class CoffeeMachine {
	private int coffee;
	private short sugar;
	private long cream;
	
	//setter- 리턴은 void
	public void setCoffee(int c)
	{
		coffee= c;
	}
	public void setSugar(short s)
	{
		sugar= s;
	}
	public void setCream(long cr)
	{
		cream= cr;
	}
	
	//getter- 매개변수 없음
	public int getCoffee()
	{
		return coffee;
	}
	public short getSugar()
	{
		return sugar;
	}
	public long getCream()
	{
		return cream;
	}

}
