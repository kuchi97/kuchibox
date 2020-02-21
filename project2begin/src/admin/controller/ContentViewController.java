package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.TrailerVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentViewController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentViewController] ## FROM. contentView.do");
		
		String idx= req.getParameter("idx");
		if(idx==null || idx.trim().isEmpty()) {
			String msg="결과를 찾을 수 없습니다 [result:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		ContentDAO dao= new ContentDAO();
		TrailerVO content= dao.selectOneContent(idx);
		//유효성
		if(content==null) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("content", content);
		
		this.setViewPage("/admin/contentView.jsp");
		this.setRedirect(false);
	}

}
