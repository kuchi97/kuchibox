package k20191105;

public class Cafe {
	
	public static void main(String[] args)
	{
		CoffeeMachine cm= new CoffeeMachine();	//Ŀ�Ǹӽ� ��ü����
		
		//Ŀ�� ���� ũ�� �� �����ϰ� ����ϱ�
		
		cm.setCoffee(3);
		cm.setSugar((short)4);
		cm.setCream(2);
		
		System.out.println("coffee: "+cm.getCoffee());
		System.out.println("sugar: "+cm.getSugar());
		System.out.println("cream: "+cm.getCream());
		
	}

}
