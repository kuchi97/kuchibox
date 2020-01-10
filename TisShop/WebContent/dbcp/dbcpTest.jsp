<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.*, java.sql.*, javax.sql.*" %>

<jsp:include page="/top.jsp"/>

<div class='container text-center'>
	<h1>DBCP Connection Pool</h1>
	
<%
	Context initContext = new InitialContext();
	Context envContext  = (Context)initContext.lookup("java:/comp/env");
	//WAS서버를 먼저 찾아라 >> 우리는 톰캣을 찾는다: java:/comp/env - 톰캣을 찾는 프로토콜
	DataSource ds = (DataSource)envContext.lookup("myoracle/myshop");
	Connection conn = ds.getConnection();
	
	Statement stmt=conn.createStatement();
	String sql="select * from tab";
	ResultSet rs= stmt.executeQuery(sql);
	out.println("<h2 class='text-danger'>myshop 계정의 테이블 목록</h2>");
	
	while(rs.next()){
		out.println("<li>"+rs.getString(1)+": "+rs.getString(2)+"</li>");
	}
	
	
	if(rs!=null) rs.close();
	if(stmt!=null) stmt.close();	
	if(conn!=null) conn.close();	//커넥션연결을 끊는것이 아니라 풀에 반납하는것
%>
	<hr>
	
	<h2 class='text-success'>DBCP connection success: <%=conn %></h2>
	
</div>

<jsp:include page="/foot.jsp"/>