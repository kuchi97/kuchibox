package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[NoticeController] Executed####");
		
		String start= req.getParameter("start");
		String end= req.getParameter("end");
		
		NoticeDAO noticeDAO= new NoticeDAO();
		List<NoticeVO> arr= noticeDAO.getNoticeList(Integer.parseInt(start), Integer.parseInt(end));
		
		req.setAttribute("noticeList", arr);
		
		this.setViewPage("notice.jsp");
		this.setRedirect(false);
	}

}
