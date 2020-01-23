<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>openApi.jsp</title>
<!-- CDN 참조-------------------------------------- -->
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
<!-- ------------------------------------------------- -->

<%-- 네이버 api 아이디: SE0PVTS8HwHFNkMhzaPW
				비번 : dTuIUDXTgv
				
	책 기본검색(xml): https://openapi.naver.com/v1/search/book.xml
	책 기본검색(json): https://openapi.naver.com/v1/search/book.json
--%>

<script type="text/javascript">
	
	$(function(){
		//var client_id="SE0PVTS8HwHFNkMhzaPW";
		//var client_secret="dTuIUDXTgv";
		//var url="https://openapi.naver.com/v1/search/book.xml?query=Ajax";
		
<%-- 'http://localhost:9090' has been blocked by CORS policy 
	요청을 보내고 받는 도메인이 같아야함 (JavaScript 보안정책) --%>
		//네이버로 요청 다이렉트로 못보내서 프록시로 우회해야함
		//BookNaverProxy객체를 이용해서 돌아갈거임
		//이러면 openApiResult.jsp와 openApi.jsp가 같은 도메인이기 때문에 요청을 받을수 있다
		
		$("#openBtn").click(function(){
			var key=$("#books").val();
			if(!key) {
				alert("검색어입력바람");
				$("#books").focus();
				return;
			}
			
			send(key, 1);
		});
	})//

		//받은 데이터를 html로 출력하는 함수
		function showData(items) {
			var str="<div class='row'>";
			$.each(items, function(i, book){
				str+="<div id='show' class='col-md-3'>";
				str+="<h5>"+book.title+"</h5>";
				str+="<a href='"+book.link+"' target=_blank>";
				str+="<img src='"+book.image+"'>";
				str+="</a>";
				str+="</div>";
				if(i%4==3) {	//0부터 시작하는 인덱스라 4번째값은 3이다. 4개씩 끊어 보여줄거
					str+="</div><div class='row'>";			//4개째 목록일때 행을 닫고 새로운 행을 시작한다
				}
			});
				str+="</div>";
			$("#result").html(str);
		}//showData()--------------------------------
		
		
		//최종 페이지 출력하는 함수
		function send(key, start) {
			var url="openApiResult.jsp?keyword="+encodeURIComponent(key)+"&pageSize=20&start="+start;		//BookNaverProxy를 받을 jsp페이지임
											//encodeURIComponent(): javascript에서의 한글인코딩처리(주로 익스 대비)
			
			$.ajax({
				
				type:"GET",
				url:url,
				dataType:"json",
				cache:false,
				success:function(res)
				{
					//console.log(JSON.stringify(res));
					//alert(res.total);
					var total= parseInt(res.total);			//총 개수
					if(total>200) {
						total=200;
					}
					var pageSize= 20;						//한페이지에 20개씩
					
					showData(res.items);					//결과를 html로 보여줄거임
					
					showPage(total, pageSize, key);			//페이징처리
					
				},
				error:function(err)
				{
					alert(err.status);
				}
			});
			
		}// send()------------------------------------------------
	
		//페이징처리하는 함수
		function showPage(total, pageSize, key) {
			
			var pageCount= Math.floor((total-1)/pageSize+1);
			//alert("pageCount= "+pageCount);
			
/*			i(cpage)	pageSize		start
			---------------------------------
			1			20				1
			2							21
			3							41
			---------------------------------
			start= (cpage-1) * (pageSize+1);			*/
			
			
			//페이징처리
			var pstr="<ul class='pagination'>";
				pstr+="	<li>";
			for(var i=1; i<pageCount; i++) {
				var start=(i-1)*pageSize+1;
				pstr+="<a href='#show' onclick='send(\""+key+"\","+start+")')>"+(i)+"</a>";	
							//= send("java", 21);
			}
				pstr+="	</li>";
				pstr+="</ul>";
			$("#paging").html(pstr);
			
		}//showPage()--------------------------------------------
	
				
	
</script>

</head>
<body>
<div class="container">
	<h1 class="text-center text-primary">Naver Open Api Books</h1>
	<div class="col-md-1 col-md-offset-1">
		<label>도서검색</label>
	</div>
	<div class="col-md-8">
		<input type="text" name="books" id="books"
		 class="form-control">
	</div>
	<div>
		<button id="openBtn" class="btn btn-primary">검색</button>
	</div>
	
	<div id="naverBook" style="margin-top:50px">
		<div id="result" style="padding:10px">
		</div>
		
		<div id="paging" class='text-center'>
		</div>
	</div>
</div>

</body>
</html>



