<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
//동적으로 컨텍스트명(프로젝트명)을 얻어오기
	String myctx=request.getContextPath();
//	System.out.println("myctx: "+myctx);
%>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link rel="stylesheet" type="text/css" href="<%=myctx %>/css/ex27_layout.css">
</head>
<body>
    <!-- semantic tag
    header, nav, aside, article, footer, section
    -->
    <div id="wrap">
        <!-- 헤더------------------------------- -->
        <header>
            <a href="https://naver.com">
                <img src="<%=myctx %>/images/diablo2.gif" width=180 height=200>
            </a>

        </header>
        <div class="clear"></div>
        <!-- 네비게이션바----------------------- -->
        <nav>
            <!-- nav -->
            <ul>
                <li><a href="<%=myctx %>/index.jsp">HOME</a></li>
                <li><a href="<%=myctx %>/member/signup.jsp">SignUp</a></li>
                <li><a href="<%=myctx %>/board/board.jsp">Board</a></li>
                <li><a href="<%=myctx %>/mypage.jsp">MyPage</a></li>
            </ul>

        </nav>
        <div class="clear"></div>

        <!-- 아티클 : 주로 컨텐츠가 들어감--------- -->
        <article>