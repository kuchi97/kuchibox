package my.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetServlet
 */
@WebServlet("/GetServlet")
public class GetServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out= res.getWriter();
		
		//1. 사용자가 입력한 값 받기: req.getParameter("파라미터명");
		String uid= req.getParameter("userId");
		String upw= req.getParameter("userPwd");
		
		
		out.println("Hello getServlet");
		out.println("<li>사용자 아이디: "+uid+"</li>");
		out.println("<li>사용자 비밀번호: "+upw+"</li>");
		
		out.close();
		
	}


}
