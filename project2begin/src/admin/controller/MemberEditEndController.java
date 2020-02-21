package admin.controller;

import java.util.List;

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
		//유효성
		if(email==null || email.trim().isEmpty()) {
			String msg="잘못된 경로입니다";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		MemberDAO dao= new MemberDAO();
		
		//나머지 파라미터 받아오고
		String pwd= req.getParameter("pwd");
		String name= req.getParameter("name");
		String year= req.getParameter("year");
		String age= req.getParameter("age");
		String point= req.getParameter("point");
		String state= req.getParameter("state");
		String showState="";
		//회원상태별로 숫자->텍스트 전환
		switch(state) {
		case "0":
			showState="일반";
			break;
		case "1":
			showState="특별";
			break;
		case "-1":
			showState="정지";
			break;
		case "-2":
			showState="탈퇴";
			break;
		case "99":
			showState="관리자";
			break;
		}
		
		String oldName= req.getParameter("oldName");
		String oldYear= req.getParameter("oldYear");
		String oldAge= req.getParameter("oldAge");
		String oldPoint= req.getParameter("oldPoint");
		String oldState= req.getParameter("oldState");
		
		
		
		MemberVO member= new MemberVO(email,pwd,name,year,
						age,point,state);
		MemberVO oldMember= new MemberVO(email,pwd,oldName,oldYear,oldAge,oldPoint,oldState);
		
		int n= dao.updateMember(member);
		
		req.setAttribute("member", member);
		req.setAttribute("newState", showState);
		req.setAttribute("oldMember", oldMember);
		
		this.setViewPage("/admin/memberInfo.jsp");
		this.setRedirect(false);

	}

}
