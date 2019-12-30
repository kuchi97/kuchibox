package intranet;

public class LoginVO {
	private int empId;		//사번
	private String eName;	//이름
	private String pwd;		//비밀번호
	
	public LoginVO(int empId, String eName, String pwd) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.pwd = pwd;
	}

	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
