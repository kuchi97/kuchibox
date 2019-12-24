package my.memo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemoDelete")
public class MemoDeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out= res.getWriter();
		
		//1. ������ �� ��ȣ �ޱ�
		String idxStr= req.getParameter("idx");
									//MemoVO�� idx�� �����;���
		
		
		//2. ��ȿ�� üũ(�����̷�Ʈ ���� ��)
		String loc="MemoList";			//�����̷�Ʈ ���

		if(idxStr==null || idxStr.trim().isEmpty())
		{
			out.println("<script>");
			out.println("alert('ã��������')");
			out.println("</script>");
			
			res.sendRedirect(loc);
			return;
		}
		
		
		
		//3. memoDAO�� deleteMemo() ȣ��
		MemoDAO dao= new MemoDAO();
		int n=dao.deleteMemo(new Integer(idxStr));
		
		//4. ����޽��� �����ְ� ������ �̵�
		String result= (n>0)? "���� ����":"���� ����";
		
		out.println("<script>");
		out.println("alert("+result+")");
		out.println("location.href='"+loc+"'");
		out.println("</script>");
		
		res.sendRedirect(loc);
		
		//�����Ͻðڽ��ϱ�? ������ memodelete���� memolist���� Ȯ�����ִ°��� ����
		out.close();
	
	
	}

}
