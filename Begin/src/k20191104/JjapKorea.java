package k20191104;

/*
 * jopapp > main()
 * 
 * - 구직자	-> 클래스
 * 		속성 ->변수
 * 		기능 ->메소드
 * - 구인회사
 * 		속성
 * 		기능
 */

class Employer
{
	String name;
	String comment;
	
	int career;
	int salaryWant;
	
	public void showInfo()
	{
		System.out.println("====지 원 서====");
		System.out.println("이름: "+name);
		System.out.println("경력: "+career+"년");
		System.out.println("희망연봉: "+salaryWant);
	}
	
	public String showComment(String input)
	{
		String str=input;
		return str;
	}
		
}

class Employee
{
	String name;
	String addr;
	int salary;
	String detail;
	
	public void showInfo()
	{
		System.out.println("===="+name+"====");
		System.out.println("주소: "+addr);
		System.out.println("연봉 :"+salary);
		System.out.println(detail);
	}
	
	public String contact(String input)
	{
		String str="지원되었습니다";
		return str;
	}
	
}
public class JjapKorea {
	
	public static void main(String[] args)
	{
		//지원자1
		Employer man1= new Employer();
		man1.name="김갑수";
		man1.career=3;
		man1.salaryWant=3500;
		
		man1.showInfo();
		String cmt=man1.showComment("잘부탁드립니다");
		System.out.println(cmt);
		
		System.out.println("========구분선=========");
		
		//회사1
		Employee comp1= new Employee();
		comp1.name="K O R A I L";
		comp1.salary=4000;
		comp1.addr="서울시 용산구 지하기지";
		comp1.detail="열정과 역량을 갖춘 인재를 아래와같이 모집합니다";
		
		comp1.showInfo();		
		String resume= comp1.contact(man1.showComment("지원합니다"));
		
		if(man1.salaryWant>=4000)
		{
			System.out.println("귀하의 지원은 거절되었습니다");
		}
		else
			System.out.println(resume);
		
		
	}

}
