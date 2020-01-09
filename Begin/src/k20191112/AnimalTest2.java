package k20191112;

import javax.swing.*;

public class AnimalTest2 {
	
	public static void main(String[] args)
	{
		String ani=JOptionPane.showInputDialog("동물을 입력하셈");
		String numStr=JOptionPane.showInputDialog("마리수 입력하셈");
		
		int num;
		num=Integer.parseInt(numStr);
		
	//코드다이어트
		//부모타입으로 선언
		Animal a= null;
		
		//각 경우에대한 객체만 생성해주고
		if(ani.equals("강아지"))
		{
			a= new Dog();
		}
		else if(ani.equals("고양이"))
		{
			a= new Cat();
		}
		else if(ani.equals("오리"))
		{
			a= new Duck();
		}
		else
		{
			System.out.println("그런거없다");
			return;
		}
		//메소드 적용
		a.crySound();
		a.getBaby(num);

	}

}
