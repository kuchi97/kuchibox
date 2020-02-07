package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.domain.MemberVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberInfoController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[MemberInfoController] executed ####");
		
		String email= req.getParameter("email");
		System.out.println(email);
		
		MemberDAO dao= new MemberDAO();
		MemberVO member= dao.listOneMember(email);
		
		req.setAttribute("member", member);
		
		this.setViewPage("/admin/memberInfoEdit.jsp");
		this.setRedirect(false);
	}

}
