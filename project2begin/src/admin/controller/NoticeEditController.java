package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeEditController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeEditController] executed ####");
		
		String idx= req.getParameter("idx");
		//��ȿ��
		if(idx==null || idx.trim().isEmpty()) {
			String msg="����� ã�� �� �����ϴ� [result:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		NoticeDAO dao= new NoticeDAO();
		NoticeVO notice= dao.selectOneNotice(idx);
		//��ȿ��
		if(notice==null) {
			String msg="�߸��� �����Դϴ� [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		req.setAttribute("notice", notice);

		this.setViewPage("/admin/noticeEdit.jsp");
		this.setRedirect(false);
	}

}
