<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/admin/adminTop.jsp"/>
<div class='box'>
	<h1>업로드하기</h1>
</div>

<div class='box'>

	<form name='insertForm' action='contentInsertPreview.do' method='POST' >
	<div class='box'>
		<label>제  목</label>
		<input type='text' name='director'>
	</div>
	<div class='box'>
		<div class='left'>
			<label>감  독</label>
			<input type='text' name='director'>	
			<label>개봉일</label>
			<input type='text' name='release'>	
		</div>
		<div class='right'>
		</div>
	</div>
	<div class='box'>
		<label>소  개</label>
		<textarea name='info' style='resize: none; width: 95%; height: 15em; margin:0em 1em; overflow-x:auto;' ></textarea>
	</div>
	<div class='box'>
		<label>포스터</label>
		<input type='file' name='img1'>	
	</div>
	<div class='box'>
		<label style='margin-right:11px;'>예  고</label>
		<input type='file' name='img1'>	
	</div>
	<div class='box right'>
		<button type='button' onclick='goPreview()'>미리보기</button>
		<button type='button' onclick='javascript:history.back()'>취  소</button>
	</div>
	</form>

</div><!-- /box outline -->

<script>
	function goPreview(){
		insertForm.submit();
	}
</script>

<jsp:include page="/foot.jsp"/>