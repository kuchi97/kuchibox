<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cbean" class="beans.count.CountBean" scope="request"/>   
<h1>result.jsp페이지</h1>   
<p>forward로 이동하면, scope2.jsp와 result2.jsp는 같은 request를 공유한다</p>
<h2 style="color:blue">
<jsp:getProperty property="count" name="cbean"/>
</h2> 
    
<a href="result3.jsp">result3으로 이동</a>