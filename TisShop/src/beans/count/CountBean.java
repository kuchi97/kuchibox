package beans.count;

public class CountBean {
	
	private int count;		//�������
	//property(jsp)�� html�� input name�� ��ġ��Ų��
	
	
	//constructor
	public CountBean()
	{
		System.out.println(".CountBean ������");
	}

	//setter,getter
	public void setCount(int val)
	{
		System.out.println("setCount(): "+val);
		this.count+=val;		//val�� ������Ű�� setter
	}
	public int getCount()
	{
		return count;
	}
}
