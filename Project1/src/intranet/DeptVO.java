package intranet;

public class DeptVO {
	private int deptNo;
	private String dName;
	
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
	public DeptVO(int deptNo, String dName) {
		super();
		this.deptNo = deptNo;
		this.dName = dName;
	}
	@Override
	public String toString() {
		return "DeptVO [deptNo=" + deptNo + ", dName=" + dName + "]";
	}
}
