package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberVO;
import admin.domain.PagingVO;
import admin.persistence.MemberDAO;
import common.controller.AbstractAction;

public class MemberSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[MemberSearchFormController] ## FROM. memberSearch.do");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage=Integer.parseInt(cpageStr);
		
		MemberDAO dao= new MemberDAO();
		PagingVO paging= new PagingVO(cpage,10,5);
		paging.setSelectBox(req.getParameter("selectBox"));
		paging.setSearchInput(req.getParameter("searchInput"));
		paging.setTotalCount(dao.getTotalSearchMember(paging.getSelectBox(), paging.getSearchInput()));
		paging.init();
//		System.out.println("MemberSearchForm/selectBox:"+selectBox);
//		System.out.println("MemberSearchForm/searchInput:"+searchInput);
		
		/* input값이 없을때- 전체리스트로 돌아간다 */
		if(paging.getSearchInput()==null || paging.getSearchInput().trim().isEmpty()) {
			this.setViewPage("memberList.do");
			this.setRedirect(false);
			
			return;
		}
		
		List<MemberVO> arr= dao.searchMember(paging.getSelectBox(), paging.getSearchInput(), paging.getStart(), paging.getEnd());
		
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "memberSearch.do", false));
		req.setAttribute("searchMember", arr);
		

		this.setViewPage("/admin/memberSearch.jsp");
		this.setRedirect(false);
	}

}
