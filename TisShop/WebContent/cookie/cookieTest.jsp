<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*, java.text.*" %>

<!-- cookieTest.jsp -->

<%-- 
	사용자의 간단한 정보들을 쿠키에 저장해본다
	쿠키는 클라이언트쪽 메모리나 파일로 저장된다
	
	1. 쿠키 저장단계
		- 쿠키 생성단계 (key, value)
		- 쿠키 속성설정 단계 (유효시간, path, secure...)
		- 쿠키 전송단계 => 응답(response)에 쿠키를 포함시켜 전송
		
	2. 쿠키 꺼내오기
	
--%>

<%
	//1. 쿠키 생성
	Cookie ck1= new Cookie("visitId","King");
	Date date= new Date();
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy:MM:dd:hh:mm:ss");
	String str= sdf.format(date);
	
	Cookie ck2= new Cookie("visitTime",str);
	
	//2. 쿠키 속성 설정
	ck1.setMaxAge(3*24*60*60);
	ck2.setMaxAge(7*24*60*60);
	//쿠키는 유효시간이 지나면 자동삭제된다
	//만약 강제삭제를 하고싶다면 setMaxAge(0)을 준다
	
//	ck1.setPath("/cookie");
	
	//3. 쿠키 전송
	response.addCookie(ck1);
	response.addCookie(ck2);
	
	
%>

<jsp:include page="/top.jsp" />

<div class='container text-center'>

	<h1>쿠키테스트</h1>
	<h2>쿠키 저장 완료  <a href='cookieList.jsp'>쿠키 목록 보러가기</a></h2>

</div>

<jsp:include page="/foot.jsp"/>