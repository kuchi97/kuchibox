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
		
		//����ڰ� �Է��� ���̵�, ��� �޾Ƽ� ����ϱ�
		
		//Post����϶��� �ѱ��� �ȳ���(���ڵ�): �����͸� entity body���� ó���ϱ⶧����
		//���ڵ��� �����ַ���
		req.setCharacterEncoding("UTF-8");		//body�� encoding�� ������
		
		String uid= req.getParameter("userId");
		String upw= req.getParameter("userPwd");
		
		PrintWriter out= res.getWriter();
		
		out.println("<li>����� ���̵�: "+uid+"</li>");
		out.println("<li>����� ��й�ȣ: "+upw+"</li>");
		
		out.close();
	
	}

}
