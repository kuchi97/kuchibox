package my.job;

//����ȸ�� Ŭ����
public class Company {
	
	//�������
	private String name;
	private String addr;
	private int salary;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String showInfo()
	{
		String str="--- "+name+"�� ����\n";
		str+="�� ��: "+addr+"\n";
		str+="�� ��: "+salary+"��\n";
		str+="����ó: "+tel+"\n";
		
		return str;	
	}
	
	public void wanted(int career, int salary)
	{
		System.out.println("==="+name+" ��===");
		System.out.println("��� ���: "+career);
		System.out.println("���� ����: "+salary);
	}

}
