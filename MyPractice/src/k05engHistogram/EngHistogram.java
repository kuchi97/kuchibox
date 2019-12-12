package k05engHistogram;

import java.util.Scanner;

public class EngHistogram {


	int ab[]= new int[26];						//���ĺ� ī��Ʈ�� �迭
	char AB[]= new char[26];					//�빮�� �迭
	
	String readString()
	{
		StringBuffer sb= new StringBuffer();		//Ű �Է� ���� ��Ʈ������
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<ab.length; i++)
		{
			ab[i]=0;
			AB[i]=(char)('A'+i);
		}
		
		while(true)
		{
			System.out.println("������ �Է���");
			String line= sc.nextLine();				//�ؽ�Ʈ �� ������ �о�
			line=line.toLowerCase();
			
			if(line.equals(";"))			//;�� �ִ� �����϶�
				break;						//�Է�����	
			
			for(int i=0; i<line.length(); i++)		//���� ���ڼ���ŭ �ݺ�
			{
				for(char j='a'; j<'a'+26; j++)		//���ĺ� ���ڸ�ŭ �ݺ��Ͽ� üũ
				{
					
					if(j==line.charAt(i))
					{
						ab[(int)(j-'a')]+=1;
					}
				}
			}
			sb.append(line);				//���� ���� ���ڿ��� ��Ʈ�����ۿ� �߰�
		}
		
		return sb.toString();				//�Էµ� ��� ��Ʈ�������� ���ڿ��� ��Ʈ������ ����
	}
	
	void showHistogram()
	{
		for(int i=0; i<ab.length; i++)
		{
//			System.out.println((char)('a'+i)+": "+ab[i]);
			System.out.print((char)('a'+i)+": ");
			for(int j=0; j<ab[i]; j++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		EngHistogram eh= new EngHistogram();
		String body= eh.readString();
		System.out.println(body);
		eh.showHistogram();
	}
}
