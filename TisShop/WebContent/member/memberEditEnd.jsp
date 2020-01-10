<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>

<!-- memberEditEnd.jsp -->

<%-- 
1. UserVO 빈 생성해서 setProperty
2. UserDAO 빈 생성해서 updateUser() 호출
3. 그 결과를 메시지처리 및 이동경로처리

--%>

<jsp:useBean id="user" class="user.model.UserVO" scope="page"/>
<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>
<jsp:setProperty name="user" property="*" />

<%
	int n=dao.updateUser(user);
	String result=(n>0)?"수정 성공":"수정 실패";
	String loc=(n>0)?"memberAll.jsp":"javascript:history.back()";
	//href에 자바스크립트 함수를 적용하려면
	//앞에 javascript: 를 붙여준다 (psuedo protocol)
%>

<script type="text/javascript">
	alert("<%= result %>");
	location.href="<%=loc%>";
</script>


