package my.job;
/*
 * ���
 * 	-- ������ ���
 * 	-- ȸ�� ���
 * 	-- ������ ���� ���
 * 	-- ȸ�� ���� ���
 * 	...
 * CRUD:
 * 	Create		������ ����/���
 * 	Read		��ȸ, �˻�
 * 	Update		����
 * 	Delete		����, Ż��
 */

import java.util.Scanner;

public class JobKorea {
	Scanner sc= new Scanner(System.in);
	
	//���� �������� ����� �迭
	Person people[]= new Person[5];
	Company comp[]= new Company[5];
	
	int countP=0;			//�迭�� index�� ����ϰ� ������ο� ī����
	int countC=0;

	public void menu()
	{
		System.out.println("********JJAP KOREA********");
		System.out.println("1.������ ���");
		System.out.println("2.����ȸ�� ���");
		System.out.println("3.������ �������");
		System.out.println("4.����ȸ�� �������");
		System.out.println("9.����");
		System.out.println("**************************");
		System.out.println("�޴���ȣ�� �Է�: ");
		System.out.println("**************************");
		
	}
	
	//���������� ����ϴ� �޼ҵ�
	public void regPerson()
	{
		//Person ��ü����
		Person p= new Person();
		
		System.out.println("=== �뿹 �Ұ��� ===");
		System.out.print("�̸��Է�: ");
		String name= sc.next();
		//Person��ü�� name������ �Է°� �ο�
		p.setName(name);
				
		//�����Է�
		System.out.print("����: ");
		int age= sc.nextInt();
		p.setAge(age);
		
		//����(1,2�� to char)
		System.out.print("����(1.�� 2.��): ");
		int g= sc.nextInt();
		p.setGender(g);
		
		if(p.getGender()==1)
		{
			p.setGender('M');
		}
		else
			p.setGender('F');

		
		
		//����ó
		System.out.print("����ó: ");
		String tel= sc.next();
		p.setTel(tel);
		
		//Ȯ��
		System.out.println(p.showInfo());
		System.out.println("\n===================\n");
		System.out.print("�� ������ �����ұ��?(1.yes 2.no: )");
		int confirm= sc.nextInt();
		
		if(confirm==1)
		{
			//�迭�� ����
			people[countP++]=p;
			//count++;
			System.out.println(countP+"�� ��ϿϷ�");
		}
	}//---������ �޼ҵ�
	
	//����ȸ�� ������� �޼ҵ�
	public void regCompany()
	{
		Company c= new Company();
		System.out.println("### ˣ�� ���� ###");
		//ȸ��� �Է�
		System.out.print("ȸ��� �Է�: ");
		String compName= sc.next();
		c.setName(compName);
		
		//�ּ��Է�
		System.out.print("�ּ� �Է�: ");
		String compAddr= sc.next();
		c.setAddr(compAddr);
		
		//���޿��� �Է�
		System.out.print("���� ����: ");
		int compSalary= sc.nextInt();
		c.setSalary(compSalary);
		
		//����ó �Է�
		System.out.print("����ó :");
		String compTel= sc.next();
		c.setTel(compTel);
		
		//�Է�Ȯ��
		System.out.println(c.showInfo());
		System.out.print("�����Ͻðڽ��ϱ�?(1.yes 2.no: )");
		int confirm= sc.nextInt();
		if(confirm==1)
		{
			comp[countC++]=c;
			System.out.println(countC+"�� �� ��ϿϷ�");
		}
		
		
	}
	
	public void printAllPerson()
	{
		System.out.println("====��ϵ� ��� ������ ����====");

		for(int i=0; i<countP; i++)
		{
			System.out.println(people[i].showInfo());
		}
	}
	
	//��ϵ� ȸ�� ��������
	public void printAllCompany()
	{
		System.out.println("====��ϵ� ��� ȸ�� ����====");
		for(int i=0; i<countC; i++)
		{
			System.out.println(comp[i].showInfo());
		}
	}

	public static void main(String[] args) {
		JobKorea jk= new JobKorea();		//��ü�� �ݺ��� �ȿ��� �����ϸ� ������������ �����ؼ� �޸𸮳���
		int no=0;							//�޴�����
		
		do {
			//menu() ȣ��
			//sc�� ������ �޾Ƽ� no�� �Ҵ��ϱ�
			
			jk.menu();
			no= jk.sc.nextInt();
			
			//�޴��� ���¹�ȣ �Է¿��� �����ְ� ��ӹݺ�
			if(no!=9 && (no<1 || no>4))
			{
				System.out.println("input Error");
				continue;
			}
			
			switch(no)
			{
			case 1:				//������ ���
				jk.regPerson();
				break;
			case 2:				//ȸ�� ���
				jk.regCompany();
				break;
			case 3:				//������ ���
				jk.printAllPerson();
				break;
			case 4:				//ȸ�� ���
				jk.printAllCompany();
				break;
			default:
				continue;
			}
			
		} while(no!=9);
		System.out.println("Bye~~");
	}

}
