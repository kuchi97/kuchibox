<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>
<div>
	<h1>response 내장객체: HttpServletResponse타입</h1>
	<h2>테스트방법: 아이디 입력 박스에 killer, forward,
		redirect값을 입력하여 테스트하세요
	</h2>
	<hr>
	<form action="ex10_response.jsp" method="post">
		아 이 디:<input type="text" name="uid"><p>
		비밀번호:<input type="password" name="upwd"><p>
		<input type="submit" value="로그인">
	</form>
</div>
<jsp:include page="/foot.jsp"/>