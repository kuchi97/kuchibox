<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="errorAlert.jsp" %>
<%@ page import="user.model.*" %>

<%
	//1. 사용자가 입력한 아이디 비번 받기, 아이디저장여부 추가
	String userid= request.getParameter("userid");
	String pwd= request.getParameter("pwd");
	String saveid= request.getParameter("saveid");		//on/null
	
	//2. 널체크 >> 잘못들어온경로. 왔던곳으로 돌려보내기
	if(userid==null || pwd==null || userid.trim().isEmpty() || pwd.trim().isEmpty())
	{
%>
	<script>
		alert("잘못찾아오셨습니다?");
		location.href="../index.jsp";
	</script>
<%
		return;
	}
	
	//3 dao 생성 >> loginCheck(아이디, 비번) 호출
%>
	
	<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>
<%
	/*
		1. 아이디 비번이 db회원의 것이라면 >> 해당회원정보를 가져와 uservo에 담아 반환
	
		2. 아이디가 없거나 비번이 일치하지 않으면 >> 사용자정의 예외 발생
	*/
	UserVO user= dao.loginCheck(userid, pwd);
		
	if(user!=null)
	{
		//로그인 한 사용자 정보를 세션에 저장
		//http프로토콜의 특징 중, 페이지를 이동할 때 상태정보를 저장하지 않는다
		//	- stateless특징
		
		/* 따라서 이를 해결하기 위해 session 또는 cookie를 사용한다
			session은 서버쪽에 저장
			cookie는 클라이언트쪽에 저장 */
			
		//session.setAttribute(String key, Object value);
		//session: jsp 내장객체 (HttpSession 타입)
		
		session.setAttribute("loginUser", user);
		//세션은 브라우저가 켜져있는동안 유효
		
		//아이디저장하기를 체크했다면,
		//쿠키 생성해서 유효시간을 주고 클라이언트쪽에 보낸다
		Cookie userCookie= new Cookie("cookieid",userid);
		if(saveid!=null)
		{
			userCookie.setMaxAge(1*24*60*60);
		}
		else
		{
			//체크를 안했으면 쿠키를 삭제
			userCookie.setMaxAge(0);
		}

		userCookie.setPath("/");
		response.addCookie(userCookie);
		
		
%>
		<script>
			location.href="../index.jsp";
		</script>
<%
	}

	
%>