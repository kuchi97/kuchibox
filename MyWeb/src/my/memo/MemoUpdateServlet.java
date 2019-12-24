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
		
		//post 방식의 한글 인코딩처리
		req.setCharacterEncoding("UTF-8");
		
		//1. 사용자가 입력한 글번호 작성자 메모내용 받기
		String idxStr= req.getParameter("idx");
		String name= req.getParameter("name");
		String msg= req.getParameter("msg");
		
		//2. 유효성체크(글번호만 체크)
		if(idxStr==null || idxStr.trim().isEmpty())
		{
			out.println("<script>");
			out.println("alert('글을 찾을수 없습니다')");
			out.println("</script>");
			res.sendRedirect("MemoList");
			return;
		}
		
		
		//3. 사용자가 입력한 값을 MemoVO에 담기
		MemoVO memo= new MemoVO();
		int idx=Integer.parseInt(idxStr.trim());			//공백까지 제거해줘요
		memo.setIdx(idx);
		memo.setName(name);
		memo.setMsg(msg);
		
		//4. MemoDAO에 int updateMemo(MemoVO) 호출
		MemoDAO dao= new MemoDAO();
		int n= dao.updateMemo(memo);

		
		String result= (n>0)? "수정 성공":"수정 실패";
		//5. 그 실행결과 메시지 보여주고 팝업창 닫기 다시 MemoList로
		out.println("<script>");
		out.println("	alert('"+result+"')");
		out.println("	window.opener.location.reload()");			//부모창을 새로고침해주기
		out.println("	self.close()");						//내창은 닫기 (또는 window.close())
		out.println("</script>");
		
		
		out.close();
	}

}
