package k20191105;

public class InstituteApp2 {

	public static void main(String[] args) 
	{
		Student std= new Student();
		Teacher tch= new Teacher();
			
		std.setName("ȫ�浿");
		std.setCname("�Ƶ��̳��");
		std.setNo(10);
		std.showInfo();

		System.out.println();
		
		tch.setName("��ö");
		tch.setSubject("����");
		tch.setNo(213);
		tch.showInfo();
		
	}

}
