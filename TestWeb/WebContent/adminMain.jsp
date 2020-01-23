<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core" %>

<%-- <jsp:include page="/top.jsp"/> --%>


<div id='outer'>
	<table style='border:1px solid blue; border-collapse:collapse'>
		<tr>
			<td>
				<div>
				<!-- 컨텐츠 테이블 -->
				<table style='border:1px solid red; border-collapse:collapse'>
					<tr>
						<th colspan='3'>Content</th>
					</tr>
					<!-- 반복문 -->
				<core:forEach var='content' items='${contentList}' begin='0' end='3'>
					<tr>
						<td>${content.idx}</td>
						<td>${content.title}</td>
						<td>상세보기</td>
					</tr>
				</core:forEach>
					<!-- ------ -->
					
				</table>
				<!-- ------ -->
				</div>
			</td>
			<td>
				<div>
				<!-- 회원관리 테이블 -->
				<table style='border:1px solid red; border-collapse:collapse'>
					<tr>
						<th colspan='4'>회원관리</th>
					</tr>
					<!-- 반복문 -->
				<core:forEach var='member' items='${memberList}' begin='0' end='3'>
					<tr>
						<td>${member.email}</td>
						<td>${member.name}</td>
						<td>${member.age}</td>
						<td>${member.state}</td>
					</tr>
				</core:forEach>
					<!-- ------ -->
					
				</table>
				<!-- ------ -->
				</div>
			</td>
		</tr>
		<tr>
			<td>
				<div>
					<!-- 사용자컨텐츠 테이블 -->
					<table style='border:1px solid red; border-collapse:collapse'>
						<tr>
							<th colspan='3'>컨텐츠</th>
						</tr>
						<!-- 반복문 -->
					<core:forEach var='userContent' items='${userContentList}' begin='0' end='3'>
						<tr>
							<td>${userContent.idx}</td>
							<td>${userContent.reviewTitle}</td>
							<td>상세보기</td>
						</tr>
					</core:forEach>
						<!-- ------ -->
					</table>
					<!-- ------ -->
				</div>
			</td>
			<td>
				<div>
					<!-- 공지사항 테이블 -->
					<table style='border:1px solid red; border-collapse:collapse'>
						<tr>
							<th colspan='3'>공지사항</th>
						</tr>
						<!-- 반복문 -->
					<core:forEach var='notice' items='${noticeList}' begin='0' end='3'>
						<tr>
							<td>${notice.idx }</td>
							<td>${notice.title }</td>
							<td>${notice.wdate }</td>
						</tr>
					</core:forEach>
						<!-- ------ -->
					</table>
					<!-- ------ -->
				</div>
			</td>
		</tr>
	</table>
</div>
