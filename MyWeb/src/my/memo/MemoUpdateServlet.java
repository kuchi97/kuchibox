package my.memo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemoUpdate")
public class MemoUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out= res.getWriter();
		
		//post ����� �ѱ� ���ڵ�ó��
		req.setCharacterEncoding("UTF-8");
		
		//1. ����ڰ� �Է��� �۹�ȣ �ۼ��� �޸𳻿� �ޱ�
		String idxStr= req.getParameter("idx");
		String name= req.getParameter("name");
		String msg= req.getParameter("msg");
		
		//2. ��ȿ��üũ(�۹�ȣ�� üũ)
		if(idxStr==null || idxStr.trim().isEmpty())
		{
			out.println("<script>");
			out.println("alert('���� ã���� �����ϴ�')");
			out.println("</script>");
			res.sendRedirect("MemoList");
			return;
		}
		
		
		//3. ����ڰ� �Է��� ���� MemoVO�� ���
		MemoVO memo= new MemoVO();
		int idx=Integer.parseInt(idxStr.trim());			//������� ���������
		memo.setIdx(idx);
		memo.setName(name);
		memo.setMsg(msg);
		
		//4. MemoDAO�� int updateMemo(MemoVO) ȣ��
		MemoDAO dao= new MemoDAO();
		int n= dao.updateMemo(memo);

		
		String result= (n>0)? "���� ����":"���� ����";
		//5. �� ������ �޽��� �����ְ� �˾�â �ݱ� �ٽ� MemoList��
		out.println("<script>");
		out.println("	alert('"+result+"')");
		out.println("	window.opener.location.reload()");			//�θ�â�� ���ΰ�ħ���ֱ�
		out.println("	self.close()");						//��â�� �ݱ� (�Ǵ� window.close())
		out.println("</script>");
		
		
		out.close();
	}

}
