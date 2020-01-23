<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>

<script>

	function showData(obj)
	{
		var str="<ul>";
			str+="<li>ISBN: "+obj.isbn+"</li>";
			str+="<li>도서명: "+obj.title+"</li>";
			str+="<li>가격: "+obj.price+"</li>";
			str+="<li>출판사: "+obj.publish+"</li>";
			str+="<li>출판일: "+obj.published+"</li>";
			str+="</ul>";
			
		$("#result").html(str);
	}
	function showList(arr)
	{
		var str="<table class='table'>";
			str+="<tr class='success'>";
			str+="	<th>ISBN</th><th>도서명</th><th>가격</th><th>출판사</th><th>출판일</th>";
			str+="</tr>";
			
			/* $.each(배열, 함수(index, element){}) */
			$.each(arr, function(i,book){
				str+="<tr><td>"+book.isbn+"</td>";
				str+="<td>"+book.title+"</td>";
				str+="<td>"+book.price+"</td>";
				str+="<td>"+book.publish+"</td>";
				str+="<td>"+book.published+"</td></tr>";
			})
			str+="</table>";
			
			$("#result").empty();
			$("#result").html(str);
	}


	$(function(){
		
		//단일객체일경우
		$("#bt1").click(function(){
			$.ajax({
				type:"GET",
				url:"jsonData1.jsp",
				dataType:"json",			//json 응답유형은 json
				cache:false,
				success:function(res)
				{
					//console.log(JSON.stringify(res));		//문자열로 나열해주는 함수(직렬화)
					
					/*
					- JSON.stringify()
					- JSON.parse(문자열)
						** 자주 쓴대 **
					*/
					
					showData(res);
				},
				error:function(err)
				{
					alert(err.status);
				}
			});
		});
		
		//배열로 응답이 올 경우
		$("#bt2").click(function(){
			$.ajax({
				type:"GET",
				url:"jsonData2.jsp",
				dataType:"json",			//json 응답유형은 json
				cache:false,
				success:function(res)
				{
					//console.log(JSON.stringify(res));		//문자열로 나열해주는 함수(직렬화)
					
					/*
					- JSON.stringify()
					- JSON.parse(문자열)
						** 자주 쓴대 **
					*/
					showList(res);			//배열을 반복문돌려서 테이블형태로 출력
				},
				error:function(err)
				{
					alert(err.status);
				}
			});
		});
		
		$("#bt3").click(function(){
			$.ajax({
				type:"GET",
				url:"jsonData3.jsp",
				dataType:"json",
				cache:false,
				success:function(res)
				{
					//console.log(res);
					//console.log(res.books[0]);
					showList(res.books);
				},
				error:function(err)
				{
					alert(err.status);
				}
			});
			
		});
		$("#bt1").click(function(){
			
			
		});
		$("#bt1").click(function(){
			
			
		});
		$("#bt1").click(function(){
			
			
		});
		
	})

</script>

<div class='container'>
	<h1>데이터를 JSON형태로 받아보자</h1>
	<h2>JSON이란? JavaScript Object Notation</h2>
	<h3>자바스크립트에서 사용하는 객체형태로 데이터를 표현하는 방식을 의미</h3>
	<h3 style='color:red; font-family:"궁서"; margin-bottom:20px;'>JSON객체에는 문자열, 배열, 숫자, boolean, null값만 들어갈 수 있다</h3>
	<div id='result'></div>
	
	<div class='button-group'>
		<button id='bt1' class='btn btn-info'>JSON형태로 받기(하나)</button>
		<button id='bt2' class='btn btn-info'>JSON형태로 받기(배열)</button>
		<button id='bt3' class='btn btn-info'>JSON형태로 받기3</button>
	</div>
	
	<div class='button-group'>
		<button id='bt4' class='btn btn-info'>JSON형태로 받기4 - DB에서 가져오기</button>
		<button id='bt5' class='btn btn-info'>JSON형태로 받기5 - 라이브러리 사용</button>
		<button id='bt6' class='btn btn-info'>JSON형태로 받기6 - 라이브러리 사용</button>
	</div>
</div>
<jsp:include page="/foot.jsp"/>