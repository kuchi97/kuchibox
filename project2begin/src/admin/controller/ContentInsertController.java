package admin.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import common.controller.AbstractAction;

public class ContentInsertController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("[ContentInsertController] executed ####");
		
		this.setViewPage("/admin/contentInsert.jsp");
		this.setRedirect(false);
	}

}
