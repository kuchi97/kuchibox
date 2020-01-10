<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>

<%-- 로그인 여부를 체크하는 모듈을 include(소스를 포함시키는 방식) --%>
	<!-- ------------------------ -->
<%@ include file="/login/loginCheckModule.jsp" %>
	<!-- ------------------------ -->

<%
	//접속한이의 id 추출
	//UserVO admin= (UserVO)session.getAttribute("loginUser");
	//위에 loginCheckModule을 인클루드 했기때문에 loginUser변수를 그대로 사용할수있음
	int adminState= loginUser.getM_state();

	//관리자 확인
	if(adminState!=99)
	{
%>
		<script>
			alert("당신은 관리자가 아닙니다 나.가.주.시.죠?");
			history.back();
		</script>
<%
		return;
	}

%>