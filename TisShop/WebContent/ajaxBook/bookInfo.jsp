<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ajax.book.*, java.util.*, java.text.*" %>
    
<jsp:useBean id="bookDao" class="ajax.book.BookDAO" scope="session" />

<%
	// 파라미터값 받아오기
	String isbn= request.getParameter("isbn");
//	System.out.println("isbn= "+isbn);
	
	
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	DecimalFormat df= new DecimalFormat("###,###");
	
	//bookDao의 isbn으로 도서정보가져오는 메소드 호출
	BookDTO book= bookDao.getBookInfo(isbn);

%>


<book>
<%
	if(book!=null)
	{
%>
		<isbn><%=book.getIsbn() %></isbn>
		<title><%=book.getTitle() %></title>
		<publish><%=book.getPublish() %></publish>
		<price><%=book.getPrice()%></price>
		<published><%=sdf.format(book.getPublished()) %></published>
		<bimage><%=book.getBimage() %></bimage>
<%
	}
%>
</book>