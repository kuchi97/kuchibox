package myLastWordGame;

import java.util.Scanner;
public class WordGameApp {
	Scanner sc= new Scanner(System.in);
	
	public void runGame()
	{
		Player p= new Player();						//player()��ü��ȯ
		
		System.out.print("how many?: ");
		int numberOfPlayer= sc.nextInt();
		
		String pl[]= new String[numberOfPlayer];	//�÷��̾�����
		
		//������ ����
		for(int i=0; i<pl.length; i++)
		{
			pl[i]= p.player();
		}
		
		//������ ���
		for(int i=0; i<pl.length; i++)
		{
			System.out.println("������"+(i+1)+": "+pl[i]);
		}
		
		System.out.println("���۴ܾ�� '�ƹ���' �Դϴ�");
		
		//���ӽ���
		int count=0;

		String input= "�ƹ���";
		while(true)
		{
			
			
			//���ܾ� ���������ڿ� �Ĵܾ� ù���� ���ϱ�
			int lastIndex= input.length()-1;		//���ܾ� �����������ε���
			char lastChar= input.charAt(lastIndex);	//���ܾ� ����������
			
			System.out.print(pl[count]+">> ");
			input= sc.next();						//���ܾ� �Է�
			
			char firstChar= input.charAt(0);		//���ܾ� ù����
			
			
			if(lastChar == firstChar)
			{
				count++;
				if(count == (numberOfPlayer))
					count=0;
				continue;
			}
			else
				break;

		}//while
		System.out.println(pl[count]+"�� �й��Ͽ����ϴ�");
		
	
	}//runGame method
	
	public static void main(String[] args)
	{
		WordGameApp rg= new WordGameApp();
		rg.runGame();
	}

}
