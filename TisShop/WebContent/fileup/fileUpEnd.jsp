<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>

<div class='col-md-10 col-md-offset-1'>
	<h1>file up end jsp</h1>
	<h2>request 객체에 첨부되어 전송되는 파일데이터를 브라우저에 출력한다</h2>

<%
	//파일의 타입을 알아보기
	String ctype= request.getContentType();
	int len= request.getContentLength();
%>	
	<h3>파일의 content type: <%=ctype %></h3>
	<h3>파일의 크기: <%=len %></h3>
	
	<hr>
	
<%
	//파일의 데이터를 추출하기
	
	//request와 stream을 연결하여 첨부된 파일데이터를 브라우저에 출력한다
	ServletInputStream in= request.getInputStream();
	
	byte[] data= new byte[1024];
	int n=0;
	
	out.println("<xmp>");		//엔터친거까지 브라우저에 보일수있게
	while((n=in.read(data))!=-1)
	{
		String str= new String(data,0,n);
		out.println(str);
	}
	out.println("</xmp");
	
	if(in!=null) in.close();
	

%>

</div>

<jsp:include page="/foot.jsp"/>