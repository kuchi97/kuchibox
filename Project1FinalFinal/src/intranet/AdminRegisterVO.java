package intranet;

public class AdminRegisterVO  {
	private int empid;
	private String ename;
	private int deptno;
	private String dname;
	private String tel;
	private String rank;
	private String email;
	private String hiredate;
	private String sex;
	private String pwd;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getDeptno() {
		return deptno;
	}
	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getHiredate() {
		return hiredate;
	}
	public void setHiredate(String hiredate) {
		this.hiredate = hiredate;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public AdminRegisterVO() {
		super();
	}
	public AdminRegisterVO(int empid, String ename, int deptno, String dname, String tel, String rank, String email,
			String hiredate, String sex, String pwd) {
		super();
		this.empid = empid;
		this.ename = ename;
		this.deptno = deptno;
		this.dname = dname;
		this.tel = tel;
		this.rank = rank;
		this.email = email;
		this.hiredate = hiredate;
		this.sex = sex;
		this.pwd = pwd;
	}
	
}
