<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ page isErrorPage="true" %>
<%-- IE의 경우 에러페이지가 안뜨면 아래 코드를 삽입한다
	IE는 에러페이지를 스스로 처리하려는 성향이 있다고 함 
	다음의 코드를 삽입해본다 --%>
<%
	response.setStatus(HttpServletResponse.SC_OK);		//200 OK
%>

<style>
	table {
		width:70%;
		margin:50px auto;
		border: 1px solid magenta;
		
	}
	table tr td {
		font-family:helvetica san-serif 궁서;
		font-weight:bold;
		color:blue;
		background-color:yellow;
		
	}
</style>


<%--
	에러처리할 페이지에서는
	page 지시어에 반드시 isErrorPage 속성값을 넣고 true를 주어야 한다
	그리야 exception 이라는 내장객체를 사용할수 있다
--%>

<table>
	<tr>
		<td>미안 우리의 서버, 한다. 점검</td>
	</tr>
	
	<tr>
		<td>
			<%=exception.getMessage() %>		<!-- 사용자에게 에러이유를 출력 (브라우저에) -->
			<%exception.printStackTrace(); %>	<!-- 디버깅하기위해 콘솔에 출력 -->
		</td>
	</tr>
	<tr>
		<td>당신의 컴퓨터에 희귀한 바이러스가 검출되었습니다!</td>
	</tr>

</table>