<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 태그라이브러리 여기서 쓸거임 --%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- jstl의 core 태그 라이브러리를 이용한 제어문 사용하기 -->
    
<c:if test="${msg!=null}">
	<script>
		alert("${msg}");
		location.href="${loc}";
	</script>
</c:if>
<%-- jstl은 else문이 없어서 else문 쓰려면 if의 반대조건을 줘서 쓴다
		아니면 choose~when 구문이 있다는데 복잡하다함 ㅇㅇ --%>
<c:if test="${msg==null}">
	<script>
		location.href="${loc}";
	</script>
	
</c:if>