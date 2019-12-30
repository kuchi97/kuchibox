<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<h1>Scripting Element (스크립트 요소)</h1>
<h2>JSP 구성요소 중 스크립트 요소에 대해 살펴봅시다으다으다으</h2>

<%--
	1. 선언문(declaration): <%! %>
		- 멤버변수를 선언하거나 메소드를 구성할때 사용함
		
	2. 실행문(scriptlet): <% %>
		- 지역변수를 선언하거나 자바코드를 이용할때 사용
	
	3. 출력식(expression): <%= %>
		- 변수값을 출력하거나 메소드 반환값을 출력할때 사용	
		
--%>

<%!
	//선언문: 이곳에서 멤버변수 선언이나 사용자정의 메소드를 구성할수 있다
	String str= "나는 멤버변수다";

	public String plus(int a, int b)
	{
		return a+" + "+b+"는 "+(a+b)+" 이다";
	}
%>

<%
	//scriptlet 안에서 변수선언을 하면 지역변수가 된다
	//scriptlet 안에 들어간 코드들은 서블릿에서 _jspService() 메소드 안에 들어간다
	//	따라서 여기서 변수선언을 하면 지역변수가 되는 것
	
	//또한 jsp 내장객체들(out, request, response, session 등)은
	//모두 _jspService()안에서 선언된 지역변수다
	String lstr="내이름은 지역변수, 탐정이죠";

%>

<h1> var. str= <%=str %></h1>
<h1> var. lstr= <%=lstr %></h1>

<!-- 456과 789의 합을 구해 출력하기 -->
<h1 style='color:blue;'><%String s=plus(456,789);
	out.println(s);%></h1>
<h1 style='color:blue;'><%=plus(456,789) %></h1>