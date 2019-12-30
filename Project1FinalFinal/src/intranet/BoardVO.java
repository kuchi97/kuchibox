package intranet;

import java.sql.Date;

public class BoardVO {

	private int idx;
	private String name;
	private String msg;
	private java.sql.Date wdate;
	
	//constructor
	public BoardVO()
	{
		this(0,null,null,null);
	}
	public BoardVO(int idx, String name, String msg, Date wdate)
	{
		super();
		this.idx= idx;
		this.name= name;
		this.msg= msg;
		this.wdate= wdate;
	}

	//setter,getter;
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

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}

	public java.sql.Date getWdate() {
		return wdate;
	}
	public void setWdate(java.sql.Date wdate) {
		this.wdate = wdate;
	}
	
	//확인용
	@Override
	public String toString()
	{
		return "MemoVO [idx: "+idx+", name: "+name+", msg: "+msg+", wdate: "+wdate+"]";
	}
	
	
}
