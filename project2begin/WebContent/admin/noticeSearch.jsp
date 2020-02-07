<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:include page="/admin/adminTop.jsp"/>
<div class='box'>
	<h1 class='head'>공지사항 - 검색어 ${selectNotice }</h1>
</div>
<div class='outer'>

	<div class='tableContainer'>
	<form action="noticeSearch.do" name="searchForm" method="POST">
		<div class='box right'>
			<select class='' name="selectBox">
				<option value='idx'>글번호</option>
				<option value='title'>제목</option>
			</select>
			<input type='text' name="searchInput" class=''>
			<button type='button' onclick='goSearch()'>검색</button>
		</div>
	</form>
		<table>
			<tr>
				<th>글번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>				
			</tr>
		<core:forEach var='list' items='${selectNotice}'>
			<tr>
				<td>${list.idx }</td>
				<td><a href='noticeView.do?idx=${list.idx}'>${list.title} &nbsp;<i class="fa fa-edit"></i></a></td>
				<td>${list.name}</td>
				<td>${list.wdate }</td>
			</tr>
		</core:forEach>
		</table>
		
		<div class='box right'>
			<a href='noticeInsert.do' class='button'>등록</a>
		</div>
	</div>
</div>

<script>
function goSearch(){
	searchForm.submit();
}
</script>
<jsp:include page="/foot.jsp"/>