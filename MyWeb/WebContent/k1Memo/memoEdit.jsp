<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>메모짱</title>
<link rel='stylesheet' type='text/css' href='../css/memo.css'>

	<script type='text/javascript'>
		function check()
		{
			//유효성 체크하기(작성자, 메모내용-100자 이내)
			var uname= frm.name.value;
			
			if(uname=="")
			{
				alert("작성자를 입력하세요");
				frm.name.focus();
				return;
					//리턴해도 submit은 무조건 전송한다
			}
			if(frm.msg.value=="")
			{
				alert("메모내용을 입력하세요");
				frm.msg.focus();		//커서를 둠
				return;
			}
			//msg는 100자 이내이어야하는 유효성체크
			if(frm.msg.value.length>101)
			{
				alert("메모가 너무 길다고 생각하지않니");
				frm.msg.select();		//블럭 잡아줌
				return;
			}
			
			frm.submit();		//form 객체에 submit()이 있다. 이걸로 서버에 전송

		}
	
	
	</script>
</head>
<body>
<%
	//여기에는 자바코드 작성
	
	//1. 수정할 글번호받기
	String idxStr=request.getParameter("idx");
	
	//2.유효성 체크
	if(idxStr==null || idxStr.trim().isEmpty())
	{
		%>
		<script>
			alert("잘못된 경로입니다");
			location href="../MemoList";
		</script>
		<%
		return;
	}
	
	//3. MemoDAO의 글번호로 해당 글을 가져오는 메소드 호출
	my.memo.MemoDAO dao= new my.memo.MemoDAO();
	my.memo.MemoVO memo= dao.selectMemo(new Integer(idxStr));
	//3.1. 유효성 체크
	if(memo==null)
	{
		%>
		<script>
			alert("해당글은 존재하지 않거나 서버오류입니다");
			self.close();
		</script>
		<%
		return;
	}
	
	//out.println("memo="+memo);
	
%>



	<div id='wrap'>
	
	<form action='../MemoUpdate' method='POST' name='frm'>
		
		<table border='1' style='width:90%; margin:auto;'>
			<tr>
				<th colspan='2'>
					<h2>한줄 메모장 수정</h2>
				</th>
			</tr>
			<tr>
				<td width='15%' class='label'><b>글 번호</b></td>
				<td width='85%'>
					<input type='text' name='idx' id='idx' value='<%=memo.getIdx() %>' readonly class='box writer'>
				</td>
			</tr>
			<tr>
				<td width='15%' class='label'><b>작성자</b></td>
				<td width='85%'>
					<input type='text' name='name' id='name' value='<%=memo.getName() %>' readonly class='box writer'>
				</td>
			</tr>
			<tr>
				<td width='15%' class='label'><b>메모내용</b></td>
				<td width='85%'>
					<input type='text' name='msg' id='msg' value='<%=memo.getMsg() %>' class='box memo'>
				</td>
			</tr>
			<tr>
				<td colspan='2'>
					<button type='button' onclick='check()'>메모 수정</button>
						<!-- 버튼의 default는 submit임
							유효성체크한뒤에 submit 하고싶으면
							일반 button으로 만들고 form객체를 통해 submit 해야함 -->
					<button type='reset'>다시 쓰기</button>
				</td>
			</tr>
		</table>
		
	</form>
	</div>
</body>
</html>