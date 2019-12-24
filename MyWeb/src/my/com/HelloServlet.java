package my.com;

import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
import java.util.*;

//servlet-api.jar���Ͽ� ����

/*
������ ����ϴ� ���

	1. WEB-INF/web.xml �� ����ϴ� ���
		web.xml�� servlet�� ���� ����Ͽ����Ѵ�
			ex>
			  <!-- Servlet ��� -->
				  <servlet>
				  	<servlet-name>Hello</servlet-name>
				  	<servlet-class>my.com.HelloServlet</servlet-class>
				  </servlet>
				  <servlet-mapping>
				  	<servlet-name>Hello</servlet-name>
				  	<url-pattern>/aaa</url-pattern>
				  	
	2. annotation�� �̿��Ͽ� ����ϴ� ���
		@WebServlet

*/


public class HelloServlet extends HttpServlet 
{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException
	{
		//res: ������ ������ ����ϴ� ��ü�� �������� ����Ǿ��ִ�
		res.setContentType("text/html; charset=UTF-8");		//http��������
		//�������� ǥ���� ���������� text/html �� ����
		
		
		PrintWriter out= res.getWriter();
		//�������� ��忬���ϰ��ִ� ��Ʈ���� ���´�
		//2byte ��� ��Ʈ��: PrintWriter(), getWriter()
		//1byte ��� ��Ʈ��: ServletOutputStream, getOutputStream()
		
		out.println("<h1>Hello Servlet</h1>");
		out.println("<h2>�ȳ� ����</h2>");
		
		Date today= new Date();
		out.println("<h3 style='color:red'>�����ð�: "+today.toString()+"</h3>");
		
		out.close();
		
	}
}
