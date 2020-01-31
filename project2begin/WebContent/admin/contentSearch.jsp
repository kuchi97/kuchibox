<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:include page="/admin/adminTop.jsp"/>

<!-- ------------------------------------------------------- -->
<div class='box'>
		<h2 class='head'>검색 결과</h2>
</div>
<form action="contentSearch.do" name="searchForm" method="POST">
	<div class='box'>
		<select class='' name="selectBox">
			<option value='idx'>번호</option>
			<option value='email'>이메일</option>
			<option value='name'>이름</option>
		</select>
		<input type='text' name="searchInput" class=''>
		<button type='button' onclick='goSearch()'>검색</button>
	</div>
</form>
<!-- ----------------------------------------------------- -->
<div class="box">
	<div class='tableContainer'>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>제목</th>
					<th>감독</th>
					<th>개봉일</th>
					<th>소개</th>
					<th>URL</th>
				</tr>
			</thead>
			<tbody>
				<core:forEach var="search" items="${searchContent}">
					<tr>
						<td><a href='index.do'>${search.idx}</a></td>
						<td>${search.title}</td>
						<td>${search.director}</td>
						<td>${search.release}</td>
				<core:if test='${function:length(search.info)<=40}'>	<!-- 너무길면 줄이기 -->
						<td title='${search.info}'>${search.info}</td>
				</core:if>
				<core:if test='${function:length(search.info)>40}'>
						<td title='${search.info}'>${function:substring(search.info,0,40)}...</td>
				</core:if>
						<td>${search.url}</td>
					</tr>
				</core:forEach>
			</tbody>
		</table>
	</div>
</div>

<script>
function goSearch() {
	searchForm.submit();
}

</script>

<jsp:include page="/foot.jsp"/>