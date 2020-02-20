package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.controller.AbstractAction;

public class NoticeInsertController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeInsertController] ## FROM.. noticeInsert.do");
		
		String name= req.getParameter("name");
		if(name==null || name.trim().isEmpty()) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("name", name);
		
		this.setViewPage("/admin/noticeInsert.jsp");
		this.setRedirect(false);

	}

}
