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
		//��ȿ��
		if(email==null || email.trim().isEmpty()) {
			String msg="�߸��� ����Դϴ� [parameter:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		MemberDAO dao= new MemberDAO();
		//��ȿ��-�������۹���
		MemberVO isMember= dao.listOneMember(email);
		if(isMember==null) {
			String msg="�߸��� �����Դϴ� [result:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		int n= dao.deleteMember(email);
		
		String msg= (n>0)? email+" ���� �������� ���� �Ϸ�":"���� ����";
		String loc= (n>0)? "memberList.do":"javascript:history.back()";
		
		req.setAttribute("msg", msg);
		req.setAttribute("loc", loc);
		
		this.setViewPage("/message.jsp");
		this.setRedirect(false);
	}

}
