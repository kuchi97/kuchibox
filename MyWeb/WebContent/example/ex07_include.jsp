<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<h1>ex07_include.jsp</h1>
<h2>include 액션으로 ex04.jsp파일을 불러봅시다</h2>

<ul>
	<li> include 액션은 실행결과만을 포함시키는 방식이다<br>
		jsp 흐름을 ex04.jsp로 이동시켜 그 실행결과를 현재위치에 포함시킨다
	</li>
</ul>

<hr color='red'>

<jsp:include page="ex04.jsp"></jsp:include>

<%-- <%=str%><%=lstr%>			//변수 못찾음 에러 --%>

