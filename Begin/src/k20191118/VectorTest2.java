package k20191118;

import java.util.Vector;


class Student
{
	private int 	no;			//�й�
	private String 	name;		//�̸�
	private String 	cname;		//�б�
	
	//constructor
	public Student(int no, String name, String cname)
	{
		this.no=no;
		this.name=name;
		this.cname=cname;
	}

	//setter,getter
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getCname() {
		return cname;
	}
	
	public void showInfo()
	{
		System.out.println("no: "+no);
		System.out.println("name: "+name);
		System.out.println("cname: "+cname);
	}
	
	
	
}
public class VectorTest2 {

	public static void main(String[] args) {
		
		//Student ��ü 3�� ����
		Student std[]= new Student[3];
		std[0]= new Student(1,"�谳��","�ڹ�");
		std[1]= new Student(2,"���ʽ�","�ڹ�");
		std[2]= new Student(3,"�ڹ���","�ڹ�");
		
		
		//������ ������ ��ü�� ������ ���ͻ���
		Vector<Student> v= new Vector<Student>();
		System.out.println(v);
		
		//���Ϳ� student��ü 3�� ����
		for(Student s:std)
		{
			v.add(s);
		}
		
		//for���� �̿��Ͽ� ����� student ��β��� �й� �б� �̸� ���
		for(Student s:v)
		{
			System.out.println("no: "+s.getNo()+"\nname: "+s.getName()+"\ncname: "+s.getCname());
		}
		for(int i=0; i<v.size(); i++)
		{
			Student s= v.get(i);		//����� ���Ϳ��� student ��������
			System.out.println(s.getNo()+"/"+s.getName()+"/"+s.getCname());
		}
		
	}
}
