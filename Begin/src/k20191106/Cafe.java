package k20191106;

public class Cafe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CoffeeMachine cm= new CoffeeMachine();
		Yuja yj= new Yuja();
		
		
		//1. ��Ŀ��
		//2. ����Ŀ��
		//3. ��ũĿ��
		//4. ũ��Ŀ��
		
		cm.coffee=3;
		cm.sugar=4;
		cm.cream=2;
		
		cm.makeTea(cm.coffee);
		cm.makeTea(cm.coffee, cm.sugar);
		System.out.println(cm.makeTea(cm.coffee, cm.sugar, cm.cream));
		cm.makeTea(cm.coffee, (short)cm.cream);
		//�޼ҵ忡 �׳� ���ڳ־ ���ݾ� ��û��
		
		//5. ������
		yj.setSugar(3);
		yj.setYuja(3);
		cm.makeTea(yj);

	}

}
