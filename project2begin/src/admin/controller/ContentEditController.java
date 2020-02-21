package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.TrailerVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentEditController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentEditController] executed ####");
		
		String idx= req.getParameter("idx");
		//유효성
		if(idx==null || idx.trim().isEmpty()) {
			String msg="잘못된 경로입니다";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			
			this.setViewPage("/message.jsp");
			this.setRedirect(true);
			
			return;
		}
		
		ContentDAO dao= new ContentDAO();
		TrailerVO content= dao.selectOneContent(idx);
		//유효성-파라미터조작
		if(content==null) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("content", content);
		
		this.setViewPage("/admin/contentEdit.jsp");
		this.setRedirect(false);
	}

}
