package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeInsertEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeInsertEndController] executed ####");
		
		String title= req.getParameter("title");
		String name= req.getParameter("name");
		String info= req.getParameter("info");
		
		NoticeVO vo= new NoticeVO(null,title,info,null,name);
		NoticeDAO dao= new NoticeDAO();
		
		int n= dao.insertNotice(vo);
		
		String msg= (n>0)?"공지사항 등록성공":"공지사항 등록실패";
		String loc= (n>0)?"noticeMain.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("message.jsp");
		this.setRedirect(false);
		
		
	}

}
