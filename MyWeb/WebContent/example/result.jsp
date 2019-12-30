<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>

<%
	//post encoding
	request.setCharacterEncoding("UTF-8");

	//var
	String empno= request.getParameter("empno");
	String java= request.getParameter("java");
	String database= request.getParameter("database");
	String jsp= request.getParameter("jsp");
	
	
	//유효성체크
	if(empno==null)		//result.jsp를 직접 치고들어올때 막아줘야한다
	{
		%>
		<script>
			alert("사번을 입력하셔야합니다");
			response.sendRedirect("input.jsp");
			return;
		</script>
		<%
	}
	if(java==null || java.trim().isEmpty())
	{
		java="0";
	}
	if(database==null || database.trim().isEmpty())
	{
		database="0";
	}
	if(jsp==null || jsp.trim().isEmpty())
	{
		jsp="0";
	}
	
	int javaInt=(Integer.parseInt(java));
	int databaseInt=(Integer.parseInt(database));
	int jspInt=(Integer.parseInt(jsp));
	
	if(javaInt<0 || javaInt>100)
	{
		%>
		<script>
			alert("유효한 점수값을 입력하십시오 (0~100점 사이)");
			history.back();
		</script>
		<%
	}
	if(databaseInt<0 || databaseInt>100)
	{
		%>
		<script>
			alert("유효한 점수값을 입력하십시오 (0~100점 사이)");
			history.back();
		</script>
		<%
	}
	if(jspInt<0 || jspInt>100)
	{
		%>
		<script>
			alert("유효한 점수값을 입력하십시오 (0~100점 사이)");
			history.back();
		</script>
		<%
	}
	
	double avg= Math.round((javaInt+databaseInt+jspInt)/3*100)/100;
	
	
	String result="";
	
	if(avg>=0 && avg <=30)
		result="형편없는 성적";
	else if(avg>30 && avg<=50)
		result="노력이 더 필요한 성적";
	else if(avg>50 && avg<=70)
		result="그저그런 성적";
	else if(avg>70 && avg<=90)
		result="나쁘지 않은 성적";
	else if(avg>90 && avg<=100)
		result="올ㅋ";
	
%>

<div>
	<h1>처리 결과 : <%=result %></h1>
	<form name='f' method='post' action='input.jsp'>
		
		<table border=1 style='width:400px; height:auto; border-collapse:collapse;'>
			<tr>
				<th colspan=2 style='padding:5px;'>사번</th>
				<td align=center><%=empno %></td>
			</tr>
			<tr>
				<th rowspan=3 style='padding:5px;'>과목</th>
				<th style='padding:5px;'>Java</th>
				<td align=center><%=java %></td>
			</tr>
			<tr>
				<th style='padding:5px;'>Database</th>
				<td align=center><%=database %></td>
			</tr>
			<tr>
				<th style='padding:5px;'>JSP</th>
				<td align=center><%=jsp %></td>
			</tr>
			<tr>
				<th colspan=2 style='padding:5px;'>평균</th>
				<td align=center><%=avg%></td>
			</tr>
			<tr>
				<td colspan=3 align=center style='padding:5px;'><button type='button' onclick='goMain()'>입력화면</button></td>
			</tr>
			
		
		</table>
	
	</form>
</div>

<script>

	function goMain()
	{
		window.location.assign("input.jsp");
	}

</script>
<jsp:include page="/foot.jsp"/>