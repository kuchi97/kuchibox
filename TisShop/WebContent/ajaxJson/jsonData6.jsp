<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  import="net.sf.json.*, ajax.book.*, java.util.*"  %>
<% 
	BookDAO bookDao=new BookDAO();

	List<BookDTO> arr=bookDao.getAllBook();
	
	JSONArray jsonArr=JSONArray.fromObject(arr);
	out.println(jsonArr.toString());
%>    

