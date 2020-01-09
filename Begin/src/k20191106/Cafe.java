package k20191106;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeMachine cm= new CoffeeMachine();
		Yuja yj= new Yuja();
		
		
		//1. 블랙커피
		//2. 설탕커피
		//3. 밀크커피
		//4. 크림커피
		
		cm.coffee=3;
		cm.sugar=4;
		cm.cream=2;
		
		cm.makeTea(cm.coffee);
		cm.makeTea(cm.coffee, cm.sugar);
		System.out.println(cm.makeTea(cm.coffee, cm.sugar, cm.cream));
		cm.makeTea(cm.coffee, (short)cm.cream);
		//메소드에 그냥 숫자넣어도 되잖아 멍청아
		
		//5. 유자차
		yj.setSugar(3);
		yj.setYuja(3);
		cm.makeTea(yj);

	}

}
