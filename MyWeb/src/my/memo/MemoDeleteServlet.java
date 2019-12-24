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
		
		//1. 삭제할 글 번호 받기
		String idxStr= req.getParameter("idx");
									//MemoVO의 idx를 꺼내와야함
		
		
		//2. 유효성 체크(리다이렉트 설정 등)
		String loc="MemoList";			//리다이렉트 경로

		if(idxStr==null || idxStr.trim().isEmpty())
		{
			out.println("<script>");
			out.println("alert('찾을수없음')");
			out.println("</script>");
			
			res.sendRedirect(loc);
			return;
		}
		
		
		
		//3. memoDAO의 deleteMemo() 호출
		MemoDAO dao= new MemoDAO();
		int n=dao.deleteMemo(new Integer(idxStr));
		
		//4. 결과메시지 보여주고 페이지 이동
		String result= (n>0)? "삭제 성공":"삭제 실패";
		
		out.println("<script>");
		out.println("alert("+result+")");
		out.println("location.href='"+loc+"'");
		out.println("</script>");
		
		res.sendRedirect(loc);
		
		//삭제하시겠습니까? 컨펌은 memodelete보다 memolist에서 확인해주는것이 좋음
		out.close();
	
	
	}

}
