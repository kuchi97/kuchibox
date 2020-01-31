package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[ContentSearchFormController] executed####");
		String selectBox= req.getParameter("selectBox");
//		System.out.println(selectBox);
		String searchInput= req.getParameter("searchInput");
//		System.out.println(searchInput);
		
		ContentDAO dao= new ContentDAO();
		List<ContentVO> arr= dao.searchContent(selectBox, searchInput);
		
		req.setAttribute("searchContent", arr);
		
		this.setViewPage("/admin/contentSearch.jsp");
		this.setRedirect(false);
	}

}
