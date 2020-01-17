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
								<th>#</th>
								<th>제목</th>
								<th>감독</th>
								<th>개봉일</th>
								<th>소개</th>
								<th>URL</th>
							</tr>
						</thead>
						<tbody>
							<core:forEach var="list" items="${listContent}">
								<tr>
									<td>${list.idx}</td>
									<td>${list.title}</td>
									<td>${list.director}</td>
									<td>${list.release}</td>
							<core:if test='${function:length(list.intro)<=40}'>	<!-- 너무길면 줄이기 -->
									<td title='${list.intro}'>${list.intro}</td>
							</core:if>
							<core:if test='${function:length(list.intro)>40}'>
									<td title='${list.intro}'>${function:substring(list.intro,0,40)}...</td>
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