package ExerciseChap3;

//�����̸��� �Է¹޾� ������ ����ϴ� ���α׷� �ۼ�
//�׸� �� �Է¹����� �����Ų��

//*** String equals(String input)			//���ڿ��� ���ϴ� �޼ҵ� true/false��ȯ

import java.util.Scanner;

public class ExCh3No14 {
	
	public static void main(String[] args)
	{
		//�־��� �迭
		String course[]= {"Java", "C++", "HTML5", "��ǻ�ͱ���", "�ȵ���̵�"};
		int score[]= {95, 88, 76, 62, 55};
		
		String stop="�׸�";
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("�Է��ϼ�: ");
			String inputStr=sc.next();

			for(int i=0; i<course.length; i++)
			{
				if(course[i].equals(inputStr))
				{
					System.out.println(score[i]);
				}
				else
				{
					continue;
				}
			}
		
			if(inputStr.equals(stop))
			{
				System.out.println("program terminated");
				return;
			}
		}
		
	}
	

}
