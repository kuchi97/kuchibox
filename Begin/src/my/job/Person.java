package my.job;

//������ Ŭ����
public class Person {
	
	//�������
	private String name;
	private int age;
	private int gender;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return (char)gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String showInfo()
	{
		String str="--- "+name+" ������\n";
		str+="�� ��: "+age+"\n";
		str+="�� ��: "+(char)gender+"\n";
		str+="����ó: "+tel+"\n";
		
		return str;		
	}
	
	public void wantJob(String job, int pay)
	{
		System.out.println("--- "+name+"��---");
		System.out.println("��� ����: "+job);
		System.out.println("��� ����: "+pay);
	}
	
	
}
