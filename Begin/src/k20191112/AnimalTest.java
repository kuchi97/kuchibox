package k20191112;

import javax.swing.*;

public class AnimalTest {
	
	public static void main(String[] args)
	{
		String ani=JOptionPane.showInputDialog("������ �Է��ϼ�");
		String numStr=JOptionPane.showInputDialog("������ �Է��ϼ�");
		
		int num;
		num=Integer.parseInt(numStr);
		
		if(ani.equals("������"))
		{
			Dog dog= new Dog();
			System.out.print("�������� ");
			dog.crySound();
			dog.getBaby(num);
		}
		else if(ani.equals("�����"))
		{
			Cat cat= new Cat();
			System.out.print("����̴� ");
			cat.crySound();
			cat.getBaby(num);
		}
		else if(ani.equals("����"))
		{
			Duck duck= new Duck();
			System.out.print("������ ");
			duck.crySound();
			duck.getBaby(num);
		}
		else
			System.out.println("�׷��ž���");
			return;


	}

}
