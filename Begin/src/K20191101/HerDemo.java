package K20191101;

//��ȯŸ���� �ִ� �޼ҵ�

public class HerDemo {
	
	//��ȯŸ���� �����ϸ� �ݵ�� return ����ߵ�
	public static int giveMe(int money)
	{
		System.out.println("giveMe() money: "+money);
		return money*3;
	}
	
	public String show(String abc)
	{
		System.out.println("-----show()------");
		return abc.toUpperCase();
	}

	public static void main(String[] args)
	{
		System.out.println("���� "+HerDemo.giveMe(1000));
		
		HerDemo str= new HerDemo();	//HerDemo ��ü�� ����
		System.out.println(str.show("give me chocolate"));
	}
}
