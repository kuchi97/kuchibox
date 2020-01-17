<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>
    
<%
	//컨텍스트 가져오기
	String myctx= request.getContextPath();

	boolean isLogin= false;			//로그인 여부
	String uid="";
	
	//세션에 로그인한 회원정보가 있는지 검사
	UserVO loginUser=(UserVO)session.getAttribute("loginUser");
	
	if(loginUser!=null)
	{
		isLogin=true;
		uid=loginUser.getUserid();
	}
	
%>

<html>
<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=myctx %>/css/index.css" rel="stylesheet" type="text/css">
</head>
<body>

	<div class="navbar navbar-default navbar-static-top">
		<div class="container">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#navbar-ex-collapse">
					<span class="sr-only">Toggle navigation</span><span
						class="icon-bar"></span><span class="icon-bar"></span><span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#"><span>Brand</span></a>
			</div>
			<div class="collapse navbar-collapse" id="navbar-ex-collapse">
				<ul class="nav navbar-nav navbar-right">
					<li class="active"><a href="<%=myctx %>/index.jsp">Home</a></li>
<%
				if(!isLogin)
				{
%>
					<li><a href="#myModal" data-toggle='modal'>Log In</a></li>
					<li><a href="<%=myctx %>/member/signup.jsp">Sign Up</a></li>
<% 
				}
				else
				{		
%>
					<li class='bg-info'><a href='#'><%= uid %> 님 로그인 중</a></li>
					<li><a href="<%=myctx %>/login/logout.jsp">Log Out</a></li>
<%
				}
%>
				</ul>
			</div>
		</div>
	</div>
	<div class="section">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<ul class="nav nav-pills">
						<li class="active"><a href="<%=myctx %>/member/memberAll.jsp">UserList</a></li>
						<li class="active"><a href="<%=myctx %>/login/sessionTest.jsp">Session</a></li>
						<li class="active"><a href="<%=myctx %>/cookie/cookieTest.jsp">Cookie</a></li>
						<li><a href="<%=myctx %>/login/profile.jsp">Profile</a></li>
						<li class='active'><a href="<%=myctx %>/dbcp/dbcpTest.jsp">DBCP</a></li>
						<li class='active'><a href="<%=myctx %>/fileup/fileUpload.jsp">upload1</a></li>
						<li class='active'><a href="<%=myctx %>/fileup/fileUpload2.jsp">upload2</a></li>
						<li class='active'><a href="<%=myctx %>/ajaxPizza/pizza.jsp">PizzaOrder</a></li>
						<li class='active'><a href="<%=myctx %>/ajaxPizza/pizza2.jsp">PizzaOrder2</a></li>
						<li class='active'><a href="<%=myctx %>/ajaxBook/book.jsp">Book</a></li>
						<li class='active'><a href="<%=myctx %>/ajaxBook/book.jsp">AJAX Open API</a></li>
					</ul>
				</div>
			</div>
		</div>
	</div>