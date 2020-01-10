package common.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FileDownloadServlet
 */
@WebServlet("/FileDown")
public class FileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		download(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		download(request, response);
	}

	private void download(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1. 다운로드할 파일명 받아오기
		String fname= req.getParameter("filename");
		
		//2. 업로드 디렉토리의 절대경로 얻기
		String upDir="C:/Myjava/upload";
		
		System.out.println(fname);
		
		//3. 다운로드창을 실행시키기위해 response 헤더에
		// 컨텐트나입을 브라우저가 파싱하기 어려운 타입으로 지정하자
		// 브라우저는 알수있는형식이면 보여주고 모르는타입이면 다운로드창을 실행시킨다
		res.setContentType("application/sctet-stream");
		
		//파일명의 한글처리를 위해 charset을 ISO-8859-1로 처리한다
		String fname_en= new String(fname.getBytes(), "ISO-8859-1");
		
		//4. 헤더에 Content-Disposition 저장 (다운로드 창에 해당 파일명이 뜨게하기)
		String arg1="attachment; filename="+fname_en;
		res.setHeader("Content-Disposition", arg1);
		
		//5. 스트림 연결하여 읽고 브라우저를 통해 내보내기
		String path=upDir+"/"+fname;	//데이터 소스(파일)
		//여기도 BufferedInputStream으로 필터링
		BufferedInputStream in= new BufferedInputStream(new FileInputStream(path));

		//데이터 목적지 >> 클라이언트(브라우저)쪽으로 출력
		ServletOutputStream sos= res.getOutputStream();
		//BufferedOutputStream 으로 필터링
		BufferedOutputStream out= new BufferedOutputStream(sos);
		
		int n;
		byte[] data= new byte[4000];
		
		while((n=in.read(data))!=-1)
		{
			out.write(data,0,n);
			out.flush();
		}
		
		in.close();
		out.close();
		sos.close();
		
		
		
	}

}
