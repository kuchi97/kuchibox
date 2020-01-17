package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentListController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("ContentListController executed ####");
		
		ContentDAO contentDao= new ContentDAO();
		List<ContentVO> arr= contentDao.listContent();
		
		req.setAttribute("listContent", arr);
		
		this.setViewPage("/contentList.jsp");
		this.setRedirect(false);

	}

}
