package k20191105;

public class InstituteApp2 {

	public static void main(String[] args) 
	{
		Student std= new Student();
		Teacher tch= new Teacher();
			
		std.setName("홍길동");
		std.setCname("아두이노반");
		std.setNo(10);
		std.showInfo();

		System.out.println();
		
		tch.setName("이철");
		tch.setSubject("국어");
		tch.setNo(213);
		tch.showInfo();
		
	}

}
