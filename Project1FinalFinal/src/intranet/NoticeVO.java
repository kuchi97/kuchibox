package intranet;

import java.sql.Date;

public class NoticeVO {
	
	private int empid;		//사번
	
	int noticeid;			//공지사항 인덱스
	int priority;			//중요도
	String priority_txt;	//중요도 한글변환 텍스트
	String title;			//제목
	String text;			//본문
	String ename;			//작성자
	java.sql.Date wdate;	//작성일
	
	public NoticeVO() {
		this.noticeid=0;
		this.priority=0;
		this.priority_txt=null;
		this.title=null;
		this.text=null;
		this.ename=null;
		this.empid=0;
		this.wdate=null;
	}
	
	public NoticeVO(int noticeid, int priority, String priority_txt, String title, int empid, String ename, Date wdate) {
		super();
		this.noticeid=noticeid;
		this.priority=priority;
		this.priority_txt=priority_txt;
		this.title=title;
		this.ename=ename;
		this.wdate=wdate;
	}

	public NoticeVO(int noticeid, int priority, String priority_txt, String title, String text, int empid, String ename, Date wdate) {
		super();
		this.noticeid=noticeid;
		this.priority=priority;
		this.priority_txt=priority_txt;
		this.title=title;
		this.text=text;
		this.empid=empid;
		this.ename=ename;
		this.wdate=wdate;
	}
	
	//getter, setter
	public int getNoticeId() {
		return noticeid;
	}
	public void setNoticeId(int noticeid) {
		this.noticeid=noticeid;
	}
	
	public int getPriority() {
		return priority;
	}
	public void setPriority(int priority) {
		this.priority=priority;
	}

	public String getPriority_txt() {
		return priority_txt;
	}
	public void setPriority_txt(String priority_txt) {
		this.priority_txt=priority_txt;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text=text;
	}
	
	public int getEmpId() {
		return empid;
	}
	public void setEmpId(int empid) {
		this.empid=empid;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename=ename;
	}

	public Date getWdate() {
		return wdate;
	}
	public void setWdate(Date wdate) {
		this.wdate=wdate;
	}
	
}
