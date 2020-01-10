<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//로그아웃처리
	
	//1. 세션의 특정변수를 삭제
	//session.removeAttribute(key);
	//session.removeAttribute("loginUser");
	
	//2. 모든 세션변수를 삭제
	session.invalidate();			//중요 외워
	
	//처리후 돌려보낼 페이지로 이동
	response.sendRedirect(request.getContextPath()+"/index.jsp");
%>