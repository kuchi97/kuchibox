package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.domain.MemberVO;
import admin.domain.NoticeVO;
import admin.domain.UserContentVO;
import admin.persistence.ContentDAO;
import admin.persistence.MemberDAO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class AdminMainController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("AdminMainController Executed#####");
		
		MemberDAO memberDAO= new MemberDAO();
		List<MemberVO> memberArr= memberDAO.listMember();
		
		ContentDAO contentDAO= new ContentDAO();
		List<ContentVO> contentArr= contentDAO.listContent();

		List<UserContentVO> userContentArr= contentDAO.listAllUserContent();
		
		NoticeDAO noticeDAO= new NoticeDAO();
		List<NoticeVO> noticeArr= noticeDAO.getNoticeList();
		
		req.setAttribute("memberList", memberArr);
		req.setAttribute("contentList", contentArr);
		req.setAttribute("userContentList", userContentArr);
		req.setAttribute("noticeList", noticeArr);
		
		
		this.setViewPage("adminMain.jsp");
		this.setRedirect(false);
	}

}
