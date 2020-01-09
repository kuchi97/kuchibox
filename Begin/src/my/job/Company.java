package my.job;

//구인회사 클래스
public class Company {
	
	//멤버변수
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
		String str="--- "+name+"사 정보\n";
		str+="주 소: "+addr+"\n";
		str+="연 봉: "+salary+"원\n";
		str+="연락처: "+tel+"\n";
		
		return str;	
	}
	
	public void wanted(int career, int salary)
	{
		System.out.println("==="+name+" 사===");
		System.out.println("희망 경력: "+career);
		System.out.println("지급 연봉: "+salary);
	}

}
