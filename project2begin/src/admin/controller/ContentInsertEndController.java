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

			
		/* 여기에 인서트문 작성하고 setAttribute()한 후에 돌아간다 */
		
		
		//이거는 임시로 contentList 보이게 해놓은거---------
//		List<ContentVO> arr= contentDAO.listContent(start, end);
//		
//		req.setAttribute("listContent", arr);
		//---------------------------------------------
		
		this.setViewPage("contentList.do");
		this.setRedirect(false);
		
	}

}
