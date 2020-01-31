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
		
		/* 여기에 인서트문 작성하고 setAttribute()한 후에 돌아간다 */
		
		//이거는 임시로 contentList 보이게 해놓은거---------
		ContentDAO contentDAO= new ContentDAO();
		List<ContentVO> arr= contentDAO.listContent();
		
		req.setAttribute("listContent", arr);
		//---------------------------------------------
		
		this.setViewPage("/admin/contentList.jsp");
		this.setRedirect(false);
	}

}
