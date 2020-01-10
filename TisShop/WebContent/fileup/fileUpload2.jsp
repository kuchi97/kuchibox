<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>


<jsp:include page="/top.jsp"/>

<div class='col-md-8 col-md-offset-2'>
	<h1>File Upload Test</h1>
	<h2>cos.jar 라이브러리를 활용하여 업로드처리하기</h2>
	<h3><a href='http://servlets.com'>servlets.com</a></h3>
	
	<!-- ## 파일 업로드시 주의사항 ## 
		:form의 action 지정이 중요하다
	
		1. method 방식은 post
			- get방식은 url부분에 데이터를 포함시키는데 512kb정도밖에 안됨
			- 업로드파일이 request의 entity body에 포함되어 가야한다
			
		2. post방식의 경우 인코딩타입(enctype)이 2종류이다
			- application/x-www-form-urlencoded [default]
			- multipart/form-data
			중에서 multipart/form-data로 지정해야
			첨부파일 데이터가 서버에 전송된다
			
			application/x-www-form-urlencoded로 전송시, 파일이름만 전송된다
	
	-->
	
	
	<!-- cos.jar 라이브러리 활용방법
		
		cos.jar파일을 다운받아서
		jdk/jre/lib/ext/아래 붙여넣고
		톰캣/lib/에도 붙여넣는다
		
	
	 -->
	
	<form action='fileUpEnd2.jsp' method='post' enctype="multipart/form-data">
		<table class='table'>
			<tr>
				<th colspan='2'>::파일 업로드::</th>
			</tr>
			<tr>
				<td>올린이</td>
				<td><input type='text' name='name' id='name' class='form-control'></td>
			</tr>			
			<tr>
				<td>파일첨부</td>
				<td><input type='file' name='myfile' id='myfile' class='form-control'></td>
			</tr>
			<tr>
				<td colspan='2' class='text-right'>
					<button class='btn btn-info'>업로드</button>
				</td>
			</tr>
			
		
		</table>
	</form>
	
	
</div>

<jsp:include page="/foot.jsp"/>