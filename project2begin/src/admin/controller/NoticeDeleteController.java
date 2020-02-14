package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeDeleteController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[NoticeDeleteController] executed ####");
		
		String idx= req.getParameter("idx");
		
		NoticeDAO dao= new NoticeDAO();
		int n= dao.deleteNotice(idx);
		
		String msg= (n>0)?"삭제 성공":"삭제 실패";
		String loc= (n>0)?"noticeMain.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("message.jsp");
		this.setRedirect(false);
	}

}
