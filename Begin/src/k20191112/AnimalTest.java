package k20191112;

import javax.swing.*;

public class AnimalTest {
	
	public static void main(String[] args)
	{
		String ani=JOptionPane.showInputDialog("동물을 입력하셈");
		String numStr=JOptionPane.showInputDialog("마리수 입력하셈");
		
		int num;
		num=Integer.parseInt(numStr);
		
		if(ani.equals("강아지"))
		{
			Dog dog= new Dog();
			System.out.print("강아지는 ");
			dog.crySound();
			dog.getBaby(num);
		}
		else if(ani.equals("고양이"))
		{
			Cat cat= new Cat();
			System.out.print("고양이는 ");
			cat.crySound();
			cat.getBaby(num);
		}
		else if(ani.equals("오리"))
		{
			Duck duck= new Duck();
			System.out.print("오리는 ");
			duck.crySound();
			duck.getBaby(num);
		}
		else
			System.out.println("그런거없다");
			return;


	}

}
