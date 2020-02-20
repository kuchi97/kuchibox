package common.controller;

//�߻�Ŭ������: execute()��� �߻�޼ҵ带 ��ӹ޾� �������ִ�
public abstract class AbstractAction implements Command{
	
	private String msg;
	private String loc;
	private String viewPage;			//����������
	private boolean isRedirect;			//�����̷�Ʈ ����
	
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
