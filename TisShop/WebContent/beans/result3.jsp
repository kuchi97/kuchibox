<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:useBean id="cbean" class="beans.count.CountBean" scope="request"/>   
<h1>result.jsp페이지</h1>   
<p>result3.jsp 로 이동하면 새로운 request를 발생시키므로 새로운 countBean이 생성</p>
<h2 style="color:magenta">
<jsp:getProperty property="count" name="cbean"/>
</h2> 
    
<a href="result2.jsp">result2으로 이동</a>