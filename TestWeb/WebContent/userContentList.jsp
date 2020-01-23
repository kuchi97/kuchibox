<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>

<jsp:include page='/top.jsp'/>

	<div class="">
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-striped">
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
							<core:forEach var="list" items="${listUserContent}">
								<tr>
									<td>${list.idx}</td>
									<td>${list.email}</td>
									<td>${list.name}</td>
									<td>${list.contentTitle}</td>
									<td>${list.reviewTitle}</td>
							<core:if test='${function:length(list.info)<=40}'>	<!-- 너무길면 줄이기 -->
									<td title='${list.info}'>${list.info}</td>
							</core:if>
							<core:if test='${function:length(list.info)>40}'>
									<td title='${list.info}'>${function:substring(list.info,0,40)}...</td>
							</core:if>
									<td>${list.url}</td>
								</tr>
							</core:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>

</html>