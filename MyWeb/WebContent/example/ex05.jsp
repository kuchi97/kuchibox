<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"
		errorPage="error.jsp" %>
<%-- errorPage: 이 페이지에서 에러가 발생하면 error.jsp로 넘기겠다 --%>

<%@ page import="java.sql.*" %>

<h1>page 지시어를 이용한 예외처리 페이지 지정</h1>

<%
	Class.forName("oracle.jdbc.driver.OracleDriver");
	
	// connection위한 url얻기
	String url="jdbc:oracle:thin:@localhost:1521:XE";
	String user="scott", pwd="tiger";
	
	Connection con=DriverManager.getConnection(url, user, pwd);
	
	out.println("<h2>DB연결 성공: "+con+"</h2>");
	
	
	
	//닫기
	if(con!=null) con.close();
%>