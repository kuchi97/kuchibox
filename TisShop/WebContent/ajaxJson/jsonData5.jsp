<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="net.sf.json.*, ajax.book.*" %>
<% 
	//WEB-INF/lib/ 아래 라이브러리 5개 jar파일을 가져다 둔뒤 사용
	//1.객체 유형
	//JSONObject obj=new JSONObject();
	//key,value 매핑해서 저장하는 구조
	/* obj.put("isbn","112233");
	obj.put("title","JSON이란");
	obj.put("publish","TIS출판사");
	obj.put("price",18000);
	obj.put("published","2020-02-03"); */
	
	
	//2.배열 유형
	JSONArray obj=new JSONArray();
	BookDTO b1=new BookDTO("112233","JSON이란","TIS출판사",18000,null,"a.jpg");
	BookDTO b2=new BookDTO("212233","Ajax란","TIS출판사",28000,null,"b.jpg");
	BookDTO b3=new BookDTO("312233","Java란","TIS출판사",15000,null,"c.jpg");
	
	obj.add(b1);
	obj.add(b2);
	obj.add(b3);
	
%>
<%=obj.toString()%>    







