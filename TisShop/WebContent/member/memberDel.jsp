<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!-- 관리자 확인모듈 include -->
<%@ include file="../login/adminCheckModule.jsp" %>
<!-- -------------------------- -->

<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>


<%
	//1. 삭제할 회원번호 받기
	String idx=request.getParameter("idx");

	//2. 유효성 체크
	if(idx==null || idx.trim().isEmpty())
	{
%>
		alert("해당 회원을 찾을수 없습니다");
		response.sendRedirect("memberAll.jsp");
		return;
<%
	}

	//3. UserDAO빈 생성
	//위에서 했음

	//4. dao의 deleteUser(idx) 호출
	int n= dao.updateUserMstate(Integer.parseInt(idx), -2);
	
	//5. 실행결과메시지 보여주고 페이지이동(목록페이지)
	String result= (n>0)?"탈퇴처리 성공":"탈퇴처리 실패";
%>
	<script>
		alert("<%= result %>");
		location.href="memberAll.jsp";
		//response.sendRedirect("memberAll.jsp");
	</script>