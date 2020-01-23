<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ajax.book.* ,java.util.*"%>

<jsp:useBean id="bookDao" class="ajax.book.BookDAO" scope="session"/>

<%
	String title= request.getParameter("title");

	List<String> arr= bookDao.getTitle(title);
	
	if(arr!=null || arr.size()==0)
	{
		out.println("<ul>");
		
		for(String str: arr)
		{
%>
			<li><a onclick='autoSet("<%=str%>")'><%=str %></a></li>
<%
		}
		out.println("</ul>");
	}
	
	System.out.println("size: "+arr.size());
%>