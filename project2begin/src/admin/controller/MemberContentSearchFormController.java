package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class MemberContentSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberContentSearchFormController] ## FROM. memberContentSearch.do");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);

		ContentDAO dao= new ContentDAO();
		PagingVO paging= new PagingVO(cpage,10,5);
		paging.setSelectBox(req.getParameter("selectBox"));
		paging.setSearchInput(req.getParameter("searchInput"));
		paging.setTotalCount(dao.getTotalSearchMemberContent(paging.getSelectBox(),paging.getSearchInput()));
		paging.init();
		
		/* 인풋이 널일때 */
		if(paging.getSearchInput()==null || paging.getSearchInput().trim().isEmpty()) {
			this.setViewPage("memberAllContent.do");
			this.setRedirect(true);
			return;
		}
		
		List<MemberContentVO> arr= dao.searchMemberContent(paging.getSelectBox(),paging.getSearchInput(),paging.getStart(),paging.getEnd());
		
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "memberContentSearch.do", false));
		req.setAttribute("searchMemberContent", arr);
		
		this.setViewPage("/admin/memberContentSearch.jsp");
		this.setRedirect(false);
		
	}

}
