package IO.k20191206;

import java.io.Serializable;

//ObjectOutputStream 을 이용하여 객체를 파일에 써보기
/*
= 직렬화: 데이터를 한줄로 나열할수 있다고 표시하는것

- 직렬화 구현하기: java.io.Serializable 인터페이스를 상속받아야함
				이 인터페이스에는 추상메소드는 존재하지 않으며,
				단순히 직렬화된 객체로 표시(marking)하는 기능만 한다
					cf> 직렬화된 객체를 복원하는 것을 '역직렬화' 라고 함
				
- 직렬화해서 내보낼때 보내고싶지 않은 데이터가 있다면
	transient 라는 modifier를 붙여준다
	
- 직렬화가 안되는 대표적인것: ImageIcon, ResultSet 등

*/

public class Employee implements Serializable{		//java.io.Serializable 직렬화 상속

	private int empno;
	private String ename;
	private String dept;
	transient private int sal;					//보내주고싶지 않으면 transient를 붙인다
	
	//constructor
	public Employee()
	{
		this(0,null,null,0);
	}
	public Employee(int empno, String ename, String dept, int sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.dept = dept;
		this.sal = sal;
	}
	
	//setter, getter
		//setter는 생성자가 해줄거임 getter만 메소드로 만들어준다
	
	public void print()
	{
		System.out.println("==="+ename+" INFO===");
		System.out.println("name: "+ename);
		System.out.println("empno: "+empno);
		System.out.println("dept: "+dept);
		System.out.println("sal: "+sal);
		
	}
	
}
