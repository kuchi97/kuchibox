package k20191118;

import java.util.Vector;


class Student
{
	private int 	no;			//학번
	private String 	name;		//이름
	private String 	cname;		//학급
	
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
		
		//Student 객체 3명 생성
		Student std[]= new Student[3];
		std[0]= new Student(1,"김개똥","자바");
		std[1]= new Student(2,"이필승","자바");
		std[2]= new Student(3,"박무직","자바");
		
		
		//위에서 생성한 객체를 저장할 벡터생성
		Vector<Student> v= new Vector<Student>();
		System.out.println(v);
		
		//벡터에 student객체 3명 저장
		for(Student s:std)
		{
			v.add(s);
		}
		
		//for루프 이용하여 저장된 student 모두꺼내 학번 학급 이름 출력
		for(Student s:v)
		{
			System.out.println("no: "+s.getNo()+"\nname: "+s.getName()+"\ncname: "+s.getCname());
		}
		for(int i=0; i<v.size(); i++)
		{
			Student s= v.get(i);		//저장된 벡터에서 student 꺼내오기
			System.out.println(s.getNo()+"/"+s.getName()+"/"+s.getCname());
		}
		
	}
}
