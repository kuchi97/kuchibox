<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>
<div align="center" class='container'>
	<hr color="green" width="400">
	<h1>CountBean Test</h1>
	<hr color="green" width="400">
	<form action="scope.jsp" class='form-inline'>
	<b>Count</b>: <input type="text" name="count" class='form-control'>
				  <input type="submit" value="전송" class='btn btn-warning'>
	</form>

</div>
<jsp:include page="/foot.jsp"/>