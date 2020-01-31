package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[MemberSearchFormController] executed ####");
		
		String selectBox= req.getParameter("selectBox");
//		System.out.println("MemberSearchForm:"+selectBox);
		String searchInput= req.getParameter("searchInput");
//		System.out.println("MemberSearchForm:"+searchInput);
		
		MemberDAO dao= new MemberDAO();
		List<MemberVO> arr= dao.searchMember(selectBox, searchInput);
		
		req.setAttribute("searchMember", arr);

		this.setViewPage("/admin/memberSearch.jsp");
		this.setRedirect(false);
	}

}
