package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentEditEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentEditEndController] ## FROM. contentEditEnd.do");
		
		String idx= req.getParameter("idx");
		//��ȿ��
		if(idx==null || idx.trim().isEmpty()) {
			String msg="�߸��� �����Դϴ� [result:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		String title= req.getParameter("title");
		String director= req.getParameter("director");
		String info= req.getParameter("info");
		String release= req.getParameter("release");
		
		ContentDAO dao= new ContentDAO();
		
		ContentVO content= new ContentVO(idx, title, director, release, info);
		
		int n= dao.updateContent(content);
		
		String msg= (n>0)?"���� ����":"���� ����";
		String loc= (n>0)?"contentView.do?idx="+idx:"javascript:history.back()";
		
		req.setAttribute("content", content);
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("/message.jsp");
		this.setRedirect(false);
		
	}

}
