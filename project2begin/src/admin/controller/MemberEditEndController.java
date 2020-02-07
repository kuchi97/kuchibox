package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberEditEndController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[MemberEditEndController] executed ####");
		
		String email= req.getParameter("email");
		String pwd= req.getParameter("pwd");
		String name= req.getParameter("name");
		String year= req.getParameter("year");
		String age= req.getParameter("age");
		String point= req.getParameter("point");
		String state= req.getParameter("state");

		String oldName= req.getParameter("oldName");
		String oldYear= req.getParameter("oldYear");
		String oldAge= req.getParameter("oldAge");
		String oldPoint= req.getParameter("oldPoint");
		String oldState= req.getParameter("oldState");
		
		System.out.println(email+" // "+pwd+" // "+name+" // "+year+" // "+age+" // "+point+" // "+state);
		
		MemberDAO dao= new MemberDAO();
		MemberVO member= new MemberVO(email,pwd,name,year,
						age,point,state);
		MemberVO oldMember= new MemberVO(email,pwd,oldName,oldYear,oldAge,oldPoint,oldState);
		
		int n= dao.updateMember(member);
		
		req.setAttribute("member", member);
		req.setAttribute("oldMember", oldMember);
		
		this.setViewPage("/admin/memberInfo.jsp");
		this.setRedirect(false);

	}

}
