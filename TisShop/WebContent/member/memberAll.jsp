<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ page import="java.util.*, user.model.*" %>

<!-- 관리자 확인모듈 include -->
<%@ include file="../login/adminCheckModule.jsp" %>
<!-- -------------------------- -->

    


<jsp:include page="/top.jsp"/>

<div class='container'>
<div class='row'>
<div class='col-md-10 col-md-offset-1 table-responsible'>

	<h1 class='text-center text-primary' style="color:white;">회원 목록 [Admin page]</h1>
	
	<table class='table table-dark'>
		
		<tr>
			<th style='background:#003163;'>회원번호</th>
			<th style='background:#003163;'>이름</th>
			<th style='background:#003163;'>아이디</th>
			<th style='background:#003163;'>이메일</th>
			<th style='background:#003163;'>연락처</th>
			<th style='background:#003163;'>가입일</th>
			<th style='background:#003163;'>상태</th>
			<th style='background:#003163;'>수정/삭제</th>
		</tr>
		
		<!-- ----------------------------------- -->
		
		<!-- UserDAO빈 생성후 listUsers()호출, 반환값받아서 반복문 -->
		<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>
<%
		List<UserVO> arr=dao.listUsers();
		//유효성체크
		if(arr==null || arr.size()==0)
		{
			out.println("<tr><td colspan='7'>서버 오류이거나 데이터가 없습니다</td></tr>");
		}
		else
		{
			for(UserVO user:arr)
			{
%>
			<tr
<%
				if(user.getM_state()==-2) {
%>
					class="danger"
<%					
				}
%>
			>
				<td><%= user.getIdx() %></td>
				<td><%= user.getName() %></td>
				<td><%= user.getUserid() %></td>
				<td><%= user.getEmail() %></td>
				<td><%= user.getAllHp() %></td>
				<td><%= user.getIndate() %></td>
				<td><%= (user.getM_state()==99)? "관리자":
						(user.getM_state()==0)? "정회원":
						(user.getM_state()==-1)?"정지회원":
						(user.getM_state()==-2)?"탈퇴회원":"무소속" %></td>
				<td>
					<!-- href 속성값에 자바스크립트 함수를 넣을때는
						반.드.시
						함수 앞에 "javascript: "접두어를 붙여주자 -->
					<a href='javascript:modify("<%=user.getIdx() %>")' style='color:white'>수정</a>/
					<a title='https://google.com' href='#' onclick='erase("<%=user.getIdx() %>")' style='color:white'>삭제</a>
				</td>
			</tr>
<%
			}//--for
		}//--else
%>

		<!--- ----------------------------------- -->
	
	</table>
	
</div>
</div>

<!-- 검색 폼--------------------------------------------- -->
<form name='fintf' id='findf' action='memberFind.jsp' method='GET'>
	<div class='row' style='margin:20px;'>
		<div class='col-md-offset-2 col-md-2'>
			<select name='findType' id='ftype' class='form-control'>
				<option value='0'>::검색 유형::</option> 
				<option value='1'>이름</option> 
				<option value='2'>아이디</option> 
				<option value='3'>이메일</option> 
			</select>
		</div>
		<div class='col-md-6'>
			<input type='text' name='findKeyword' id='fkeyword' class='form-control' placeholder='검색어를 입력하세요'>
		</div>
		<div class='col-md-1'>
			<button type='button' id='findBtn' class='btn btn-primary'>검 색</button>
		</div>
	</div>
</form>

<!-- 검색 폼 끝--------------------------------------------- -->

<!-- 수정/삭제 처리시 사용할 폼 -->
<form name='frm' method='post'>
	<input type='hidden' name='idx' style='color:black'>
	<!-- hidden data -->
</form>

</div>

<script>
	function erase(midx)
	{
		//alert(midx);
		
		//정말 삭제할것인지 확인
		var yn=confirm(midx+" 번 회원을 정말로 삭제할거늬");
		//console.log(conf);
		
		//삭제할경우 frm폼의 idx value로 midx를 넣어준다
		if(yn)
		{
			frm.idx.value=midx;
			frm.action="memberDel.jsp";
			frm.method="post";
			frm.submit();
		}
	}
	
	function modify(midx)
	{
		//alert("수정: "+midx);
		
		$('input[name="idx"]').val(midx);
		
		frm.action="memberEdit.jsp";
		frm.submit();
	}
	
	$(function(){
		$("#findBtn").on("click", function(){
			if($("#ftype").val()=="0")
			{
				alert("검색 유형을 선택하시오");
				$("ftype").focus();
				return;
			}
			if(!$("#fkeyword").val())
			{
				alert("검색어를 입력해야죠");
				$("fkeyword").focus();
				return;
			}
			
			$("#findf").submit();
		});
	});

</script>


<jsp:include page="/foot.jsp"/>