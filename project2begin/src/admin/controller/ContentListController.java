package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.ContentVO;
import admin.domain.PagingVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class ContentListController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[ContentListController] ## contentList.do ���� �Ѿ��");
		
		String cpageStr= req.getParameter("cpage");
		if(cpageStr==null) {
			cpageStr="1";
		}
		int cpage= Integer.parseInt(cpageStr);
		
		ContentDAO dao= new ContentDAO();
		PagingVO paging= new PagingVO(dao.getTotalContent(), cpage, 10, 10);
		
		List<ContentVO> arr= dao.listContent(paging.getStart(), paging.getEnd());
		//��ȿ��
		if(arr.size()<=0) {
			String msg="����� ã�� �� �����ϴ� [result:none]";
			String loc="javascript:history.back()";
			req.setAttribute("msg", msg);
			req.setAttribute("loc", loc);
			this.setViewPage("/message.jsp");
			return;
		}
		
		req.setAttribute("listContent", arr);
		req.setAttribute("paging", paging);
		req.setAttribute("pageNavi", paging.getPageNavi(req.getContextPath(),"contentList.do",false));
		
		this.setViewPage("/admin/contentList.jsp");
		this.setRedirect(false);

	}

}
