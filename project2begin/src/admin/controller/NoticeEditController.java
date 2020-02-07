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
		
		NoticeDAO dao= new NoticeDAO();
		NoticeVO notice= dao.selectOneNotice(idx);
		
		req.setAttribute("notice", notice);

		this.setViewPage("/admin/noticeEdit.jsp");
		this.setRedirect(false);
	}

}
