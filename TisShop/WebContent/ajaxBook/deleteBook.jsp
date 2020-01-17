<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import='ajax.book.*' %>

<jsp:useBean id="bookDao" class="ajax.book.BookDAO" />

<%
	String isbn= request.getParameter("isbn");
	System.out.println("isbn: "+isbn);
	
	int n= bookDao.deleteBook(isbn);

	String result= (n=0)"테스트 성공":"테스트 실패";
	
%>