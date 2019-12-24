package my.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		
		//사용자가 입력한 아이디, 비번 받아서 출력하기
		
		//Post방식일때는 한글이 안나옴(인코딩): 데이터를 entity body에서 처리하기때문에
		//인코딩을 맞춰주려면
		req.setCharacterEncoding("UTF-8");		//body의 encoding을 맞춰줌
		
		String uid= req.getParameter("userId");
		String upw= req.getParameter("userPwd");
		
		PrintWriter out= res.getWriter();
		
		out.println("<li>사용자 아이디: "+uid+"</li>");
		out.println("<li>사용자 비밀번호: "+upw+"</li>");
		
		out.close();
	
	}

}
