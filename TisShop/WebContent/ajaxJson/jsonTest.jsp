<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/top.jsp"/>

<style>
button {
	color: black;
	margin: 3px;
}
</style>

<script type="text/javascript">
	function showData(obj){
		var str="<ul>";
			str+="<li> 도서명: "+obj.title+"</li>";
			str+="<li> 출판사: "+obj.publish+"</li>";
			str+="<li> 가  격: "+obj.price+"</li>";
			str+="<li> 출판일: "+obj.published+"</li>";
			str+="</ul>";
		$('#result').html(str);	
	}//------------------------------
	function showList(arr){
		var str="<table class='table'>";
			str+="<tr class='success'>";
			str+="<th>도서명</th><th>출판사</th><th>판매가</th><th>출판일</th>";
			str+="</tr>";
			//$.each(배열, 함수(index, element){})
			$.each(arr, function(i, book){
				str+="<tr><td>"+book.title+"</td>";
				str+="<td>"+book.publish+"</td>";
				str+="<td>"+book.price+"</td>";
				str+="<td>"+book.published+"</td>";
				str+="</tr>";
			})
			str+="</table>";
			$('#result').empty();//비워주기
			$('#result').html(str);
	}//------------------------------


	$(function(){
		$('#bt1').click(function(){
			$.ajax({
				type:'GET',
				url:'jsonData1.jsp',
				dataType:'json',//응답유형 json
				cache:false,
				success:function(res){
					//alert(res.title);
					//JSON.stringify() : json객체를 문자열로 나열해서 보여줌
					//JSON.parse(문자열): 문자열을 파싱하여 JSON객체로 만들어줌
					console.log(JSON.stringify(res));
					showData(res);					
				},
				error:function(e){
					alert('error: '+e.status);
				}
			})
		});
		
		//배열로 응답이 올 경우
		$('#bt2').click(function(){
			$.ajax({
				type:'GET',
				url:'jsonData2.jsp',
				dataType:'json',//응답유형 json
				cache:false,
				success:function(res){
					//alert(res);
					//console.log(JSON.stringify(res));
					showList(res);//배열을 반복문 돌려 테이블 형태로 출력					
				},
				error:function(e){
					alert('error: '+e.status);
				}
			})
		});
		$('#bt3').click(function(){
			$.ajax({
				type:'GET',
				url:'jsonData3.jsp',
				dataType:'json',//응답유형 json
				cache:false,
				success:function(res){
					//alert(res.books);
					console.log(JSON.stringify(res));
					showList(res.books);//배열을 반복문 돌려 테이블 형태로 출력					
				},
				error:function(e){
					alert('error: '+e.status);
				}
			})
		});
		$('#bt5').click(function(){
			$.ajax({
				type:'GET',
				url:'jsonData5.jsp',
				dataType:'json',
				cache:false,
				success:function(res){
					//alert(JSON.stringify(res));
					//showData(res); //객체 1개 응답 올경우
					showList(res); //배열로 응답 올 경우
				},
				error:function(e){
					alert('error: '+e.status)
				}
			})			
		});
		$('#bt6').click(function(){
			$.ajax({
				type:'GET',
				url:'jsonData6.jsp',
				dataType:'json',
				cache:false,
				success:function(res){
					//alert(JSON.stringify(res));
					//showData(res);	//객체 1개 응답 올 경우
					showList(res);		//배열로 응답 올 경우
				},
				error:function(e){
					alert('error: '+e.status)
				}
			})
		});	
	})//$()end
</script>


<div class="container">
	<h1>데이터를 JSON형태로 받아보자</h1>
	<h2>JSON이란? JavaScript Object Notation</h2>
	<h3>자바스크립트에서 사용하는 객체 형태로 데이터를 표현하는 방식을 의미</h3>
	<h3>JSON객체에는 문자열, 배열, 숫자, boolean, null값만 들어갈 수 있음</h3>
	<button id="bt1">JSON형태로 받기1</button>
	<button id="bt2">JSON형태로 받기2</button>
	<button id="bt3">JSON형태로 받기3</button>
	<button id="bt4">JSON형태로 받기4-DB에서 가져오기</button>
	<button id="bt5">JSON형태로 받기5-라이브러리 사용</button>
	<button id="bt6">JSON형태로 받기6-라이브러리 사용</button>
	<hr>
	<div id="result"></div>
</div>
<jsp:include page="/foot.jsp"/>