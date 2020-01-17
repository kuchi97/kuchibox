<%@ page language="java" contentType="text/xml; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.*, javax.sql.*, java.sql.*" %>

<%-- result를 xml형식으로 넘길것임 --%>

<%
	String phone= request.getParameter("phone");
	
	//DB연동을 위한 데이터소스 룩업
	Context ctx= new InitialContext();
	DataSource ds=(DataSource)ctx.lookup("java:comp/env/myoracle/myshop");
	
	Connection con= ds.getConnection();
	
	String sql="select * from pizza_user where phone=?";
	
	PreparedStatement ps= con.prepareStatement(sql);
	
	ps.setString(1, phone);
	
	ResultSet rs= ps.executeQuery();
	
	int idx=0;
	String name=null;
	String addr=null;
	String phone2=null;
	while(rs.next())
	{
		idx= rs.getInt("idx");
		name= rs.getString("name");
		addr= rs.getString("addr");
		phone2= rs.getString("phone");
	}
	
	rs.close();
	ps.close();
	con.close();
%>

<%-- 
	xml로 전송할때..
	 1. well-formed 해야함
	 2. validate 해야함
	 
	* 맨 위에 page 세팅에서 contentType을 text/xml로 지정해야한다
--%>
<pizza-user>
	<idx><%=idx %></idx>
	<name><%=name %></name>
	<addr><%=addr %></addr>
	<phone><%=phone
	%></phone>
</pizza-user>