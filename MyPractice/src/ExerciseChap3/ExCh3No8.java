package ExerciseChap3;
//������ ��������� Ű����� �Է¹޾� (100�̸�) �����迭 ����
//1~100���� �����ϰ� ����
//�迭���� �������� �������ϰ� ����Ұ�

import java.util.Scanner;
public class ExCh3No8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("input int 1~99: ");
		int input= sc.nextInt();
		
		if(input<1||input>=100)
		{
			System.out.println("error");
			return;
		}
		
		int randArr[];
		randArr= new int[input];
		
		for(int i=0; i<input; i++)			//i�� input��ŭ �������� input��ŭ ��½�ų��
		{
			for(int j=0; j<=i; j++)			//j�� i�� Ƚ����ŭ �ٽ� ����
			{
				randArr[i]= (int)(Math.random()*100+1);		//���� i���� �迭�� ���� ��
				if(randArr[i]==(int)(Math.random()+100+1))	//���� �������� ������
				{
					randArr[i]=(int)(Math.random()*100+1);	//i��° �迭��Ҹ� �ٽ� �־���
				}
			}
		}
		
		
		
		
		for(int i=0; i<input; i++)
		{
			System.out.print(randArr[i]+" ");
			if((i+1)%5 == 0)
			{
				System.out.println();
			}
		}
		
	}

}
