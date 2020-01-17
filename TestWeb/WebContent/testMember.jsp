<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:include page="/top.jsp"/>
<%--
<!DOCTYPE html>
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link
	href="http://pingendo.github.io/pingendo-bootstrap/themes/default/bootstrap.css"
	rel="stylesheet" type="text/css">
<style>
#tab {
	margin-top: 20px;
}
</style>
<script>
<%
	String myctx= request.getContextPath();
	System.out.println(myctx);
%>
</script>

</head>

<body>
	<div class="section">
		<div class="container">
			<div class="row">관리자페이지</div>
		</div>
	</div>
	<div id="tab" class="">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="btn-toolbar" role="toolbar">
						<div class="btn-group">
							<a type="button" href="<%=myctx %>/testMember.do" class="btn btn-default">회원정보</a> 
							<a type="button" class="btn btn-default">컨텐츠목록</a> 
							<a type="button" class="btn btn-default">포인트</a> 
							<a type="button"
								class="btn btn-default">결제내역</a>
						</div>
						<div class="btn-group">
							<a type="button" class="btn btn-default">5</a> <a type="button"
								class="btn btn-default">6</a> <a type="button"
								class="btn btn-default">7</a>
						</div>
						<div class="btn-group">
							<a type="button" class="btn btn-default">8</a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</div>
--%>
<%-- 탑 예정------------------------------------------------------ --%>
	
	<div class="">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>#</th>
								<th>이메일</th>
								<th>이름</th>
								<th>비밀번호</th>
								<th>나이</th>
								<th>포인트</th>
								<th>상태</th>
							</tr>
						</thead>
						<tbody>
							<core:forEach var="list" items="${listMember}">
								<tr>
									<td>${list.idx}</td>
									<td>${list.email}</td>
									<td>${list.name}</td>
									<td>${list.pwd}</td>
									<td>${list.age}</td>
									<td>${list.point}</td>
									<td>${list.state}</td>
								</tr>
							</core:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>