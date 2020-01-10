<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>    
    
    
    
<!-- loginCheckModule.jsp -->
<%
	//1. 세션에 저장한 loginUser꺼내온다
	UserVO loginUser= (UserVO)session.getAttribute("loginUser");

	//2. loginUser가 null이면 에러메시지 출력: alert
	//3. 이전페이지로 이동
	if(loginUser==null)
	{
%>
		<script>
			alert("로그인 하셔야 하는데요");
			history.back();
		</script>
<%
		return;
	}
%>