package my.job;
/*
 * 기능
 * 	-- 구직자 등록
 * 	-- 회사 등록
 * 	-- 구직자 정보 출력
 * 	-- 회사 정보 출력
 * 	...
 * CRUD:
 * 	Create		데이터 생성/등록
 * 	Read		조회, 검색
 * 	Update		수정
 * 	Delete		삭제, 탈퇴
 */

import java.util.Scanner;

public class JobKorea {
	Scanner sc= new Scanner(System.in);
	
	//개별 인적사항 저장용 배열
	Person people[]= new Person[5];
	Company comp[]= new Company[5];
	
	int countP=0;			//배열의 index로 사용하고 등록한인원 카운팅
	int countC=0;

	public void menu()
	{
		System.out.println("********JJAP KOREA********");
		System.out.println("1.구직자 등록");
		System.out.println("2.구인회사 등록");
		System.out.println("3.구직자 정보출력");
		System.out.println("4.구인회사 정보출력");
		System.out.println("9.종료");
		System.out.println("**************************");
		System.out.println("메뉴번호를 입력: ");
		System.out.println("**************************");
		
	}
	
	//구직자정보 등록하는 메소드
	public void regPerson()
	{
		//Person 객체생성
		Person p= new Person();
		
		System.out.println("=== 노예 소개서 ===");
		System.out.print("이름입력: ");
		String name= sc.next();
		//Person객체의 name변수에 입력값 부여
		p.setName(name);
				
		//나이입력
		System.out.print("나이: ");
		int age= sc.nextInt();
		p.setAge(age);
		
		//성별(1,2번 to char)
		System.out.print("성별(1.남 2.여): ");
		int g= sc.nextInt();
		p.setGender(g);
		
		if(p.getGender()==1)
		{
			p.setGender('M');
		}
		else
			p.setGender('F');

		
		
		//연락처
		System.out.print("연락처: ");
		String tel= sc.next();
		p.setTel(tel);
		
		//확인
		System.out.println(p.showInfo());
		System.out.println("\n===================\n");
		System.out.print("위 정보를 저장할까요?(1.yes 2.no: )");
		int confirm= sc.nextInt();
		
		if(confirm==1)
		{
			//배열에 저장
			people[countP++]=p;
			//count++;
			System.out.println(countP+"명 등록완료");
		}
	}//---구직자 메소드
	
	//구인회사 정보등록 메소드
	public void regCompany()
	{
		Company c= new Company();
		System.out.println("### 甲의 궁전 ###");
		//회사명 입력
		System.out.print("회사명 입력: ");
		String compName= sc.next();
		c.setName(compName);
		
		//주소입력
		System.out.print("주소 입력: ");
		String compAddr= sc.next();
		c.setAddr(compAddr);
		
		//지급연봉 입력
		System.out.print("지급 연봉: ");
		int compSalary= sc.nextInt();
		c.setSalary(compSalary);
		
		//연락처 입력
		System.out.print("연락처 :");
		String compTel= sc.next();
		c.setTel(compTel);
		
		//입력확인
		System.out.println(c.showInfo());
		System.out.print("저장하시겠습니까?(1.yes 2.no: )");
		int confirm= sc.nextInt();
		if(confirm==1)
		{
			comp[countC++]=c;
			System.out.println(countC+"개 사 등록완료");
		}
		
		
	}
	
	public void printAllPerson()
	{
		System.out.println("====등록된 모든 구직자 정보====");

		for(int i=0; i<countP; i++)
		{
			System.out.println(people[i].showInfo());
		}
	}
	
	//등록된 회사 정보보기
	public void printAllCompany()
	{
		System.out.println("====등록된 모든 회사 정보====");
		for(int i=0; i<countC; i++)
		{
			System.out.println(comp[i].showInfo());
		}
	}

	public static void main(String[] args) {
		JobKorea jk= new JobKorea();		//객체를 반복문 안에서 생성하면 루프돌때마다 생성해서 메모리낭비
		int no=0;							//메뉴선택
		
		do {
			//menu() 호출
			//sc로 정수값 받아서 no에 할당하기
			
			jk.menu();
			no= jk.sc.nextInt();
			
			//메뉴에 없는번호 입력오류 보여주고 계속반복
			if(no!=9 && (no<1 || no>4))
			{
				System.out.println("input Error");
				continue;
			}
			
			switch(no)
			{
			case 1:				//구직자 등록
				jk.regPerson();
				break;
			case 2:				//회사 등록
				jk.regCompany();
				break;
			case 3:				//구직자 출력
				jk.printAllPerson();
				break;
			case 4:				//회사 출력
				jk.printAllCompany();
				break;
			default:
				continue;
			}
			
		} while(no!=9);
		System.out.println("Bye~~");
	}

}
