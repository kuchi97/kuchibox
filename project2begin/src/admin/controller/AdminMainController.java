package admin.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.TrailerVO;
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
		System.out.println("[AdminMainController] ## admin.do 에서 넘어옴");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null || cpageStr.trim().isEmpty()) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		PagingVO paging= new PagingVO(10,cpage, 5, 5);
			//totalCount값을 고정으로 줘서 공통적으로 다 출력할수있게함
			//(어차피 메인에 출력할 목록은 4개씩이니까)
		int start= paging.getStart();
		int end= paging.getEnd();
		
		
		MemberDAO memberDAO= new MemberDAO();
		List<MemberVO> memberArr= memberDAO.listMember(start, end);
		
		ContentDAO contentDAO= new ContentDAO();
		List<TrailerVO> contentArr= contentDAO.listContent(start, end);

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
