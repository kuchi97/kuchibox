package k20191112;

import javax.swing.*;

public class AnimalTest2 {
	
	public static void main(String[] args)
	{
		String ani=JOptionPane.showInputDialog("������ �Է��ϼ�");
		String numStr=JOptionPane.showInputDialog("������ �Է��ϼ�");
		
		int num;
		num=Integer.parseInt(numStr);
		
	//�ڵ���̾�Ʈ
		//�θ�Ÿ������ ����
		Animal a= null;
		
		//�� ��쿡���� ��ü�� �������ְ�
		if(ani.equals("������"))
		{
			a= new Dog();
		}
		else if(ani.equals("�����"))
		{
			a= new Cat();
		}
		else if(ani.equals("����"))
		{
			a= new Duck();
		}
		else
		{
			System.out.println("�׷��ž���");
			return;
		}
		//�޼ҵ� ����
		a.crySound();
		a.getBaby(num);

	}

}
