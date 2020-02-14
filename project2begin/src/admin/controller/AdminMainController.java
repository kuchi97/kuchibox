package admin.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.domain.MemberContentVO;
import admin.domain.MemberVO;
import admin.domain.NoticeVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import admin.persistence.MemberDAO;
import admin.persistence.NoticeDAO;
import common.controller.AbstractAction;

public class AdminMainController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[AdminMainController] ## admin.do ���� �Ѿ��");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		PagingVO paging= new PagingVO(10,cpage, 5, 5);
			//totalCount���� �������� �༭ ���������� �� ����Ҽ��ְ���
			//(������ ���ο� ����� ����� 4�����̴ϱ�)
		int start= paging.getStart();
		int end= paging.getEnd();
		
		
		MemberDAO memberDAO= new MemberDAO();
		List<MemberVO> memberArr= memberDAO.listMember(start, end);
		
		ContentDAO contentDAO= new ContentDAO();
		List<ContentVO> contentArr= contentDAO.listContent(start, end);

		List<MemberContentVO> userContentArr= contentDAO.listAllMemberContent(start, end);
		
		NoticeDAO noticeDAO= new NoticeDAO();
		List<NoticeVO> noticeArr= noticeDAO.getNoticeList(start,end);
		
		req.setAttribute("memberList", memberArr);
		req.setAttribute("contentList", contentArr);
		req.setAttribute("userContentList", userContentArr);
		req.setAttribute("noticeList", noticeArr);
		
		this.setViewPage("/admin/adminMain.jsp");
		this.setRedirect(false);
	}

}
