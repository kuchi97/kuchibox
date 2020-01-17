<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	response.setHeader("Pragma","No-cache"); //HTTP 1.0 
	response.setDateHeader ("Expires", 0); 
	response.setHeader("Cache-Control","no-cache");
%>    
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>BOOK</title>
<!-- CDN 참조-------------------------------------- -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!-- ------------------------------------------------- -->
<style type="text/css">


</style>


<script type="text/javascript">
	
	$(function(){
		getAllBook();
	})
	
	function goDel(visbn)
	{
		$.ajax({
			type:"POST",
			url:"deleteBook.jsp",
			dataType:"xml",
			data:"isbn="+visbn,
			cache:false,
			success: function(res)
			{
				alert(res);
			},
			error: function(err)
			{
				alert("error: "+err.status);
			}
		});
	}
	
	function goEdit(visbn)
	{
//		alert(visbn);
		$.ajax({
			type:"POST",
			url:"bookInfo.jsp",
			dataType:"xml",
			data:"isbn="+visbn,
			// POST방식일 경우 전송할 파라미터를 body에 포함시켜 넘겨야함
			// data: 라는 항목에다가 입력한다
			cache:false,
			success:function(res)
			{
//				alert(res);
				var isbn=$(res).find("isbn").text();
				var title=$(res).find("title").text();
				var publish=$(res).find("publish").text();
				var price=$(res).find("price").text();
				var published=$(res).find("published").text();
				var bimage=$(res).find("bimage").text();
				$("#isbn").val(isbn);
				$("#title").val(title);
				$("#publish").val(publish);
				$("#price").val(price);
				$("#published").val(published);
				var str="<img class='img img-thumbnail' src='"+bimage+"'>";
				$("#bimage").html(str);
				
			},
			error:function(e)
			{
				alert("error: "+e.status);
			}
			
		});
	}//--goEdit()
	
	function goEditEnd()
	{
//		var paramData="isbn="+$("#isbn").val()+"&title="+$("#title").val();
		//일일히 입력하는 것 보다 간단하게 줄이는 방법
		//jquery에 파라미터 데이터를 만들어주는 함수가 있다? 뿌슝빠쓩
		//$(폼객체).serialize()
		var paramData=$("#editF").serialize();
		alert(paramData);
				
		$.ajax({
			//사용자가 입력한 수정값들을 서버에 넘기기
			//GET이면 쿼리스트링으로 넘기고 POST이면 바디에 포함해서 같이넘겨야함
			type:"POST",
			url:"bookUpdate.jsp",
			data:paramData,
			dataType:"xml",
			cache:false,
			success:function(res)
			{
//				alert(res);
				var n=$(res).find("result").text();
				if(parseInt(n)>0)
				{
					getAllBook();
				}
				else
				{
					alert("수정 실패");
				}
			},
			error:function(err)
			{
				alert(err.status);
			}
		});
	}//goEditEnd()

	function getAllBook()
	{
		$.ajax({
			type:"GET",			//요청 메소드
			url:"bookAll.jsp",	//요청 url
			dataType:"text",	//응답 유형(text/xml)
			cache:false,		//ajax는 캐쉬를 자꾸 불러오려는 성향이 있다
			success:function(res)		//성공적인 응답이 왔을때 호출하는 함수
			{
				$("#book_data").html(res);
			},
			error:function(err)			//에러가 났을때 호출되는 함수
			{
				alert("Error: "+err.status);
			}
		});			//jquery 함수
	}


</script>

</head>
<!--onload시 출판사 목록 가져오기  -->
<body onload="getPublish()">
   <div class="container">
	<h2 id="msg">서적 정보 페이지</h2>
<form name="findF" id="findF" role="form"
 action="" method="POST">
<div class="form-group">
<label for="sel" class="control-label col-sm-2">출판사</label>
<span id="sel"></span><span id="sel2"></span>
</div>
<p>
<div class='form-group'>
	<label for="books" class="control-label col-sm-2" id="msg1">도서검색</label>
	<div class="col-sm-6">
	<input type="text" name="books" id="books"
	 onkeyup="autoComp(this.value)"
	 class="form-control" >
	 <!-- ---------------------------- -->
	 <div id="lst1" class="listbox"
	  style="display:none">
	 	<div id="lst2" class="blist"
	 	 style="display:none">
	 	</div>
	 </div>
	 <!-- ---------------------------- -->
	</div>
</div>
</form>
<div>
 
 <button type="button"
  onclick="getBook()"
  class="btn btn-primary">검색</button>
 
 <button type="button" onclick="getAllBook()" class="btn btn-success">모두보기</button>
 <button type="button" id="openBtn"
  class="btn btn-info">OPEN API에서 검색</button><br><br>
</div>
<div id="localBook">

<table class="table table-bordered" border="1">
	<tr class="info">
		<td style="width:20%;">서명</td>
		<td style="width:20%;">출판사</td>
		<td style="width:20%;">가격</td>
		<td style="width:20%;">출판일</td>
		<td style="width:20%;">편집</td>
	</tr>
</table>
<!-- ----------------------- -->
<div id="book_data"></div>
<!-- ----------------------- -->
<form id="editF" name="editF">
<table id="book_info" class="table table-hover" border="2">
	<tr>
		<td width="20%">ISBN코드</td>
		<td>
		<input type="text" name="isbn" id="isbn"
		class="form-control" readonly>
		</td>
		<td rowspan="6" width="30%" id="bimage" class="text-center"></td>
	</tr>
	<tr>
		<td>서명</td>
		<td>
		<input type="text" name="title" id="title"
		class="form-control">
		</td>
		
	</tr>
	<tr>
		
		<td>출판사</td>
		<td>
		<input type="text" name="publish" id="publish"
		class="form-control">
		</td>
		
	
	</tr>
	<tr>
	
		<td>가격</td>
		<td>
			<input type="text" name="price" id="price" class="form-control">
		</td>
		
	</tr>
	<tr>
	
		<td>출판일</td>
		<td>
		<input type="text" name="published"
		 id="published"  disabled
		class="form-control">
		</td>
		
	</tr>
	<tr>
		<td colspan="2">
		<button type="button"
		onclick="goEditEnd()" class="btn btn-danger">갱신</button></td>
	</tr>
</table>
</form>
	</div>
</div><!-- #localBook end -->

<!-- ------------------------------- -->
<div id="openApiBook">

</div>
	
</body>
</html>

<!-- https://apis.daum.net/search/book -->
<!-- 53c73f32f6c4150ca5aa184ba6250d8e -->

<!-- https://apis.daum.net/search/book?apikey=53c73f32f6c4150ca5aa184ba6250d8e&q=다음카카오&output=json -->




