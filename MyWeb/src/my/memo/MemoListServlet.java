package my.memo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemoList")
public class MemoListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

		res.setContentType("text/html; charset=UTF-8");
		PrintWriter out= res.getWriter();
		
		out.println("<link rel='stylesheet' type='text/css' href='css/memo.css'>");
		
		out.println("<div id='wrap' style='text-align:center;'>");
		out.println("<h1>:: ���� �޸��� ��� ::</h1>");
		out.println("<table border='1', style='border-collapse:collapse; width='90%'>");
		out.println("	<tr><th>�۹�ȣ</th>");
		out.println("	<th width='70%'>�޸𳻿�</th><th>�ۼ���</th><th>����|����</th></tr>");
		
		//���̺� �޸����̺� ���� ����ϱ�
		MemoDAO dao= new MemoDAO();
		ArrayList<MemoVO> al= dao.listMemo();
		if(al==null)
		{
			out.println("<tr><td colspan='4'> ���������Դϴ� </td></tr>");
		}
		else if(al.size()==0)
		{
			out.println("<tr><td colspan='4'> �����Ͱ� �����ϴ� </td></tr>");
		}
		else {
			for(MemoVO m:al)
			{
				out.println("	<tr>");
				out.println("		<td>"+m.getIdx()+"</td>");
				out.println("		<td>"+m.getMsg()+"    ["+m.getWdate()+"]</td>");
				out.println("		<td>"+m.getName()+"</td>");
				out.println("		<td><a href='#' onclick='goDel("+m.getIdx()+")'>����</a>|");
				out.println("			<a href='#' onclick='goEdit("+m.getIdx()+")'>����</a></td>");
				out.println("	</tr>");
			}//--for
			
		}//--else
		
		out.println("</table>");
		out.println("</div>");
		
		out.println("<script>");
		//goDel()
		out.println("function goDel(idx) {");
		out.println("	var yn= confirm(idx+' �� ���� ���� �����Ͻðڽ��ϱ�?')");
		out.println("	if(yn) {");
		out.println("		location.href='MemoDelete?idx='+idx");
		out.println("	}");
		out.println("}");
		
		//goEdit()
		out.println("function goEdit(idx) {");
		out.println("	var win= window.open('k1Memo/memoEdit.jsp?idx='+idx, 'width=600, height=500')");		//window.open �˾�â ����
		out.println("}");

		out.println("</script>");
		
		out.close();
	
	}

}
