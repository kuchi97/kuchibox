package k20191105;

//access modifier: private, ������, protected, public
public class CoffeeMachine {
	private int coffee;
	private short sugar;
	private long cream;
	
	//setter- ������ void
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
	
	//getter- �Ű����� ����
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
