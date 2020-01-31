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
		
		/* �Ķ���ͷ� email�� �޾ƿ��� ������ ��ü ���������� ����� �����ִ� �������� �̵� */
		if(email==null || email.trim().isEmpty()) {
			memberContent=contentDAO.listAllMemberContent();
			
			req.setAttribute("listAllMemberContent", memberContent);
			
			this.setViewPage("/admin/memberAllContentList.jsp");
			this.setRedirect(false);
			
		}
		/* email�� �Ķ���ͷ� �޾ƿ��� Ư������ �������� �����ִ� �������� �̵� */
		else {
			memberContent= contentDAO.listMemberContent(email);
			//�ۼ��� ������ ������
			if(memberContent==null || memberContent.size()==0) {
				String msg="�ش� ȸ���� �ۼ��� ������ �������� �ʽ��ϴ�";
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
