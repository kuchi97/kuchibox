<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. 아이디와 비번 받아 출력
	String uid=request.getParameter("uid");
	String upwd=request.getParameter("upwd");
	out.println(uid+"/"+upwd);
	//2. null로 들어오면 제대로된 경로로 redirect방식으로 이동시키세요
	//   ex10_form.jsp
	if(uid==null||upwd==null){
		response.sendRedirect("ex10_form.jsp");
		return;
	}
	System.out.println("여기도 오나요....");
	//3. 빈문자열로 들어오면=> 잘못된 요청이라는 에러 응답 처리 예정
	if("".equals(uid.trim())||"".equals(upwd.trim())){
		response.sendError(response.SC_BAD_REQUEST);//400
		System.out.println(HttpServletResponse.SC_BAD_REQUEST);
		return;
	}
	
	//4. killer로 들어오면=> 접근 금지 처리
	if(uid.equalsIgnoreCase("killer")){
		response.sendError(response.SC_FORBIDDEN);//403
		return;
	}
	
	//그 외에는 "환영합니다. ..님"
	out.println("<h1>"+uid+"님 환영합니다.</h1>");

	//아이디가 redirect인 경우=>welcome.jsp페이지로 이동(redirect방식으로 이동)
	if(uid.equals("redirect"))	//주소가 ../welcome.jsp 로 이동
	{
		request.setAttribute("msg", uid+" 님 환영합니다");
		response.sendRedirect("welcome.jsp");
		return;
	}
	else if(uid.equals("forward"))	//../ex10_response.jsp 로 이동
	{
		request.setAttribute("msg", uid+" 님 환영합니다");
		%>
		<jsp:forward page="welcome.jsp"/>
		<%
		
	}
	
	//아이디가 forward인 경우=>welcome.jsp페이지로 이동(forward방식으로 이동)
	
	/*
	JSP의 페이지 이동방식
	1. redirect 방식
		: 새롭게 요청(request)을 보내 페이지를 보여준다
		- 새롭게 요청보내기 때문에 새로운 url로 바뀐다
		- 이동시킨 페이지와 이동된 페이지는 서로 다른 request이므로,
			request에 저장한 값을 기억하지 못한다
			
	2. forward 방식
		: 서버 내부에서 페이지이동이 일어난다.
		- 서버 내부에서 이동하므로, 요청 url은 이전의 url을 유지한다.
		- 이동시킨 페이지와 이동된 페이지는 같은 request를 공유한다
			따라서, request에 저장된 값이 있으면 꺼내쓸 수 있다
		
	cf> forward 액선을 서블릿으로 구현하면 아래와 같다
	
		RequestDispatcher dis= request.getRequestDispatcher("welcome.jsp");
		dis.forward(request, response);
		
		
	*/
%>





