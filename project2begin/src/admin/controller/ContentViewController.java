package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentViewController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentViewController] ## FROM. contentView.do");
		
		String idx= req.getParameter("idx");
		
		ContentDAO dao= new ContentDAO();
		ContentVO content= dao.selectOneContent(idx);
		req.setAttribute("content", content);
		
		this.setViewPage("/admin/contentView.jsp");
		this.setRedirect(false);
	}

}
