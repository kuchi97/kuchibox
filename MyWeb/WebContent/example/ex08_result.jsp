<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>

<%
//post방식일때 인코딩설정: request로
	request.setCharacterEncoding("UTF-8");

//사용자가 입력한 값들 받기

	//파라미터값 받기: 내장객체 request 이용
	//	String getParameter(String paramName)
	//	String[] getParameterValues(String paramName)  >>  다중값일때

	String uid= request.getParameter("userId");
	String name= request.getParameter("username");
	String pwd= request.getParameter("userpwd");
	String birth= request.getParameter("birth");
	String tel1= request.getParameter("phone1");
	String tel2= request.getParameter("phone2");
	String tel3= request.getParameter("phone3");
	String email= request.getParameter("email");
	String[] lang= request.getParameterValues("lang");
	String[] db= request.getParameterValues("dbms");

%>
<h3>ID: <%=uid %></h3>
<h3>NAME: <%= name%></h3>
<h3>PWD: <%= pwd%></h3>
<h3>BIRTH: <%= birth%></h3>
<h3>TEL: <%= tel1%>-<%=tel2%>-<%=tel3%></h3>
<h3>EMAIL: <%= email%></h3>
<h3>LANGUAGE: 
<%
	//배열은 꼭 null체크 하도록
	if(lang!=null)
	{
		for(int i=0; i<lang.length; i++)
		{
			out.print(lang[i]+", ");
		}		
	}
		
%>
</h3>
<h3>USABLE DB:
<%
	if(db!=null)
	{
		for(int i=0; i<db.length; i++)
		{
			%><%=db[i]%>, <%
		}		
	}
%>
</h3>


<jsp:include page="/foot.jsp"/>