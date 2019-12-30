<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>
<div>
	<h1>welcome home</h1>
	<h1 style='color=red'>메시지: <%=request.getAttribute("msg") %></h1>
	
</div>

<jsp:include page="/foot.jsp"/>