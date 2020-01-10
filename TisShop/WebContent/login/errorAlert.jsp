<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true" %>
<%-- 에러처리페이지: isErrorPage="true" 
		- exception 내장객체를 사용할 수 있다
--%>

<%-- IE의 경우 에러페이지가 안뜨면 아래 코드를 삽입한다
	IE는 에러페이지를 스스로 처리하려는 성향이 있다고 함 
	다음의 코드를 삽입해본다 --%>
<%
	response.setStatus(HttpServletResponse.SC_OK);		//200 OK
%>

<script>
	alert('<%= exception.getMessage()%>');
	<%
	exception.printStackTrace();
	%>
	history.back();

</script>