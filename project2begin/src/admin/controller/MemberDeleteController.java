package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberDeleteController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberDeleteController] ## FROM. memberDelete.do");
		
		String email= req.getParameter("email");
		//유효성
		if(email==null || email.trim().isEmpty()) {
			String msg="잘못된 경로입니다 [parameter:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		MemberDAO dao= new MemberDAO();
		//유효성-쿼리조작방지
		MemberVO isMember= dao.listOneMember(email);
		if(isMember==null) {
			String msg="잘못된 접근입니다 [result:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		int n= dao.deleteMember(email);
		
		String msg= (n>0)? email+" 님의 개인정보 삭제 완료":"삭제 실패";
		String loc= (n>0)? "memberList.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("/message.jsp");
		this.setRedirect(false);
	}

}
