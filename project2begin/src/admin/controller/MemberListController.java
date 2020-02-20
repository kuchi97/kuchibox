package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.domain.PagingVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberListController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberListController] ## memberList.do���� �Ѿ��");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);

		MemberDAO dao= new MemberDAO();
		PagingVO paging= new PagingVO(dao.getTotalMember(), cpage, 10, 5);
		List<MemberVO> arr= dao.listMember(paging.getStart(), paging.getEnd());
		//��ȿ��
		if(arr.size()<=0) {
			String msg="ȸ������� �������µ� �����߽��ϴ� [result:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("listMember", arr);
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "memberList.do",false));
		
		this.setViewPage("/admin/memberList.jsp");
		this.setRedirect(false);
	}

}
