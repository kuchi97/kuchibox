package k20191105;

import java.util.Scanner;

public class InstituteApp {
	
	public void menu()
	{
		System.out.println("******** REGISTER ********");
		System.out.println("1.�л� ���");
		System.out.println("2.���� ���");
		System.out.println("3.������ ���");
		System.out.println("4.�л� �������");
		System.out.println("4.���� �������");
		System.out.println("4.������ �������");
		System.out.println("9.����");
		System.out.println("**************************");
		System.out.println("�޴���ȣ�� �Է�: ");
		System.out.println("**************************");
	}
	
	public void regMember()
	{
		//��1. �л���ü 3�� �����ϰ� ������ �־����� �迭�� ����/���
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student std[]= new Student[3];
		
		s1.setName("�谳��");
		s1.setCname("�޴Թ�");
		s1.setNo(1);
		s2.setName("�̸���");
		s2.setCname("�޴Թ�");
		s2.setNo(13);
		s3.setName("ȫ����");
		s3.setCname("�عٶ���");
		s3.setNo(4);
		
		std[0]= s1;
		std[1]= s2;
		std[2]= s3;
		
//		Student std[]= {s1, s2, s3};
		
		for(int i=0; i<std.length; i++)
		{
			std[i].showInfo();
			System.out.println("=============");
		}
	}

	public static void main(String[] args) {
		
		InstituteApp ia= new InstituteApp();
		ia.menu();
		
		ia.regMember();
	}

}
