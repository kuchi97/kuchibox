package ExerciseChap3;
//Scanner�� �̿��Ͽ� �ҹ��� ���ĺ��� �ϳ� �Է¹ް�
//a���� �Է¹��������� ���Ƕ�̵����·� ���
import java.util.Scanner;

public class ExCh3No4 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("input alphabet: ");
		String str= sc.next();		//���ڿ����� (����x)
		char ch=str.charAt(0);		//���ڿ��� ù��° ���ڸ� �о��
				
		for(int i=0; i<ch-'a'+1; i++)		//ch�� ���� ���ڿ� a��ŭ�� ���� ch�� ���ĺ� ������ ���´�
		{
			for(char j='a'; ((int)(ch-j)+1)>i; j++)	//��������
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
