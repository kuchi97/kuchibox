package k01HumanMaker;
//��� �Ż��� ��µǴ� �޼ҵ�
//�迭�� �ִ� ���� �����ϰ� ���
//��ü ���鶧���� �̸��̳� ���̰� �޶�������

import java.util.Scanner;


public class HumanMaker {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Human hm= new Human();
		
		int input;
		
		System.out.println("******** HUMAN MAKER *******");
		System.out.println("*==== �ΰ��� â���Ͽ� =====*");
		System.out.println("*== �ż����� ���� �Ǿ�� ==*");
		System.out.println("****************************");
		while(true)
		{
			System.out.print("1.����� 2.����: ");
			input= sc.nextInt();
			if(input==1)
			{
				hm.makeHuman();
				System.out.println("\n===== ���� �Ϸ�!! =====\n");
			}
			else if(input==2)
				return;
			else
				continue;
		}
		
	}

}
