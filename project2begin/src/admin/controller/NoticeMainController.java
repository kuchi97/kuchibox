package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeMainController extends AbstractAction{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		NoticeDAO dao= new NoticeDAO();
		List<NoticeVO> arr= dao.getNoticeList();
		
		req.setAttribute("noticeList", arr);
		
		this.setViewPage("/admin/noticeMain.jsp");
		this.setRedirect(false);
	}

}
