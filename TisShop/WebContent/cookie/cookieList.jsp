<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>

<div>
	<h1>cookieList.jsp</h1>
<%
	
//쿠키가 전송되면 웹브라우저는 한번저장된 쿠키를 매번 요청이 필요할때마다
//웹서버에 접속한다.
//그러면 서버는 전송할 쿠키를 이용해 필요한 작업을 수행한다

	Cookie[] cks=request.getCookies();
	if(cks!=null)
	{
		for(Cookie c:cks)
		{
			String key=c.getName();			//key
			String val=c.getValue();		//value
%>
			<h4><%=key %> : <%=val %></h4>
<%
		}
	}



%>
	
	
	
	
</div>

<jsp:include page="/foot.jsp"/>