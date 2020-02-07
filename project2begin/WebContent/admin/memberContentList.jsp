<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions"%>

<jsp:include page="/admin/adminTop.jsp"/>

<!-- ------------------------------------------------------- -->
<div class='box'>
		<h2 class='head'>회원 업로드 목록</h2>
</div>
<form action="memberContentSearch.do" name="searchForm" method="POST">
	<div class='box'>
		<select class='' name="selectBox">
			<option value='idx'>번호</option>
			<option value='email'>이메일</option>
			<option value='name'>이름</option>
			<option value='title'>제목</option>
		</select>
		<input type='text' name="searchInput" class=''>
		<button type='button' onclick='goSearch()'>검색</button>
	</div>
</form>
<!-- ----------------------------------------------------- -->
<div class="outer">
<div class="tableContainer">
	<table class='table'>
		<thead>
			<tr>
				<th>IDX</th>
				<th>이메일</th>
				<th>이름</th>
				<th>영화명</th>
				<th>리뷰제목</th>
				<th>소개</th>
				<th>URL</th>
			</tr>
		</thead>
		<tbody>
			<core:forEach var="member" items="${listMemberContent}">
				<tr>
					<td>${member.idx}</td>
					<td>${member.email}</td>
					<td>${member.name}</td>
					<td>${member.title}</td>
					<td>${member.reviewTitle}</td>
			<core:if test='${function:length(member.info)<=40}'>	<!-- 너무길면 줄이기 -->
					<td title='${member.info}'>${member.info}</td>
			</core:if>
			<core:if test='${function:length(member.info)>40}'>
					<td title='${member.info}'>${function:substring(member.info,0,40)}...</td>
			</core:if>
					<td><i class="fa fa-edit fa-2x"></i></td>
				</tr>
			</core:forEach>
		</tbody>
	</table>
</div>
</div>


<jsp:include page="/foot.jsp"/>