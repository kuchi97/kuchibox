<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
#header {
	margin-top: 20px;
	margin-bottom: 20px;
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
	<div id="header" class="">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<div class="btn-toolbar" role="toolbar">
						<div class="btn-group">
							<a type="button" href="<%=myctx %>/testMember.do" class="btn btn-default">회원정보</a> 
							<a type="button" href="<%=myctx %>/contentList.do" class="btn btn-default">컨텐츠목록</a> 
								<a type="button" class="btn btn-default">포인트</a> 
								<a type="button" class="btn btn-default">결제내역</a>
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