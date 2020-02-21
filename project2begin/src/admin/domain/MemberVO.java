package admin.domain;

public class MemberVO {
	String email;
	String pwd;
	String name;
	String age;
	int point;
	int subs;
	String icon;
	String chimg;
	int state;
	
	/*constructor*/
	public MemberVO() {
		
	}
	public MemberVO(String email, String pwd, String name, String age, int point, int subs, String icon, String chimg,
			int state) {
		super();
		this.email = email;
		this.pwd = pwd;
		this.name = name;
		this.age = age;
		this.point = point;
		this.subs = subs;
		this.icon = icon;
		this.chimg = chimg;
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
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		this.point = point;
	}
	public int getSubs() {
		return subs;
	}
	public void setSubs(int subs) {
		this.subs = subs;
	}
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getChimg() {
		return chimg;
	}
	public void setChimg(String chimg) {
		this.chimg = chimg;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}

	
	


}
