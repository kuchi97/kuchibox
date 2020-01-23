<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ajax.book.*" %>
    
<%
	String key= request.getParameter("keyword");

	//네이버에서 제공하는 리스트는 기본 10개인데 더 보여주고싶다면
	String pageSize= request.getParameter("pageSize");
	String start= request.getParameter("start");
	
	if(pageSize==null) pageSize= "10";
	if(key==null) key="Ajax";
	
	BookNaverProxy bp= new BookNaverProxy();
	
	String str=bp.getData(key, pageSize, start);
	
	out.println(str);

%>