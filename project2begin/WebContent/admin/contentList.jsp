<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:include page="/admin/adminTop.jsp"/>
<!-- ------------------------------------------------------- -->
<div class='box'>
		<h2 class='head'>Content List</h2>
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
				<core:forEach var="list" items="${listContent}">
					<tr>
						<td><a href='contentEdit.do?idx=${list.idx}'><i class="fa fa-edit fa-2x"></i></a></td>
						<td>${list.idx}</td>
						<td>${list.title}</td>
						<td>${list.director}</td>
						<td>${list.release}</td>
				<core:if test='${function:length(list.info)<=40}'>	<!-- 너무길면 줄이기 -->
						<td title='${list.info}'>${list.info}</td>
				</core:if>
				<core:if test='${function:length(list.info)>40}'>
						<td title='${list.info}'>${function:substring(list.info,0,40)}...</td>
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


<jsp:include page="/foot.jsp" />
