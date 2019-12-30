<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
												<!-- 최근에 pageEncoding 이 추가됨, 과도기적 -->

<h1>Hello JSP! 나는 50번 반복돼!</h1>

<%
	for(int i=0; i<5; i++)
	{
		out.println("<h2>"+i+": Hello JSP!</h2>");
	}
%>

<hr color='red'>

<%
	for(int i=0; i<5; i++)
	{
		%>
		<h2 style='color:cyan;'> <%=i %>: 안녕 쟈스피!</h2>
		<%
		//<%= 내용 %\>  >>>  <% out.println(내용); %\> 출력식이라 한다 이말이야
	}
%>