package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.domain.PagingVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeMainController extends AbstractAction{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeMainController] ## noticeMain.do¿¡¼­ ³Ñ¾î¿È");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		NoticeDAO dao= new NoticeDAO();
		PagingVO paging= new PagingVO(dao.getTotalNotice(), cpage, 10, 5);
		List<NoticeVO> arr= dao.getNoticeList(paging.getStart(), paging.getEnd());
		
		req.setAttribute("noticeList", arr);
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(), "noticeMain.do",false));
		
		this.setViewPage("/admin/noticeMain.jsp");
		this.setRedirect(false);
	}

}
