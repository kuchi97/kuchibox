<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="javax.naming.*, javax.sql.*, java.sql.*" %>

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
	while(rs.next())
	{
		idx= rs.getInt("idx");
		name= rs.getString("name");
		addr= rs.getString("addr");
	}
	
	rs.close();
	ps.close();
	con.close();
%>

<%=idx%>#<%=name%>#<%=addr%>