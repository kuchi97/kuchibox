<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 로그인 여부를 체크하는 모듈을 include(소스를 포함시키는 방식) --%>
	<!-- ------------------------ -->
<%@ include file="/login/loginCheckModule.jsp" %>
	<!-- ------------------------ -->



<jsp:include page="/top.jsp"/>



<div class='container text-center'>
	<h1>*** <%=loginUser.getName() %> 님 전상서 ***</h1>
	<h2>회원들만 사용할수 있는 페이지</h2>
	<h3>로그인해야 이용할수 있다네</h3>
	
</div>

<jsp:include page="/foot.jsp"/>