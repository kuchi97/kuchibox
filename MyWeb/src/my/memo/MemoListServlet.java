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
		out.println("<h1>:: 한줄 메모장 목록 ::</h1>");
		out.println("<table border='1', style='border-collapse:collapse; width='90%'>");
		out.println("	<tr><th>글번호</th>");
		out.println("	<th width='70%'>메모내용</th><th>작성자</th><th>삭제|수정</th></tr>");
		
		//테이블에 메모테이블 내용 출력하기
		MemoDAO dao= new MemoDAO();
		ArrayList<MemoVO> al= dao.listMemo();
		if(al==null)
		{
			out.println("<tr><td colspan='4'> 서버오류입니다 </td></tr>");
		}
		else if(al.size()==0)
		{
			out.println("<tr><td colspan='4'> 데이터가 없습니다 </td></tr>");
		}
		else {
			for(MemoVO m:al)
			{
				out.println("	<tr>");
				out.println("		<td>"+m.getIdx()+"</td>");
				out.println("		<td>"+m.getMsg()+"    ["+m.getWdate()+"]</td>");
				out.println("		<td>"+m.getName()+"</td>");
				out.println("		<td><a href='#' onclick='goDel("+m.getIdx()+")'>삭제</a>|");
				out.println("			<a href='#' onclick='goEdit("+m.getIdx()+")'>수정</a></td>");
				out.println("	</tr>");
			}//--for
			
		}//--else
		
		out.println("</table>");
		out.println("</div>");
		
		out.println("<script>");
		//goDel()
		out.println("function goDel(idx) {");
		out.println("	var yn= confirm(idx+' 번 글을 정말 삭제하시겠습니까?')");
		out.println("	if(yn) {");
		out.println("		location.href='MemoDelete?idx='+idx");
		out.println("	}");
		out.println("}");
		
		//goEdit()
		out.println("function goEdit(idx) {");
		out.println("	var win= window.open('k1Memo/memoEdit.jsp?idx='+idx, 'width=600, height=500')");		//window.open 팝업창 띄우기
		out.println("}");

		out.println("</script>");
		
		out.close();
	
	}

}
