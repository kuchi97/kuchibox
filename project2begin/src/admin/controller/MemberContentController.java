package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.MemberContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class MemberContentController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[MemberContentController] executed ####");
		String email= req.getParameter("email");
//		System.out.println(email);
		
		ContentDAO contentDAO= new ContentDAO();
		List<MemberContentVO> memberContent;
		
		/* 파라미터로 email을 받아오지 않으면 전체 유저컨텐츠 목록을 보여주는 페이지로 이동 */
		if(email==null || email.trim().isEmpty()) {
			memberContent=contentDAO.listAllMemberContent();
			
			req.setAttribute("listAllMemberContent", memberContent);
			
			this.setViewPage("/admin/memberAllContentList.jsp");
			this.setRedirect(false);
			
		}
		/* email을 파라미터로 받아오면 특정유저 컨텐츠만 보여주는 페이지로 이동 */
		else {
			memberContent= contentDAO.listMemberContent(email);
			//작성한 내역이 없을때
			if(memberContent==null || memberContent.size()==0) {
				String msg="해당 회원이 작성한 내역은 존재하지 않습니다";
				String loc="javascript:history.back()";
				
				req.setAttribute("msg", msg);
				req.setAttribute("loc", loc);
				
				this.setViewPage("message.jsp");
				this.setRedirect(false);
				
				return;
			}
			
			req.setAttribute("listMemberContent", memberContent);
	
			this.setViewPage("/admin/memberContentList.jsp");
			this.setRedirect(false);
		}

	}

}
