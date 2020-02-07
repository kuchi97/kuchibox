package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.controller.AbstractAction;

public class NoticeInsertController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeInsertController] executed ####");
		
		String name= req.getParameter("name");
		
		req.setAttribute("name", name);
		
		this.setViewPage("/admin/noticeInsert.jsp");
		this.setRedirect(false);

	}

}
