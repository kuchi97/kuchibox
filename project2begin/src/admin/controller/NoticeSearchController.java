package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeSearchController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[NoticeSearchController] executed ####");
		
		String selectBox= req.getParameter("selectBox");
		String searchInput= req.getParameter("searchInput");
		
		/* input값이 null일때 */
		if(searchInput==null || searchInput.trim().isEmpty()) {
			
			this.setViewPage("noticeMain.do");
			this.setRedirect(true);
			return;
		}
		
		NoticeDAO dao= new NoticeDAO();
		List<NoticeVO> arr= dao.selectNotice(selectBox, searchInput);
		
		System.out.println(selectBox+"//"+searchInput+"//"+arr);
		req.setAttribute("selectNotice", arr);
		
		this.setViewPage("/admin/noticeSearch.jsp");
		this.setRedirect(false);
	}

}
