package intranet;

public class EmpVO {
	private int empId;
	private String eName;
	private int deptNo;
	private String dName;
	private String rank;
	
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
	public int getDeptNo() {
		return deptNo;
	}
	public void setDeptNo(int deptNo) {
		this.deptNo = deptNo;
	}
	public String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	}
	public EmpVO(int empId) {
		super();
		this.empId = empId;
	}
	public EmpVO(int empId, String eName, int deptNo, String dName, String rank) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.deptNo = deptNo;
		this.dName = dName;
		this.rank = rank;
	}
	@Override
	public String toString() {
		return "EmpVO [empId=" + empId + ", eName=" + eName + ", deptNo=" + deptNo + ", dName=" + dName + ", rank="
				+ rank + "]";
	}
}