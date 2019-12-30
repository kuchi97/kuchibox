package intranet;

import java.sql.Date;

public class MeetroomVO {
	
	private int empid;	//사번
	
	int idx;			//예약 순번 인덱스
	String roomNum;		//회의실 번호
	java.sql.Date start;//예약 시작시간
	java.sql.Date end;	//예약 종료시간
	String dname;		//예약 부서
	String ename;		//예약자이름
	
	public MeetroomVO() {
		this(0,0,null,null,null,null,null);
	}

	//사번, 예약순번, 회의실번호, 예약시작시간, 예약종료시간, 예약부서, 예약자이름
	public MeetroomVO(int empid, int idx, String roomNum, Date start, Date end, String dname, String ename) {
		super();
		this.empid=empid;
		this.idx=idx;
		this.roomNum=roomNum;
		this.start=start;
		this.end=end;
		this.dname=dname;
		this.ename=ename;
	}

	//getter, setter 생성
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getRoomNum() {
		return roomNum;
	}
	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public java.sql.Date getStart() {
		return start;
	}
	public void setStart(java.sql.Date start) {
		this.start = start;
	}

	public java.sql.Date getEnd() {
		return end;
	}
	public void setEnd(java.sql.Date end) {
		this.end = end;
	}

	public String getDnamet() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
}
