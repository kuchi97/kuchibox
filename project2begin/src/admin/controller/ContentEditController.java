package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentEditController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentEditController] executed ####");
		
		String idx= req.getParameter("idx");
		//��ȿ��
		if(idx==null || idx.trim().isEmpty()) {
			String msg="�߸��� ����Դϴ�";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			
			this.setViewPage("/message.jsp");
			this.setRedirect(true);
			
			return;
		}
		
		ContentDAO dao= new ContentDAO();
		ContentVO content= dao.selectOneContent(idx);
		//��ȿ��-�Ķ��������
		if(content==null) {
			String msg="�߸��� �����Դϴ� [parameter:none]";
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
