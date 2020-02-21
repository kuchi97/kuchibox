package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.TrailerVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentEditPreviewController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentEditPreviewController] ## FROM. contentEditPreview.do");
		
		String idx= req.getParameter("idx");
		//유효성
		if(idx==null || idx.trim().isEmpty()) {
			String msg="목록을 찾을 수 없습니다 [result:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		ContentDAO dao= new ContentDAO();
		TrailerVO isContent= dao.selectOneContent(idx);
		if(isContent==null) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		String title= req.getParameter("title");
		String director= req.getParameter("director");
		String release= req.getParameter("release");
		String info= req.getParameter("info");
		
		
		TrailerVO content= new TrailerVO(idx, title, director, release, info);
		req.setAttribute("content", content);
		
		this.setViewPage("admin/contentPreview.jsp");
		this.setRedirect(false);
		
	}

}
