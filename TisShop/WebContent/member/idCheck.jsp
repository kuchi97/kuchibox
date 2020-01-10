<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%
	//패스 얻기
	String myctx=request.getContextPath();
%>    

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<script type="text/javascript"
	src="http://cdnjs.cloudflare.com/ajax/libs/jquery/2.0.3/jquery.min.js"></script>
<script type="text/javascript"
	src="http://netdna.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
<link
	href="http://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.3.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="<%=myctx %>/css/index.css" rel="stylesheet" type="text/css">
<title>Insert title here</title>
<script>
	$(function(){
		$("#userid").focus().css("border","1px solid red");
	});
</script>
</head>
<body>

<%
	String method= request.getMethod();
	out.println("method: "+method+"<br>");
	
	//메소드요청방식이 get이면 아이디입력 form 을 보여주고,
	//					post 이면 그 실행결과(아이디 사용가능여부)를 보여줄 예정

	switch(method)
	{
	case "GET":
	{
%>
	<div class='container'>
		<div class='row' style='margin-top:30px;'>
			<form name='idf' id='idf' action='idCheck.jsp' method='post'>
				<label for='userid' class='col-xs-2'>아이디</label>
				
				<div class='col-xs-8'>
					<input type='text' name='userid' id='userid' class='form-control' 
							placeholder='ID를 입력하세요' required>
				
				</div>
				<div class='col-xs-2'>
					<button class='btn btn-primary'>확인</button>
				</div>
			</form>
		</div>
	</div>
<%
	} break;
						
	case "POST":	//요청방식이 post일때는 아이디 중복여부 결과를 보여준다
	{
		//사용자가 입력한 userid값을 받기
		String userid= request.getParameter("userid");
		
		//유효성체크
		if(userid==null || userid.trim().isEmpty())
		{
%>
			<script>
				alert("아이디를 입력하세요");
				history.back();
			</script>
<%
			return;
		}//--if()
%>

<jsp:useBean id="dao" class="user.model.UserDAO" scope="session" />
<%
		boolean canUse=dao.idCheck(userid.trim());
%>

			<div class='container text-center'>
			<!-- ---------------------------------------------------------- -->
<%
		if(canUse)
		{
%>
				<h3>ID로 <span class='text-danger'><%=userid %></span>을(를) 사용할 수 있습니다</h3>
				<button type='button' onclick='set("<%=userid %>")' class='btn btn-success'>알겠어요</button>
			<!-- ---------------------------------------------------------- -->
<%
		}
		else
		{
%>
				<h3><span class='text-danger'><%=userid %></span>은(는) 이미 사용중인 아이디입니다!</h3>
				<div class='row' style='margin-top:30px;'>
					<form name='idf' id='idf' action='idCheck.jsp' method='post'>
						<label for='userid' class='col-xs-2'>아이디</label>
						
						<div class='col-xs-8'>
							<input type='text' name='userid' id='userid' class='form-control' 
									placeholder='ID를 입력하세요' required>
						
						</div>
						<div class='col-xs-2'>
							<button class='btn btn-primary'>확인</button>
						</div>
					</form>
				</div>
<%
	}//--else
%>
			<!-- ---------------------------------------------------------- -->
			</div>
<%
	} break;
	}//--switch()
%>

<script>
	function set(uid)
	{
		//window.opener.document.mf.userid.value=uid;		//폼 이름을 지정했을경우
		window.opener.document.forms[0].userid.value=uid;	//폼 이름 지정 안했을경우
		window.close();
	}
</script>
</body>
</html>