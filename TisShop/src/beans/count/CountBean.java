package beans.count;

public class CountBean {
	
	private int count;		//멤버변수
	//property(jsp)는 html의 input name과 일치시킨다
	
	
	//constructor
	public CountBean()
	{
		System.out.println(".CountBean 생성됨");
	}

	//setter,getter
	public void setCount(int val)
	{
		System.out.println("setCount(): "+val);
		this.count+=val;		//val을 누적시키는 setter
	}
	public int getCount()
	{
		return count;
	}
}
