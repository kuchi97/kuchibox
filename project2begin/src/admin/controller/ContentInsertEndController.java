package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentInsertEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("[ContentInsertEndController] executed ####");
		
		/* ���⿡ �μ�Ʈ�� �ۼ��ϰ� setAttribute()�� �Ŀ� ���ư��� */
		
		//�̰Ŵ� �ӽ÷� contentList ���̰� �س�����---------
		ContentDAO contentDAO= new ContentDAO();
		List<ContentVO> arr= contentDAO.listContent();
		
		req.setAttribute("listContent", arr);
		//---------------------------------------------
		
		this.setViewPage("/admin/contentList.jsp");
		this.setRedirect(false);
	}

}
