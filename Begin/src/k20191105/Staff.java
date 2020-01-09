package k20191105;
//사번 이름 소속부서
public class Staff {
	
	private String name;
	private String division;
	private int no;
	
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDivision() {
		return division;
	}


	public void setDivision(String division) {
		this.division = division;
	}


	public int getNo() {
		return no;
	}


	public void setNo(int no) {
		this.no = no;
	}


	public void showInfo()
	{
		System.out.println("name: "+name);
		System.out.println("division: "+division);
		System.out.println("number: "+no);
	}

}
