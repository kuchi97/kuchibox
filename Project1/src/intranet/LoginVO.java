package intranet;

public class LoginVO {
	private int empId;
	private String eName;
	private String pwd;
	
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
	public LoginVO(int empId, String eName, String pwd) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "LoginVO [empId=" + empId + ", eName=" + eName + ", pwd=" + pwd + "]";
	}

}
