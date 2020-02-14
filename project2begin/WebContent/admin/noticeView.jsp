<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/admin/adminTop.jsp"/>

<!-- ------------------------------------------- -->
<div class='box'>
	<h1 class='head'>공지사항 읽기</h1>
</div>

<div class='box'>

<!-- 전송폼 -------------------------- -->
<form action='noticeEdit.do' name='noticeEditForm' method='POST'>
	<div class='box'>
		<label for='title'>제  목</label>
		<input type='text' name='title' id='title' value='${notice.title}' readonly>
		<label for='wdate'>작성일</label>
		<input type='text' name='wdate' id='wdate' value='${notice.wdate}' readonly>
	</div>
	<div class='box'>
		<label for='info'>내  용</label>
		<textarea name='info' readonly style='resize: none; width: 95%; height: 15em; margin:0em 1em; overflow-x:auto;' >${notice.info }</textarea>
	</div>
	<!-- 히든인풋 -->
	<input type='text' name='name' id='name' value='${notice.name}' readonly placeholder='히든으로 작성자 보낼거임'>
	<!-- ////히든인풋 -->
</form>
<!-- //전송폼 -------------------------- -->

	<div class='box right'>
		<button type='button' id='edit' onclick='goEdit(${notice.idx})' class='button'>수  정</button>
		<button type='button' onclick='goBack()' class='button'>취  소</button>
	</div>
</div>

<!-- ------------------------------------------- -->

<!-- script -->
<script>
//매개변수로 idx를 줘서 폼에 함께 보낸다
function goEdit(idx){
	idx= noticeEditForm.idx.val;
	noticeEditForm.submit();
}
function goBack(){
	history.back();
}
</script>
<!-- //script -->

<jsp:include page="/foot.jsp"/>