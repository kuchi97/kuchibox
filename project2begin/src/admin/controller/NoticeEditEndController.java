package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeEditEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeEditEndController] executed ####");
		
		String idx= req.getParameter("idx");
		String title= req.getParameter("title");
		String info= req.getParameter("info");
		String name= req.getParameter("name");
		
		NoticeDAO dao= new NoticeDAO();
		NoticeVO notice= new NoticeVO(idx,title,info,null,name);
		
		int n= dao.updateNotice(notice);

		String msg= (n>0)?"수정 성공":"수정 실패";
		String loc= (n>0)?"noticeMain.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("message.jsp");
		this.setRedirect(false);
	}

}
