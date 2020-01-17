package admin.domain;

public class MemberVO {
	Integer idx;
	String email;
	String name;
	String pwd;
	int age;
	int point;
	int state;
	
	public MemberVO()
	{
		
	}

	public MemberVO(Integer idx, String email, String name, String pwd, int age, int point, int state) {
		super();
		this.idx= idx;
		this.email = email;
		this.name = name;
		this.pwd = pwd;
		this.age = age;
		this.point = point;
		this.state = state;
	}

	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

}
