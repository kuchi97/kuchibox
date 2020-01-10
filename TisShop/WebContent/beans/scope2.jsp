<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="beans.count.*"  %>
<%-- 빈즈 스코프를 request으로 테스트하자.
 --%>

<jsp:useBean class="beans.count.CountBean" id='cbean' scope='request'/>
	<%-- CountBean cbean= new CountBean(); 과 동일 --%>
	
<jsp:setProperty property="count" name="cbean"/>
	<%-- cbean.setCount(request.getParameter("count")); 와 동일--%>
	



<h1>scope.jsp</h1>
<h2 style="color:red">
<jsp:getProperty property="count" name="cbean"/>
<%-- <%=cbean.getCount()%>  과 동일 --%>
</h2> 
    

<%--forward 액션으로 result2.jsp로 이동(같은 request를 사용함) --%>
<jsp:forward page="result2.jsp" />