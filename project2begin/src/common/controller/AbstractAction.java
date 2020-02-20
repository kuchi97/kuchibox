package common.controller;

//추상클래스임: execute()라는 추상메소드를 상속받아 가지고있다
public abstract class AbstractAction implements Command{
	
	private String msg;
	private String loc;
	private String viewPage;			//뷰페이지값
	private boolean isRedirect;			//리다이렉트 여부
	
	/* setter, getter */
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getViewPage() {
		return viewPage;
	}
	public void setViewPage(String viewPage) {
		this.viewPage = viewPage;
	}
	public boolean isRedirect() {
		return isRedirect;
	}
	public void setRedirect(boolean isRedirect) {
		this.isRedirect = isRedirect;
	}
	
}
