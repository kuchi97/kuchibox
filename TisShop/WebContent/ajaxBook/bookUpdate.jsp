<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:useBean id="book" class="ajax.book.BookDTO" scope="page"/>
<jsp:setProperty property="*" name="book"/>

<jsp:useBean id="bookDAO" class="ajax.book.BookDAO" scope="session"/>

<%
	int n=bookDAO.updateBook(book);
	
%>

<result>
<%=n %>

</result>