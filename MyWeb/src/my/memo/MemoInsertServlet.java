package my.memo;

import java.io.IOException;
import java.io.PrintWriter; 

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//url-pattern mapping (서블릿에 대한 논리적 경로를 맵핑한다)
@WebServlet("/MemoInsert")
public class MemoInsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out= res.getWriter();
		//1. 사용자입력한값 받아오기
		String name= req.getParameter("name");
		String msg= req.getParameter("msg");
		
		out.println(name+"/"+msg);
		
		
		//2. 유효성 체크
		if(name==null || msg==null)
		{
			res.sendRedirect("k1Memo/memo.html");
			//memo.html로 리다이렉트
			
			return;
			//리턴해서 db연동되는거 막아야함
		}
		if(name.trim().isEmpty() || msg.trim().isEmpty())
		{
			//JS에서 에러와 리다이렉트 실행
			out.println("<script>");
			out.println("alert('작성자와 메모내용을 입력하세요')");
			out.println("location.href='k1Memo/memo.html'");
			out.println("</script>");
			return;
		}
		//
		
		
		//2. memoVO에 담기
		MemoVO memo= new MemoVO(0,name,msg,null);
		
		//3. memoDAO에서 insertMemo() 호출
		MemoDAO dao= new MemoDAO();
		int n= dao.insertMemo(memo);
		
		//4. 실행결과 보여주기/페이지이동
		String str= (n>0)? "메모 등록 성공":"메모 등록 실패";
		String loc= (n>0)? "MemoList":"k1Memo/memo.html";
		
		out.println("<script>");
		out.println("alert('"+str+"')");
		out.println("location.href='"+loc+"'");
		out.println("</script>");
		
		
		//닫기
		out.close();
		
	}

}
