package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.domain.PagingVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeSearchController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeSearchController] ## FROM. noticeSearch.do");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		NoticeDAO dao= new NoticeDAO();
		PagingVO paging= new PagingVO(cpage,10,5);
		paging.setSelectBox(req.getParameter("selectBox"));
		paging.setSearchInput(req.getParameter("searchInput"));
		paging.setTotalCount(dao.getTotalSearchNotice(paging.getSelectBox(),paging.getSearchInput()));
		paging.init();
		
		/* input값이 null일때 */
		if(paging.getSearchInput()==null || paging.getSearchInput().trim().isEmpty()) {
			this.setViewPage("noticeMain.do");
			this.setRedirect(true);
			return;
		}
		
		List<NoticeVO> arr= dao.selectNotice(paging.getSelectBox(), paging.getSearchInput(), paging.getStart(), paging.getEnd());
		
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "noticeSearch.do", false));
		req.setAttribute("selectNotice", arr);
		
		this.setViewPage("/admin/noticeSearch.jsp");
		this.setRedirect(false);
	}

}
