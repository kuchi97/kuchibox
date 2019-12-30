<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>


<div>
	<h1 style='padding:auto;'>성적 입력</h1>
	
	<form name='f' method='post' action='result.jsp'>
		
		<table border=1 style='width:400px; height:auto; border-collapse:collapse;'>
			<tr>
				<th colspan=2 style='padding:5px;'>사번</th>
				<td><input type='text' id='empno' name='empno'></td>
			</tr>
			<tr>
				<th rowspan=3 style='padding:5px;'>과목</th>
				<th style='padding:5px;'>Java</th>
				<td><input type='text' id='java' name='java'></td>
			</tr>
			<tr>
				<th style='padding:5px;'>Database</th>
				<td><input type='text' id='database' name='database'></td>
			</tr>
			<tr>
				<th style='padding:5px;'>JSP</th>
				<td><input type='text' id='jsp' name='jsp'></td>
			</tr>
			<tr>
				<td colspan=3 align=center style='padding:5px;'><button type='button' onclick='check()'>저장</button></td>
			</tr>
			
		
		</table>
	
	</form>
</div>


<script>

	function check()
	{
		if(!isEmpno(f.empno))
		{
			alert("알맞은 형식으로 사번을 입력하세요(숫자 4자리)");
			f.empno.focus();
			return;
		}
		
		if(f.java.value==null || f.java.value=="")
		{
			f.java.value=0;
		}
		if(f.database.value==null || f.database.value=="")
		{
			f.database.value=0;
		}
		if(f.jsp.value==null || f.jsp.value=="")
		{
			f.jsp.value=0;
		}
		
		if(!isNum(f.java) || !isNum(f.database) || !isNum(f.jsp))
		{
			alert("숫자만 입력하여야 합니다")
			return;
		}
		
		f.submit();

	}
	
	
	function isEmpno(obj)
	{
		var val= obj.value;
		var pattern=/^[0-9]{4}$/;
		
		return pattern.test(val);
	}
	function isNum(obj)
	{
		var val= obj.value;
		var pattern=/^(\d|\s){1,3}$/;
		console.log(val);
		console.log(pattern.test(val));
		return pattern.test(val);
	}

</script>
<jsp:include page="/foot.jsp"/>