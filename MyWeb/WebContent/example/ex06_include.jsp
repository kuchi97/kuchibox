<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<!-- include.jsp -->

<h1>ex06_include.jsp 파일입니다</h1>
<h2>include 지시어로 다른파일 ex03.jsp를 포함시켜봅니다</h2>
<ul>
	<li>include지시어는 다른파일(ex03.jsp)의 **소스를 현재위치(ex06...jsp)파일에 삽입**시킨후<br>
		jsp 파일을 서블릿파일로 변환하고 컴파일하는 방식이다
	</li>
</ul>

<hr color='red'>

<%@include file='ex04.jsp' %>
<!-- 소스를 포함시키는 방식 -->

<hr color='blue'>

<%=str %><%=lstr %>
<h3><%=plus(231,999) %></h3>
<!-- 그래서 ex04의 변수나 메소드를 여기서도 사용가능함 -->
	
