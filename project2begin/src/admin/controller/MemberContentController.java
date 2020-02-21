package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class MemberContentController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberContentController] ## FROM. memberContent.do");
		
		String email= req.getParameter("email");
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		ContentDAO dao= new ContentDAO();
		PagingVO paging= new PagingVO(dao.getTotalMemberContent(email), cpage, 10, 5);
		List<MemberContentVO> memberContent= dao.listMemberContent(email, paging.getStart(), paging.getEnd());
		
		
		//작성한 내역이 없을때
		if(memberContent==null || memberContent.size()<=0) {
			String msg="해당 회원이 작성한 내역은 존재하지 않습니다";
			String loc="javascript:history.back()";
			
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			
			this.setViewPage("message.jsp");
			this.setRedirect(false);
			
			return;
		}
		
		req.setAttribute("email", email);
		req.setAttribute("listMemberContent", memberContent);
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "memberContent.do?email="+email,true));

		this.setViewPage("/admin/memberContentList.jsp");
		this.setRedirect(false);

	}

}
