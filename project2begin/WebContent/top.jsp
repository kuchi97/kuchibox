<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>

<html lang="en">

<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta http-equiv="X-UA-Compatible" content="ie=edge">

	<link rel="stylesheet" href="./css/whole.css" /> <!-- 전체 기본 스타일 -->
	<link rel="stylesheet" href="./css/topNav.css" /> <!-- 상단 내비게이션 바 스타일 -->
	<link rel="stylesheet" href="./css/sideNav.css" /> <!-- 좌측 내비게이션 바 스타일 -->
	<link rel="stylesheet" href="./css/main.css" /> <!-- main 컨텐츠 삽입부 기본 스타일 -->
	<link rel="stylesheet" href="./css/myChannel.css" /> <!-- 업로드 페이지 스타일 -->
	<link rel="stylesheet" href="./css/admin.css" /> <!-- admin css -->

	<!--jQuery Google CDN-------------------------->
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>

	<!-- 메뉴 토글 -->
	<script type="text/javascript" src="./js/menuToggle.js"></script>

	<title>reTuLix</title>
</head><!-- EO-head--------------------------------------------------- -->

<%
	String myctx= request.getContextPath();
%>
<body>
	<div id="wrap">
		<ul class="topNav">
			<li class="topNavLeft" id="menuToggle"><img src="./images/setting.png" alt="menu"></li>
			<li class="topNavLeft"><img src="./images/logo-01.png" alt="logo" class="retulix_logo"></li>

			<li class="topNavLeft"><a href="#">영화</a></li>
			<li class="topNavLeft"><a href="#">TV프로그램</a></li>
			<li class="topNavSearch">
				<form action="">
					<input type="text" name="search" placeholder="검색어를 입력하세요">
			<li><img src="./images/search.png" alt="menu"></li>
			</form>
			</li>

			<li class="topNavRight"><a href="#">로그아웃</a></li>
			<li class="topNavRight"><a href="<%=myctx%>/admin.do">내 채널</a></li>
		</ul>
	</div>

	<!-- 좌측바====================================================================== -->
	<div id="wrap">
		<!-- topNav에 가려지는 부분 -->
		<div class="topNavFloor"></div>

		<div class="sideNav">
			<!-- 상단 로그인 회원 정보 -->
			<div class="sideNavInfo">
				<span>
					<img src="images/logo_58px.png" alt="회원 이미지" />
				</span>
				<h1>회원 이름</h1>
				<p>일반회원</p>
			</div>

			<!-- 중앙 메뉴 -->
			<div class="sideNavMenu">
				<ul>
					<li><a href="#">
							<span class=""><img src="./images/home.png" alt="">홈</span>
						</a></li>
					<li><a href="#">
							<span class=""><img src="./images/hot.png" alt="">최근 인기 영상</span>
						</a></li>
					<li><a href="#">
							<span class=""><img src="./images/played.png" alt="">최근에 본 영상</span>
						</a></li>
					<li><a href="#">
							<span class=""><img src="./images/subscribe.png" alt="">나중에 볼 영상</span>
						</a></li>
				</ul>

				<hr>

				<table class="subscribe">
					<tr>
						<td><img src="./images/subscribe.png" alt=""></td>
						<td>구독 리뷰어A</td>
					</tr>
					<tr>
						<td><img src="./images/subscribe.png" alt=""></td>
						<td>구독 리뷰어A</td>
					</tr>
					<tr>
						<td><img src="./images/subscribe.png" alt=""></td>
						<td>구독 리뷰어A</td>
					</tr>
					<tr>
						<td><img src="./images/subscribe.png" alt=""></td>
						<td>구독 리뷰어A</td>
					</tr>
					<tr>
						<td><img src="./images/subscribe.png" alt=""></td>
						<td>구독 리뷰어A</td>
					</tr>
				</table>

			</div>

			<!-- 하단 메뉴 -->
			<div class="sideNavBottom">
				<ul>
					<li><button>포인트 충전하기</button></li>
				</ul>
			</div>
		</div>

	</div>

	<div class="main">

		<!-- 컨텐츠 삽입========================================= -->
