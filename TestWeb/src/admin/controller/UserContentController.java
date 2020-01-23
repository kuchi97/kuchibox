package admin.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import admin.domain.UserContentVO;
import admin.persistence.ContentDAO;
import common.controller.AbstractAction;

public class UserContentController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("UserContentController executed ####");
		String email= req.getParameter("email");
		System.out.println(email);
		
		ContentDAO contentDAO= new ContentDAO();
		List<UserContentVO> arr= contentDAO.listUserContent(email);
		
		req.setAttribute("listUserContent", arr);

		this.setViewPage("/userContentList.jsp");
		this.setRedirect(false);

	}

}
