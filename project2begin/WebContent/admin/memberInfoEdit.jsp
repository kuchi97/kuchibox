<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="function" uri="http://java.sun.com/jsp/jstl/functions" %>


<jsp:include page="/admin/adminTop.jsp"/>

<!-- -------------------------------------------------------- -->

<div class='box'>
	<h1 class='head'>회원정보 수정</h1>
</div>

<div class='box'>
	<form name='memberInfoForm' action='memberEditEnd.do' method='POST'>
		<div class="box">
			<label for="email">Email</label> 
			<input name="email" type="text" value='${member.email}' readonly>
			<button class="btn btn-danger" type="button">중복체크</button>
		</div>
		<div class="box">
			<label for="pwd">비밀번호</label> 
			<input name="pwd" type="password" value='${member.pwd}' readonly>
		</div>
		<div class="box">
			<label for="name">이름</label> 
			<input name="name" type="text" value='${member.name }'>
		</div>
		<div class="box">
			<label for="year">생년</label> 
			<input name="year" type="text" value='${member.year }'>
		</div>
		<div class="box">
			<label for="age">나이</label> 
			<input name="age" type="text" value='${member.age }'>
		</div>
		<div class="box">
			<label for="point">포인트</label> 
			<input name="point" type="text" value='${member.point }'> point
		</div>
		<div class="box">
			<label for="state">회원상태</label>
			<select id='state' name="state" id="state">
				<!-- 당신의 회원상태 동적으로 할당되었다 아래스크립트에 -->
			</select>
		</div>
		<div class="box">
			<button type="button" onclick='confirm()'>수정</button>
			<button type="button" onclick='javascript:history.back()'>취소</button>
		</div>
		<div>
			<input name='oldName' id='oldName' type='hidden' value='${member.name }'>
			<input name='oldYear' id='oldYear' type='hidden' value='${member.year}'>
			<input name='oldAge' id='oldAge' type='hidden' value='${member.age}'>
			<input name='oldPoint' id='oldPoint' type='hidden' value='${member.point}'>
			<input name='oldState' id='oldState' type='hidden' value='${member.state}'>
		</div>
	</form>
</div>

<!-- -------------------------------------------------------- -->
<script>

//동적으로 회원상태 할당하기
$(function(){
});
	var stateName=['일반','특별','정지','탈퇴','관리자'];
	var stateVal=[0,1,-1,-2,99];
	var str=``;
	for(var i=0; i<stateVal.length; i++) {
		if(stateVal[i] == ${member.state}) {
			str+="<option value='"+stateVal[i]+"' selected>"+stateName[i]+"</option>";			
		}
		else {
			str+="<option value='"+stateVal[i]+"'>"+stateName[i]+"</option>";			
		}
	}
	
	$('#state').html(str);

//기존회원정보 저장
//input 아래 히든 input에다 저장해둠(각 항목)

//수정버튼
function confirm() {
	memberInfoForm.submit();
}


</script>
<!-- -------------------------------------------------------- -->

<jsp:include page="/foot.jsp"/>