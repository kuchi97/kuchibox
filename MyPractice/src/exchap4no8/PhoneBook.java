package exchap4no8;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner sc= new Scanner(System.in);
	
	//�̸��� ��ȣ�Է¹ޱ�
	public void regPhone()
	{
		int input;
		String search;
		
		System.out.print("�Է��� �����: ");
		input= sc.nextInt();
		
		Phone phArr[]= new Phone[input];
		for(int i=0; i<input; i++)
		{
			Phone ph= new Phone();
			
			System.out.println("�̸��� ��ȭ��ȣ �Է�");
			System.out.println("�̸��� ��ȭ��ȣ�� ��ĭ���� �Է�(ex>ȫ�浿 xxx-xxxx)");
			
			ph.name= sc.next();
			ph.tel= sc.next();
			
			phArr[i]= ph;
			
			
		}
		
		String tmp="";
		boolean tf=false;

		while(true)
		{
			System.out.print("�˻��� �̸�: ");
			search= sc.next();
			
			for (int i=0; i < phArr.length; i++) {
				
				if(search.equals(phArr[i].name))
				{
					tmp=phArr[i].tel;
					tf=true;
					break;
				}
				else if(search.contentEquals("�׸�"))
				{
					System.out.println("�ý�������");
					return;
				}
				else
				{
					tmp="�׷���� �����";
				}
				
			}
			
			if(tf=true)
			{
				System.out.println(tmp);
				tf=false;
			}
			else if(tf=false)
				System.out.println(tmp);
			
//			if(search.equals("�׸�"))
//			{
//				System.out.println("�ý�������");
//				return;
//			}
//			else
//				continue;
			
		}
/*		
		//�迭����˻�
		for (int i = 0; i < phArr.length; i++) {
			phArr[i].showInfo();
		}
*/		
		
		
	}//--EOregPhone();

	public static void main(String[] args) {
		
		PhoneBook ph= new PhoneBook();
		
		ph.regPhone();
		

	}

}
