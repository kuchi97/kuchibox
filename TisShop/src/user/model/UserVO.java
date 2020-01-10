package user.model;

import java.io.Serializable;
import java.sql.Date;

//VO - 도메인계층: 값을 가지고 있는것 (Model)

public class UserVO implements Serializable {

	//멤버변수 ==> property (jsp에서)
	//property명은 가능하면 html의 input name과 맞춘다
	
	private int idx;
	private String name;
	private String userid;
	private String email;
	private String pwd;
	private String hp1;
	private String hp2;
	private String hp3;
	private String post;
	private String addr1;
	private String addr2;
	private java.sql.Date indate;
	private int mileage;
	private int m_state;
	
	//constructor
	public UserVO()
	{
		System.out.println("UserVO() 생성");
	}
	public UserVO(int idx, String name, String userid, String email, String pwd, String hp1, String hp2, String hp3,
			String post, String addr1, String addr2, Date indate, int mileage, int m_state) {
		super();
		this.idx = idx;
		this.name = name;
		this.userid = userid;
		this.email = email;
		this.pwd = pwd;
		this.hp1 = hp1;
		this.hp2 = hp2;
		this.hp3 = hp3;
		this.post = post;
		this.addr1 = addr1;
		this.addr2 = addr2;
		this.indate = indate;
		this.mileage = mileage;
		this.m_state = m_state;
	}
	
	//setter, getter
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		System.out.println("setUserid() 호출됨: "+userid);
		this.userid = userid;
	}
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
	public String getHp1() {
		return hp1;
	}
	public void setHp1(String hp1) {
		this.hp1 = hp1;
	}
	public String getHp2() {
		return hp2;
	}
	public void setHp2(String hp2) {
		this.hp2 = hp2;
	}
	public String getHp3() {
		return hp3;
	}
	public void setHp3(String hp3) {
		this.hp3 = hp3;
	}
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
	}
	public String getAddr1() {
		return addr1;
	}
	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}
	public String getAddr2() {
		return addr2;
	}
	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}
	public java.sql.Date getIndate() {
		return indate;
	}
	public void setIndate(java.sql.Date indate) {
		this.indate = indate;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public int getM_state() {
		return m_state;
	}
	public void setM_state(int m_state) {
		this.m_state = m_state;
	}
	
	public String getAllHp()
	{
		return hp1+"-"+hp2+"-"+hp3;
	}
	public String getAllAddr()
	{
		return "["+post+"] "+addr1+" / "+addr2;
	}
	
	@Override
	public String toString() {
		return "UserVO [idx=" + idx + ", name=" + name + ", userid=" + userid + ", email=" + email + ", pwd=" + pwd
				+ ", hp1=" + hp1 + ", hp2=" + hp2 + ", hp3=" + hp3 + ", post=" + post + ", addr1=" + addr1 + ", addr2="
				+ addr2 + ", indate=" + indate + ", mileage=" + mileage + ", m_state=" + m_state + "]";
	}

	
}
