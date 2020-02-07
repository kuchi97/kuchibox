package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class MemberContentSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[MemberContentSearchFormController] 개길어 ㅅㅂ");
		
		String selectBox= req.getParameter("selectBox");
		String searchInput= req.getParameter("searchInput");
		
		/* 인풋이 널일때 */
		if(searchInput==null || searchInput.trim().isEmpty()) {
			this.setViewPage("memberContent.do");
			this.setRedirect(true);
		}
		
		ContentDAO dao= new ContentDAO();
		List<ContentVO> arr= dao.searchMemberContent(selectBox, searchInput);
		
		req.setAttribute("keyword", searchInput);
		req.setAttribute("searchMemberContent", arr);
		
		this.setViewPage("/admin/memberContentSearch.jsp");
		this.setRedirect(false);
		
	}

}
