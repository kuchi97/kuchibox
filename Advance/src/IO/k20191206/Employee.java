package IO.k20191206;

import java.io.Serializable;

//ObjectOutputStream �� �̿��Ͽ� ��ü�� ���Ͽ� �Ẹ��
/*
= ����ȭ: �����͸� ���ٷ� �����Ҽ� �ִٰ� ǥ���ϴ°�

- ����ȭ �����ϱ�: java.io.Serializable �������̽��� ��ӹ޾ƾ���
				�� �������̽����� �߻�޼ҵ�� �������� ������,
				�ܼ��� ����ȭ�� ��ü�� ǥ��(marking)�ϴ� ��ɸ� �Ѵ�
					cf> ����ȭ�� ��ü�� �����ϴ� ���� '������ȭ' ��� ��
				
- ����ȭ�ؼ� �������� ��������� ���� �����Ͱ� �ִٸ�
	transient ��� modifier�� �ٿ��ش�
	
- ����ȭ�� �ȵǴ� ��ǥ���ΰ�: ImageIcon, ResultSet ��

*/

public class Employee implements Serializable{		//java.io.Serializable ����ȭ ���

	private int empno;
	private String ename;
	private String dept;
	transient private int sal;					//�����ְ���� ������ transient�� ���δ�
	
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
		//setter�� �����ڰ� ���ٰ��� getter�� �޼ҵ�� ������ش�
	
	public void print()
	{
		System.out.println("==="+ename+" INFO===");
		System.out.println("name: "+ename);
		System.out.println("empno: "+empno);
		System.out.println("dept: "+dept);
		System.out.println("sal: "+sal);
		
	}
	
}
