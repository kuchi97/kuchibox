<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <jsp:include page="/top.jsp"/> --%>
<div>
	<h1>공지사항</h1>
	<table>
		<tr>
			<th>번호</th>
			<th>제목</th>
			<th>작성자</th>
			<th>등록일</th>
		</tr>
	<core:forEach var='notice' items='${noticeList }'>
		<tr>
			<td>${notice.idx }</td>
			<td>${notice.title }</td>
			<td>${notice.name }</td>
			<td>${notice.wdate }</td>
		</tr>
	</core:forEach>
	</table>
</div>
