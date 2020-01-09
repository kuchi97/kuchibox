package k20191105;

import java.util.Scanner;

public class InstituteApp {
	
	public void menu()
	{
		System.out.println("******** REGISTER ********");
		System.out.println("1.학생 등록");
		System.out.println("2.교사 등록");
		System.out.println("3.교직원 등록");
		System.out.println("4.학생 정보출력");
		System.out.println("4.교사 정보출력");
		System.out.println("4.교직원 정보출력");
		System.out.println("9.종료");
		System.out.println("**************************");
		System.out.println("메뉴번호를 입력: ");
		System.out.println("**************************");
	}
	
	public void regMember()
	{
		//문1. 학생객체 3개 생성하고 각각값 넣어준후 배열에 저장/출력
		Student s1= new Student();
		Student s2= new Student();
		Student s3= new Student();
		Student std[]= new Student[3];
		
		s1.setName("김개똥");
		s1.setCname("햇님반");
		s1.setNo(1);
		s2.setName("이말숙");
		s2.setCname("달님반");
		s2.setNo(13);
		s3.setName("홍찰찰");
		s3.setCname("해바라기반");
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
