<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="ajax.book.*, java.util.*, java.text.*" %>

<jsp:useBean id="bookDao" class="ajax.book.BookDAO" scope="session" />

<%
	List<BookDTO> arr= bookDao.getAllBook();
	//out.println(arr);
	
	//숫자포맷
	DecimalFormat df= new DecimalFormat("###,###");
	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
%>

<table class="table table-striped table-condensed">
<%
	if(arr==null || arr.size()==0)
	{
%>
	<tr><td colspan=5>데이터가 없습니다ㅠㅠ</td></tr>
<%
	}
	else
	{
		for(BookDTO b:arr)
		{
%>
	<tr>
		<td width="20%"><%=b.getTitle() %></td>
		<td width="20%"><%=b.getPublish() %></td>
		<td width="20%"><%=df.format(b.getPrice()) %></td>
		<td width="20%"><%=sdf.format(b.getPublished()) %></td>
		<td width="20%">
			<a href='#book_data' onclick='goEdit("<%=b.getIsbn()%>")'>수정</a>|
			<a href='javascript:goDel("<%=b.getIsbn()%>")'>삭제</a>
		</td>
	</tr>
<%
		}//--for
	}//--else
%>
</table>