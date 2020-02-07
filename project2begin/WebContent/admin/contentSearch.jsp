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
			<option value='title'>제목</option>
		</select>
		<input type='text' name="searchInput" class=''>
		<button type='button' onclick='goSearch()'>검색</button>
	</div>
</form>
<!-- ----------------------------------------------------- -->
<div class="outer">
	<div class='tableContainer'>
		<table class="table">
			<thead>
				<tr>
					<th>#</th>
					<th>인덱스</th>
					<th>제목</th>
					<th>감독</th>
					<th>개봉일</th>
					<th>소개</th>
				</tr>
			</thead>
			<tbody>
				<core:forEach var="search" items="${searchContent}">
					<tr>
						<td><a href='contentEdit.do?idx=${search.idx}'><i class="fa fa-edit fa-2x"></i></a></td>
						<td>${search.idx}</td>
						<td>${search.title}</td>
						<td>${search.director}</td>
						<td>${search.release}</td>
				<core:if test='${function:length(search.info)<=40}'>	<!-- 너무길면 줄이기 -->
						<td title='${search.info}'>${search.info}</td>
				</core:if>
				<core:if test='${function:length(search.info)>40}'>
						<td title='${search.info}'>${function:substring(search.info,0,40)}...</td>
				</core:if>
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