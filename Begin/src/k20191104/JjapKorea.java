package k20191104;

/*
 * jopapp > main()
 * 
 * - ������	-> Ŭ����
 * 		�Ӽ� ->����
 * 		��� ->�޼ҵ�
 * - ����ȸ��
 * 		�Ӽ�
 * 		���
 */

class Employer
{
	String name;
	String comment;
	
	int career;
	int salaryWant;
	
	public void showInfo()
	{
		System.out.println("====�� �� ��====");
		System.out.println("�̸�: "+name);
		System.out.println("���: "+career+"��");
		System.out.println("�������: "+salaryWant);
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
		System.out.println("�ּ�: "+addr);
		System.out.println("���� :"+salary);
		System.out.println(detail);
	}
	
	public String contact(String input)
	{
		String str="�����Ǿ����ϴ�";
		return str;
	}
	
}
public class JjapKorea {
	
	public static void main(String[] args)
	{
		//������1
		Employer man1= new Employer();
		man1.name="�谩��";
		man1.career=3;
		man1.salaryWant=3500;
		
		man1.showInfo();
		String cmt=man1.showComment("�ߺ�Ź�帳�ϴ�");
		System.out.println(cmt);
		
		System.out.println("========���м�=========");
		
		//ȸ��1
		Employee comp1= new Employee();
		comp1.name="K O R A I L";
		comp1.salary=4000;
		comp1.addr="����� ��걸 ���ϱ���";
		comp1.detail="������ ������ ���� ���縦 �Ʒ��Ͱ��� �����մϴ�";
		
		comp1.showInfo();		
		String resume= comp1.contact(man1.showComment("�����մϴ�"));
		
		if(man1.salaryWant>=4000)
		{
			System.out.println("������ ������ �����Ǿ����ϴ�");
		}
		else
			System.out.println(resume);
		
		
	}

}
