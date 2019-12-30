<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<h1> 구구단 7단을 테이블형태로 출력하기 </h1>

<table border=1>
<%
		for(int i=1; i<=9; i++)
		{
			out.println("<tr>");
			out.println("<td>7 * "+i+"= "+(7*i)+"</td>");
			out.println("</tr>");
		}
%>
</table>

<hr color='red'>

<h1>구구단 전체를 테이블형태로 출력하시오</h1>

<table border=1 style='border-collapse:collapse; width:90%; margin:auto;'>
	<tr>
<%
	for(int i=2; i<=9; i++)
		out.println("<th bgcolor='yellow'>"+i+" 단</th>");
		
%>
	</tr>
<%
	for(int i=1; i<=9; i++)
	{
		%><tr><%
		for(int j=2; j<=9; j++)
		{			
			out.print("<td style='text-align:center;'>"+j +"x"+ i +"="+ (i)*(j) +"</td>");
		}
		%></tr><%
	}
%>
		
</table>