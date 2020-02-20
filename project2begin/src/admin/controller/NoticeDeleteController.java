package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeDeleteController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeDeleteController] ## FROM.. noticeDelete.do");
		
		String idx= req.getParameter("idx");
		if(idx==null || idx.trim().isEmpty()) {
			String msg="�߸��� ����Դϴ� [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		NoticeDAO dao= new NoticeDAO();
		//��ȿ��(�Ķ���� ����)
		NoticeVO notice= dao.selectOneNotice(idx);
		if(notice==null) {
			String msg="�߸��� �����Դϴ� [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		int n= dao.deleteNotice(idx);
		
		String msg= (n>0)?"���� ����":"���� ����";
		String loc= (n>0)?"noticeMain.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("message.jsp");
		this.setRedirect(false);
	}

}
