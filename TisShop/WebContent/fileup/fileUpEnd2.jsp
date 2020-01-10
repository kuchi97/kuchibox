<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.oreilly.servlet.*, com.oreilly.servlet.multipart.*" %>

<jsp:include page="/top.jsp"/>

<div class='col-md-10 col-md-offset-1'>
	<h1>MultipartRequest를 이용한 파일업로드</h1>
	<h2>MultipartRequest 객체를 생성하면 업로드처리가 끝남</h2>
	<h4>[대충 밥로스가 참쉽죠 하는 짤]</h4>
	
<%
	String upDir="C:/Myjava/upload";			//업로드할 디렉토리
	DefaultFileRenamePolicy df= new DefaultFileRenamePolicy();	//동일한파일 올렸을때 덮어쓰기 방지(인덱스를 부여)
	MultipartRequest mr=null;
	
	try
	{
		mr= new MultipartRequest(request, upDir,10*1024*1024, "UTF-8", df);
			//업로드용량 10mb 초과하면 예외발생
	}
	catch (java.io.IOException e) {
		out.println("업로드 실패");
		e.printStackTrace();
		return;
	}
	
	//올린이의 값을 받아오기
	//MultipartRequest에서 request매개변수를 받기때문에 그놈이 먼저 데이터를 추출한다
	//String name=request.getParameter("name");	//[x] 얘는 null 나옴
	String name=mr.getParameter("name");		//MultipartRequest의 getParameter()를 호출해야함
	
	//업로드한 '파일명'을 얻을때는 getFilesystemName("파라미터명")
	String filename=mr.getFilesystemName("myfile");
	String type=mr.getContentType("myfile");
	java.io.File file=mr.getFile("myfile");
	long fsize=file.length();
	
	//원본파일명을 알아야하는 이유는 올린이(사용자)가 일련번호 붙은걸 모르고 자기 파일명을 알고있을테니까
	String origin=mr.getOriginalFileName("myfile");
	
%>
	<h2>올린이 : <%=name %></h2>
	<h2>업로드한 파일명 : <%=filename %></h2>
	<h2>업로드한 파일크기 : <%=fsize %></h2>
	<h2>업로드한 컨텐트타입 : <%=type %></h2>
	<h2>업로드한 원본파일명 : <%=origin %></h2>
	
	<h3 class='text-success'><a href='fileList.jsp'>업로드파일 목록보기</a></h3>
	
	
	
</div>

<jsp:include page="/foot.jsp"/>