package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class MemberAllContentController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberAllContentController] ## FROM. memberAllContent.do ");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		ContentDAO dao= new ContentDAO();
		PagingVO paging= new PagingVO(dao.getTotalMemberAllContent(), cpage, 10, 5);
		List<MemberContentVO> arr=dao.listAllMemberContent(paging.getStart(), paging.getEnd());
		//유효성
		if(arr.size()<=0) {
			String msg="목록을 찾을 수 없습니다 [result:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("listAllMemberContent", arr);
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "memberAllContent.do",false));
		
		this.setViewPage("/admin/memberAllContentList.jsp");
		this.setRedirect(false);
	}

}
