package my.memo;

import java.sql.Date;

//domain object: 값을 담고있는 객체
//DB의 memo테이블을 클래스로 옮겨놓는다

public class MemoVO {

	private int 	idx;			//글번호
	private String 	name;			//작성자
	private String	msg;			//메모내용
	private java.sql.Date wdate;	//작성일
	
	//기본생성자(필수), 인자생성자 오버로드
	public MemoVO()
	{
		this(0,null,null,null);
	}

	public MemoVO(int idx, String name, String msg, Date wdate) {
		super();
		this.idx = idx;
		this.name = name;
		this.msg = msg;
		this.wdate = wdate;
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
	
	//override toString() 개발시 확인용
	@Override
	public String toString() {
		return "MemoVO [idx=" + idx + ", name=" + name + ", msg=" + msg + ", wdate=" + wdate + "]";
	}
	
	
}
