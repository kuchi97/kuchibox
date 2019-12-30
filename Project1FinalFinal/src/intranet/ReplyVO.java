package intranet;

public class ReplyVO {

	private String idx;
	private int boardIdx;
	private String name;
	private String msg;
	private java.sql.Date wdate;
	
	//setter getter
	public String getIdx() {
		return idx;
	}
	public void setIdx(String idx) {
		this.idx = idx;
	}
	
	public int getBoardIdx()
	{
		return boardIdx;
	}
	public void setBoardIdx(int boardIdx)
	{
		this.boardIdx=boardIdx;
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
	
	@Override
	public String toString() {
		return "ReplyVO [idx=" + idx + ", name=" + name + ", msg=" + msg + ", wdate=" + wdate + "]";
	}
}
