package admin.domain;

public class NoticeVO {
	
	String idx;
	String title;
	String info;
	String wdate;
	String name;
	
	public NoticeVO()
	{
		
	}
	public NoticeVO(String idx, String title, String info, String wdate, String name) {
		super();
		this.idx = idx;
		this.title = title;
		this.info = info;
		this.wdate = wdate;
		this.name = name;
	}
	
	
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	public String getWdate() {
		return wdate;
	}
	public void setWdate(String wdate) {
		this.wdate = wdate;
	}
	public String getname() {
		return name;
	}
	public void setname(String name) {
		this.name = name;
	}

	
	

}
