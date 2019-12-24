package my.com;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

//servlet-api.jar파일에 있음

/*
서블릿을 등록하는 방법

	1. WEB-INF/web.xml 에 등록하는 방법
		web.xml에 servlet을 따로 등록하여야한다
			ex>
			  <!-- Servlet 등록 -->
				  <servlet>
				  	<servlet-name>Hello</servlet-name>
				  	<servlet-class>my.com.HelloServlet</servlet-class>
				  </servlet>
				  <servlet-mapping>
				  	<servlet-name>Hello</servlet-name>
				  	<url-pattern>/aaa</url-pattern>
				  	
	2. annotation을 이용하여 등록하는 방법
		@WebServlet

*/


public class HelloServlet extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//res: 응답을 보낼때 사용하는 객체로 브라우저와 연결되어있다
		res.setContentType("text/html; charset=UTF-8");		//http프로토콜
		//브라우저에 표현할 문서형식을 text/html 로 지정
		
		
		PrintWriter out= res.getWriter();
		//브라우저와 노드연결하고있는 스트림을 얻어온다
		//2byte 기반 스트림: PrintWriter(), getWriter()
		//1byte 기반 스트림: ServletOutputStream, getOutputStream()
		
		out.println("<h1>Hello Servlet</h1>");
		out.println("<h2>안녕 서블릿</h2>");
		
		Date today= new Date();
		out.println("<h3 style='color:red'>서버시간: "+today.toString()+"</h3>");
		
		out.close();
		
	}
}
