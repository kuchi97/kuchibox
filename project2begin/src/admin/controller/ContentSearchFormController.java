package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentSearchFormController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentSearchFormController] ## FROM. contentSearch.do");
				
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		ContentDAO dao= new ContentDAO();
		PagingVO paging= new PagingVO(cpage, 10, 5);
		paging.setSelectBox(req.getParameter("selectBox"));
		paging.setSearchInput(req.getParameter("searchInput"));
		paging.setTotalCount(dao.getTotalSearchContent(paging.getSelectBox(),paging.getSearchInput()));
		paging.init();
		
		//검색이 공란이면 전체리스트로 돌아간다
		if(paging.getSearchInput()==null || paging.getSearchInput().trim().isEmpty()) {
			this.setViewPage("contentList.do");
			this.setRedirect(true);
			return;
		}
		
		List<ContentVO> arr= dao.searchContent(paging.getSelectBox(),paging.getSearchInput(),paging.getStart(),paging.getEnd());
		
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "contentSearch.do", false));
		req.setAttribute("searchContent", arr);
		
		this.setViewPage("/admin/contentSearch.jsp");
		this.setRedirect(false);
	}

}
