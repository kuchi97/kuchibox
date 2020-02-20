package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.NoticeVO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class NoticeViewController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[NoticeViewController] ## FROM.. noticeView.do");
		
		String idx= req.getParameter("idx");
		if(idx==null || idx.trim().isEmpty()) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		NoticeDAO dao= new NoticeDAO();
		//조회수 1증가
		dao.updateClick(idx);
		
		NoticeVO notice= dao.selectOneNotice(idx);
		//유효성
		if(notice==null) {
			String msg="잘못된 접근입니다 [parameter:none]";
			String loc="index.do";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		
		req.setAttribute("notice", notice);
		
		this.setViewPage("/admin/noticeView.jsp");
		this.setRedirect(false);
	}

}
