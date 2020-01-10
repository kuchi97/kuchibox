<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="beans.count.*"  %>
<%-- 빈즈 스코프를 page,request,session,application으로 바꿔가며 테스트하자.
 --%>

<jsp:useBean class="beans.count.CountBean" id='cbean' scope='application'/>
	<%-- CountBean cbean= new CountBean(); 과 동일 --%>
	
<jsp:setProperty property="count" name="cbean"/>
	<%-- cbean.setCount(request.getParameter("count")); 와 동일--%>
	



<h1>scope.jsp</h1>
<h2 style="color:red">
<jsp:getProperty property="count" name="cbean"/>
<%-- <%=cbean.getCount()%>  과 동일 --%>
</h2> 
    

<a href="javascript:history.go(-1)">이전 페이지</a>|
<a href="result.jsp">result.jsp로 가기</a>  