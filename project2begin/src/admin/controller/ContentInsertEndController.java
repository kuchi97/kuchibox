package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentInsertEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentInsertEndController] ## FROM. contentInsertEnd.do");

			
		/* ���⿡ �μ�Ʈ�� �ۼ��ϰ� setAttribute()�� �Ŀ� ���ư��� */
		
		
		//�̰Ŵ� �ӽ÷� contentList ���̰� �س�����---------
//		List<ContentVO> arr= contentDAO.listContent(start, end);
//		
//		req.setAttribute("listContent", arr);
		//---------------------------------------------
		
		this.setViewPage("contentList.do");
		this.setRedirect(false);
		
	}

}
