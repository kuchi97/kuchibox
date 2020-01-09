package k20191105;

public class Cafe {
	
	public static void main(String[] args)
	{
		CoffeeMachine cm= new CoffeeMachine();	//커피머신 객체생성
		
		//커피 설탕 크림 값 설정하고 출력하기
		
		cm.setCoffee(3);
		cm.setSugar((short)4);
		cm.setCream(2);
		
		System.out.println("coffee: "+cm.getCoffee());
		System.out.println("sugar: "+cm.getSugar());
		System.out.println("cream: "+cm.getCream());
		
	}

}
