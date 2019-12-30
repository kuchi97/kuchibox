<%@ page contentType="text/html; charset=UTF-8" %>

<!-- import는 이렇게 -->
<%@ page import= "java.util.*, java.text.*" %>

<!--1. html 주석: page 지시어(directive)-->

<h1>Hello JSP</h1>
<h2>안녕 쟈스피</h2>

<%
//스크립트렛 (scriptlet) 태그
/*2. 자바 주석*/
	
	Date today= new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	String str= sdf.format(today);
	
	out.println("<h2 style='color:red;'>"+str+"</h2>");
	//out: 내장객체(JSPWriter 타입)
	
%>

<%-- 3. JSP 주석 --%>
<%-- 이 클래스파일의 경로
C:\Myjava\workspace\.metadata\.plugins\org.eclipse.wst.server.core\tmp0\work\Catalina\localhost\MyWeb\org\apache\jsp\example
 --%>