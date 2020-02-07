package admin.domain;

public class MemberVO {
	String email;
	String pwd;
	String name;
	String year;
	String age;
	String point;
	String state;
	
	/*constructor*/
	public MemberVO()
	{
		
	}
	public MemberVO(String email, String pwd, String name, String year, String age, String point, String state) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.year = year;
		this.age = age;
		this.point = point;
		this.state = state;
	}
	
	/* setter, getter */
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}




}
