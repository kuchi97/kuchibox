package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class TestMemberFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("testMemberFormController executed ####");
		
		
		MemberDAO memberDao= new MemberDAO();
		List<MemberVO> arr= memberDao.listMember();
		
		req.setAttribute("listMember", arr);
		
		this.setViewPage("testMember.jsp");
		this.setRedirect(false);
	}

}
