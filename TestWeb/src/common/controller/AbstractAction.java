package common.controller;

//추상클래스: execute()라는 추상메소드를 상속받아 가지고있음
public abstract class AbstractAction implements Command{
	
	private String viewPage;		//뷰페이지값
	private boolean isRedirect;		//페이지이동방식이 redirect인지?
	
/* setter,getter */
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
