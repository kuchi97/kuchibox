package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//index.jsp로 가기위한 첫걸음
public class IndexController extends AbstractAction {

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		System.out.println("[IndexController] executed ####");
		
		this.setViewPage("/index.jsp");
		this.setRedirect(false);
	}

}
