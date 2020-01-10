<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
    

<jsp:include page="/top.jsp"/>

<div class='row'>
	<div class='col-md-10 col-md-offset-1'>
		<h1>session test</h1>
		<h2>세션에 담긴 모든 정보를 꺼내온다</h2>
		
		<hr color='red'>
		
		<h2 class='text-primary' style='color:white'>JSESSIONID: <%= session.getId() %></h2>
		
<%
		//세션의 키값들을 추출
		Enumeration<String> en= session.getAttributeNames();		
		
		while(en.hasMoreElements())
		{
			String key= en.nextElement();
			
			Object val=session.getAttribute(key);
			out.println("<h3>"+key+": "+val+"</h3>");
		}
%>
	</div>
</div>
<jsp:include page="/foot.jsp"/>